package c2;

/* loaded from: classes2.dex */
public final class n1 implements b3.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25000b;

    public /* synthetic */ n1(Object obj, int i13) {
        this.f24999a = i13;
        this.f25000b = obj;
    }

    @Override // b3.x
    public final long a() {
        int i13 = this.f24999a;
        Object obj = this.f25000b;
        switch (i13) {
            case 0:
                p1 p1Var = (p1) obj;
                long a13 = p1Var.f25063s.a();
                if (a13 != 16) {
                    return a13;
                }
                o3 o3Var = (o3) com.bumptech.glide.c.w(p1Var, p3.f25069b);
                if (o3Var != null) {
                    long j13 = o3Var.f25040a;
                    if (j13 != 16) {
                        return j13;
                    }
                }
                long j14 = ((b3.w) com.bumptech.glide.c.w(p1Var, c1.f24577a)).f21392a;
                return (((s0) com.bumptech.glide.c.w(p1Var, u0.f25271a)).f() || ((double) androidx.compose.ui.graphics.a.q(j14)) >= 0.5d) ? j14 : b3.w.f21382f;
            default:
                return ((q3) obj).f25099c;
        }
    }
}
