char = [
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
    '4', '5', '6,', '7', '8', '9', '(', ')', '*', '+', ',', '-', '.', '/'
]

plainText = input("Please input your message: ").upper()

new_text = ''
text = ''
#finding the shift
shift = char.index(plainText[0]) % 44
keep = plainText[0]
#remove shift
for num in range(1, len(plainText)):
    text += plainText[num]

for word in text:
    if word in char:
        position = char.index(word)
        # print(position)
        new_text += char[position - shift]
    else:
        new_text += word

encodedText = keep + new_text
    
# print(f"The new text = {new_text}")
print(f"The encoded message is {encodedText}")

    