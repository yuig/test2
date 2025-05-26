package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class o1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25037i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1 f25038j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(p1 p1Var, int i13) {
        super(0);
        this.f25037i = i13;
        this.f25038j = p1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e2.i iVar;
        int i13 = this.f25037i;
        p1 p1Var = this.f25038j;
        switch (i13) {
            case 0:
                o3 o3Var = (o3) com.bumptech.glide.c.w(p1Var, p3.f25069b);
                if (o3Var == null || (iVar = o3Var.f25041b) == null) {
                    return ((s0) com.bumptech.glide.c.w(p1Var, u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(((b3.w) com.bumptech.glide.c.w(p1Var, c1.f24577a)).f21392a)) > 0.5d ? p3.f25072e : p3.f25073f : p3.f25074g;
                }
                return iVar;
            default:
                if (((o3) com.bumptech.glide.c.w(p1Var, p3.f25069b)) == null) {
                    e2.z zVar = p1Var.f25064t;
                    if (zVar != null) {
                        p1Var.N0(zVar);
                    }
                } else if (p1Var.f25064t == null) {
                    int i14 = 0;
                    n1 n1Var = new n1(p1Var, i14);
                    o1 o1Var = new o1(p1Var, i14);
                    j1.o2 o2Var = e2.x.f56917a;
                    boolean z13 = e2.d0.f56843a;
                    o1.k kVar = p1Var.f25060p;
                    boolean z14 = p1Var.f25061q;
                    float f13 = p1Var.f25062r;
                    e2.z dVar = z13 ? new e2.d(kVar, z14, f13, n1Var, o1Var) : new e2.b(kVar, z14, f13, n1Var, o1Var);
                    p1Var.M0(dVar);
                    p1Var.f25064t = dVar;
                }
                return Unit.f80348a;
        }
    }
}
