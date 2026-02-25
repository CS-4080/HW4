public class ch9_q1 {

    class True {
        choose(thenFn, elseFn) { return thenFN(); }
    }

    class False {
        choose(thenFn, elseFn) { return elseFN(); }
    }

    fun BoolObj(b) {
        if (b) return True();
        return False();
    }

    fun IF(cond, thenFn, elseFn) {
        return BoolObj(cond).choose(thenFn, elseFn);
    }

    var x = 20;

    fun then1() {
        print "THEN branch ran";
        return "x was > 8";
    }

    fun else1() {
        print "ELSE branch ran";
        return "x was <= 8";
    }

    IF(x > 8, then1, else1);

}