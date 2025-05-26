package t3;

/* loaded from: classes.dex */
public interface e4 {
    long a();

    long b();

    default float c() {
        return 2.0f;
    }

    default long d() {
        float f13 = 48;
        return b7.c.e(f13, f13);
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();

    default float g() {
        return 16.0f;
    }
}
