package ek1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az.a f59217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yi1.x f59218j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f59219k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(az.a aVar, yi1.x xVar, long j13) {
        super(1);
        this.f59217i = aVar;
        this.f59218j = xVar;
        this.f59219k = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h32.z1 z1Var;
        r it = (r) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        az.b bVar = it.f59329b;
        h32.z1 source = bVar.f20694b;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            hs1.x xVar = this.f59218j.f139165b;
            z1Var = new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, Double.valueOf(this.f59219k), source.f67500l, source.f67502m, Boolean.valueOf(xVar == hs1.x.DISK || xVar == hs1.x.MEMORY), source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
        } else {
            z1Var = null;
        }
        return r.e(it, null, az.b.e(bVar, null, z1Var, this.f59217i, 1), null, false, null, 29);
    }
}
