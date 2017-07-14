# Arrays
CircularArrays


Given a circular array of relative indexes, write a function that determines whether or not the elements of the array represent a complete path through the array, regardless of starting position.  A circular array means that if you go past the end of the array, you start back at the beginning and vice-versa (if you go beyond the beginning of the array, you start back at the end).  The relative indexes represent the number of indexes to step for the next value check (1 = step to the next index, -1 = step to the previous index, 2 = step two indexes forward, -2 = step two indexes backward, etc…).
 
Examples:
[0] = pass (Start at 0, stay at 0 – pass) = pass (any array of length 1 passes, in fact)
[1, -1] = pass (Starting at 0, step to 1 – pass | Starting at 1, step back to 0 – pass) = pass
[1, 1, 1] = pass (Starting at 0, step to 1, step to 2 – pass | Starting at 1, step to 2, step to 0 – pass | Starting at 2, step to 0, step to 1 – pass) = pass
[2, 2, 2] = pass (Starting at 0, step to 2, step to 1 – pass | Starting at 1, step to 0, step to 2 – pass | Starting at 2, step to 1, step to 0 – pass) = pass
[-1, -1, -1] = pass (Starting at 0, step to 2, step to 1 – pass | Starting at 1, step to 0, step to 2 – pass | Starting at 2, step to 1, step to 0 – pass) = pass
[2, 2, -1] = pass (Starting at 0, step to 2, step back to 1 – pass | Starting at 1, step to 0, step to 2 – pass | Starting at 2, step to 1, step to 0 – pass)  = pass
[5, 5, 5] = pass (Starting at 0, step to 2, step to 1 – pass | Starting at 1, step to 0, step to 2 – pass | Starting at 2, step to 1, step to 0 – pass) = pass
[-5, -5, -5] = pass (Starting at 0, step to 1, step to 2 – pass | Starting at 1, step to 2, step to 0 – pass | Starting at 2, step to 0, step to 1 – pass) = pass
[2, 0, 2] = fail (Starting at 0, step to 2, step to 1– pass | Starting at 1, stay at 1 – fail | Starting at 2, step to 1, stay at 1 – fail) = fail
[2, 2, 0] = fail (Starting at 0, step to 2, stay at 2 – fail | Starting at 1, step to 0, step to 2 – pass | Starting at 2, stay at 2 – fail) = fail
