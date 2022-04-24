#swap two numbers without introducing a new variable

$a = 21;
$b = 10;

print "Value of \$a = $a and value of \$b = $b\n";

$a = $a + $b;
$b = $a - $b;
$a = $a - $b

print "Value of \$a = $a and value of \$b = $b\n";