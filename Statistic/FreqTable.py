import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# data from the assignment
data = [
    21, 20, 31, 24, 15, 21, 24, 18, 33,  8,
    26, 17, 27, 29, 24, 14, 29, 41, 15, 11,
    13, 28, 22, 16, 12, 15, 11, 16, 18, 17,
    29, 16, 24, 21, 19,  7, 16, 12, 45, 24,
    21, 12, 10, 13, 20, 35, 32, 22, 12, 10
]

# convert to a pandas series
dataSeries = pd.Series(data)

# creating the freq table

# use pandas 'cut' to automatically create 5 equal intervals
intervalData = pd.cut(dataSeries, bins=5)

# calculate the frequency for each interval
freqTable = intervalData.value_counts().sort_index().to_frame(name='Frequency')

# add relative and cumulative frequency columns
totCount = freqTable['Frequency'].sum()
freqTable['Relative Frequency'] = freqTable['Frequency'] / totCount
freqTable['Cumulative Frequency'] = freqTable['Relative Frequency'].cumsum()
freqTable.index.name = 'Class Interval'

# display the frequency table
print("--- Frequency Table ---")
print(freqTable)
print("\n")

# creating the hstogram ---

# get the exact bin edges
counts, bin_edges = np.histogram(dataSeries, bins=5)

# create the plot figure
plt.figure(figsize=(10, 6))

# create the histogram
plt.hist(dataSeries, bins=bin_edges, edgecolor='black', color='cornflowerblue')

# set informative labels and title
plt.title('Histogram of Assignment Data (5 Bins)')
plt.xlabel('Value')
plt.ylabel('Frequency')

# set the x-axis ticks to show the exact interval edges
plt.xticks(bin_edges)
plt.grid(axis='y', linestyle='--', alpha=0.7)

print("Displaying Histogram plot...")
plt.show()
