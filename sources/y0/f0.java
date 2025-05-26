package y0;

import android.util.Range;

/* loaded from: classes2.dex */
public interface f0 {
    boolean a();

    Range b(int i13);

    int c();

    boolean d(int i13, int i14);

    default boolean e(int i13, int i14) {
        return d(i13, i14) || (a() && d(i14, i13));
    }

    int f();

    Range g();

    Range h(int i13);

    Range i();

    Range j();
}
