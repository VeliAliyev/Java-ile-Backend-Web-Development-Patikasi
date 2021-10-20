# 1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
```SQL
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer

ORDER BY first_name;
```
# 2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
```SQL
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer

ORDER BY first_name;
```
# 3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
```SQL
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer

ORDER BY first_name;
```
# 4. İlk 3 sorguyu tekrar eden veriler için de yapalım.
## 1. Sorgu:
```SQL
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer

ORDER BY first_name;
```
## 2. Sorgu(sonuç değişmez):
```SQL
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer

ORDER BY first_name;
```
## 3. Sorgu:
```SQL
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer

ORDER BY first_name;
```