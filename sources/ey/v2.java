package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v2 extends a2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60598g;

    /* renamed from: h, reason: collision with root package name */
    public final String f60599h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f60600i;

    /* renamed from: j, reason: collision with root package name */
    public final h32.d4 f60601j;

    /* renamed from: k, reason: collision with root package name */
    public final h32.a4 f60602k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(String pinUid, String str, Integer num, h32.d4 d4Var, h32.a4 a4Var) {
        super(pinUid, 0);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f60598g = pinUid;
        this.f60599h = str;
        this.f60600i = num;
        this.f60601j = d4Var;
        this.f60602k = a4Var;
    }

    public final String l() {
        return this.f60598g;
    }

    public final Integer m() {
        return this.f60600i;
    }

    public final String n() {
        return this.f60599h;
    }

    public final h32.a4 o() {
        return this.f60602k;
    }

    public final h32.d4 p() {
        return this.f60601j;
    }
}
