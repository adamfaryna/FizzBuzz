'use strict';

var length = 35;

for (var i = 1; i !== length; i++) {
  if (i % 3 === 0) {
    console.log(i % 5 === 0 ? 'fizz buzz' : 'fizz');

  } else {
    console.log(i % 5 === 0 ? 'buzz' : i);
  }
}
