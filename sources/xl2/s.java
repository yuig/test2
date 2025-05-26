package xl2;

import am2.c0;
import am2.x;
import com.google.android.gms.ads.RequestConfiguration;
import dm2.j0;
import dm2.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.e0;
import pn2.w1;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f135338a;

    static {
        rn2.m mVar = rn2.m.f108927a;
        dm2.q qVar = new dm2.q(rn2.m.f108928b, r.f135326f);
        am2.h hVar = am2.h.INTERFACE;
        ym2.g f13 = r.f135327g.f();
        on2.c cVar = on2.q.f96785e;
        j0 j0Var = new j0(qVar, hVar, f13, cVar);
        c0 c0Var = c0.ABSTRACT;
        if (c0Var == null) {
            j0.o0(6);
            throw null;
        }
        j0Var.f55448j = c0Var;
        am2.r rVar = am2.s.f15577e;
        if (rVar == null) {
            j0.o0(9);
            throw null;
        }
        j0Var.f55449k = rVar;
        List b13 = e0.b(z0.x0(j0Var, w1.IN_VARIANCE, ym2.g.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, cVar));
        if (b13 == null) {
            j0.o0(14);
            throw null;
        }
        if (j0Var.f55451m != null) {
            throw new IllegalStateException("Type parameters are already set for " + j0Var.getName());
        }
        ArrayList arrayList = new ArrayList(b13);
        j0Var.f55451m = arrayList;
        j0Var.f55450l = new pn2.o(j0Var, arrayList, j0Var.f55452n, j0Var.f55453o);
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            j0.o0(13);
            throw null;
        }
        Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            ((dm2.k) ((x) it.next())).D0(j0Var.j());
        }
        f135338a = j0Var;
    }
}
