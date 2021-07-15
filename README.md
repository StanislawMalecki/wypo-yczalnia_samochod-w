[README.txt](https://github.com/StanislawMalecki/wypozyczalnia_samochodow/files/6822160/README.txt)
1. nalezy utworzyć bazę danych:
    w cmd wpisać mysql -u root -p
    wpisać hasło 
    wpisać następujące komendy 
	create database db_samochody;
	create user 'springuser'@'%' identified by 'ThePassword';
	grant select, insert, delete, update on db_samochody.* to 'springuser'@'%';
