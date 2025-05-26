package ek1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yi1.f0 f59273j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(yi1.f0 f0Var, int i13) {
        super(1);
        this.f59272i = i13;
        this.f59273j = f0Var;
    }

    public final r1 b(r1 it) {
        int i13 = this.f59272i;
        yi1.f0 f0Var = this.f59273j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, ((yi1.y) f0Var).f139169a, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -32769, 4194303);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, ((yi1.v) f0Var).f139161a, false, false, -1, 3932159);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h32.z1 z1Var;
        switch (this.f59272i) {
            case 0:
                return b((r1) obj);
            case 1:
                r it = (r) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                az.b bVar = it.f59329b;
                h32.z1 source = bVar.f20694b;
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    z1Var = new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, Short.valueOf((short) (((yi1.y) this.f59273j).f139169a + 1)), source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
                } else {
                    z1Var = null;
                }
                return r.e(it, null, az.b.e(bVar, null, z1Var, null, 5), null, false, null, 29);
            default:
                return b((r1) obj);
        }
    }
}
