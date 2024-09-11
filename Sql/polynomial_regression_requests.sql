create table if not exists polynomial_regression_requests(
regression_section_code Integer not null,
polynomial_regression_approval1 varchar(255) null,
polynomial_regression_approval_message1 varchar(255) null,
polynomial_regression_approval2 varchar(255) null,
polynomial_regression_approval_message2 varchar(255) null,
data_points Integer null,
data_points_aggregate Integer null,
linear_regression varchar(255) null,
x_variables varchar(255) null,
y_variables varchar(255) null,
variable_relationship varchar(255) null,
constraint polynomial_regression_requests_pk primary key(regression_section_code));