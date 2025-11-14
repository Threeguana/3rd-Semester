import numpy as np
import pandas as pd
from scipy import stats
import statistics as s
from sklearn.preprocessing import MinMaxScaler, StandardScaler
import matplotlib.pyplot as plt

# data dari 'contoh kasus sederhana (1)'
apel = [100, 200, 150, 100, 120, 80, 90, 160, 110, 170]
print(f"Data Apel: {apel}")

# 1. Mean (Rata-rata)
mean_apel = np.mean(apel)
print(f"Mean: {mean_apel}")

# 2. Median (Nilai Tengah)
median_apel = np.median(apel)
# menampilkan data terurut untuk verif manual
apel_sorted = np.sort(apel)
print(f"Data Apel Terurut: {apel_sorted}")
print(f"Median: {median_apel}")

nilai = [70, 80, 70, 70, 90, 100]
print(f"\nData Nilai: {nilai}")

# 3. Modus (Nilai Sering Muncul)
mode_native = s.mode(nilai)
print(f"Modus: {mode_native}")

# menggunakan Scipy
mode_scipy = stats.mode(nilai)
print(f"Modus: {mode_scipy.mode} (Muncul {mode_scipy.count} kali)")


# variabilitas data
# data dari 'Nilai Matematika Kelas 12'
data_b3 = np.array([23, 56, 45, 65, 59, 55, 62, 54, 85, 25])
print(f"Data Matematika: {data_b3}")

# 4. Rentang (Range)
data_max = np.max(data_b3)
data_min = np.min(data_b3)
rentang = data_max - data_min
print(f"Nilai Max: {data_max}")
print(f"Nilai Min: {data_min}")
print(f"Rentang: {rentang}")

# 5. Kuartil (Quartile) & IQR
data_baru_b3 = np.array([23, 56, 45, 65, 59, 55, 62, 54, 85, 25, 55])
print(f"\nData Baru Matematika: {data_baru_b3}")

print("\nDeskripsi Statistik (Pandas) pada data_baru:")
df = pd.DataFrame(data_baru_b3)
# mencakup count, mean, std, min, max, dan kuartil
print(df.describe())

# Ekstraksi Q1, Q3, dan IQR secara spesifik
[cite_start]q1 = df[0].quantile(0.25)
[cite_start]q3 = df[0].quantile(0.75)
[cite_start]iqr = q3 - q1
print(f"IQR (Q3 - Q1): {iqr}")

# 6. Varians (Variance) & Simpangan Baku (Standard Deviation)
var_sampel = np.var(data_b3, ddof=1)
std_sampel = np.std(data_b3, ddof=1)

print(f"\nPerhitungan Variabilitas (Sampel, n-1):")
print(f"Varians: {var_sampel:.4f}")
print(f"Simpangan Baku: {std_sampel:.4f}")


print("\n--- Shifting dan Scaling ---")

# data_raw dari contoh Normalisasi & Standardisasi
data_raw = np.array([
    [2, 3, 7, 30],
    [9, 4, 6, 1],
    [8, 15, 2, 40],
    [20, 10, 2, 6]
])
print(f"\nData Asli (data_raw):\n{data_raw}")

# 7. Normalisasi Data (MinMax Scaler)
# Rumus: x_norm = (x - min(x)) / (max(x) - min(x))
scaler_minmax = MinMaxScaler()
[cite_start]data_scaled = scaler_minmax.fit_transform(data_raw)
print(f"\nHasil Normalisasi (MinMaxScaler):\n{data_scaled}")

# 8. Standardisasi Data (Standard Scaler)
# Rumus: x_stand = (x - mean(x)) / std(x)
scaler_std = StandardScaler()
[cite_start]data_standardized = scaler_std.fit_transform(data_raw)
print(f"\nHasil Standardisasi (StandardScaler):\n{data_standardized}")

# 9. Visualisasi Box Plot
# Menampilkan 3 plot untuk perbandingan visual
print("\nMenampilkan plot perbandingan (Data Asli, Normalisasi, Standardisasi)...")

plt.figure(figsize=(18, 6))

# Plot 1: Data Asli
plt.subplot(1, 3, 1)
plt.boxplot(data_raw)
plt.title("Data Asli (Raw)")
plt.xlabel("Fitur")
plt.ylabel("Nilai")

# Plot 2: Data Normalisasi
plt.subplot(1, 3, 2)
plt.boxplot(data_scaled)
plt.title("Data Normalisasi (MinMax)")
plt.xlabel("Fitur")
plt.ylabel("Nilai Ternormalisasi")

# Plot 3: Data Standardisasi
plt.subplot(1, 3, 3)
plt.boxplot(data_standardized)
plt.title("Data Standardisasi (Standard)")
plt.xlabel("Fitur")
plt.ylabel("Nilai Terstandardisasi")

plt.tight_layout()
plt.suptitle("Perbandingan Data Sebelum dan Sesudah Scaling", y=1.05)
plt.show()
