#Set B

#Q1.
import matplotlib.pyplot as plt 
from sklearn.datasets import load_iris

iris=load_iris()
data=iris.data
petal_length=data[:,0]
petal_width=data[:,1]
plt.figure(figsize=(10,5))
plt.scatter(petal_length,petal_width,c=iris.target)
plt.title('Comparison between Petal length and Petal width')
plt.xlabel('Petal Length')
plt.ylabel('Petal Width')
plt.show()

#Q2.
import matplotlib.pyplot as plt 
from sklearn.datasets import load_iris
iris=load_iris()
data=iris.data
sepal_length=data[:,0]
sepal_width=data[:,1]
plt.figure(figsize=(10,5))
plt.scatter(sepal_length,sepal_width,c=iris.target)
plt.title('Relationship between Sepal length and Sepal width')
plt.xlabel('Sepal Length')
plt.ylabel('Sepal Width')
plt.colorbar(ticks=[0,1,2],label='species')
plt.grid(True)
plt.show()

#Q3.
import matplotlib.pyplot as plt 
from sklearn.datasets import load_iris
iris=load_iris()
data=iris.data
features=iris.feature_names
species=iris.target_names
for i,features in enumerate(features):
      plt.figure(figsize=(10,5))
      plt.boxplot([data[iris.target==j,i]for j in range(3)])
      plt.xticks([1,2,3],species)
      plt.title('Boxplot for Features')
      plt.xlabel('Species')
      plt.ylabel('cm')
      plt.grid(True)
plt.show()

