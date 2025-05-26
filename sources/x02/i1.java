package x02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 extends o1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f131411e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131412f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String uid, String str, String str2, String str3) {
        super(uid, str3);
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f131411e = uid;
        this.f131412f = str;
        this.f131413g = str2;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131411e;
    }
}
