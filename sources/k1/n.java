package k1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public a3.c f77932a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f77933b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f77934c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f77935d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77936e;

    /* renamed from: f, reason: collision with root package name */
    public long f77937f;

    /* renamed from: g, reason: collision with root package name */
    public n3.p f77938g;

    /* renamed from: h, reason: collision with root package name */
    public final u2.q f77939h;

    public n(Context context, b2 b2Var) {
        p0 p0Var = new p0(context, androidx.compose.ui.graphics.a.u(b2Var.f77823a));
        this.f77933b = p0Var;
        Unit unit = Unit.f80348a;
        this.f77934c = bs1.c.u1(unit, i2.r1.f71258a);
        this.f77935d = true;
        this.f77937f = 0L;
        this.f77939h = n3.f0.a(u2.n.f120041b, unit, new m(this, null)).j(Build.VERSION.SDK_INT >= 31 ? new o0(this, p0Var) : new n0(this, p0Var, b2Var));
    }

    @Override // k1.e2
    public final boolean a() {
        p0 p0Var = this.f77933b;
        EdgeEffect edgeEffect = p0Var.f77965d;
        if (edgeEffect != null && lp2.b.h(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = p0Var.f77966e;
        if (edgeEffect2 != null && lp2.b.h(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = p0Var.f77967f;
        if (edgeEffect3 != null && lp2.b.h(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = p0Var.f77968g;
        return (edgeEffect4 == null || lp2.b.h(edgeEffect4) == 0.0f) ? false : true;
    }

    @Override // k1.e2
    public final u2.q b() {
        return this.f77939h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d9, code lost:
    
        if (k1.p0.j(r8.f77966e) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01de, code lost:
    
        if (r6 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dc, code lost:
    
        if (r7 != false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f  */
    @Override // k1.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r18, int r20, k1.s2 r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.n.c(long, int, k1.s2):long");
    }

    public final void d() {
        boolean z13;
        p0 p0Var = this.f77933b;
        EdgeEffect edgeEffect = p0Var.f77965d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z13 = edgeEffect.isFinished();
        } else {
            z13 = false;
        }
        EdgeEffect edgeEffect2 = p0Var.f77966e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z13 = edgeEffect2.isFinished() || z13;
        }
        EdgeEffect edgeEffect3 = p0Var.f77967f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z13 = edgeEffect3.isFinished() || z13;
        }
        EdgeEffect edgeEffect4 = p0Var.f77968g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() && !z13) {
                return;
            }
        } else if (!z13) {
            return;
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k1.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r9, m1.m2 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.n.e(long, m1.m2, bl2.c):java.lang.Object");
    }

    public final long f() {
        a3.c cVar = this.f77932a;
        long r03 = cVar != null ? cVar.f482a : bs1.c.r0(this.f77937f);
        return com.bumptech.glide.c.d(a3.c.d(r03) / a3.f.d(this.f77937f), a3.c.e(r03) / a3.f.b(this.f77937f));
    }

    public final void g() {
        if (this.f77935d) {
            this.f77934c.setValue(Unit.f80348a);
        }
    }

    public final float h(long j13) {
        float d2 = a3.c.d(f());
        float e13 = a3.c.e(j13) / a3.f.b(this.f77937f);
        EdgeEffect b13 = this.f77933b.b();
        return lp2.b.h(b13) == 0.0f ? a3.f.b(this.f77937f) * (-lp2.b.n(b13, -e13, 1 - d2)) : a3.c.e(j13);
    }

    public final float i(long j13) {
        float e13 = a3.c.e(f());
        float d2 = a3.c.d(j13) / a3.f.d(this.f77937f);
        EdgeEffect d13 = this.f77933b.d();
        return lp2.b.h(d13) == 0.0f ? a3.f.d(this.f77937f) * lp2.b.n(d13, d2, 1 - e13) : a3.c.d(j13);
    }

    public final float j(long j13) {
        float e13 = a3.c.e(f());
        float d2 = a3.c.d(j13) / a3.f.d(this.f77937f);
        EdgeEffect f13 = this.f77933b.f();
        return lp2.b.h(f13) == 0.0f ? a3.f.d(this.f77937f) * (-lp2.b.n(f13, -d2, e13)) : a3.c.d(j13);
    }

    public final float k(long j13) {
        float d2 = a3.c.d(f());
        float e13 = a3.c.e(j13) / a3.f.b(this.f77937f);
        EdgeEffect h10 = this.f77933b.h();
        return lp2.b.h(h10) == 0.0f ? a3.f.b(this.f77937f) * lp2.b.n(h10, e13, d2) : a3.c.e(j13);
    }

    public final void l(long j13) {
        boolean a13 = a3.f.a(this.f77937f, 0L);
        boolean z13 = !a3.f.a(j13, this.f77937f);
        this.f77937f = j13;
        if (z13) {
            long d2 = lb.l0.d(ml2.c.c(a3.f.d(j13)), ml2.c.c(a3.f.b(j13)));
            p0 p0Var = this.f77933b;
            p0Var.f77964c = d2;
            EdgeEffect edgeEffect = p0Var.f77965d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (d2 >> 32), (int) (d2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = p0Var.f77966e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (d2 >> 32), (int) (d2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = p0Var.f77967f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (d2 & 4294967295L), (int) (d2 >> 32));
            }
            EdgeEffect edgeEffect4 = p0Var.f77968g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (d2 & 4294967295L), (int) (d2 >> 32));
            }
            EdgeEffect edgeEffect5 = p0Var.f77969h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (d2 >> 32), (int) (d2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = p0Var.f77970i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (d2 >> 32), (int) (d2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = p0Var.f77971j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (d2 & 4294967295L), (int) (d2 >> 32));
            }
            EdgeEffect edgeEffect8 = p0Var.f77972k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (d2 & 4294967295L), (int) (d2 >> 32));
            }
        }
        if (a13 || !z13) {
            return;
        }
        g();
        d();
    }
}
