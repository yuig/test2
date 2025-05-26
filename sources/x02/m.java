package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends q {

    /* renamed from: e, reason: collision with root package name */
    public final String f131445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String uid, String str) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131445e = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131445e;
    }
}
