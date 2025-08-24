#Set A :
'''
#Q1.
import numpy as np
import matplotlib.pyplot as p

np.random.seed(42)
random_data=np.random.randint(1,100,50)

fig,axs=p.subplots(2,2,figsize=(12,8))
fig.suptitle('RANDOM INTEGER DATA VISUALIZATION')

axs[0,0].plot(random_data,'bo-')
axs[0,0].set_title('Line Chart')
axs[0,0].set_xlabel('Index')
axs[0,0].set_ylabel('Value')



axs[0,1].hist(random_data,bins=10,color='b',alpha=0.7)
axs[0,1].set_title('Histogram')
axs[0,1].set_xlabel('Value')
axs[0,1].set_ylabel('Frequency')

axs[1,0].scatter(range(50),random_data,color='g',marker='x')
axs[1,0].set_title('Scatter Plot')
axs[1,0].set_xlabel('Index')
axs[1,0].set_ylabel('Value')


axs[1,1].boxplot(random_data,vert=False,patch_artist=True,boxprops=dict(facecolor='y'))
axs[1,1].set_title('Box plot')

p.tight_layout(rect=[0,0,1,0.85])
p.show()
'''

#Q2.
import numpy as np
import matplotlib.pyplot as p

np.random.seed(42)
random_data=np.random.randint(1,100,200)

outliers=[150,175]
random_data=np.append(random_data,outliers)

fig,axs=p.subplots(1,2,figsize=(12,6))
fig.suptitle('RANDOM INTEGER DATA VISUALIZATION')

axs[0].boxplot(random_data[:-2],vert=False,patch_artist=True,boxprops=dict(facecolor='y'))
axs[0].set_title('Box plot (No Outliers)')

axs[1].boxplot(random_data,vert=False,patch_artist=True,boxprops=dict(facecolor='y'))
axs[1].set_title('Box plot (No Outliers)')

p.tight_layout(rect=[0,0,1,0.85])
p.show()

'''
#Q3.

import matplotlib.pyplot as p
subject=['Math','Science','History','English','Arts']
marks=[90,85,75,92,88]
p.figure(figsize=(8,8))
p.pie(marks,labels=subject,autopct='%1.1f%%',startangle=140)
p.title('Marks Distribution of By Subject')
p.axis('equal')
p.figure(figsize=(10,6))
p.bar(subject,marks,color='green')
p.title('Marks Distribution of By Subject')
p.xlabel('subject')
p.ylabel('marks')
p.ylim(0,100)
p.tight_layout()
p.show()

#Q4.
import seaborn as sns
import matplotlib.pyplot as p

iris_data=sns.load_dataset('iris')
species_counts=iris_data['species'].value_counts()
p.figure(figsize=(10,6))
sns.barplot(x=species_counts.index,y=species_counts.values,palette='viridis')
p.title('Frequency of Iris Species')
p.xlabel('Species')
p.ylabel('Frequency')
p.show()


#Q5.
import seaborn as sns
import matplotlib.pyplot as p

iris_data=sns.load_dataset('iris')
species_counts=iris_data['species'].value_counts()
p.figure(figsize=(8,6))
p.pie(species_counts,labels=species_counts.index,autopct='%1.1f%%',colors=['blue','green','yellow'])
p.title('Frequency of Iris Species')
p.axis('equal')
p.show()


#Q6.
import pandas as pd
from matplotlib import pyplot as plt
import sklearn.datasets

def get_iris_df():
    ds=sklearn.datasets.load_iris()
    df=pd.DataFrame(ds['data'],columns=ds['feature_names'])
    code_species_map=dict(zip(range(3),ds['target_names']))
    df['species']=[code_species_map[c] for c in ds['target']]
    return df
    df=get_iris_df()
#Q5.    
    sums_by_species=df.groupby('species').sum()
    sums_by_species.plot(kind='pie',subplots=True,layout=(2,2),legend=False)
    plt.ylabel(var,horizontalalignment='left')
    plt.title('Total Measurement by Species')
#Q4.    
    sums_by_species=df.groupby('species').sum()
    var='sepal width(cm)'
    sums_by_species[var].plot(kind='bar',fontsize=20)
    plt.ylabel(var,horizontalalignment='left')
    plt.title('breakdown for' +var, fontsize=25)
    plt.show()
'''

