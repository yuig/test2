package k22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78209d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String uid, String username) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f78209d = uid;
        this.f78210e = username;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78209d;
    }
}
