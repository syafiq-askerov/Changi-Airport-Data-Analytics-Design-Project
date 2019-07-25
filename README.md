# Syafiq Bashir's Design Project

This reposistory consists of contents from Syafiq's design project.

**Design project:** Developing a Data Analysis Interface for Changi Airport.
Elasticsearch, Logstash, Kibana and Jupyter Notebook are the four Open-source tools are used for this project. 

Dashboard One and Dashboard Two are developed using three Open-source tools namely Elasticsearch,Logstash and Kibana(ELK Stack) for the purpose of data visualizations and analysis.

Jupyter Notebook is used as the Machine Learning tool for predictive analysis by utilising Linear Regression algorithm. 


## Dashboard One 

Dashboard One portrays data analysis of Changi Airport’s passengers population and air cargo data over a period of five years from several countries. Data displayed in Dashboard one are authentic as datasets are obtained from public data portal in CSV format.There are an estimated amount of 4000 thousand rows consisting of air cargo loaded in tonnes information and 7000 rows of passenger’s arrival by country information data in CSV format that are loaded into Elasticsearch. 

An example of datasets source:
https://data.gov.sg/dataset/air-passenger-arrivals-total-by-region-and-selected-country-of-embarkation?resource_id=efd7b75b-992e-4221-aff3-c57140af1f67

The purpose of Dashboard one would be to would be to provide analysis of large datasets through a simple interface. An example would be  querying for countries where air cargo loaded is above 10000kg.

![D1 top ss](https://user-images.githubusercontent.com/47980926/58750954-fc242c00-84ca-11e9-910a-dbc580661220.JPG)
![Dashboard One Loaded cargo and passengers analysis](https://user-images.githubusercontent.com/47980926/58750956-047c6700-84cb-11e9-9193-35b05a26a5c9.JPG)

## Dashboard Two

Data displayed in Dashboard Two are artificial as datasets are obtained from developing a data generation program in Java.

The purpose of Dashboard Two would be to simulate analysis of data from a server as datasets are generated in near "Real-Time". The dashboard visuals will capture datasets(in the bottom right of the image below) if certain threshold values have been surpassed.

A usecase for Dashboard Two would be for troubleshooting as investigations could be narrowed down to timestamps where datasets have exceeded the threshold value placed. 

![dashboard 2 top ss](https://user-images.githubusercontent.com/47980926/58751127-1232ec00-84cd-11e9-8ba7-fdcc0b526210.JPG)
![Dashboard Two bottom](https://user-images.githubusercontent.com/47980926/58751135-17903680-84cd-11e9-906d-88043f2aa6e2.JPG)

## Machine learning 

Linear Regression Algorithm is used in Python for predictive analysis to forecast Changi Airport's 2019 air cargo loaded data based on auhentic datasets of air cargo loaded from years ranging between 2014 to 2018. Datasets of air cargo loaded from years ranging between 2014 to 2018 are obtained from data.gov.sg.

The Regression line(in green) is taken as the predictive value of air cargo loaded in 2019.The Visual below is developed by utilizing Jupyter Notebook.

![Machine learning](https://user-images.githubusercontent.com/47980926/58751594-13671780-84d3-11e9-8677-05ad32e46bb2.JPG)
