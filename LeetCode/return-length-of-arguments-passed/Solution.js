1/**
2 * @param {...(null|boolean|number|string|Array|Object)} args
3 * @return {number}
4 */
5var argumentsLength = function(...args) {
6    return args.length;
7};
8
9/**
10 * argumentsLength(1, 2, 3); // 3
11 */