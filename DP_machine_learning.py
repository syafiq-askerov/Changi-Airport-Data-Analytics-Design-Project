cd C:\Users\syafiq\Desktop\Machine learning\2014-2018 Cargo data\Combined data

%matplotlib inline
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
plt.rcParams['figure.figsize'] = (20.0,10.0)
data = pd.read_csv('numeric Loaded Cargo Analysis.csv')
print(data.shape)
data.head()

#collecting X & Y
X = data['month'].values
Y = data['Average Air Cargo Loaded (tonnes)'].values

# Mean X and Y
mean_x = np.mean(X)
mean_y = np.mean(Y)

# total number of values
m = len(X)


numer = 0
denom = 0
for i in range(m):
    numer += (X[i] - mean_x) * (Y[i] - mean_y)
    denom += (X[i] - mean_x) ** 2
b1 = numer / denom  #b1 is M(gradient)
b0 = mean_y - (b1 * mean_x)   #b0 is C (y-intercept)

print(b1,b0)    


#plotting Values and regression line
max_x = np.max(X) + 1
min_x = np.min(X) - 1

# calculating line values x and y
x = np.linspace(min_x, max_x, 1000)
y = b0 + b1 * x

#ploting Line
plt.plot(x, y , color='#58b970', label='Rehression Line')
# ploting Scatter Point
plt.scatter(X, Y, c='#ef5423' , label='scatter Plot')
plt.xlabel('month')
plt.ylabel('Average Air Cargo Loaded (tonnes)')
plt.legend()
plt.show()

#calculating r-square to find accuracy
ss_t = 0 #total sum of errors numerator
ss_r = 0 #total sum of errors denominator
for i in range(m):
    y_pred = b0 + b1 * X[i]
    ss_t += (Y[i] - mean_y) ** 2
    ss_r += (Y[i] - y_pred) ** 2
r2 = 1 - (ss_r/ss_t)    
print(r2) 
