print("Welcome to the GK Quiz")
print()

# Initialize score
score = 0

# Question 1
print("|How many continents are there in the world?|")
print("|Please select your option|")
print("| A. Six         |")
print("| B. Seven       |")
print("| C. Eight       |")

choice = input("Enter A, B, or C: ").upper()

if choice == "A":
    print("Wrong answer.")
elif choice == "B":
    print("That's the correct answer.")
    score += 1
elif choice == "C":
    print("Wrong answer.")
else:
    print("Incorrect option.")

print()

# Question 2
print("|In which city would you find the world's tallest building?|")
print("|Please select your option|")
print("| A. New York City        |")
print("| B. Japan                |")
print("| C. Dubai                |")

choice = input("Enter A, B, or C: ").upper()

if choice == "A":
    print("Wrong answer.")
elif choice == "B":
    print("Wrong answer.")
elif choice == "C":
    print("That's the correct answer.")
    score += 1
else:
    print("Incorrect option.")

print()

# Question 3
print("|Which is the largest continent?|")
print("|Please select your option|")
print("| A. Antartica            |")
print("| B. Asia                 |")
print("| C. Australia            |")

choice = input("Enter A, B, or C: ").upper()

if choice == "A":
    print("Wrong answer.")
elif choice == "B":
    print("That's the correct answer.")
    score += 1
elif choice == "C":
    print("Wrong answer.")
else:
    print("Incorrect option.")

print()
print("Thank you for attending the Quiz Activity...")
print(f"Your Final Score: {score}/3")