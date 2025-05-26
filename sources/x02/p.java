package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends q {

    /* renamed from: e, reason: collision with root package name */
    public final String f131462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String uid, String str) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131462e = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131462e;
    }
}
