num_people = int(input("How many people are auditioning? "))

database = {
    "Jose": ["hi", "whats up", "i'm jose the legend", "I will kill you"], 
    "Maria": ["Jose, no!", "He's my love", "I hate you"],
    "Tony": ["I love you Maria", "Jose, I will kill you for harming Maria", "Maria! Don't die on me!"],
    "Anita": ["Tony, love me instead!", "Jose, my brother, you have crossed the line", "Mom! I don't want to marry the prince!"],
    "Mercedes": ["Thou is my only love", "I wish I had a mercedes", "Anita!"],
    "Mr. Capone": ["Kill the girl", "My darling Anita", "Did you leave you brain someplace else?"],
    "Romeo": ["Oh Juliet!!"],
    "The Prince": ["Anita, will you marry me?", "How dare she pick that commoner Tony, over me, the prince?!"]
}

passed_actors = []
character_picked = []

while num_people > 0:

    name = input("what is the actor's name? ")

    point = 0
    height = float(input("What is your height in meters: "))
    if height >= 1.8:
        point += 5
    elif height < 1.4:
        point -= 5
    character = input("Which character are you auditioning for? ")

    if character in character_picked:
        print(f'{name}, sorry your audition is cancelled as your there is already an actor playing your character')
        continue 
    
    cnt_line = 1

    for line in database[character]:

        print(f'LINE {cnt_line}')

        language = input("Is the dialogue correct? ")
        if language == "yes":
            point += 1
        else:
            point -= 1
        
        emotion = input("Is the emotion portrayed correct? ")
        if emotion == "yes":
            point += 1
        else:
            point -= 1

        body = input("Is the actor's body language correct? ")
        if body == "yes":
            point += 1
        else:
            point -= 1

        cnt_line += 1
    
    in_costume = input("Is the actor in the correct costume? ")

    if in_costume == "yes":
        point += 2
    
    donate_bool = input("Did the actor donate money? ")
    if donate_bool == "yes":
        amount = int(input("How much did the actor donate? (in millions) "))
        if amount > 100:
            point += 10

    chairman = input("Is the actor related to the chairman? ")
    if chairman == "yes":
        point += 10
    
    can_sing = input("can the actor sing? ")
    if can_sing == "yes":
        if point > 0:
            point *= 1.5
        else:
            point += 10 
    
    if point > 20:
        print(f'{name}! you passed! Congratulations!')
        passed_actors.append(name)
        character_picked.appened(character)
    else:
        print(f'{name}, you failed.')
    
    num_people -= 1
    
print(passed_actors)
        