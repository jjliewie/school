import random

print('Welcome to Countries Guessing Game! '
      'In this game you will be given facts about a country and you have to guess the country according to them')

name = input("What is your name? ")
# Here the user is asked to enter the name first
print("Good Luck ! ", name)
# List of countries
countries = ['Philippines', 'Brazil', 'China', 'USA', 'Germany', 'Chad', 'Russia', 'India', 'Saudi Arabia', 'Israel', 'Thailand', 'New Zealand']
# Countries facts
# Philippines facts

# countries use

countries1 = ['Philippines', 'Brazil', 'China', 'USA', 'Germany', 'Chad', 'Russia', 'India', 'Saudi Arabia', 'Israel', 'Thailand', 'New Zealand']


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
# China facts
china1 = 'This country is located in East Asia'
china2 = 'This country traditional food is Dumplings'
china3 = 'This country national holiday is Chinese New Year'
china4 = 'In this country Chinese is spoken'
# US facts
usa1 = 'This country is located in North America'
usa2 = 'This country traditional food is Burger'
usa3 = 'This country national holiday is Thanksgiving'
usa4 = 'In this country English is spoken'
# Germany facts
germany1 = 'This country is located in Central Europe'
germany2 = 'This country traditional food is Rouladen'
germany3 = 'This country national holiday is Oktoberfest'
germany4 = 'In this country German is spoken'
# Chad facts
chad1 = 'This country is located in Central Africa'
chad2 = 'This country traditional food is Jarret de Boeuf'
chad3 = 'This country national holiday is Kawlid'
chad4 = 'In this country French is spoken'
# Russia facts
russia1 = 'This country is located in East Europe'
russia2 = 'This country traditional food is Blini'
russia3 = 'This country national holiday is Victory Day'
russia4 = 'In this country Russian is spoken'
# India facts
india1 = 'This country is located in South Asia'
india2 = 'This country traditional food is Biryani'
india3 = 'This country national holiday is Chhat Puja'
india4 = 'In this country Hindi is spoken'
# Saudi Arabia facts
saudi_arabia1 = 'This country is located in Middle East'
saudi_arabia2 = 'This country traditional food is Muttabaq'
saudi_arabia3 = 'This country national holiday is Eid-al Fitr'
saudi_arabia4 = 'In this country Arabic is spoken'
# Israel facts
israel1 = 'This country is located in Middle East'
israel2 = 'This country traditional food is Falafel'
israel3 = 'This country national holiday is Chanukah'
israel4 = 'In this country Hebrew is spoken'
# Thailand facts
thailand1 = 'This country is located in SouthEast Asia'
thailand2 = 'This country traditional food is Guay Teow'
thailand3 = 'This country national holiday is SongKran'
thailand4 = 'In this country Thai is spoken'
# New Zealand facts
new_zealand1 = 'This country is located in South Western Pacific Ocean'
new_zealand2 = 'This country traditional food is Crayfish'
new_zealand3 = 'This country national holiday is Waitangi Day'
new_zealand4 = 'In this country English is spoken'
countries = random.choice(countries)

print("Guess the country according to description:")

# Philippines
clue1 = philippines1
print(clue1)
user = input('Which country do you think it is?')

print(user)
# print(countries[0])
if user == countries1[0]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue2 = philippines2
      print(clue2)
      user = input('Which country do you think it is?')
      if user == countries1[0]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue3 = (philippines3)
            print(clue3)
            user = input('Which country do you think it is?')
            if user == countries1[0]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue4 = (philippines4)
                  print(clue4)
                  user = input('Which country do you think it is?')
                  if user == countries[0]:
                        print('You won!')
# Brazil
clue5 = (brazil1)
print(clue5)
user = input('Which country do you think it is?')
if user == countries1[1]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue6 = (brazil2)
      print(clue6)
      user = input('Which country do you think it is?')
      if user == countries1[1]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue7 = (brazil3)
            print(clue7)
            user = input('Which country do you think it is?')
            if user == countries1[1]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue8 = (brazil4)
                  print(clue8)
                  user = input('Which country do you think it is?')
                  if user == countries1[1]:
                        print('You won!')
# China
clue9 = (china1)
print(clue9)
user = input('Which country do you think it is?')
if user == countries[2]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue10 = (china2)
      print(clue10)
      user = input('Which country do you think it is?')
      if user == countries[2]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue11 = (china3)
            print(clue11)
            user = input('Which country do you think it is?')
            if user == countries[2]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue12 = (china4)
                  print(clue12)
                  user = input('Which country do you think it is?')
                  if user == countries[2]:
                        print('You won!')
# USA
clue13 = (usa1)
print(clue13)
user = input('Which country do you think it is?')
if user == countries[3]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue14 = (usa2)
      print(clue14)
      user = input('Which country do you think it is?')
      if user == countries[3]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue15 = (usa3)
            print(clue15)
            user = input('Which country do you think it is?')
            if user == countries[3]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue16 = (usa4)
                  print(clue16)
                  user = input('Which country do you think it is?')
                  if user == countries[3]:
                        print('You won!')
# Germany
clue17 = (germany1)
print(clue17)
user = input('Which country do you think it is?')
if user == countries[4]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue18 = (germany2)
      print(clue18)
      user = input('Which country do you think it is?')
      if user == countries[4]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue19 = (germany3)
            print(clue19)
            user = input('Which country do you think it is?')
            if user == countries[4]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue20 = (germany4)
                  print(clue20)
                  user = input('Which country do you think it is?')
                  if user == countries[4]:
                        print('You won!')
# Chad
clue21 = (chad1)
print(clue21)
user = input('Which country do you think it is?')
if user == countries[5]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue22 = (chad2)
      print(clue22)
      user = input('Which country do you think it is?')
      if user == countries[5]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue23 = (chad3)
            print(clue23)
            user = input('Which country do you think it is?')
            if user == countries[5]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue24 = (chad4)
                  print(clue24)
                  user = input('Which country do you think it is?')
                  if user == countries[5]:
                        print('You won!')
# Russia
clue25 = (russia1)
print(clue25)
user = input('Which country do you think it is?')
if user == countries[6]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue26 = (russia2)
      print(clue26)
      user = input('Which country do you think it is?')
      if user == countries[6]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue27 = (russia3)
            print(clue27)
            user = input('Which country do you think it is?')
            if user == countries[6]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue28 = (russia4)
                  print(clue28)
                  user = input('Which country do you think it is?')
                  if user == countries[6]:
                        print('You won!')
# India
clue29 = (india1)
print(clue29)
user = input('Which country do you think it is?')
if user == countries[7]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue30 = (india2)
      print(clue30)
      user = input('Which country do you think it is?')
      if user == countries[7]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue31 = (india3)
            print(clue31)
            user = input('Which country do you think it is?')
            if user == countries[7]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue32 = (india4)
                  print(clue32)
                  user = input('Which country do you think it is?')
                  if user == countries[7]:
                        print('You won!')
# Saudi_Arabia
clue33 = (saudi_arabia1)
print(clue33)
user = input('Which country do you think it is?')
if user == countries[8]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue34 = (saudi_arabia2)
      print(clue34)
      user = input('Which country do you think it is?')
      if user == countries[8]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue35 = (saudi_arabia3)
            print(clue35)
            user = input('Which country do you think it is?')
            if user == countries[8]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue36 = (saudi_arabia4)
                  print(clue36)
                  user = input('Which country do you think it is?')
                  if user == countries[8]:
                        print('You won!')
# Israel
clue37 = (israel1)
print(clue37)
user = input('Which country do you think it is?')
if user == countries[9]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue38 = (israel2)
      print(clue38)
      user = input('Which country do you think it is?')
      if user == countries[9]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue39 = (israel3)
            print(clue39)
            user = input('Which country do you think it is?')
            if user == countries[9]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue40 = (israel4)
                  print(clue40)
                  user = input('Which country do you think it is?')
                  if user == countries[9]:
                        print('You won!')
# Thailand
clue41 = (thailand1)
print(clue41)
user = input('Which country do you think it is?')
if user == countries[10]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue42 = (thailand2)
      print(clue42)
      user = input('Which country do you think it is?')
      if user == countries[10]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue43 = (thailand3)
            print(clue43)
            user = input('Which country do you think it is?')
            if user == countries[10]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue44 = (thailand4)
                  print(clue44)
                  user = input('Which country do you think it is?')
                  if user == countries[10]:
                        print('You won!')
# New_Zealend
clue45 = (new_zealand1)
print(clue45)
user = input('Which country do you think it is?')
if user == countries[11]:
      print('You won!')
else:
      print('That is incorrect here is another clue')
      clue46 = (new_zealand2)
      print(clue46)
      user = input('Which country do you think it is?')
      if user == countries[11]:
            print('You won!')
      else:
            print('That is incorrect here is another clue')
            clue47 = (new_zealand3)
            print(clue47)
            user = input('Which country do you think it is?')
            if user == countries[11]:
                  print('You won!')
            else:
                  print('That is incorrect here is another clue')
                  clue48 = (new_zealand4)
                  print(clue48)
                  user = input('Which country do you think it is?')
                  if user == countries[11]:
                        print('You won!')