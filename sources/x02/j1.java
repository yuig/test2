package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 extends o1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f131422e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f131423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String uid, String str, boolean z13) {
        super(uid, str);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131422e = uid;
        this.f131423f = z13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131422e;
    }
}
