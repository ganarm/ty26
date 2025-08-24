'''
from pandas import *
df=DataFrame(columns=['name','age','percentage'])
print(df)
df.loc[0]=['Ganesh',19,96]
print(df)
df.loc[1]=['Sanat',20,90]
df.loc[2]=['Darshan',23,89]
df.loc[3]=['Arya',17,68]
df.loc[4]=['Kalpesh',15,84]
df.loc[5]=['Lucky',12,78]
df.loc[6]=['Monu',16,96]
df.loc[7]=['Atharv',17,94]
df.loc[8]=['Omkar',14,64]
df.loc[9]=['Jay',19,53]
print(df)
print("\nShape of dataframe : ",df.shape)
print("\nNo of rows : ",df.shape[0])
print("\nNo of columns : ",df.shape[1])
print("\nData types : ",df.dtypes)
print("\nFeatures (COLUMNS) Name : ",df.columns)
print("Statistical Data : ",df.describe())
df.loc[10]=['Ganesh',19,96]
df.loc[11]=[None,17,91]
df.loc[12]=['Jaya',None,70]
df.loc[13]=['abc',None,None]
df.loc[14]=['Abhi',None,85]
print(df)
df['remarks']=None;
print(df)
print("No of observations : ",df['name'].count()+1)
print("no of null observations : ",df.isnull().sum())
print("NO of Dublicated observations : ",df.duplicated().sum())
df.drop(columns="remarks",axis=1,inplace=True)
print(df)
from matplotlib.pyplot import *

df.plot(x="name",y="percentage",color="pink")
xlabel("NAME")
ylabel("PERCENTAGE")
title("LINE PLOT")
show()
'''
from matplotlib.pyplot import *
from pandas import *
df=DataFrame(columns=['name','age','percentage'])
print(df)
df.loc[0]=['Ganesh',19,96]
print(df)
df.loc[1]=['Sanat',20,90]
df.loc[2]=['Darshan',23,89]
df.loc[3]=['Arya',17,68]
df.loc[4]=['Kalpesh',15,84]
df.loc[5]=['Lucky',12,78]
df.loc[6]=['Monu',16,96]
df.loc[7]=['Atharv',17,94]
df.loc[8]=['Omkar',14,64]
df.loc[9]=['Jay',19,53]
print(df)
df.plot.scatter(x="name",y="percentage",color='r',marker='*')
grid(True)
show()




