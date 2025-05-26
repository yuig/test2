package rm2;

import am2.v0;
import am2.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f108756a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f108757b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f108758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g f108759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym2.b f108760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f108761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f108762g;

    public n(o oVar, am2.g gVar, ym2.b bVar, List list, w0 w0Var) {
        this.f108758c = oVar;
        this.f108759d = gVar;
        this.f108760e = bVar;
        this.f108761f = list;
        this.f108762g = w0Var;
        this.f108756a = oVar;
    }

    @Override // rm2.c0
    public final void a() {
        HashMap arguments = this.f108757b;
        o oVar = this.f108758c;
        oVar.getClass();
        ym2.b annotationClassId = this.f108760e;
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (Intrinsics.d(annotationClassId, wl2.b.f130215b)) {
            Object obj = arguments.get(ym2.g.e("value"));
            dn2.t tVar = obj instanceof dn2.t ? (dn2.t) obj : null;
            if (tVar != null) {
                Object obj2 = tVar.f55623a;
                dn2.r rVar = obj2 instanceof dn2.r ? (dn2.r) obj2 : null;
                if (rVar != null && oVar.o(rVar.f55636a.f55621a)) {
                    return;
                }
            }
        }
        if (oVar.o(annotationClassId)) {
            return;
        }
        this.f108761f.add(new bm2.d(this.f108759d.j(), arguments, this.f108762g));
    }

    @Override // rm2.c0
    public final void b(ym2.g gVar, ym2.b enumClassId, ym2.g enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        g(gVar, new dn2.i(enumClassId, enumEntryName));
    }

    @Override // rm2.c0
    public final void c(Object obj, ym2.g gVar) {
        g(gVar, o.t(this.f108756a, gVar, obj));
    }

    @Override // rm2.c0
    public final void d(ym2.g gVar, dn2.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g(gVar, new dn2.t(value));
    }

    @Override // rm2.c0
    public final d0 e(ym2.g gVar) {
        return new m(this.f108756a, gVar, this);
    }

    @Override // rm2.c0
    public final c0 f(ym2.b classId, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        v0 NO_SOURCE = w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new k(this.f108756a.p(classId, NO_SOURCE, arrayList), this, gVar, arrayList);
    }

    public final void g(ym2.g gVar, dn2.g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (gVar != null) {
            this.f108757b.put(gVar, value);
        }
    }
}
