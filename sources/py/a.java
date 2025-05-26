package py;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f101716a;

    /* renamed from: b, reason: collision with root package name */
    public d4 f101717b;

    /* renamed from: c, reason: collision with root package name */
    public int f101718c;

    /* renamed from: d, reason: collision with root package name */
    public q92.c f101719d;

    /* renamed from: e, reason: collision with root package name */
    public StringBuilder f101720e;

    public final int a() {
        return this.f101716a;
    }

    public final int b() {
        return this.f101718c;
    }

    public final d4 c() {
        return this.f101717b;
    }

    public final void d(int i13) {
        this.f101716a = i13;
        StringBuilder sb3 = this.f101720e;
        sb3.append("->");
        sb3.append(i13);
    }

    public final void e(int i13) {
        this.f101718c = i13;
    }

    public final void f(d4 d4Var) {
        Intrinsics.checkNotNullParameter(d4Var, "<set-?>");
        this.f101717b = d4Var;
    }

    public final String toString() {
        String sb3 = this.f101720e.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
