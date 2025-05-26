package cz;

import com.pinterest.api.model.f11;
import com.pinterest.api.model.i11;
import com.pinterest.api.model.ur0;
import com.pinterest.api.model.w01;
import h32.f1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.c1;
import nx.d0;
import rg0.u0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c12.a f53453a;

    /* renamed from: b, reason: collision with root package name */
    public final w f53454b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f53455c;

    /* renamed from: d, reason: collision with root package name */
    public final h f53456d;

    /* renamed from: e, reason: collision with root package name */
    public w01 f53457e;

    /* renamed from: f, reason: collision with root package name */
    public final xj2.b f53458f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f53459g;

    /* renamed from: h, reason: collision with root package name */
    public ur0 f53460h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f53461i;

    /* renamed from: j, reason: collision with root package name */
    public c f53462j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f53463k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f53464l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f53465m;

    /* renamed from: n, reason: collision with root package name */
    public ag2.e f53466n;

    /* renamed from: o, reason: collision with root package name */
    public String f53467o;

    /* renamed from: p, reason: collision with root package name */
    public String f53468p;

    public e(c12.a service, w eventManager, i92.k toastUtils, h anketQuestionsPath) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(anketQuestionsPath, "anketQuestionsPath");
        this.f53453a = service;
        this.f53454b = eventManager;
        this.f53455c = toastUtils;
        this.f53456d = anketQuestionsPath;
        this.f53458f = new xj2.b();
        this.f53461i = new HashMap();
        this.f53463k = new HashMap();
        this.f53464l = new HashMap();
    }

    public final void a() {
        this.f53460h = null;
        this.f53462j = null;
        this.f53461i.clear();
        this.f53458f.d();
        this.f53463k.clear();
        this.f53464l.clear();
        h hVar = this.f53456d;
        hVar.f53471b.clear();
        hVar.f53470a = null;
    }

    public final void b(h32.u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        d0 a13 = c1.a();
        f1 f1Var = f1.TAP;
        ur0 ur0Var = this.f53460h;
        String c13 = ur0Var != null ? ur0Var.c() : null;
        ur0 ur0Var2 = this.f53460h;
        a13.N(f1Var, elementType, ur0Var2 != null ? ur0Var2.b() : null, c13, false);
    }

    public final void c(ur0 ur0Var, String str, String str2) {
        String surveyId;
        this.f53460h = ur0Var;
        h hVar = this.f53456d;
        hVar.getClass();
        hVar.f53470a = ur0Var != null ? ur0Var.a() : null;
        ur0 ur0Var2 = this.f53460h;
        if (ur0Var2 == null || (surveyId = ur0Var2.c()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        f11 f11Var = new f11(0);
        f11Var.b(str);
        f11Var.c(str2);
        i11 a13 = f11Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f53453a.b(surveyId, a13).r(tk2.e.f118017c).u().F(new dv.a(8, new wt.c(this, 22)), new dv.a(9, d.f53450k), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final void d(String str, b bVar) {
        HashMap hashMap = this.f53461i;
        if (bVar != null) {
            hashMap.put(str, bVar);
        } else {
            ur0 ur0Var = this.f53460h;
            if (ur0Var == null || ur0Var.d(str)) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, null);
            }
        }
        this.f53456d.b(str, bVar, hashMap);
        c cVar = this.f53462j;
        if (cVar != null) {
            cVar.p1();
        }
    }
}
