package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131293d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String uid, String str) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131293d = uid;
        this.f131294e = str;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131293d;
    }
}
