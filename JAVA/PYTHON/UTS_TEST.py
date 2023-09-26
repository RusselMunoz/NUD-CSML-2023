def read_questions(filename):
    questions = []
    with open(filename, 'r') as file:
        lines = file.readlines()
        question = None
        choices = []
        for line in lines:
            line = line.strip()
            if not line:
                continue
            if line.startswith(' '):
                choices.append(line)
            else:
                if question:
                    questions.append((question, choices))
                question = line
                choices = []
        if question:
            questions.append((question, choices))
    return questions

def present_questions(questions):
    score = 0
    for i, (question, choices) in enumerate(questions, start=1):
        print(f"{i}. {question}")
        for choice in choices:
            print(choice)
        user_answer = input("Your answer: ").strip().lower()
        correct_answer = None
        for choice in choices:
            if choice.endswith('(correct)') or choice.endswith('(c)'):
                correct_answer = choice[0].strip().lower()
                break
        if user_answer == correct_answer:
            print("Correct!\n")
            score += 1
        else:
            print(f"Wrong! The correct answer is {correct_answer.upper()}\n")
    print(f"You scored {score}/{len(questions)}")
    
import os
print("Current working directory:", os.getcwd())

if __name__ == "__main__":
    questions = read_questions("test.txt")
    present_questions(questions)