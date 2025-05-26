package k1;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.work.impl.WorkDatabase;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.md0;
import com.pinterest.api.model.v7;
import i2.v3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import so.ba;
import so.oa;
import t3.a4;
import t3.o3;
import t3.q3;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78053i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f78054j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f78055k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i13, Object obj, Object obj2) {
        super(0);
        this.f78053i = i13;
        this.f78054j = obj;
        this.f78055k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean dispatchKeyEvent;
        int i13 = this.f78053i;
        Object obj = this.f78055k;
        Object obj2 = this.f78054j;
        switch (i13) {
            case 6:
                ((w1.l1) obj2).f127375u.invoke(new h4.n(((h4.o) obj).f67602e));
                return Boolean.TRUE;
            default:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b4.g e13;
        long j13;
        w1.r2 d2;
        w1.l1 l1Var;
        w1.x1 x1Var;
        b4.g gVar;
        w1.x1 x1Var2;
        androidx.appcompat.app.x0 x0Var;
        int i13;
        int i14 = this.f78053i;
        int i15 = -1;
        int i16 = 10;
        int i17 = 3;
        wc.m mVar = null;
        ?? r83 = 0;
        byte b13 = 0;
        byte b14 = 0;
        Object obj = this.f78055k;
        Object obj2 = this.f78054j;
        switch (i14) {
            case 0:
                m167invoke();
                return Unit.f80348a;
            case 1:
                r1.l lVar = (r1.l) ((v3) obj2).getValue();
                r1.p0 p0Var = (r1.p0) obj;
                return new r1.o(p0Var, lVar, new androidx.compose.foundation.lazy.layout.x0((IntRange) p0Var.f105955b.f105892e.getValue(), lVar));
            case 2:
                s1.a0 a0Var = (s1.a0) ((v3) obj2).getValue();
                s1.o0 o0Var = (s1.o0) obj;
                return new s1.c0(o0Var, a0Var, new androidx.compose.foundation.lazy.layout.x0((IntRange) o0Var.f110493c.f110453f.getValue(), a0Var));
            case 3:
                a3.d dVar = (a3.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                q3.x xVar = (q3.x) obj;
                if (!xVar.h()) {
                    xVar = null;
                }
                if (xVar != null) {
                    return com.bumptech.glide.d.c(0L, lb.l0.y1(xVar.j()));
                }
                return null;
            case 4:
                m167invoke();
                return Unit.f80348a;
            case 5:
                w1.v2 v2Var = (w1.v2) obj2;
                if (v2Var != null) {
                    s2.t tVar = v2Var.f127552d;
                    if (tVar.isEmpty()) {
                        e13 = v2Var.f127551c;
                    } else {
                        b4.d dVar2 = new b4.d();
                        dVar2.b(v2Var.f127549a);
                        w1.v1 v1Var = new w1.v1(dVar2);
                        int size = tVar.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            ((Function1) tVar.get(i18)).invoke(v1Var);
                        }
                        e13 = dVar2.e();
                    }
                    v2Var.f127551c = e13;
                    if (e13 != null) {
                        return e13;
                    }
                }
                return (b4.g) obj;
            case 6:
                return invoke();
            case 7:
                b2.t0 t0Var = (b2.t0) obj2;
                long j14 = ((n4.j) ((i2.q1) obj).getValue()).f89186a;
                a3.c i19 = t0Var.i();
                long j15 = y2.h.f136670b;
                if (i19 != null) {
                    w1.l1 l1Var2 = t0Var.f21219d;
                    b4.g gVar2 = (l1Var2 == null || (x1Var2 = l1Var2.f127355a) == null) ? null : x1Var2.f127567a;
                    if (gVar2 != null && gVar2.f21571a.length() != 0) {
                        w1.v0 v0Var = (w1.v0) t0Var.f21231p.getValue();
                        int i23 = v0Var == null ? -1 : b2.w0.f21255a[v0Var.ordinal()];
                        if (i23 != -1) {
                            if (i23 != 1 && i23 != 2) {
                                if (i23 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                long j16 = t0Var.l().f67560b;
                                int i24 = b4.p0.f21640c;
                                j13 = j16 & 4294967295L;
                            } else {
                                long j17 = t0Var.l().f67560b;
                                int i25 = b4.p0.f21640c;
                                j13 = j17 >> 32;
                            }
                            int i26 = (int) j13;
                            w1.l1 l1Var3 = t0Var.f21219d;
                            if (l1Var3 != null && (d2 = l1Var3.d()) != null && (l1Var = t0Var.f21219d) != null && (x1Var = l1Var.f127355a) != null && (gVar = x1Var.f127567a) != null) {
                                int g13 = ql2.s.g(t0Var.f21217b.b(i26), 0, gVar.f21571a.length());
                                float d13 = a3.c.d(d2.d(i19.f482a));
                                b4.m0 m0Var = d2.f127471a;
                                int f13 = m0Var.f(g13);
                                float g14 = m0Var.g(f13);
                                float h10 = m0Var.h(f13);
                                float f14 = ql2.s.f(d13, Math.min(g14, h10), Math.max(g14, h10));
                                if (n4.j.a(j14, 0L) || Math.abs(d13 - f14) <= ((int) (j14 >> 32)) / 2) {
                                    b4.o oVar = m0Var.f21616b;
                                    float d14 = oVar.d(f13);
                                    j15 = com.bumptech.glide.c.d(f14, ((oVar.b(f13) - d14) / 2) + d14);
                                }
                            }
                        }
                    }
                }
                return new a3.c(j15);
            case 8:
                m167invoke();
                return Unit.f80348a;
            case 9:
                m167invoke();
                return Unit.f80348a;
            case 10:
                m167invoke();
                return Unit.f80348a;
            case 11:
            default:
                sp.g gVar3 = (sp.g) obj2;
                ni1.d0 d0Var = gVar3.f114860c;
                if (d0Var != null) {
                    nx.d0 d0Var2 = (nx.d0) obj;
                    return ((ba) d0Var).a(gVar3.f114863f, new sp.e(d0Var2, b14 == true ? 1 : 0), new sp.f(d0Var2, b13 == true ? 1 : 0));
                }
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            case 12:
                m167invoke();
                return Unit.f80348a;
            case 13:
                return invoke();
            case 14:
                m167invoke();
                return Unit.f80348a;
            case 15:
                m167invoke();
                return Unit.f80348a;
            case 16:
                m167invoke();
                return Unit.f80348a;
            case 17:
                m167invoke();
                return Unit.f80348a;
            case 18:
                m167invoke();
                return Unit.f80348a;
            case 19:
                m167invoke();
                return Unit.f80348a;
            case 20:
                m167invoke();
                return Unit.f80348a;
            case 21:
                m167invoke();
                return Unit.f80348a;
            case 22:
                return ((Function1) obj2).invoke((WorkDatabase) obj);
            case 23:
                xc.e eVar = (xc.e) ((yc.q) obj2).f138662e.getValue();
                UUID mutationId = (UUID) obj;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(mutationId, "mutationId");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = eVar.f134548b.entrySet().iterator();
                while (it.hasNext()) {
                    xc.d dVar3 = (xc.d) ((Map.Entry) it.next()).getValue();
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(mutationId, "mutationId");
                    ArrayList arrayList = dVar3.f134547b;
                    Iterator it2 = arrayList.iterator();
                    int i27 = r83;
                    while (true) {
                        if (!it2.hasNext()) {
                            i27 = i15;
                        } else if (!Intrinsics.d(mutationId, ((wc.m) it2.next()).f129095c)) {
                            i27++;
                        }
                    }
                    if (i27 == i15) {
                        x0Var = new androidx.appcompat.app.x0(kotlin.collections.s0.f80394a, (boolean) r83);
                        i13 = i16;
                    } else if (arrayList.size() == 1) {
                        i13 = i16;
                        x0Var = new androidx.appcompat.app.x0(dVar3.f134546a.b(), true);
                    } else {
                        wc.m record1 = dVar3.f134546a;
                        ((wc.m) arrayList.remove(i27)).getClass();
                        int size2 = arrayList.size();
                        wc.m record2 = mVar;
                        for (int max = Math.max((int) r83, i27 - 1); max < size2; max++) {
                            wc.m mVar2 = (wc.m) arrayList.get(max);
                            if (record2 != null) {
                                mVar2 = (wc.m) record2.c(mVar2).f80346a;
                            }
                            record2 = mVar2;
                        }
                        Intrinsics.f(record2);
                        dVar3.f134546a = record2;
                        Intrinsics.checkNotNullParameter(record1, "record1");
                        Intrinsics.checkNotNullParameter(record2, "record2");
                        String str = record1.f129093a;
                        String str2 = record2.f129093a;
                        boolean d15 = Intrinsics.d(str, str2);
                        String str3 = record1.f129093a;
                        if (d15) {
                            Set keySet = record1.f129094b.keySet();
                            Set keySet2 = record2.f129094b.keySet();
                            LinkedHashSet X = CollectionsKt.X(keySet, keySet2);
                            LinkedHashSet i28 = kotlin.collections.i1.i(kotlin.collections.i1.h(keySet, X), kotlin.collections.i1.h(keySet2, X));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : X) {
                                String str4 = (String) obj3;
                                if (!Intrinsics.d(r7.get(str4), r12.get(str4))) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashSet i29 = kotlin.collections.i1.i(i28, arrayList2);
                            i13 = 10;
                            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(i29, 10));
                            Iterator it3 = i29.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(str3 + '.' + ((String) it3.next()));
                            }
                            x0Var = new androidx.appcompat.app.x0(CollectionsKt.J0(arrayList3), false);
                        } else {
                            throw new IllegalStateException(("Cannot compute changed keys on record with different keys: '" + str3 + "' - '" + str2 + '\'').toString());
                        }
                    }
                    linkedHashSet.addAll((Set) x0Var.f16148b);
                    if (x0Var.f16147a) {
                        it.remove();
                    }
                    i16 = i13;
                    i15 = -1;
                    mVar = null;
                    r83 = 0;
                }
                return linkedHashSet;
            case 24:
                ((com.bugsnag.android.r) ((bb.p) obj2).f22464b).getClass();
                return ((Context) obj).getCacheDir();
            case 25:
                m167invoke();
                return Unit.f80348a;
            case 26:
                m167invoke();
                return Unit.f80348a;
            case 27:
                return new ep.i((h12.a) obj2, ((jp.h) obj).f77262c);
            case 28:
                jp.i iVar = (jp.i) obj2;
                String str5 = (String) obj;
                iVar.getClass();
                com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s(iVar.f77268a, new ex.d(i17, 16), jp.g.f77256m, new j1(str5, i16), new z3.m(iVar, 13), null, null, null, 8160);
                sVar.o(3, new xv.g(iVar.getPinalytics(), iVar.f77270c, iVar.f77271d, str5));
                return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, new kp.n(0), "", null);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m167invoke() {
        z3.q qVar;
        s3.k0 k0Var;
        int i13 = this.f78053i;
        Object obj = this.f78055k;
        Object obj2 = this.f78054j;
        switch (i13) {
            case 0:
                ((kotlin.jvm.internal.j0) obj2).f80434a = com.bumptech.glide.c.w((w0) obj, q3.a1.f102167a);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 11:
            case 13:
            case 22:
            case 23:
            case 24:
            default:
                Context context = kb0.a.f79058b;
                i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                v7 board = (v7) obj2;
                Intrinsics.checkNotNullExpressionValue(board, "$board");
                E2.c(new up.c(board, (g70.h) ((gi.m) obj).f65094c));
                m60.w wVar = m60.u.f85943a;
                wVar.d(new pg0.a(board.getUid(), false));
                wVar.d(new md0());
                gw gwVar = fw.f37821a;
                String uid = board.getUid();
                gwVar.getClass();
                gw.a(uid);
                break;
            case 4:
                h4.f0 f0Var = (h4.f0) obj2;
                long j13 = f0Var.f67560b;
                i2.q1 q1Var = (i2.q1) obj;
                int i14 = w1.m.f127382a;
                if (!b4.p0.a(j13, ((h4.f0) q1Var.getValue()).f67560b) || !Intrinsics.d(f0Var.f67561c, ((h4.f0) q1Var.getValue()).f67561c)) {
                    q1Var.setValue(f0Var);
                    break;
                }
                break;
            case 8:
                i2.k1 k1Var = (i2.k1) obj;
                k1Var.getClass();
                k1Var.getClass();
                k1Var.getClass();
                i2.s.b((i2.s) obj2, null, null);
                break;
            case 9:
                ((y2.c) obj2).f136663q.invoke((y2.d) obj);
                break;
            case 10:
                ((kotlin.jvm.internal.j0) obj2).f80434a = ((z2.z) obj).M0();
                break;
            case 12:
                Function1 e13 = ((s3.e2) obj2).f110771a.e();
                if (e13 != null) {
                    s3.z0 z0Var = (s3.z0) obj;
                    z0Var.getClass();
                    e13.invoke(new s3.y0(z0Var));
                    break;
                }
                break;
            case 14:
                t3.c0 c0Var = (t3.c0) obj2;
                p4.j jVar = (p4.j) obj;
                c0Var.k().removeViewInLayout(jVar);
                dl2.b.u(c0Var.k().f116251b).remove(c0Var.k().f116250a.remove(jVar));
                jVar.setImportantForAccessibility(0);
                break;
            case 15:
                o3 o3Var = (o3) obj2;
                z3.h hVar = o3Var.f116114e;
                z3.h hVar2 = o3Var.f116115f;
                Float f13 = o3Var.f116112c;
                Float f14 = o3Var.f116113d;
                float floatValue = (hVar == null || f13 == null) ? 0.0f : ((Number) hVar.f140671a.invoke()).floatValue() - f13.floatValue();
                float floatValue2 = (hVar2 == null || f14 == null) ? 0.0f : ((Number) hVar2.f140671a.invoke()).floatValue() - f14.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    t3.v0 v0Var = (t3.v0) obj;
                    g1.t tVar = t3.v0.N;
                    int J2 = v0Var.J(o3Var.f116110a);
                    q3 q3Var = (q3) v0Var.w().h(v0Var.f116221n);
                    if (q3Var != null) {
                        try {
                            r5.e eVar = v0Var.f116222o;
                            if (eVar != null) {
                                eVar.p(v0Var.m(q3Var));
                                Unit unit = Unit.f80348a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.f80348a;
                        }
                    }
                    v0Var.f116211d.invalidate();
                    q3 q3Var2 = (q3) v0Var.w().h(J2);
                    if (q3Var2 != null && (qVar = q3Var2.f116173a) != null && (k0Var = qVar.f140713c) != null) {
                        if (hVar != null) {
                            v0Var.f116224q.l(J2, hVar);
                        }
                        if (hVar2 != null) {
                            v0Var.f116225r.l(J2, hVar2);
                        }
                        v0Var.F(k0Var);
                    }
                }
                if (hVar != null) {
                    o3Var.f116112c = (Float) hVar.f140671a.invoke();
                }
                if (hVar2 != null) {
                    o3Var.f116113d = (Float) hVar2.f140671a.invoke();
                    break;
                }
                break;
            case 16:
                ((AbstractComposeView) obj2).removeOnAttachStateChangeListener((a4) obj);
                break;
            case 17:
                ((androidx.lifecycle.s) obj2).b((androidx.lifecycle.x) obj);
                break;
            case 18:
                ((ba.n) obj2).i((z9.k) obj, false);
                break;
            case 19:
                ((eb.o) obj2).f58209b.b((p5.a) obj);
                break;
            case 20:
                kb.b0.e().a(pb.m.f99427a, "NetworkRequestConstraintController unregister callback");
                ((pb.g) obj2).f99414a.unregisterNetworkCallback((pb.e) obj);
                break;
            case 21:
                lb.j0 j0Var = (lb.j0) obj2;
                WorkDatabase workDatabase = j0Var.f82607d;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.q(new androidx.media3.ui.z(6, j0Var, (UUID) obj));
                lb.s.b(j0Var.f82606c, j0Var.f82607d, j0Var.f82609f);
                break;
            case 25:
                TypeAheadItem typeAheadItem = (TypeAheadItem) obj2;
                typeAheadItem.f35153n = er.d.SENT;
                xo.d0 d0Var = (xo.d0) obj;
                String join = String.join(" ", d0Var.getResources().getString(d70.g.board_invites_sent_to), typeAheadItem.n());
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(join);
                d0Var.V1();
                break;
        }
    }
}
