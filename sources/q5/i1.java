package q5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.q4;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class i1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.x f102461a;

    /* renamed from: b, reason: collision with root package name */
    public a2 f102462b;

    public i1(View view, androidx.constraintlayout.widget.x xVar) {
        a2 a2Var;
        this.f102461a = xVar;
        WeakHashMap weakHashMap = v0.f102521a;
        a2 a13 = n0.a(view);
        if (a13 != null) {
            int i13 = Build.VERSION.SDK_INT;
            a2Var = (i13 >= 30 ? new r1(a13) : i13 >= 29 ? new q1(a13) : new p1(a13)).b();
        } else {
            a2Var = null;
        }
        this.f102462b = a2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y1 y1Var;
        if (!view.isLaidOut()) {
            this.f102462b = a2.i(view, windowInsets);
            return j1.i(view, windowInsets);
        }
        a2 i13 = a2.i(view, windowInsets);
        if (this.f102462b == null) {
            WeakHashMap weakHashMap = v0.f102521a;
            this.f102462b = n0.a(view);
        }
        if (this.f102462b == null) {
            this.f102462b = i13;
            return j1.i(view, windowInsets);
        }
        androidx.constraintlayout.widget.x j13 = j1.j(view);
        if (j13 != null && Objects.equals((WindowInsets) j13.f17873d, windowInsets)) {
            return j1.i(view, windowInsets);
        }
        a2 a2Var = this.f102462b;
        int i14 = 1;
        int i15 = 0;
        while (true) {
            y1Var = i13.f102400a;
            if (i14 > 256) {
                break;
            }
            if (!y1Var.f(i14).equals(a2Var.f102400a.f(i14))) {
                i15 |= i14;
            }
            i14 <<= 1;
        }
        if (i15 == 0) {
            return j1.i(view, windowInsets);
        }
        a2 a2Var2 = this.f102462b;
        o1 o1Var = new o1(i15, (i15 & 8) != 0 ? y1Var.f(8).f61084d > a2Var2.f102400a.f(8).f61084d ? j1.f102468e : j1.f102469f : j1.f102470g, 160L);
        o1Var.f102491a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o1Var.f102491a.a());
        f5.e f13 = y1Var.f(i15);
        f5.e f14 = a2Var2.f102400a.f(i15);
        int min = Math.min(f13.f61081a, f14.f61081a);
        int i16 = f13.f61082b;
        int i17 = f14.f61082b;
        int min2 = Math.min(i16, i17);
        int i18 = f13.f61083c;
        int i19 = f14.f61083c;
        int min3 = Math.min(i18, i19);
        int i23 = f13.f61084d;
        int i24 = i15;
        int i25 = f14.f61084d;
        q4 q4Var = new q4(13, f5.e.b(min, min2, min3, Math.min(i23, i25)), f5.e.b(Math.max(f13.f61081a, f14.f61081a), Math.max(i16, i17), Math.max(i18, i19), Math.max(i23, i25)));
        j1.f(view, windowInsets, false);
        duration.addUpdateListener(new g1(o1Var, i13, a2Var2, i24, view));
        duration.addListener(new c1(this, o1Var, view, 1));
        x.a(view, new h1(this, view, o1Var, q4Var, duration, 0));
        this.f102462b = i13;
        return j1.i(view, windowInsets);
    }
}
