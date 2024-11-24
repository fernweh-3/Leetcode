def romanizer(numbers):
    # Write your code here
    roman_dict = {
        1000:'M',
        900:'CM',
        500:'D',
        400:'CD',
        100:'C',
        90:'XC',
        50:'L',
        40:'XL',
        10:'X',
        9:'IX',
        8:'VIII',
        7:'VII',
        6:'VI',
        5:'V',
        4:'IV',
        3:'III',
        2:'II',
        1:'I'
    }

    def int_to_roman(n):
        result = ''
        for num in roman_dict:
            while n >= num:
                result += roman_dict[num]
                n -= num
        return result

    return [int_to_roman(num) for num in numbers]
