# 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
```SQL

CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

```
# 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```SQL

insert into employee (name, birthday, email) values ('Guss Szymanek', '1996-05-15', 'gszymanek0@bbb.org');
insert into employee (name, birthday, email) values ('Kiersten Bortolomei', '1999-10-31', null);
insert into employee (name, birthday, email) values ('Andeee Byrne', '1977-11-24', 'abyrne2@google.com');
insert into employee (name, birthday, email) values ('Nadiya Sturm', '2002-10-10', 'nsturm3@tinyurl.com');
insert into employee (name, birthday, email) values ('Jean Scaice', '1902-01-12', null);
insert into employee (name, birthday, email) values ('Boonie Firebrace', '1997-12-02', 'bfirebrace5@sitemeter.com');
insert into employee (name, birthday, email) values ('Gena McElrath', null, 'gmcelrath6@fastcompany.com');
insert into employee (name, birthday, email) values ('Cornelle Elacoate', '1968-04-24', 'celacoate7@yale.edu');
insert into employee (name, birthday, email) values ('Vaclav Dumbell', '1993-05-14', 'vdumbell8@artisteer.com');
insert into employee (name, birthday, email) values ('Filide Corneliussen', '1950-03-15', 'fcorneliussen9@thetimes.co.uk');
insert into employee (name, birthday, email) values ('Tabbitha Castellan', '2002-11-18', null);
insert into employee (name, birthday, email) values ('Jarred Rouke', '1971-12-29', null);
insert into employee (name, birthday, email) values ('Ralf Francino', '1990-12-25', 'rfrancinoc@furl.net');
insert into employee (name, birthday, email) values ('Ralph Fylan', '2004-07-24', 'rfyland@vinaora.com');
insert into employee (name, birthday, email) values ('Zabrina Sukbhans', '2006-03-28', 'zsukbhanse@nasa.gov');
insert into employee (name, birthday, email) values ('Amelie Micah', '1944-06-21', null);
insert into employee (name, birthday, email) values ('Andy Kimblin', '1950-08-22', null);
insert into employee (name, birthday, email) values ('Deborah Greystoke', '1932-06-29', 'dgreystokeh@skype.com');
insert into employee (name, birthday, email) values ('Kerwinn Compfort', null, 'kcompforti@liveinternet.ru');
insert into employee (name, birthday, email) values ('Wrennie O'' Brian', '1922-06-29', 'woj@fema.gov');
insert into employee (name, birthday, email) values ('Flossi Archibould', '1971-02-17', 'farchibouldk@lycos.com');
insert into employee (name, birthday, email) values ('Debera Boulsher', '1940-08-18', 'dboulsherl@china.com.cn');
insert into employee (name, birthday, email) values ('Kerry Harget', '1921-10-16', 'khargetm@google.nl');
insert into employee (name, birthday, email) values ('Dorothea Furnell', '1977-03-18', 'dfurnelln@storify.com');
insert into employee (name, birthday, email) values ('Melanie Lightbourne', '2011-11-02', 'mlightbourneo@google.ca');
insert into employee (name, birthday, email) values ('Florina Dray', null, 'fdrayp@cmu.edu');
insert into employee (name, birthday, email) values ('Hamish Benettelli', '2008-06-05', 'hbenettelliq@privacy.gov.au');
insert into employee (name, birthday, email) values ('Berry McKeating', '2018-01-18', 'bmckeatingr@digg.com');
insert into employee (name, birthday, email) values ('Ossie Regina', '1928-08-24', 'oreginas@networksolutions.com');
insert into employee (name, birthday, email) values ('Kelby Miell', null, 'kmiellt@bing.com');
insert into employee (name, birthday, email) values ('Kriste Suddick', null, null);
insert into employee (name, birthday, email) values ('Anthe Shirer', '1902-07-30', 'ashirerv@wikia.com');
insert into employee (name, birthday, email) values ('Ainsley Guildford', '2010-06-28', 'aguildfordw@virginia.edu');
insert into employee (name, birthday, email) values ('Gustavus McCarney', null, 'gmccarneyx@nsw.gov.au');
insert into employee (name, birthday, email) values ('Sharona Wortman', '1944-05-15', 'swortmany@icio.us');
insert into employee (name, birthday, email) values ('Saidee Schroeder', '1925-11-02', 'sschroederz@angelfire.com');
insert into employee (name, birthday, email) values ('Alverta Enston', '1957-04-10', 'aenston10@harvard.edu');
insert into employee (name, birthday, email) values ('Niles Crone', '1962-08-16', null);
insert into employee (name, birthday, email) values ('Gabie Clousley', '1982-11-17', 'gclousley12@sitemeter.com');
insert into employee (name, birthday, email) values ('Elfreda Caddy', '1928-09-05', 'ecaddy13@virginia.edu');
insert into employee (name, birthday, email) values ('Ed Hendrix', '1987-11-26', 'ehendrix14@google.com');
insert into employee (name, birthday, email) values ('Ilaire Roney', null, 'ironey15@ibm.com');
insert into employee (name, birthday, email) values ('Eloise Cuckson', '1978-12-10', 'ecuckson16@yandex.ru');
insert into employee (name, birthday, email) values ('Ive Prestedge', '1904-08-14', 'iprestedge17@meetup.com');
insert into employee (name, birthday, email) values ('Cheryl Legon', '1945-07-24', 'clegon18@usda.gov');
insert into employee (name, birthday, email) values ('Moises Wingate', '2007-01-12', 'mwingate19@intel.com');
insert into employee (name, birthday, email) values ('Tiena Semble', '1986-03-14', 'tsemble1a@discovery.com');
insert into employee (name, birthday, email) values ('Annalise Leuren', '1971-03-23', 'aleuren1b@360.cn');
insert into employee (name, birthday, email) values ('Giulio Biddlecombe', '1904-04-11', 'gbiddlecombe1c@geocities.jp');
insert into employee (name, birthday, email) values ('Sibilla Jurges', null, 'sjurges1d@economist.com');

```

# 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```SQL

UPDATE employee
SET email = 'kiersten@bortolomei.com'
WHERE name = 'Kiersten Bortolomei'
RETURNING *;

UPDATE employee
SET name = 'Harry Potter'
WHERE id = 8
RETURNING *;

UPDATE employee
SET birthday = '1995-07-29'
WHERE id = 7
RETURNING *;

UPDATE employee
SET name = 'Pablo Escobar'
WHERE birthday = '1993-05-14'
RETURNING *;

UPDATE employee
SET name = 'Mamma mia'
WHERE email = 'woj@fema.gov'
RETURNING *;

```

# 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```SQL
DELETE FROM employee
WHERE name = 'Amelie Micah'
RETURNING*;

DELETE FROM employee
WHERE id = 14
RETURNING*;

DELETE FROM employee
WHERE email = 'khargetm@google.nl'
RETURNING*;

DELETE FROM employee
WHERE birthday = '1993-05-14'
RETURNING*;

DELETE FROM employee
WHERE name = 'Dorothea Furnell'
RETURNING*;
```