package qn2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.a0;
import pn2.b0;
import pn2.b1;
import pn2.h0;
import pn2.r0;
import pn2.t0;
import pn2.u0;
import pn2.v1;
import rm2.i0;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f104520a = new x();

    public static ArrayList a(AbstractCollection abstractCollection, w wVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h0 h0Var2 = (h0) it2.next();
                    if (h0Var2 != h0Var) {
                        Intrinsics.f(h0Var2);
                        Intrinsics.f(h0Var);
                        if (((Boolean) wVar.invoke(h0Var2, h0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, pn2.u0, vn2.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [pn2.u0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, pn2.b0, pn2.h0] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v24, types: [pn2.h0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final h0 b(ArrayList types) {
        int i13;
        int i14;
        h0 h0Var;
        h0 g13;
        LinkedHashSet X;
        pn2.m mVar;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (true) {
            i13 = 1;
            if (!it.hasNext()) {
                break;
            }
            h0 h0Var2 = (h0) it.next();
            if (h0Var2.w0() instanceof a0) {
                Collection c13 = h0Var2.w0().c();
                Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                Collection<b0> collection = c13;
                ArrayList arrayList2 = new ArrayList(g0.q(collection, 10));
                for (b0 b0Var : collection) {
                    Intrinsics.f(b0Var);
                    h0 Y2 = dl2.b.Y2(b0Var);
                    if (h0Var2.x0()) {
                        Y2 = Y2.A0(true);
                    }
                    arrayList2.add(Y2);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(h0Var2);
            }
        }
        v vVar = v.START;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            vVar = vVar.combine((v1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (true) {
            i14 = 0;
            if (!it3.hasNext()) {
                break;
            }
            h0 h0Var3 = (h0) it3.next();
            if (vVar == v.NOT_NULL) {
                if (h0Var3 instanceof k) {
                    k kVar = (k) h0Var3;
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    h0Var3 = new k(kVar.f104500b, kVar.f104501c, kVar.f104502d, kVar.f104503e, kVar.f104504f, true);
                }
                Intrinsics.checkNotNullParameter(h0Var3, "<this>");
                int i15 = pn2.r.f100835d;
                h0 k13 = i0.k(h0Var3, false);
                h0Var3 = (k13 == null && (k13 = l0.L0(h0Var3)) == null) ? h0Var3.A0(false) : k13;
            }
            linkedHashSet.add(h0Var3);
        }
        ArrayList arrayList3 = new ArrayList(g0.q(types, 10));
        Iterator it4 = types.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((h0) it4.next()).v0());
        }
        Iterator it5 = arrayList3.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (true) {
            h0Var = null;
            if (!it5.hasNext()) {
                break;
            }
            u0 other = (u0) it5.next();
            next = (u0) next;
            next.getClass();
            Intrinsics.checkNotNullParameter(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Collection values = u0.f100848b.f100840a.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                Iterator it6 = values.iterator();
                while (it6.hasNext()) {
                    int intValue = ((Number) it6.next()).intValue();
                    r0 r0Var = (r0) next.f126314a.get(intValue);
                    r0 r0Var2 = (r0) other.f126314a.get(intValue);
                    if (r0Var == null) {
                        if (r0Var2 != null) {
                            mVar = (pn2.m) r0Var2;
                            if (Intrinsics.d((pn2.m) r0Var, mVar)) {
                            }
                        }
                        mVar = null;
                    } else {
                        pn2.m mVar2 = (pn2.m) r0Var;
                        if (Intrinsics.d((pn2.m) r0Var2, mVar2)) {
                            mVar = mVar2;
                        }
                        mVar = null;
                    }
                    wn2.k.b(mVar, arrayList4);
                }
                next = t0.a(arrayList4);
            }
        }
        u0 u0Var = (u0) next;
        if (linkedHashSet.size() == 1) {
            g13 = (h0) CollectionsKt.r0(linkedHashSet);
        } else {
            ArrayList types2 = a(linkedHashSet, new w(this, i14));
            types2.isEmpty();
            Intrinsics.checkNotNullParameter(types2, "types");
            dn2.l lVar = dn2.l.INTERSECTION_TYPE;
            if (!types2.isEmpty()) {
                Iterator it7 = types2.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                h0 next2 = it7.next();
                while (it7.hasNext()) {
                    h0 h0Var4 = (h0) it7.next();
                    next2 = next2;
                    if (next2 != 0 && h0Var4 != null) {
                        b1 w03 = next2.w0();
                        b1 w04 = h0Var4.w0();
                        boolean z13 = w03 instanceof dn2.o;
                        if (z13 && (w04 instanceof dn2.o)) {
                            dn2.o oVar = (dn2.o) w03;
                            dn2.o oVar2 = (dn2.o) w04;
                            int i16 = dn2.m.f55628a[lVar.ordinal()];
                            if (i16 == 1) {
                                X = CollectionsKt.X(oVar.f55632c, oVar2.f55632c);
                            } else {
                                if (i16 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                X = CollectionsKt.K0(oVar.f55632c, oVar2.f55632c);
                            }
                            dn2.o constructor = new dn2.o(oVar.f55630a, oVar.f55631b, X);
                            u0.f100848b.getClass();
                            u0 attributes = u0.f100849c;
                            Intrinsics.checkNotNullParameter(attributes, "attributes");
                            Intrinsics.checkNotNullParameter(constructor, "constructor");
                            next2 = pn2.g.r(q0.f80391a, rn2.m.a(rn2.i.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, constructor, false);
                        } else if (z13) {
                            if (!((dn2.o) w03).f55632c.contains(h0Var4)) {
                                h0Var4 = null;
                            }
                            next2 = h0Var4;
                        } else if ((w04 instanceof dn2.o) && ((dn2.o) w04).f55632c.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                h0Var = next2;
            }
            if (h0Var != null) {
                g13 = h0Var;
            } else {
                n.f104513b.getClass();
                ArrayList a13 = a(types2, new w(m.f104512b, i13));
                a13.isEmpty();
                g13 = a13.size() < 2 ? (h0) CollectionsKt.r0(a13) : new a0(linkedHashSet).g();
            }
        }
        return g13.C0(u0Var);
    }
}
