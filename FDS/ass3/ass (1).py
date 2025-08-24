#Set A :

#Q1.
'''
from pandas import *
df=read_csv("Data.csv")
print("Description of Data : ")
print(df.describe())
print("-----------------")
print("Shape of data : ",df.shape)
print("-----------------")
print("First 3 rows are : ")
print(df.head(3))
'''
#Q2.

from pandas import *
df=read_csv("Data.csv")
print("Missing Values : ",df.isnull())
print("------------------")
#df.fillna(0)
#print(df)
#print("------------------")
mean_age=df['Age'].mean().round(2)
print("Mean of Age : ",mean_age)
print("------------------")
mean_salary=df['Salary'].mean().round(2)
print("Mean of Salary : ",mean_salary)
df['Age'].fillna(mean_age,inplace=True)
df['Salary'].fillna(mean_salary,inplace=True)
print(df)

#Q3.
'''
import pandas as pd
from sklearn import preprocessing
data=pd.read_csv("data.csv")
df=pd.DataFrame(data)
label_enc=preprocessing.LabelEncoder()
df=label_enc.fit_transform(df['Purchased'])
print(df)
'''

#SET B : 

#Q1.

import pandas as pd
import numpy as np
from sklearn import preprocessing
import scipy.stats as s
data=pd.read_csv("winequality-red.csv")
print(data)
print("Rescaling Data : ")
print("\n Data scaled between 0 and 1 ")
data_scaler=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scaler.fit_transform(data)
print("------------------")
print(data_scaled.round(2))

print("\n  Standardizing Data  ")
print("------------------")
a=np.array(data)
print("Initial mean : ",s.tmean(a))
print("Standard Deviation : ",a.std())
x_scaled=preprocessing.scale(a)
x_scaled.mean(axis=0)
x_scaled.std(axis=0)
print("Standardizing Data : ",x_scaled.round(2))
print("Scaled Mean : ",s.tmean(x_scaled))
print("Scaled Standard Deviation : ",x_scaled.std())

print("\n L1 Normalizing Data  ")
print("------------------")
dn=preprocessing.normalize(data,norm='l1')
print(dn.round(2))

print("\n  Binarizing Data  ")
print("------------------")
data_binarized=preprocessing.Binarizer(threshold=1).transform(data)
print(data_binarized)

'''

