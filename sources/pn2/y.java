package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public final am2.c1[] f100856b;

    /* renamed from: c, reason: collision with root package name */
    public final g1[] f100857c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100858d;

    public y(am2.c1[] parameters, g1[] arguments, boolean z13) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f100856b = parameters;
        this.f100857c = arguments;
        this.f100858d = z13;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // pn2.l1
    public final boolean b() {
        return this.f100858d;
    }

    @Override // pn2.l1
    public final g1 e(b0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        am2.j b13 = key.w0().b();
        am2.c1 c1Var = b13 instanceof am2.c1 ? (am2.c1) b13 : null;
        if (c1Var == null) {
            return null;
        }
        int index = c1Var.getIndex();
        am2.c1[] c1VarArr = this.f100856b;
        if (index >= c1VarArr.length || !Intrinsics.d(c1VarArr[index].e(), c1Var.e())) {
            return null;
        }
        return this.f100857c[index];
    }

    @Override // pn2.l1
    public final boolean f() {
        return this.f100857c.length == 0;
    }
}
