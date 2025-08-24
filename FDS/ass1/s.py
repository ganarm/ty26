from pandas import *
df=read_csv("hw.csv")
print(df)
print("\n1st 10 Data Elements : ", df.head(10))
print("\nLast 10 Data Elements : ", df.tail(10))
print("\nRandom DATA set of size 20 : ",df.sample(20))
print("\nShape : ",df.shape)
print("\nSize : ",df.size)
print("\nData Types : ",df.dtypes)
print("\nStatistical Data : ",df.describe())
print("\nNo of observations : ",df['Height(Inches)'].count()+1)
print("\nno of null observations : ",df.isnull().sum())
print("\nNO of Dublicated observations : ",df.duplicated().sum())
# print("\nNO of NAN Values : ")
df.fillna("NAN")
df['BMI']=df['Weight(Pounds)']/(df['Height(Inches)'])**2
print(df)
print("\nMaximum BMI : ",df['BMI'].max())
print("\nMinimum BMI : ",df['BMI'].min())
print("\n")
print("\n")
from matplotlib.pyplot import *
df.plot.scatter(x='Height(Inches)',y='Weight(Pounds)',color='r',marker="*")
title("Scattter plot of height vs weight")
show()




