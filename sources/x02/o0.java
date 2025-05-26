package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131455d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f131458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String uid, String invited, boolean z13) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(invited, "invited");
        this.f131455d = uid;
        this.f131456e = invited;
        this.f131457f = "";
        this.f131458g = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131455d;
    }
}
