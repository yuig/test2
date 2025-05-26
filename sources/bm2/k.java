package bm2;

import am2.v0;
import am2.w0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import tu1.u;

/* loaded from: classes2.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final xl2.l f23543a;

    /* renamed from: b, reason: collision with root package name */
    public final ym2.c f23544b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f23545c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f23546d;

    public k(xl2.l builtIns, ym2.c fqName, Map allValueArguments) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f23543a = builtIns;
        this.f23544b = fqName;
        this.f23545c = allValueArguments;
        this.f23546d = xk2.m.a(xk2.n.PUBLICATION, new u(this, 20));
    }

    @Override // bm2.c
    public final Map a() {
        return this.f23545c;
    }

    @Override // bm2.c
    public final w0 b() {
        v0 NO_SOURCE = w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // bm2.c
    public final ym2.c c() {
        return this.f23544b;
    }

    @Override // bm2.c
    public final b0 getType() {
        Object value = this.f23546d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }
}
