package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131428d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(String uid, boolean z13) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131428d = uid;
        this.f131429e = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131428d;
    }
}
