# Exercise 006: Sum numbers from array of data objects by code

The purpose of this exercise is to verify that you can use a `Map (Java) / Dictionary (C#)`. These are central types of object in the Java / C&#35; platform. The `Map` interface / `Dictionary` class is part of the [Java Collections API](http://tutorials.jenkov.com/java-collections/index.html) / [C&#35; Collections API](https://docs.microsoft.com/en-us/dotnet/api/system.collections.generic.dictionary-2?view=netframework-4.8). The exercise will loop through an array of objects sum up all `count` values for objects which have the same `code` value.

## Description

### Java

1. Start with the class from exercise 5 called `Exercise5`, rename it to `Exercise6`.
1. Remove the `sum` variable. You will not use it in this exercise.
1. To hold the sums for each `code`, create a `HashMap<String, Integer>` variable named `sumsForCodes` and set it equal to `new HashMap<String, Integer>();`
1. Inside the `for` loop, lookup the sum for the `code` of that object in the `sumsForCodes` `Map`. If no sum is yet found for that code, set the sum to 0.
1. Add the `count` of the current object to the sum for the code.
1. Store the new sum for the code in the `sumsForCodes` `Map`.
1. After the `for` loop, create a new `for` loop that loops through all keys of the `sumsForCodes` `Map`.
1. Inside this new `for` loop print out the code and the sum for the code.

## Related resources

- [http://tutorials.jenkov.com/java-collections/map.html](http://tutorials.jenkov.com/java-collections/map.html)

### C&#35;

1. Start with the class from exercise 5 called `Exercise5`, rename it to `Exercise6`.
1. Remove the `sum` variable. You will not use it in this exercise.
1. To hold the sums for each `Code`, create a `Dictionary<string, Integer>` variable named `sumsForCodes` and set it equal to `new Dictionary<string, Integer>();`
1. Inside the `for` loop, lookup the sum for the `Code` of that object in the `sumsForCodes` `Dictionary`. If no sum is yet found for that Code, set the sum to 0.
1. Add the `Count` of the current object to the sum for the Code.
1. Store the new sum for the Code in the `sumsForCodes` `Dictionary`.
1. After the `for` loop, create a new `for` loop that loops through all keys of the `sumsForCodes` `Dictionary`.
1. Inside this new `for` loop print out the code and the sum for the code.

## Related resources

- [dictionary](https://docs.microsoft.com/en-us/dotnet/api/system.collections.generic.dictionary-2?view=netframework-4.8)