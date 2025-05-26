package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131499d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131500e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131501f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131502g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131503h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(String uid, String str, boolean z13) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131499d = uid;
        this.f131500e = z13;
        this.f131501f = str;
        this.f131502g = null;
        this.f131503h = null;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131499d;
    }
}
