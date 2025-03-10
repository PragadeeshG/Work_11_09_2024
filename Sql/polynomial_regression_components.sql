create table if not exists polynomial_regression_components(
run_by Integer not null,
decision_tree varchar(255) null,
predict_from varchar(255) null,
target_column varchar(255) null,
stages varchar(255) null,
hierarchical_clustering char null,
clustering_data_point char null,
cluster_visualizer char null,
scatter_plot varchar(255) null,
bottom_up_approach varchar(255) null,
linkage_method Integer null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint polynomial_regression_components_pk primary key(run_by));