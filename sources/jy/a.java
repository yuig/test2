package jy;

import ey.z1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final s92.o f77700e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f77701f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f77702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a4 a4Var, d4 d4Var, s92.o result, String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f77700e = result;
        this.f77701f = d4Var;
        this.f77702g = a4Var;
    }

    @Override // ey.u1
    public final String e() {
        return h.f77707a;
    }
}
