package vr0;

import a.z0;
import cp.i;
import dh0.d;
import gk2.f1;
import i32.y0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jk2.l1;
import kotlin.jvm.internal.Intrinsics;
import rg0.v;
import rg0.y;
import tb0.g;
import tb0.h;
import tk2.e;

/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final sk2.c f126454a = new sk2.c();

    public static c a() {
        return b.f126453a;
    }

    public final void b(y0 y0Var) {
        c(y0Var, null);
    }

    public final void c(y0 placement, Map map) {
        List asList = Arrays.asList(String.valueOf(placement.value()));
        d dVar = (d) y.a();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(placement, "placement");
        dVar.f54984c.remove(placement);
        l1 A = v.a().h(asList, map, false, new tg0.c(false, false)).H(e.f118017c).A(wj2.c.a());
        i onSuccess = new i(this, 9);
        Intrinsics.checkNotNullParameter(A, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        nl.b.s(A, onSuccess, null, null, 6);
    }

    public final xj2.c d(y0 y0Var, xo.a aVar) {
        z0 z0Var = new z0(y0Var, 0);
        sk2.c cVar = this.f126454a;
        cVar.getClass();
        f1 f1Var = new f1(cVar, z0Var, 2);
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        Objects.requireNonNull(hVar);
        return f1Var.j(aVar, new xo.a(hVar, 12));
    }
}
