package ha0;

import ao2.j0;
import fa0.s0;
import fa0.v;
import fa0.x;
import h32.d4;
import h32.i0;
import ha2.a0;
import ha2.z;
import j1.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import u50.r;
import x02.i2;

/* loaded from: classes5.dex */
public final class f implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final w f68373a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f68374b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f68375c;

    public f(w eventManager, ll.j navigator, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f68373a = eventManager;
        this.f68374b = navigator;
        this.f68375c = pinRepository;
    }

    public static String j(i0 i0Var) {
        d4 d4Var = i0Var.f67081a;
        String name = d4Var != null ? d4Var.name() : null;
        return name == null ? "" : name;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        fa0.w request = (fa0.w) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof s0)) {
            return;
        }
        List options = ((s0) request).f61534a;
        p0 optionSelected = new p0(this, request, scope, eventIntake);
        List list = x.f61542a;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(optionSelected, "optionSelected");
        HashMap hashMap = new HashMap();
        List list2 = options;
        Iterator it = list2.iterator();
        int i13 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                ha2.x xVar = new ha2.x(ea0.k.remix_collage_options_title, null, null, null, null, 30);
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                int i14 = 0;
                for (Object obj : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    arrayList.add(new a0(((v) obj).getLabelResId(), i14, null, null, null, null, null, null, null, 1020));
                    i14 = i15;
                    num = null;
                }
                this.f68373a.d(new jc0.v(new lp.k(new ha2.a(e0.b(new z(xVar, arrayList, new t80.r(15, hashMap, optionSelected))), true, num, 12)), false, 0L, 30));
                return;
            }
            Object next = it.next();
            int i16 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            hashMap.put(Integer.valueOf(i13), (v) next);
            i13 = i16;
        }
    }
}
