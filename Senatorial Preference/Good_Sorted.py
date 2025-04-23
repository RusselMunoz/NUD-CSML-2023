import matplotlib.pyplot as plt

# Using a dictionary to store the data
election_results = {
    "Abalos, Benhur (PFP)": 29,
    "Aquino, Bam (KNP)": 28,
    "Binay, Abby (NPC)": 37,
    "Bondoc, Jimmy (PDPLBN)": 19,
    "Bosita, Colonel (Ind)": 16,
    "Cayetano, Pia (NPC)": 41,
    "Dela Rosa, Bato (PDPLBN)": 38,
    "Go, Bong Go (PDPLBN)": 64,
    "Hinlo, Jayvee (PDPLBN)": 11,
    "Honasan, Gringo (RP)": 15,
    "Lacson, Ping (Ind)": 42,
    "Lambino, Raul (PDPLBN)": 14,
    "Lapid, Lito (NPC)": 42,
    "Marcoleta, Rodante (Ind)": 20,
    "Marcos, Imee R. (NP)": 27,
    "Mata, Doc Marites (Ind)": 5,
    "Mendoza, Heidi (Ind)": 2,
    "Pacquiao, Manny Pacman (PFP)": 29,
    "Pangilinan, Kiko (LP)": 27,
    "Querubin, Ariel Poririo (NP)": 5,
    "Quiboloy, Apollo (Ind)": 10,
    "Revillame, Willie Wil (Ind)": 29,
    "Rodriguez, Atty. Vic (Ind)": 16,
    "Salvador, Phillip Ipe (PDPLBN)": 22,
    "Sotto, Tito (NPC)": 46,
    "Tolentino, Francis Tol (PFP)": 27,
    "Tulfo, Ben Bitag (Ind)": 48,
    "Tulfo, Erwin (Lakas)": 61,
    "Villar, Camille (NP)": 35
}

plt.bar(election_results.keys(), election_results.values(), color='skyblue')
plt.title("Senatorial Survey polls for Midterm Elections", fontdict={'fontsize': 14, 'fontweight': 'bold'})
plt.ylabel("Votes", fontdict={'fontsize': 11, 'fontweight': 'bold'})
plt.xlabel("Candidates", fontdict={'fontsize': 11, 'fontweight': 'bold'})
plt.xticks(rotation=45, ha='right')


plt.tight_layout()
plt.show()