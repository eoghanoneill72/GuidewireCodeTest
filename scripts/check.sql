DROP TABLE IF EXISTS cc_check;
CREATE TABLE cc_check(
	Processed bit NOT NULL,
	CheckNumber varchar(255) NULL,
	PayTo varchar(255) NULL,
	MailTo varchar(255) NULL,
	Comments varchar(255) NULL,
	Amount decimal(18, 2) NULL,	
	ID int NOT NULL PRIMARY KEY);
	
INSERT into cc_check VALUES(0, NULL, 'John Doe', '123 Main Street Hollywood, CA 90210', 'Settlement', 100.00, 1);
INSERT into cc_check VALUES(1, NULL, 'Jane Doe', '456 Main Street Hollywood, CA 90210', 'Settlement', 100.00, 2);
INSERT into cc_check VALUES(0, NULL, 'Jim Doe', '789 Main Street Hollywood, CA 90210', 'Settlement', 100.00, 3);
INSERT into cc_check VALUES(1, NULL, 'Bill Doe', '012 Main Street Hollywood, CA 90210', 'Settlement', 100.00, 4);
INSERT into cc_check VALUES(0, NULL, 'Mark Doe', '345 Main Street Hollywood, CA 90210', 'Settlement', 100.00, 5);
