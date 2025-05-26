package q5;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public n1 f102491a;

    public o1(int i13, Interpolator interpolator, long j13) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f102491a = new m1(k1.k(i13, interpolator, j13));
        } else {
            this.f102491a = new j1(i13, interpolator, j13);
        }
    }
}
