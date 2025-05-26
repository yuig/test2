package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String uid) {
        super(uid, 0);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131410d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131410d;
    }
}
