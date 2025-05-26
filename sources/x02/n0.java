package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131451d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String uid, boolean z13) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131451d = uid;
        this.f131452e = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131451d;
    }
}
