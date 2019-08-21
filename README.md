# Syafiq Bashir's Design Project

This reposistory consists of contents from Syafiq's design project.

**Design project:** Developing a Data Analysis Interface for Changi Airport.

Elasticsearch, Logstash, Kibana and Jupyter Notebook are the four Open-source tools are used for this project. 

Dashboard One and Dashboard Two are developed using three Open-source tools, the tools are namely Elasticsearch,Logstash and Kibana(ELK Stack). They are utlised for the purpose of data visualizations and analysis.

Jupyter Notebook is used as the Machine Learning tool for predictive analysis by utilising Linear Regression algorithm. 


## Dashboard One 

Dashboard One portrays data analysis of Changi Airport’s passengers population and air cargo data over a period of five years from several countries. Data displayed in Dashboard one are authentic as datasets are obtained from public data portal in CSV format.There are an estimated amount of 4000 rows consisting of air cargo loaded in tonnes information and 7000 rows of passenger’s arrival by country information data in CSV format that are loaded into Elasticsearch. 

**Data pipeline for Dashboard One

![dashboard One pipeline](https://user-images.githubusercontent.com/47980926/63438842-9c9d4300-c45f-11e9-9973-5e7df09771c0.JPG)

An example of datasets source:
https://data.gov.sg/dataset/air-passenger-arrivals-total-by-region-and-selected-country-of-embarkation?resource_id=efd7b75b-992e-4221-aff3-c57140af1f67

The purpose of Dashboard one would be to would be to provide analysis of large datasets through a simple interface. An example would be  querying for countries where air cargo loaded is above 10000kg.

![D1 top ss](https://user-images.githubusercontent.com/47980926/58750954-fc242c00-84ca-11e9-910a-dbc580661220.JPG)
![Dashboard One Loaded cargo and passengers analysis](https://user-images.githubusercontent.com/47980926/58750956-047c6700-84cb-11e9-9193-35b05a26a5c9.JPG)

## Dashboard Two

Data displayed in Dashboard Two are artificial as datasets are obtained from developing a data generation program in Java.

The purpose of Dashboard Two would be to simulate analysis of near "Real-Time" datsets. The key feature of Dashboard Two would be to provide the end user with a clear visual representation of datasets that have exceeded threshold limits. The dashboard visuals will capture datasets(in the bottom right of the image below) if certain threshold values have been surpassed.

Dashboard Two could function as a threshold alert system as troubleshooting could be narrowed down to timestamps where datasets have exceeded the threshold values that are being placed.

![dashboard 2 top ss](https://user-images.githubusercontent.com/47980926/58751127-1232ec00-84cd-11e9-8ba7-fdcc0b526210.JPG)
![Dashboard Two bottom](https://user-images.githubusercontent.com/47980926/58751135-17903680-84cd-11e9-906d-88043f2aa6e2.JPG)

## Machine learning 

Supervised Machine Learning through usage of Linear Regression Algorithm is utlised for predictive analysis of Changi Airport's air cargo datasets. Air cargo data in the year 2019 are forecasted based on datasets of air cargo from years ranging between 2014 to 2018. Authentic datasets of air cargo loaded from years ranging between 2014 to 2018 were obtained from data.gov.sg.

![regression lines](https://user-images.githubusercontent.com/47980926/62994977-329a0200-be91-11e9-9d74-ccb448d65aef.JPG)

The variable “x” and “y” represents datasets in the independent and dependent axis respectively. The variable “x” are the varying timestamps plots and “y” are the varying loaded cargo values. The variable “x ̅” and “y ̅” are the mean values of the timestamp and air cargo.

After calculation of the slope of Regression line is done, the Y-intercept calculation of the Regression line is carried out. This can be done by using the equation of a straight line.

![esl snip](https://user-images.githubusercontent.com/47980926/62995488-67a75400-be93-11e9-9101-620f5ee6e3ca.JPG)

In order to first calculate the Y-intercept of the Regression line, y and x are taken to be mean values from the dependent and independent variable respectively. After the Y-intercept is calculated, the slope and Y-intercept values will be a constant in the equation of a straight line and varying independent variable values will be substituted in the equation to solve for Regression line values

Programming in Python is done with the usage of NumPy, matplotlib and Pandas libraries for computing and plotting purposes. The Regression Line output is displayed through usage of Jupyter Notebook, the Regression line(in green) is taken as the forcasted value of air cargo loaded in 2019.

![Machine learning](https://user-images.githubusercontent.com/47980926/58751594-13671780-84d3-11e9-8677-05ad32e46bb2.JPG)


**Testing is done to determine the accuracy of Regression line.**

The R-squared method is used to determine accuracy of Regression Line. The R-squared is a statistical measure of how close data are fitted to the Regression Line.

![R-squared](https://user-images.githubusercontent.com/47980926/62994782-442eda00-be90-11e9-8e01-cbdffb5e54b3.JPG)

The variable “R^2” represents the R-squared value, the variable “Py” represents the plotted regression line values and the variable “y ̅” represents the calculated mean of the air cargo values.

The R-squared value is calculated to be **0.106 or 10.6%**. This possibly could be due to the large standard deviation among the air cargo datasets that can be observed from the scattered plots.
