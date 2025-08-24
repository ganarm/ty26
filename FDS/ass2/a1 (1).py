#1 , 3 , 6

import numpy as np
from pandas import *

fa=np.array([[1,2,3],[4,5,6],[7,8,9]])
print(fa)
print('Maximum value of the above flattened array :\n',fa.max())
print('Minimum value of the above flattened array :\n',fa.min())
df=DataFrame(columns=['name','age','percentage'])
print('\ndata set : \n',df)
df.loc[0]=['Ganesh',19,96]
df.loc[1]=['Sanat',20,90]
df.loc[2]=['Darshan',23,89]
df.loc[3]=['Arya',17,68]
df.loc[4]=['Kalpesh',15,84]
df.loc[5]=['Lucky',12,78]
df.loc[6]=['Monu',16,96]
df.loc[7]=['Atharv',17,94]
df.loc[8]=['Omkar',14,64]
df.loc[9]=['Jay',19,53]
print('\ndata set : \n',df)
print(np.mean(df['age']))
m=df['age'].min()
n=df['age'].max()
r=n-m
print("RANGE of age : ",r)
m=df['percentage'].min()
n=df['percentage'].max()
r=n-m
print("RANGE of percentage : ",r)
m=df['percentage'].quantile(0.25)
n=df['percentage'].quantile(0.75)
r=n-m
print("IQR : ",r)
print("Average age : ",df['age'].mean())
print("Average Percentage : ",df['percentage'].mean())
print("Describe : \n",df.describe())
'''
#2
from numpy import *
point1=array([1,1])
point2=array([2,2])
d=linalg.norm((point1-point2))
print("Euclidean distance  : ",d)

#4

p=(1,2,3,4)
q=(5,6,7,8)
d=0
s=0
for x1,x2 in zip(p,q):
  d=abs(x2-x1)
  s=s+d
print("Manhattan distance : ",s)

#5
from numpy import *
from matplotlib.pyplot import *
nums=array([0.5,0.7,1.0,1.2,1.3,2.1])
bins=array([0,1,2,3])
print("nums:",nums)
print("bins:",bins)
print(histogram(nums,bins))
hist(nums,bins,edgecolor="r",alpha=0.3)
xlabel("NUMS")
ylabel("BINS")
show()
'''

#set B



 








