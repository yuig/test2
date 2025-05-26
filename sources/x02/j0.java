package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(String uid) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131421d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131421d;
    }
}
