package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h2 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131406d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(String uid, String str) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131406d = uid;
        this.f131407e = str;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131406d;
    }
}
