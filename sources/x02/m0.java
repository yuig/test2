package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String uid) {
        super(uid, 1);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131446d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131446d;
    }
}
