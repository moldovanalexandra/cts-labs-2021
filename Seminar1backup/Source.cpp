#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<fstream>
#include<iomanip>
#include<map>
using namespace std;

class Motocicleta
{
private:
	char* producator;
protected:
	const int id;
	static int nrMot; //1)nrMot - nume care poate crea ambiguitate (se poate interpreta ca numar de inmatriculare) -> SOLUTIE: numarMotociclete; 
	string model;
	float capacitate;
public:
	Motocicleta() :id(++nrMot)
	{
		producator = nullptr;
		model = "";
		capacitate = 0; //5) valoarea 0 nu este tocmai realista => 1300 ar fi o idee mai buna
	}
	Motocicleta(const char* producator, string model, float capacitate) :id(++nrMot)
	{
		//4) codul se repeta -> o varianta mai buna ar fi apelul setterilor care contin validari oricum
		if (strlen(producator) > 0)
		{
			this->producator = new char[strlen(producator) + 1];
			strcpy(this->producator, producator);
		}
		else
			producator = nullptr;
		if (model.length() > 0)
			this->model = model;
		else
			this->model = "necunoscut";
		if (capacitate > 0)
			this->capacitate = capacitate;
		else
			this->capacitate = 0;
	}
	/*char* getProducator()
	{
		if (producator != nullptr)
		{
			char* aux = new char[strlen(aux) + 1];
			strcpy(aux, producator);
			return aux;
		}
		else
			return nullptr;
	}*/
	//6) varianta mai buna
	char* getProducator()
	{
		char* aux = nullptr;
		if (producator != nullptr)
		{
			char* aux = new char[strlen(aux) + 1];
			strcpy(aux, producator);
			
		}
		return aux;
			
	}
	void setProducator(const char* producator)
	{
		if (strlen(producator) > 0)
		{
			this->producator = new char[strlen(producator) + 1];
			strcpy(this->producator, producator);
		}
		else
			this->producator = nullptr;
	}
	string getModel()
	{
		return this->model;
	}
	Motocicleta(const Motocicleta& m) :id(++nrMot)
	{
		if (strlen(m.producator) > 0)
		{
			this->producator = new char[strlen(m.producator) + 1];
			strcpy(this->producator, m.producator);
		}
		else
			producator = nullptr;
		if (m.model.length() > 0)
			this->model = m.model;
		else
			this->model = "necunoscut";
		if (m.capacitate > 0)
			this->capacitate = m.capacitate;
		else
			this->capacitate = 0;
	}
	~Motocicleta()
	{
		if (this->producator != nullptr)
			delete[] this->producator;
	}
	Motocicleta& operator=(const Motocicleta& m)
	{
		if (this->producator != nullptr)
			delete[] this->producator;
		if (strlen(m.producator) > 0)
		{
			this->producator = new char[strlen(m.producator) + 1];
			strcpy(this->producator, m.producator);
		}
		else
			producator = nullptr;
		if (m.model.length() > 0)
			this->model = m.model;
		else
			this->model = "necunoscut";
		if (m.capacitate > 0)
			this->capacitate = m.capacitate;
		else
			this->capacitate = 0;
		return *this;
	}
	friend ostream& operator<<(ostream& out, Motocicleta& m)
	{
		out << endl << "---------------------------------------------------------------------------------------" << endl;
		if (m.producator != nullptr)
			out << "Producator: " << m.producator << " | ";
		else
			out << "Producator: necunoscut";
		out << "Model: " << m.model << " | " << "Capacitate: " << m.capacitate << endl;
		out << "Id motocicleta: " << m.id << "|" << "nr total de motociclete: " << m.nrMot << endl;
		return out;

	}
	
	//3)Metoda redundanta -> void setProducator(const char* producator) face acelasi lucru
	void schimbaDetalii(const char* producatorNou)
	{
		if (strlen(producatorNou) > 0)
		{
			this->producator = new char[strlen(producatorNou) + 1];
			strcpy(this->producator, producatorNou);
		}
	}
	void schimbaDetalii(string modelNou)
	{
		if (modelNou.length() > 0)
			this->model = modelNou;
	}
	void schimbaDetalii(float capacitateNoua)
	{
		if (capacitateNoua > 0)
			this->capacitate = capacitateNoua;
	}
	void serializare()
	{
		ofstream f;
		f.open("motocicleta.bin", ios::binary | ios::out); 
		if (f.is_open())
		{
			int l = strlen(producator);
			f.write((char*)&l, sizeof(l));
			l++;
			f.write(producator, l);
			l = model.length();
			f.write((char*)&l, sizeof(l));
			l++;
			f.write(model.c_str(), l);
			f.write((char*)&capacitate, sizeof(capacitate));
		}
		else
			cout << "Nu s-a deschis fisierul";
	}

	void deserializare()
	{
		ifstream f;
		f.open("motocicleta.bin", ios::binary | ios::in);
		if (f.is_open())
		{
			int l = 0;
			f.read((char*)&l, sizeof(l));
			if (producator != nullptr)
				delete[] producator;
			producator = new char[l]; 
			f.read(producator, l);
			l = 0;
			f.read((char*)&l, sizeof(l));
			l++;
			char* buffer = new char[l];
			f.read(buffer, l);
			model = buffer;
			if (buffer != nullptr)
				delete[] buffer;
			f.read((char*)&capacitate, sizeof(capacitate));
		}
		else
			cout << "Nu s-a deschis fisierul";

	}
};

int Motocicleta::nrMot = 0;

class MotocicletaElectrica : public Motocicleta
{
	int nrLeduri;
	float* putereLed;

public:
	MotocicletaElectrica():Motocicleta()
	{
		this->nrLeduri = 0;
		this->putereLed = nullptr;
	}
	MotocicletaElectrica(int nrLeduri, float* putereLed, const char* producator, string model, float capacitate) :Motocicleta(producator, model, capacitate)
	{
		if (nrLeduri > 0 && putereLed != nullptr)
		{
			this->nrLeduri = nrLeduri;
			this->putereLed = new float[nrLeduri];
			for (int i = 0; i < this->nrLeduri; i++)
			{
				this->putereLed[i] = putereLed[i];
			}
		}
		else
		{
			this->nrLeduri = 0;
			this->putereLed = nullptr;
		}
	}
	MotocicletaElectrica(const MotocicletaElectrica& m):Motocicleta(m)
	{
		if (nrLeduri > 0 && putereLed != nullptr)
		{
			this->nrLeduri = nrLeduri;
			this->putereLed = new float[nrLeduri];
			for (int i = 0; i < this->nrLeduri; i++)
			{
				this->putereLed[i] = putereLed[i];
			}
		}
		else
		{
			this->nrLeduri = 0;
			this->putereLed = nullptr;
		}
	}
	MotocicletaElectrica& operator=(const MotocicletaElectrica& me)
	{
		Motocicleta::operator=(me);
		if (putereLed != nullptr && nrLeduri > 0)
			delete[] putereLed;
		if (me.putereLed != nullptr && me.nrLeduri > 0)
		{
			nrLeduri = me.nrLeduri;
			putereLed = new float[nrLeduri];
			for (int i = 0; i < nrLeduri; i++)
			{
				putereLed[i] = me.putereLed[i];
			}
		}
		else
		{
			nrLeduri = 0;
			putereLed = nullptr;
		}
		return *this;
	}
	~MotocicletaElectrica()
	{
		if (this->putereLed != nullptr)
			delete[] this->putereLed;
	}
	//friend ostream& operator<<(ostream& out, MotocicletaElectrica me)
	//{
	//	{
	//		//apelez operatorul << din clasa de baza!
	//		operator<<(out, (Motocicleta)me);

	//	}
	//}

	//2)CODE ZOMBIE -> TREBUIE ELIMINAT
	

};




int main()
{
	Motocicleta m;
	Motocicleta m1("model1", "a25", 23.5f);
	cout << m;
	cout << m1;
	Motocicleta m2 = m1;
	m = m1;
	cout << m;
	cout << m2;

	Motocicleta m3("prodcatorX", "modelT", 45.6f);
	Motocicleta m4;
	m3.serializare();
	m4.deserializare();
	cout << "dupa deserializare: " << m4 << endl;

	map<string, Motocicleta>motociclete;
	motociclete.insert(make_pair(m1.getModel(), m1));
	motociclete.insert(make_pair(m2.getModel(), m2));
	motociclete.insert(make_pair(m3.getModel(), m3));


	map<string, Motocicleta>::iterator i = motociclete.find("modelT");
	cout << endl << endl;
	if (i != motociclete.end())
		cout << "Modelul " << i->first << " cautat este al motocicletei " << endl << i->second << endl;
	else
		cout << "Nu exista motocicleta cu acest model";

	cout << motociclete["model1"] << endl;

}
