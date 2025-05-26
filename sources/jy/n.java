package jy;

import ey.z1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final s92.o f77716e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f77717f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f77718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a4 a4Var, d4 d4Var, s92.o result, String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f77716e = result;
        this.f77717f = d4Var;
        this.f77718g = a4Var;
    }

    @Override // ey.u1
    public final String e() {
        return y.f77729a;
    }
}
