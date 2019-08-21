# zuulapigateway

#h2db

http://localhost:8033/registration

{

	"id":1,	
	"firstName" : "naman",
	"lastName": "gupta",
	"email": "naman.gupta2007@gmail.com",
	"password": "admin",
	"enabled": "true",
	"role": "ADMIN",
	"phoneNumber": "9650110989"
	
	
}

CREATE TABLE user_table
(
    id int NOT NULL,
    created_date date ,
    email character varying(255),
    enabled boolean,
    first_name character varying(255) ,
    last_name character varying(255) ,
    password character varying(255) ,
    phone_number character varying(255) ,
    role character varying(255) ,
    CONSTRAINT user_table_pkey PRIMARY KEY (id)
)
