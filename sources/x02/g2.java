package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 extends j12.h {

    /* renamed from: d, reason: collision with root package name */
    public final String f131396d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131397e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(String uid, int i13, String str) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131396d = uid;
        this.f131397e = i13;
        this.f131398f = str;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131396d;
    }
}
