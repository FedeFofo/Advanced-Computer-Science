public class Unit2ExercisesTester {
    public static void main(String[] args) {

        // Testing alarmClock()
        System.out.println("------------------------");
        System.out.println(" Testing alarmClock(): ");
        System.out.println("------------------------");

        System.out.println("\talarmClock(1, false)");
        System.out.println("Expected output:\t7:00");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.alarmClock(1, false) + "\n");

        System.out.println("\talarmClock(5, false)");
        System.out.println("Expected output:\t7:00");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.alarmClock(5, false) + "\n");

        System.out.println("\talarmClock(0, false)");
        System.out.println("Expected output:\t10:00");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.alarmClock(0, false) + "\n");

        // Testing love6()
        System.out.println("------------------");
        System.out.println(" Testing love6(): ");
        System.out.println("------------------");

        System.out.println("\tlove6(6, 4)");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + Unit2Exercises.love6(6, 4) + "\n");

        System.out.println("\tlove6(4, 5)");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" + Unit2Exercises.love6(4, 5) + "\n");

        System.out.println("\tlove6(1, 5)");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" + Unit2Exercises.love6(1, 5) + "\n");

        // Testing redTicket()
        System.out.println("----------------------");
        System.out.println(" Testing redTicket(): ");
        System.out.println("----------------------");

        System.out.println("\tredTicket(2, 2, 2)");
        System.out.println("Expected output:\t10");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.redTicket(2, 2, 2) + "\n");

        System.out.println("\tredTicket(2, 2, 1)");
        System.out.println("Expected output:\t0");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.redTicket(2, 2, 1) + "\n");

        System.out.println("\tredTicket(0, 0, 0)");
        System.out.println("Expected output:\t5");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.redTicket(0, 0, 0) + "\n");

        // Testing fizzString()
        System.out.println("-----------------------");
        System.out.println(" Testing fizzString(): ");
        System.out.println("-----------------------");

        System.out.println("\tfizzString(\"fig\")");
        System.out.println("Expected output:\tFizz");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.fizzString("fig") + "\n");

        System.out.println("\tfizzString(\"dib\")");
        System.out.println("Expected output:\tBuzz");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.fizzString("dib") + "\n");

        System.out.println("\tfizzString(\"fib\")");
        System.out.println("Expected output:\tFizzBuzz");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.fizzString("fib") + "\n");

        // Testing doubleChar()
        System.out.println("-----------------------");
        System.out.println(" Testing doubleChar(): ");
        System.out.println("-----------------------");

        System.out.println("\tdoubleChar(\"The\")");
        System.out.println("Expected output:\tTThhee");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.doubleChar("The") + "\n");

        System.out.println("\tdoubleChar(\"AAbb\")");
        System.out.println("Expected output:\tAAAAbbbb");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.doubleChar("AAbb") + "\n");

        System.out.println("\tdoubleChar(\"Hi-There\")");
        System.out.println("Expected output:\tHHii--TThheerree");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.doubleChar("Hi-There") + "\n");

        // Testing countHi()
        System.out.println("--------------------");
        System.out.println(" Testing countHi(): ");
        System.out.println("--------------------");

        System.out.println("\tcountHi(\"abc hi ho\")");
        System.out.println("Expected output:\t1");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countHi("abc hi ho") + "\n");

        System.out.println("\tcountHi(\"ABChi hi\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countHi("ABChi hi") + "\n");

        System.out.println("\tcountHi(\"hihi\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countHi("hihi") + "\n");

        // Testing catDog()
        System.out.println("-------------------");
        System.out.println(" Testing catDog(): ");
        System.out.println("-------------------");

        System.out.println("\tcatDog(\"catdog\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.catDog("catdog") + "\n");

        System.out.println("\tcatDog(\"catcat\")");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.catDog("catcat") + "\n");

        System.out.println("\tcatDog(\"1cat1cadodog\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.catDog("1cat1cadodog") + "\n");

        // Testing mixString()
        System.out.println("----------------------");
        System.out.println(" Testing mixString(): ");
        System.out.println("----------------------");

        System.out.println("\tmixString(\"abc\", \"xyz\")");
        System.out.println("Expected output:\taxbycz");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.mixString("abc", "xyz") + "\n");

        System.out.println("\tmixString(\"Hi\", \"There\")");
        System.out.println("Expected output:\tHTihere");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.mixString("Hi", "There") + "\n");

        System.out.println("\tmixString(\"xxxx\", \"There\")");
        System.out.println("Expected output:\txTxhxexre");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.mixString("xxxx", "There") + "\n");

        // Testing repeatEnd()
        System.out.println("----------------------");
        System.out.println(" Testing repeatEnd(): ");
        System.out.println("----------------------");

        System.out.println("\trepeatEnd(\"Hello\", 3)");
        System.out.println("Expected output:\tllollollo");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.repeatEnd("Hello", 3) + "\n");

        System.out.println("\trepeatEnd(\"Hello\", 2)");
        System.out.println("Expected output:\tlolo");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.repeatEnd("Hello", 2) + "\n");

        System.out.println("\trepeatEnd(\"Hello\", 1)");
        System.out.println("Expected output:\to");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.repeatEnd("Hello", 1) + "\n");

        // Testing endOther()
        System.out.println("---------------------");
        System.out.println(" Testing endOther(): ");
        System.out.println("---------------------");

        System.out.println("\tendOther(\"Hiabc\", \"abc\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.endOther("Hiabc", "abc") + "\n");

        System.out.println("\tendOther(\"AbC\", \"HiaBc\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.endOther("AbC", "HiaBc") + "\n");

        System.out.println("\tendOther(\"abc\", \"abXabc\")");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.endOther("abc", "abXabc") + "\n");

        // Testing countCode()
        System.out.println("----------------------");
        System.out.println(" Testing countCode(): ");
        System.out.println("----------------------");

        System.out.println("\tcountCode(\"aaacodebbb\")");
        System.out.println("Expected output:\t1");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countCode("aaacodebbb") + "\n");

        System.out.println("\tcountCode(\"codexxcode\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countCode("codexxcode") + "\n");

        System.out.println("\tcountCode(\"cozexxcope\")");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countCode("cozexxcope") + "\n");

        // Testing countEvens()
        System.out.println("-----------------------");
        System.out.println(" Testing countEvens(): ");
        System.out.println("-----------------------");

        int[] evensArr1 = {2, 1, 2, 3, 4};
        System.out.println("\tcountEvens([2, 1, 2, 3, 4])");
        System.out.println("Expected output:\t3");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countEvens(evensArr1) + "\n");

        int[] evensArr2 = {2, 2, 0};
        System.out.println("\tcountEvens([2, 2, 0])");
        System.out.println("Expected output:\t3");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countEvens(evensArr2) + "\n");

        int[] evensArr3 = {1, 3, 5};
        System.out.println("\tcountEvens([1, 3, 5])");
        System.out.println("Expected output:\t0");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.countEvens(evensArr3) + "\n");

        // Testing bigDiff()
        System.out.println("--------------------");
        System.out.println(" Testing bigDiff(): ");
        System.out.println("--------------------");

        int[] diffArr1 = {10, 3, 5, 6};
        System.out.println("\tbigDiff([10, 3, 5, 6])");
        System.out.println("Expected output:\t7");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.bigDiff(diffArr1) + "\n");

        int[] diffArr2 = {7, 2, 10, 9};
        System.out.println("\tbigDiff([7, 2, 10, 9])");
        System.out.println("Expected output:\t8");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.bigDiff(diffArr2) + "\n");

        int[] diffArr3 = {2, 10, 7, 2};
        System.out.println("\tbigDiff([2, 10, 7, 2])");
        System.out.println("Expected output:\t8");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.bigDiff(diffArr3) + "\n");

        // Testing sum13()
        System.out.println("------------------");
        System.out.println(" Testing sum13(): ");
        System.out.println("------------------");

        int[] sum13Arr1 = {1, 2, 2, 1};
        System.out.println("\tsum13([1, 2, 2, 1])");
        System.out.println("Expected output:\t6");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.sum13(sum13Arr1) + "\n");

        int[] sum13Arr2 = {1, 1};
        System.out.println("\tsum13([1, 1])");
        System.out.println("Expected output:\t2");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.sum13(sum13Arr2) + "\n");

        int[] sum13Arr3 = {1, 2, 2, 1, 13};
        System.out.println("\tsum13([1, 2, 2, 1, 13])");
        System.out.println("Expected output:\t6");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.sum13(sum13Arr3) + "\n");

        // Testing fizzArray()
        System.out.println("----------------------");
        System.out.println(" Testing fizzArray(): ");
        System.out.println("----------------------");

        System.out.println("\tfizzArray(4)");
        System.out.println("Expected output:\t[0, 1, 2, 3]");
        int[] fizzArr1 = Unit2Exercises.fizzArray(4);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(fizzArr1) + "\n");

        System.out.println("\tfizzArray(1)");
        System.out.println("Expected output:\t[0]");
        int[] fizzArr2 = Unit2Exercises.fizzArray(1);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(fizzArr2) + "\n");

        System.out.println("\tfizzArray(10)");
        System.out.println("Expected output:\t[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        int[] fizzArr3 = Unit2Exercises.fizzArray(10);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(fizzArr3) + "\n");

        // Testing haveThree()
        System.out.println("----------------------");
        System.out.println(" Testing haveThree(): ");
        System.out.println("----------------------");

        int[] threeArr1 = {3, 1, 3, 1, 3};
        System.out.println("\thaveThree([3, 1, 3, 1, 3])");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.haveThree(threeArr1) + "\n");

        int[] threeArr2 = {3, 1, 3, 3};
        System.out.println("\thaveThree([3, 1, 3, 3])");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.haveThree(threeArr2) + "\n");

        int[] threeArr3 = {3, 4, 3, 3, 4};
        System.out.println("\thaveThree([3, 4, 3, 3, 4])");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.haveThree(threeArr3) + "\n");

        // Testing fizzArray2()
        System.out.println("-----------------------");
        System.out.println(" Testing fizzArray2(): ");
        System.out.println("-----------------------");

        System.out.println("\tfizzArray2(4)");
        System.out.println("Expected output:\t[0, 1, 2, 3]");
        String[] fizzArr2num1 = Unit2Exercises.fizzArray2(4);
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(fizzArr2num1) + "\n");

        System.out.println("\tfizzArray2(10)");
        System.out.println("Expected output:\t[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        String[] fizzArr2num2 = Unit2Exercises.fizzArray2(10);
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(fizzArr2num2) + "\n");

        System.out.println("\tfizzArray2(2)");
        System.out.println("Expected output:\t[0, 1]");
        String[] fizzArr2num3 = Unit2Exercises.fizzArray2(2);
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(fizzArr2num3) + "\n");

        // Testing zeroFront()
        System.out.println("----------------------");
        System.out.println(" Testing zeroFront(): ");
        System.out.println("----------------------");

        int[] zeroArr1 = {1, 0, 0, 1};
        System.out.println("\tzeroFront([1, 0, 0, 1])");
        System.out.println("Expected output:\t[0, 0, 1, 1]");
        int[] zeroResult1 = Unit2Exercises.zeroFront(zeroArr1);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(zeroResult1) + "\n");

        int[] zeroArr2 = {0, 1, 1, 0, 1};
        System.out.println("\tzeroFront([0, 1, 1, 0, 1])");
        System.out.println("Expected output:\t[0, 0, 1, 1, 1]");
        int[] zeroResult2 = Unit2Exercises.zeroFront(zeroArr2);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(zeroResult2) + "\n");

        int[] zeroArr3 = {1, 0};
        System.out.println("\tzeroFront([1, 0])");
        System.out.println("Expected output:\t[0, 1]");
        int[] zeroResult3 = Unit2Exercises.zeroFront(zeroArr3);
        System.out.println("Actual output:\t\t" 
            + Utils.printIntegerArray(zeroResult3) + "\n");

        // Testing wordsWithout()
        System.out.println("-------------------------");
        System.out.println(" Testing wordsWithout(): ");
        System.out.println("-------------------------");

        String[] wordsArr1 = {"a", "b", "c", "a"};
        System.out.println("\twordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\")");
        System.out.println("Expected output:\t[b, c]");
        String[] wordsResult1 = Unit2Exercises.wordsWithout(wordsArr1, "a");
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(wordsResult1) + "\n");

        String[] wordsArr2 = {"a", "b", "c", "a"};
        System.out.println("\twordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\")");
        System.out.println("Expected output:\t[a, c, a]");
        String[] wordsResult2 = Unit2Exercises.wordsWithout(wordsArr2, "b");
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(wordsResult2) + "\n");

        String[] wordsArr3 = {"a", "b", "c", "a"};
        System.out.println("\twordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\")");
        System.out.println("Expected output:\t[a, b, a]");
        String[] wordsResult3 = Unit2Exercises.wordsWithout(wordsArr3, "c");
        System.out.println("Actual output:\t\t" 
            + Utils.printStringArray(wordsResult3) + "\n");

        // Testing scoresAverage()
        System.out.println("---------------------------");
        System.out.println(" Testing scoresAverage(): ");
        System.out.println("---------------------------");

        int[] avgArr1 = {2, 2, 4, 4};
        System.out.println("\tscoresAverage([2, 2, 4, 4])");
        System.out.println("Expected output:\t4");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresAverage(avgArr1) + "\n");

        int[] avgArr2 = {4, 4, 4, 2, 2, 2};
        System.out.println("\tscoresAverage([4, 4, 4, 2, 2, 2])");
        System.out.println("Expected output:\t4");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresAverage(avgArr2) + "\n");

        int[] avgArr3 = {3, 4, 5, 1, 2, 3};
        System.out.println("\tscoresAverage([3, 4, 5, 1, 2, 3])");
        System.out.println("Expected output:\t4");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresAverage(avgArr3) + "\n");

        // Testing scoresIncreasing()
        System.out.println("------------------------------");
        System.out.println(" Testing scoresIncreasing(): ");
        System.out.println("------------------------------");

        int[] incArr1 = {1, 3, 4};
        System.out.println("\tscoresIncreasing([1, 3, 4])");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresIncreasing(incArr1) + "\n");

        int[] incArr2 = {1, 3, 2};
        System.out.println("\tscoresIncreasing([1, 3, 2])");
        System.out.println("Expected output:\tfalse");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresIncreasing(incArr2) + "\n");

        int[] incArr3 = {1, 1, 4};
        System.out.println("\tscoresIncreasing([1, 1, 4])");
        System.out.println("Expected output:\ttrue");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresIncreasing(incArr3) + "\n");

        // Testing scoresSpecial()
        System.out.println("---------------------------");
        System.out.println(" Testing scoresSpecial(): ");
        System.out.println("---------------------------");

        int[] specialArr1a = {12, 10, 4};
        int[] specialArr1b = {2, 20, 30};
        System.out.println("\tscoresSpecial([12, 10, 4], [2, 20, 30])");
        System.out.println("Expected output:\t40");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresSpecial(specialArr1a, specialArr1b) + "\n");

        int[] specialArr2a = {20, 10, 4};
        int[] specialArr2b = {2, 20, 10};
        System.out.println("\tscoresSpecial([20, 10, 4], [2, 20, 10])");
        System.out.println("Expected output:\t40");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresSpecial(specialArr2a, specialArr2b) + "\n");

        int[] specialArr3a = {12, 11, 4};
        int[] specialArr3b = {2, 20, 31};
        System.out.println("\tscoresSpecial([12, 11, 4], [2, 20, 31])");
        System.out.println("Expected output:\t20");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.scoresSpecial(specialArr3a, specialArr3b) + "\n");

        // Testing firstTwo()
        System.out.println("---------------------");
        System.out.println(" Testing firstTwo(): ");
        System.out.println("---------------------");

        System.out.println("\tfirstTwo(\"hello\")");
        System.out.println("Expected output:\the");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.firstTwo("hello") + "\n");

        System.out.println("\tfirstTwo(\"hi\")");
        System.out.println("Expected output:\thi");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.firstTwo("hi") + "\n");

        System.out.println("\tfirstTwo(\"h\")");
        System.out.println("Expected output:\th*");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.firstTwo("h") + "\n");

        System.out.println("\tfirstTwo(\"\")");
        System.out.println("Expected output:\t**");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.firstTwo("") + "\n");

        // Testing divide()
        System.out.println("-------------------");
        System.out.println(" Testing divide(): ");
        System.out.println("-------------------");

        System.out.println("\tdivide(5, 2)");
        System.out.println("Expected output:\t2.5");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.divide(5, 2) + "\n");

        System.out.println("\tdivide(2, 5)");
        System.out.println("Expected output:\t2.5");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.divide(2, 5) + "\n");

        System.out.println("\tdivide(4, 2)");
        System.out.println("Expected output:\t2.0");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.divide(4, 2) + "\n");

        System.out.println("\tdivide(10, 55)");
        System.out.println("Expected output:\t5.5");
        System.out.println("Actual output:\t\t" 
            + Unit2Exercises.divide(10, 55) + "\n");
    }
}
