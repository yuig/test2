package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends q {

    /* renamed from: e, reason: collision with root package name */
    public final String f131437e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f131438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String uid, String str, boolean z13) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131437e = uid;
        this.f131438f = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131437e;
    }
}
