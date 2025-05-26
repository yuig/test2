package jy;

import ey.z1;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final d4 f77705e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f77706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a4 a4Var, d4 d4Var, String pinUid) {
        super(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f77705e = d4Var;
        this.f77706f = a4Var;
    }

    @Override // ey.u1
    public final String e() {
        return "load_image";
    }

    @Override // ey.u1
    public final String g() {
        return h.f77707a;
    }
}
