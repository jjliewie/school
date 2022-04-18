import random

print('Welcome to Countries Guessing Game! '
      'In this game you will be given facts about a country and you have to guess the country according to them')

name = input("What is your name? ")
# Here the user is asked to enter the name first
print("Good Luck ! ", name)
# List of countries
countries = ['Philippines', 'Brazil', 'China', 'USA']

# countries hints

philippines1 = 'This country is located in SouthEast Asia'
philippines2 = 'This country traditional food is Lechon'
philippines3 = 'This country national holiday is Bonifacio Day'
philippines4 = 'In this country Filipino language is spoken'

philippine_fact = [philippines1, philippines2, philippines3, philippines4]

# Brazil facts
brazil1 = 'This country is located in South America'
brazil2 = 'This country traditional food is Moqueca'
brazil3 = 'This country national holiday is Our lady of Aparecida’s day'
brazil4 = 'Portuguese'

brazil_fact = [brazil1, brazil2, brazil3, brazil4]

# China facts
china1 = 'This country is located in East Asia'
china2 = 'This country traditional food is Dumplings'
china3 = 'This country national holiday is Chinese New Year'
china4 = 'In this country Chinese is spoken'

china_fact = [china1, china2, china3, china4]

# US facts
usa1 = 'This country is located in North America'
usa2 = 'This country traditional food is Burger'
usa3 = 'This country national holiday is Thanksgiving'
usa4 = 'In this country English is spoken'

usa_fact = [usa1, usa2, usa3, usa4]

print("Guess the country according to description:")

choose_country = random.randint(0, len(countries)-1)

random_country = countries[choose_country]

facts = []

# countries = ['Philippines', 'Brazil', 'China', 'USA']

if random_country == "Philippines":
    facts = philippine_fact
elif random_country == "Brazil":
    facts = brazil_fact
elif random_country == "China":
    facts = china_fact
else:
    facts = usa_fact

# print(random_country)

for i in range(len(countries)):
    print(facts[i])
    user = input('Which country do you think it is?')
    if user == random_country:
        print("You Won!")
        break