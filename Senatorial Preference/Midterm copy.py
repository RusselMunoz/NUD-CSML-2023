import matplotlib.pyplot as plt

# Using a dictionary to store the data
election_results = {
    "Go, Bong (PDPLBN)": 64,
    "Tulfo, Erwin (Lakas)": 61,
    "Tulfo, Ben Bitag (Ind)": 48,
    "Sotto, Tito (NPC)": 46,
    "Bong Revilla, Ramon Jr. (Lakas)": 45,
    "Lapid, Lito (NPC)": 42,
    "Lacson, Ping (Ind)": 42,
    "Cayetano, Pia (NPC)": 41,
    "Dela Rosa, Bato (PDPLBN)": 38,
    "Binay, Abby (NPC)": 37,
    "Villar, Camille (NP)": 35,
    "Pacquiao, Manny Pacman (PFP)": 29,
    "Revillame, Willie Wil (Ind)": 29,
    "Abalos, Benhur (PFP)": 29,
    "Aquino, Bam (KNP)": 28,
    "Pangilinan, Kiko (LP)": 27,
    "Tolentino, Francis Tol (PFP)": 27,
    "Marcos, Imee R. (NP)": 27,
    "Salvador, Phillip Ipe (PDPLBN)": 22,
    "Marcoleta, Rodante (Ind)": 20,
    "Bondoc, Jimmy (PDPLBN)": 19,
    "Rodriguez, Atty. Vic (Ind)": 16,
    "Bosita, Colonel (Ind)": 16,
    "Honasan, Gringo (RP)": 15,
    "Lambino, Raul (PDPLBN)": 14,
    "Hinlo, Jayvee (PDPLBN)": 11,
    "Quiboloy, Apollo (Ind)": 10,
    "Mata, Doc Marites (Ind)": 5,
    "Querubin, Ariel Poririo (NP)": 5,
    "Mendoza, Heidi (Ind)": 2
}

# Calculate total votes
total_votes = sum(election_results.values())

# Calculate percentages and sort by votes
sorted_results = sorted(election_results.items(), key=lambda x: x[1], reverse=True)
top_10 = sorted_results[:10]
others = sorted_results[10:]

# Prepare data for plotting
top_10_names = [name for name, votes in top_10]
top_10_percentages = [(votes / total_votes) * 100 for _, votes in top_10]
others_percentage = sum((votes / total_votes) * 100 for _, votes in others)

# Add "Others" category
top_10_names.append("Others")
top_10_percentages.append(others_percentage)

# Plot the data
plt.bar(top_10_names, top_10_percentages)
plt.title("Midterm Election Results (Top 10 + Others)")
plt.xlabel('Senator')
plt.ylabel('Percentage of Votes')
plt.xticks(rotation=45, ha='right')
plt.tight_layout()
plt.show()