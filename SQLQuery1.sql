create database PRJ301_YourID
go
use PRJ301_YourID
go
create table YourID(
	CourseID varchar(4) not null primary key 
	check(CourseID like 'C[0-9][0-9][0-9]'),
	Subject nvarchar(20) not null,
	LectureName nvarchar(20),
	Credit int,
)
INSERT INTO YourID (CourseID, Subject, LectureName, Credit)
VALUES 
    ('C123', 'Math', 'Professor A', 3),
    ('C234', 'History', 'Professor B', 4),
    ('C345', 'Computer Science', 'Professor C', 3);