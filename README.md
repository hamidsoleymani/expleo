1) TemperatureClosestToZero Task
Determine from a sequence of temperatures (int values) the closest value to zero
Conditions:
If two values e.g -1 and 1 are the closest, choose the positive value.
example [4-5,1,7,-1] -> 1

2) ChildLearnsAddition Task
example
123 + 234 = 357 In this case method should return "ok"
123 + 234 = 358 In this case method should return "1" because in the first place there is an error
123 + 234 = 367  In this case method should return "2" because in the second place there is an error
123 + 234 = 457  In this case method should return "3" because in the third place there is an error
