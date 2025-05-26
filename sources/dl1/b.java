package dl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends u {

    /* renamed from: d, reason: collision with root package name */
    public final String f55197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String uid) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f55197d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f55197d;
    }
}
