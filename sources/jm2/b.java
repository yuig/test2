package jm2;

import am2.w0;
import i2.j2;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import on2.q;
import pn2.b0;
import pn2.h0;
import rl2.u;

/* loaded from: classes2.dex */
public class b implements bm2.c, km2.i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f77045e;

    /* renamed from: a, reason: collision with root package name */
    public final ym2.c f77046a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f77047b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.l f77048c;

    /* renamed from: d, reason: collision with root package name */
    public final pm2.b f77049d;

    static {
        l0 l0Var = k0.f80436a;
        f77045e = new u[]{l0Var.g(new d0(l0Var.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(rg.a c13, pm2.a aVar, ym2.c fqName) {
        w0 NO_SOURCE;
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f77046a = fqName;
        if (aVar != null) {
            NO_SOURCE = ((fm2.f) ((lm2.a) c13.f107929a).f83940j).b(aVar);
        } else {
            NO_SOURCE = w0.f15602a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.f77047b = NO_SOURCE;
        on2.u c14 = c13.c();
        j2 j2Var = new j2(22, c13, this);
        q qVar = (q) c14;
        qVar.getClass();
        this.f77048c = new on2.l(qVar, j2Var);
        this.f77049d = aVar != null ? (pm2.b) CollectionsKt.T(((gm2.e) aVar).b()) : null;
    }

    @Override // bm2.c
    public Map a() {
        return z0.d();
    }

    @Override // bm2.c
    public final w0 b() {
        return this.f77047b;
    }

    @Override // bm2.c
    public final ym2.c c() {
        return this.f77046a;
    }

    @Override // bm2.c
    public final b0 getType() {
        return (h0) lb.l0.B0(this.f77048c, f77045e[0]);
    }
}
