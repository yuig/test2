package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131402d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String uid, int i13) {
        super(uid, 0);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131402d = uid;
        this.f131403e = i13;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131402d;
    }
}
