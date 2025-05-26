package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e2 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(String uid) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131348d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131348d;
    }
}
