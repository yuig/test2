package k22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f78208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String uid) {
        super(uid, 2);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f78208d = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f78208d;
    }
}
