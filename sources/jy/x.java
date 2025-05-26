package jy;

import ey.z1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final d4 f77727e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f77728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a4 a4Var, d4 d4Var, String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f77727e = d4Var;
        this.f77728f = a4Var;
    }

    @Override // ey.u1
    public final String e() {
        return "view_rendered";
    }

    @Override // ey.u1
    public final String g() {
        return y.f77729a;
    }
}
