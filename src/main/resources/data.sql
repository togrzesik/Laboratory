DROP TABLE IF EXISTS pacjent;
DROP TABLE IF EXISTS pracownik;
DROP TABLE IF EXISTS wyniki;

CREATE TABLE pacjent(
  id_pacjenta serial NOT NULL,
  imie character varying(40) NOT NULL,
  nazwisko character varying(40) NOT NULL,
  data_urodzenia date NOT NULL,
  nr_telefonu character varying(9) NOT NULL,
  pesel character varying(11) NOT NULL,
  CONSTRAINT pkey PRIMARY KEY (id_pacjenta),
  CONSTRAINT pesel CHECK (pesel::text ~ '\d{11}$'::text),
  CONSTRAINT valid_phone_number CHECK (nr_telefonu::text ~ '\d{9}$'::text)
);

CREATE TABLE pracownik(
  id_pracownika serial NOT NULL,
  imie character varying(40) NOT NULL,
  nazwisko character varying(40) NOT NULL,
  data_urodzenia date NOT NULL,
  stanowisko character varying(40) NOT NULL,
  CONSTRAINT pracownik_pkey PRIMARY KEY (id_pracownika),
  CONSTRAINT chk_typ CHECK (stanowisko::text = ANY (ARRAY['recepcjonista'::character varying, 'laborant'::character varying, 'recepcjonistka'::character varying]::text[]))
);

CREATE TABLE wyniki(
  id_wynikow serial NOT NULL,
  choroby character varying NOT NULL,
  pracownik_id integer NOT NULL,
  pacjent_id integer NOT NULL,
  CONSTRAINT wyniki_pkey PRIMARY KEY (id_wynikow),
  CONSTRAINT pacjent_fk FOREIGN KEY (pacjent_id)
      REFERENCES pacjent (id_pacjenta) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk FOREIGN KEY (pracownik_id)
      REFERENCES laboratorium.pracownik (id_pracownika) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

INSERT INTO pacjent VALUES (1,'Adam','Nowacki','20-05-1999','123456789','97042949384');
INSERT INTO pacjent VALUES (3,'Jan','Kowalski','22-12-1990','123123123','12345678912');
INSERT INTO pacjent VALUES (4,'Jan','Marcin','05-10-2000','123456123','76554312343');
INSERT INTO pacjent VALUES (5,'Tomasz','Grzesik','04-06-1998','602329289','98060405174');
INSERT INTO pacjent VALUES (6,'Piotr','Kowalski','01-01-1970' ,'123456789','12345678900');

INSERT INTO pracownik VALUES (1,'Adam','Nowacki','20-05-1999','recepcjonista');
INSERT INTO pracownik VALUES (3,'asd','asd','12-12-2000','recepcjonista');
INSERT INTO pracownik VALUES (4,'aleks','ciurej','09-04-2019','recepcjonista');

INSERT INTO wyniki VALUES (1,'',1,1)
INSERT INTO wyniki VALUES (2,'OB, HGB, WBC, RBC',1,3)
INSERT INTO wyniki VALUES (3,'Niedoczynnosc traczycy, Zaburzenia funkcji filtracyjnych nerek, Osteoporoza, Zaburzenia funkcji trzustki',1,3);
INSERT INTO wyniki VALUES (4,'Hipoglikemia, Osteoporoza',1,3);
INSERT INTO wyniki VALUES (5,'Hipoglikemia, Leukocytoza, Przewlekle choroby pluc lub nerek, Osteoporoza');
INSERT INTO wyniki VALUES (6,'Hipoglikemia, Leukocytoza, Przewlekle choroby pluc lub nerek, Osteoporoza');
INSERT INTO wyniki VALUES (7,'Hipoglikemia, Leukocytoza, Przewlekle choroby pluc lub nerek, Osteoporoza');
INSERT INTO wyniki VALUES (8,'Hipoglikemia, Leukocytoza, Przewlekle choroby pluc lub nerek, Osteoporoza');
