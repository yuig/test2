package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131463d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String uid) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131463d = uid;
        this.f131464e = null;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131463d;
    }
}
