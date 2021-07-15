1. nalezy utworzyć bazę danych:
    w cmd wpisać mysql -u root -p
    wpisać hasło 
    wpisać następujące komendy 
	create database db_samochody;
	create user 'springuser'@'%' identified by 'ThePassword';
	grant select, insert, delete, update on db_samochody.* to 'springuser'@'%';

2.
Należy zainstalować odadtek curl

DODAWANIE SAMOCHODU:
	w cmd wpisujemy bez średnika ;-)
	curl localhost:8080/wypozycz/add -d marka=honda -d przebieg=100 -d moc=2000 -d wypozyczony=false	
	dane przykładowe
USUWANIE SAMOCHODU:
	w cmd wpisujemy
	curl localhost:8080/wypozycz/delete/<numer id usuwanego samochodu>
WYPOŻYCZENIE LUB ODDANIE WYPOŻYCZONEGO SAMOCHODU:
	w cmd wpisujemy 
	curl localhost:8070/wypozycz/wypozyczLUBzwruc/<numer id wypozyczonego/oddawanego samochodu>
ZMIANA DANYCH SAMOCHODU:
	w cmd wpisujemy
	curl localhost:8070/wypozycz/zamien/przebieg_na/<nowyPrzebieg>/<numer id zmienianego samochodu>
lub 
	curl localhost:8070/wypozycz/zamien/moc_na/<nowaMoc>/<numer id zmienianego samochodu> 

