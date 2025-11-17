# question_3

import numpy as np
from scipy import stats
import matplotlib.pyplot as plt

def analyze_iq_data():
    # The dataset of 50 student IQ scores
    data = np.array([
        129, 99, 98, 113, 103, 128, 102, 110, 80, 105,
        93, 98, 109, 109, 100, 111, 106, 96, 108, 90,
        104, 94, 92, 119, 127, 89, 95, 92, 105, 108,
        83, 100, 107, 106, 101, 118, 84, 119, 105, 111,
        118, 106, 122, 120, 102, 117, 103, 117, 103, 88
    ])

    print("--- Analysis of Student IQ Scores ---")
    print(f"Data points (N): {len(data)}")

    # a. tentukan nilai mean, median, dan modusnya
    print("\n--- Mean, Median, Mode ---")
    mean = np.mean(data)
    median = np.median(data)

    # sort data for clarity when finding mode manually (and for median check)
    data_sorted = np.sort(data)

    mode_result = stats.mode(data)

    print(f"  Mean: {mean:.2f}")
    print(f"  Median: {median}")
    print(f"  Mode: {mode_result.mode} (appears {mode_result.count} times)")

    # b. tentukan nilai Q1, Q2, Q3, dan IQR dari data tersebut
    print("\n--- Quartiles and IQR ---")
    q1 = np.percentile(data, 25)
    q2 = np.percentile(data, 50)
    q3 = np.percentile(data, 75)
    iqr = q3 - q1

    print(f"  Q1 (25th Percentile): {q1}")
    print(f"  Q2 (50th Percentile / Median): {q2}")
    print(f"  Q3 (75th Percentile): {q3}")
    print(f"  Interquartile Range (IQR = Q3 - Q1): {iqr}")

    # c. apakah terdapat outlier pada data tersebut?
    print("\n--- Outlier Detection ---")
    lower_fence = q1 - (1.5 * iqr)
    upper_fence = q3 + (1.5 * iqr)

    print(f"  Lower Fence (Q1 - 1.5*IQR): {lower_fence:.2f}")
    print(f"  Upper Fence (Q3 + 1.5*IQR): {upper_fence:.2f}")

    # find outliers
    outliers = data[(data < lower_fence) | (data > upper_fence)]

    if len(outliers) > 0:
        print(f"  Result: Yes, outliers were found: {outliers}")
    else:
        print("  Result: No outliers were found.")

    # d. buatlah histogram dari data tersebut.
    # correct me if i'm wrong
    print("\n--- Histogram ---")
    plt.figure(figsize=(10, 6))
    plt.hist(data, bins='auto', edgecolor='black', alpha=0.7)

    plt.title('Histogram of Student IQ Scores (N=50)')
    plt.xlabel('IQ Score')
    plt.ylabel('Frequency')
    plt.grid(axis='y', linestyle='--', alpha=0.7)

    # add vertical lines for mean and median
    plt.axvline(mean, color='red', linestyle='dashed', linewidth=1.5, label=f'Mean ({mean:.2f})')
    plt.axvline(median, color='green', linestyle='dashed', linewidth=1.5, label=f'Median ({median})')
    plt.legend()

    # save the plot to a file
    output_filename = 'question_3_histogram.png'
    plt.savefig(output_filename)
    print(f"  Histogram has been generated and saved as '{output_filename}'")

    # show the plot
    plt.show()

if __name__ == "__main__":
    analyze_iq_data()
