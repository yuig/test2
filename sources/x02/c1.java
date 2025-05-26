package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131297e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f131298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(String uid) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131296d = uid;
        this.f131297e = false;
        this.f131298f = true;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131296d;
    }
}
