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

plt.bar(election_results.keys(), election_results.values(), color='skyblue')
plt.title("Senatorial Survey polls for Midterm Elections", fontdict={'fontsize': 14, 'fontweight': 'bold'})
plt.ylabel("Votes", fontdict={'fontsize': 11, 'fontweight': 'bold'})
plt.xlabel("Candidates", fontdict={'fontsize': 11, 'fontweight': 'bold'})
plt.xticks(rotation=45, ha='right')


plt.tight_layout()
plt.show()