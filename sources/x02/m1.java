package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 extends o1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f131447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(String uid, String str) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131447e = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131447e;
    }
}
