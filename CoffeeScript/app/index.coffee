p = (v) ->
  if v % 3 == 0
    console.log if v % 5 == 0 then 'fizz buzz' else 'fizz'
  else
    console.log if v % 5 == 0 then 'buzz' else v

p num for num in [1..34]
