package mm2;

import am2.w0;
import ao2.m0;
import dm2.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import pn2.r1;
import pn2.w1;

/* loaded from: classes2.dex */
public final class f implements bm2.c, km2.i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f87663h;

    /* renamed from: a, reason: collision with root package name */
    public final rg.a f87664a;

    /* renamed from: b, reason: collision with root package name */
    public final pm2.a f87665b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.j f87666c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f87667d;

    /* renamed from: e, reason: collision with root package name */
    public final fm2.h f87668e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.l f87669f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87670g;

    static {
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f87663h = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(f.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public f(rg.a c13, pm2.a javaAnnotation, boolean z13) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f87664a = c13;
        this.f87665b = javaAnnotation;
        on2.u c14 = c13.c();
        e eVar = new e(this, 1);
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f87666c = new on2.j(qVar, eVar);
        on2.u c15 = c13.c();
        e eVar2 = new e(this, 2);
        on2.q qVar2 = (on2.q) c15;
        qVar2.getClass();
        this.f87667d = new on2.l(qVar2, eVar2);
        this.f87668e = ((fm2.f) ((lm2.a) c13.f107929a).f83940j).b(javaAnnotation);
        on2.u c16 = c13.c();
        e eVar3 = new e(this, 0);
        on2.q qVar3 = (on2.q) c16;
        qVar3.getClass();
        this.f87669f = new on2.l(qVar3, eVar3);
        this.f87670g = z13;
    }

    @Override // bm2.c
    public final Map a() {
        return (Map) lb.l0.B0(this.f87669f, f87663h[2]);
    }

    @Override // bm2.c
    public final w0 b() {
        return this.f87668e;
    }

    @Override // bm2.c
    public final ym2.c c() {
        on2.j jVar = this.f87666c;
        rl2.u p13 = f87663h[0];
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(p13, "p");
        return (ym2.c) jVar.invoke();
    }

    public final dn2.g d(pm2.b bVar) {
        pn2.b0 type;
        if (bVar instanceof pm2.l) {
            return dn2.h.f55624a.b(((gm2.x) ((pm2.l) bVar)).f65793b, null);
        }
        if (bVar instanceof pm2.k) {
            gm2.v vVar = (gm2.v) ((pm2.k) bVar);
            return new dn2.i(vVar.b(), vVar.a());
        }
        boolean z13 = bVar instanceof pm2.e;
        rg.a aVar = this.f87664a;
        if (!z13) {
            if (bVar instanceof pm2.c) {
                f value = new f(aVar, ((gm2.g) ((pm2.c) bVar)).a(), false);
                Intrinsics.checkNotNullParameter(value, "value");
                return new dn2.a((Object) value);
            }
            if (bVar instanceof pm2.h) {
                return rm2.i0.c(((com.google.firebase.messaging.q) aVar.f107933e).O(((gm2.r) ((pm2.h) bVar)).a(), com.bumptech.glide.c.m1(r1.COMMON, false, false, null, 7)));
            }
            return null;
        }
        pm2.b bVar2 = (pm2.e) bVar;
        ym2.g gVar = ((gm2.f) bVar2).f65767a;
        if (gVar == null) {
            gVar = im2.d0.f72702b;
        }
        Intrinsics.f(gVar);
        ArrayList a13 = ((gm2.h) bVar2).a();
        pn2.h0 h0Var = (pn2.h0) lb.l0.B0(this.f87667d, f87663h[1]);
        Intrinsics.checkNotNullExpressionValue(h0Var, "<get-type>(...)");
        if (m0.U(h0Var)) {
            return null;
        }
        am2.g d2 = fn2.d.d(this);
        Intrinsics.f(d2);
        am2.p n03 = lb.l0.n0(gVar, d2);
        if (n03 == null || (type = ((c1) n03).getType()) == null) {
            type = ((lm2.a) aVar.f107929a).f83945o.f().g(rn2.m.d(rn2.l.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), w1.INVARIANT);
        }
        ArrayList value2 = new ArrayList(kotlin.collections.g0.q(a13, 10));
        Iterator it = a13.iterator();
        while (it.hasNext()) {
            dn2.g d13 = d((pm2.b) it.next());
            if (d13 == null) {
                d13 = new dn2.v();
            }
            value2.add(d13);
        }
        Intrinsics.checkNotNullParameter(value2, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new dn2.y(value2, type);
    }

    @Override // bm2.c
    public final pn2.b0 getType() {
        return (pn2.h0) lb.l0.B0(this.f87667d, f87663h[1]);
    }

    public final String toString() {
        return an2.y.f15818c.A(this, null);
    }
}
