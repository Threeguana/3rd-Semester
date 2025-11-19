def calculate_bayes(prior, likelihood, evidence):
    """
    Calculates the posterior probability using Bayes' Theorem.
    """
    return (prior * likelihood) / evidence

print("--- CASE 1: Photography Competition ---")
# Context: Three people submit photos. Who is most likely the winner?

# 1. Define the total number of photos (Sample Space)
total_photos = 15 + 5 + 10  # Roy + Hartono + Ria

# 2. Calculate Priors: P(Person)
# "Probability that a random photo belongs to X"
prior_roy = 15 / total_photos
prior_hartono = 5 / total_photos
prior_ria = 10 / total_photos

# 3. Define Likelihoods: P(Win|Person)
# "Probability of winning given the photo belongs to X"
likelihood_win_roy = 0.40      # 40% chance
likelihood_win_hartono = 0.60  # 60% chance
likelihood_win_ria = 0.30      # 30% chance

# 4. Calculate Total Evidence: P(Win)
# Sum of (Prior * Likelihood) for all candidates
total_prob_win = (prior_roy * likelihood_win_roy) + \
                 (prior_hartono * likelihood_win_hartono) + \
                 (prior_ria * likelihood_win_ria)

# 5. Calculate Posterior: P(Roy|Win)
# "Probability that Roy is the winner, given that a photo won"
prob_roy_wins = calculate_bayes(prior_roy, likelihood_win_roy, total_prob_win)

print(f"Probability Roy wins: {prob_roy_wins:.2f} or {prob_roy_wins*100}%")
print("Note: This matches the calculation in your slide: 0.5 or 50% ")

print("\n" + "="*40 + "\n")

print("--- CASE 2: False Positives ---")
# A scanner detects a file as 'Infected'. Is it actually a virus?

# 1. Priors (Reality)
# Let's assume 1% of files in our server actually have a virus.
prior_virus = 0.01          # P(Virus)
prior_safe = 0.99           # P(Safe) = 1 - P(Virus)

# 2. Likelihoods (The Scanner's Accuracy)
# True Positive: Scanner says "Infected" when it IS a virus.
likelihood_alert_given_virus = 0.99

# False Positive: Scanner says "Infected" when it is SAFE.
likelihood_alert_given_safe = 0.05

# 3. Calculate Evidence: P(Alert)
# The total chance the scanner beeps (regardless of whether it's right or wrong)
total_prob_alert = (prior_virus * likelihood_alert_given_virus) + \
                   (prior_safe * likelihood_alert_given_safe)

# 4. Calculate Posterior: P(Virus|Alert)
# "Scanner beeped. What is the chance it is actually a virus?"
prob_real_virus = calculate_bayes(prior_virus, likelihood_alert_given_virus, total_prob_alert)

print(f"Probability of Virus (Prior): {prior_virus*100}%")
print(f"Scanner False Positive Rate: {likelihood_alert_given_safe*100}%")
print(f"Probability the file is ACTUALLY infected if alarm rings: {prob_real_virus:.4f}")
print(f"Result: {prob_real_virus*100:.2f}%")

print("\nAnalysis: Even with a good scanner, a high False Positive rate")
print("can make the alarm unreliable if viruses are rare.")
