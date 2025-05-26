package h0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j1;
import java.io.Serializable;
import java.util.TreeSet;
import kh2.n3;
import v.j2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f66411a;

    /* renamed from: b, reason: collision with root package name */
    public int f66412b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66413c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f66414d;

    public j() {
        this.f66414d = new TreeSet(new j2(6));
        e();
    }

    public static int b(int i13, int i14) {
        int min;
        int i15 = i13 - i14;
        return (Math.abs(i15) <= 1000 || (min = (Math.min(i13, i14) - Math.max(i13, i14)) + 65535) >= 1000) ? i15 : i13 < i14 ? min : -min;
    }

    public final synchronized void a(a8.j jVar) {
        this.f66411a = jVar.f1369a.f1358c;
        ((TreeSet) this.f66414d).add(jVar);
    }

    public final Size c(j1 j1Var) {
        int n13 = j1Var.n();
        Size size = (Size) j1Var.j(j1.f16884gn, null);
        int i13 = this.f66412b;
        int i14 = this.f66411a;
        if (size == null) {
            return size;
        }
        int y13 = n3.y(n3.K0(n13), i14, 1 == i13);
        return (y13 == 90 || y13 == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public final synchronized a8.i d(long j13) {
        if (((TreeSet) this.f66414d).isEmpty()) {
            return null;
        }
        a8.j jVar = (a8.j) ((TreeSet) this.f66414d).first();
        int i13 = jVar.f1369a.f1358c;
        if (i13 != a8.i.a(this.f66412b) && j13 < jVar.f1370b) {
            return null;
        }
        ((TreeSet) this.f66414d).pollFirst();
        this.f66412b = i13;
        return jVar.f1369a;
    }

    public final synchronized void e() {
        ((TreeSet) this.f66414d).clear();
        this.f66413c = false;
        this.f66412b = -1;
        this.f66411a = -1;
    }

    public j(h0 h0Var, Rational rational) {
        this.f66411a = h0Var.b();
        this.f66412b = h0Var.d();
        this.f66414d = rational;
        boolean z13 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z13 = false;
        }
        this.f66413c = z13;
    }
}
