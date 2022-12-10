x = [], y = []

for i = 1:20
  x(i) = i - 1
  y(i) = i.^2 - 1
endfor

a = -200
b = 200
r = a + (b-a)*rand(1, 1)

salt = r * rand(1, 20)

saltY = []

for i = 1:20
  saltY(i) = y(i) + salt(i)
endfor



plot(x, y)
hold on
plot(x, saltY)
hold on
csvwrite("Saltedx", x)
hold on
csvwrite("Saltedy", saltY)