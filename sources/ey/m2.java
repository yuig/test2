package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m2 extends x1 implements b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60533g;

    /* renamed from: h, reason: collision with root package name */
    public final long f60534h;

    /* renamed from: i, reason: collision with root package name */
    public final int f60535i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 parameters) {
        super(parameters.f60537a, 1);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f60533g = parameters.f60537a;
        j3 j3Var = j3.f60510a;
        this.f60534h = j3.a();
        this.f60535i = parameters.f60538b;
    }

    public final long a() {
        return this.f60534h;
    }

    public final String l() {
        return this.f60533g;
    }
}
