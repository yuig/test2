package bn2;

import am2.a0;
import am2.c1;
import am2.i0;
import am2.w0;
import dm2.k0;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23578a = new c();

    public static w0 d(am2.b bVar) {
        while (bVar instanceof am2.d) {
            am2.d dVar = (am2.d) bVar;
            if (dVar.c() != am2.c.FAKE_OVERRIDE) {
                break;
            }
            Collection h10 = dVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getOverriddenDescriptors(...)");
            bVar = (am2.d) CollectionsKt.t0(h10);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.b();
    }

    public final boolean a(am2.m mVar, am2.m mVar2, boolean z13, boolean z14) {
        if ((mVar instanceof am2.g) && (mVar2 instanceof am2.g)) {
            return Intrinsics.d(((am2.g) mVar).e(), ((am2.g) mVar2).e());
        }
        if ((mVar instanceof c1) && (mVar2 instanceof c1)) {
            return b((c1) mVar, (c1) mVar2, z13, b.f23577i);
        }
        if (!(mVar instanceof am2.b) || !(mVar2 instanceof am2.b)) {
            return ((mVar instanceof i0) && (mVar2 instanceof i0)) ? Intrinsics.d(((k0) ((i0) mVar)).f55454e, ((k0) ((i0) mVar2)).f55454e) : Intrinsics.d(mVar, mVar2);
        }
        am2.b a13 = (am2.b) mVar;
        am2.b b13 = (am2.b) mVar2;
        qn2.h kotlinTypeRefiner = qn2.h.f104498a;
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        boolean z15 = true;
        if (!Intrinsics.d(a13, b13)) {
            if (Intrinsics.d(a13.getName(), b13.getName()) && ((!z14 || !(a13 instanceof a0) || !(b13 instanceof a0) || ((a0) a13).Z() == ((a0) b13).Z()) && ((!Intrinsics.d(a13.g(), b13.g()) || (z13 && Intrinsics.d(d(a13), d(b13)))) && !e.q(a13) && !e.q(b13)))) {
                am2.m g13 = a13.g();
                am2.m g14 = b13.g();
                if (((g13 instanceof am2.d) || (g14 instanceof am2.d)) ? Boolean.FALSE.booleanValue() : a(g13, g14, z13, true)) {
                    o oVar = new o(new ae.s(a13, b13, z13));
                    Intrinsics.checkNotNullExpressionValue(oVar, "create(...)");
                    m c13 = oVar.o(a13, b13, null, true).c();
                    m mVar3 = m.OVERRIDABLE;
                    if (c13 != mVar3 || oVar.o(b13, a13, null, true).c() != mVar3) {
                        z15 = false;
                    }
                }
            }
            return false;
        }
        return z15;
    }

    public final boolean b(c1 a13, c1 b13, boolean z13, Function2 equivalentCallables) {
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.d(a13, b13)) {
            return true;
        }
        return !Intrinsics.d(a13.g(), b13.g()) && c(a13, b13, equivalentCallables, z13) && a13.getIndex() == b13.getIndex();
    }

    public final boolean c(am2.m mVar, am2.m mVar2, Function2 function2, boolean z13) {
        am2.m g13 = mVar.g();
        am2.m g14 = mVar2.g();
        return ((g13 instanceof am2.d) || (g14 instanceof am2.d)) ? ((Boolean) function2.invoke(g13, g14)).booleanValue() : a(g13, g14, z13, true);
    }
}
