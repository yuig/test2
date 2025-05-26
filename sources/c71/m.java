package c71;

import android.os.Bundle;
import android.os.Handler;
import com.apollographql.apollo3.exception.ApolloException;
import com.pinterest.api.model.ay;
import com.pinterest.api.model.cy;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.dz;
import com.pinterest.api.model.fy;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.gy;
import com.pinterest.api.model.gz;
import com.pinterest.api.model.h00;
import com.pinterest.api.model.ih0;
import com.pinterest.api.model.jy;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.px0;
import com.pinterest.api.model.qm;
import com.pinterest.api.model.qs0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.ts0;
import com.pinterest.api.model.ul;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xl;
import com.pinterest.api.model.xx;
import com.pinterest.feature.search.results.view.n0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.u3;
import de1.c0;
import de1.d0;
import e50.a1;
import e50.b1;
import e50.c1;
import e50.d1;
import e50.e1;
import e50.f1;
import e50.g0;
import e50.g1;
import e50.i0;
import e50.j0;
import e50.k0;
import e50.l0;
import e50.m0;
import e50.r0;
import e50.t0;
import e50.u0;
import e50.v0;
import e50.x0;
import e50.y0;
import e50.z0;
import ey.h1;
import ey.q1;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.g3;
import m60.h0;
import pc.p0;
import pc.q0;
import so.d2;
import zd1.e0;

/* loaded from: classes5.dex */
public final class m extends wk1.n implements t, h61.j, d0, de1.d, c0, ov1.d, n0, gm1.a, ca2.b, h61.i {
    public final sq0.f A;
    public ArrayList B;
    public final HashSet C;
    public boolean D;
    public final m60.w E;
    public final xk2.v F;
    public final a71.c G;
    public final e61.a H;
    public final xk2.v I;

    /* renamed from: a, reason: collision with root package name */
    public final z61.b f26787a;

    /* renamed from: b, reason: collision with root package name */
    public final pr0.g f26788b;

    /* renamed from: c, reason: collision with root package name */
    public final l11.f f26789c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26790d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.f f26791e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f26792f;

    /* renamed from: g, reason: collision with root package name */
    public final g3 f26793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26794h;

    /* renamed from: i, reason: collision with root package name */
    public final oc.c f26795i;

    /* renamed from: j, reason: collision with root package name */
    public final yk1.v f26796j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.e f26797k;

    /* renamed from: l, reason: collision with root package name */
    public final d2 f26798l;

    /* renamed from: m, reason: collision with root package name */
    public final b60.b f26799m;

    /* renamed from: n, reason: collision with root package name */
    public List f26800n;

    /* renamed from: o, reason: collision with root package name */
    public final String f26801o;

    /* renamed from: p, reason: collision with root package name */
    public final h61.h f26802p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f26803q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f26804r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f26805s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26806t;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f26807u;

    /* renamed from: v, reason: collision with root package name */
    public b0 f26808v;

    /* renamed from: w, reason: collision with root package name */
    public String f26809w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26810x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26811y;

    /* renamed from: z, reason: collision with root package name */
    public String f26812z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wk1.c parameters, b0 searchParameters, z61.b searchPWTManager, pr0.g feedPWTLoggingEventListener, l11.f searchPWTLogger, int i13, uk2.f productFilterAppliedCountSubject, e0 e0Var, g3 experiments, boolean z13, hf0.b device, oc.c apolloClient, uj2.q networkStateStream, yk1.v viewResources, m60.e applicationInfoProvider, d2 graphQLLegoUserRepPresenterFactory, b60.b activeUserManager) {
        super(parameters);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(feedPWTLoggingEventListener, "feedPWTLoggingEventListener");
        Intrinsics.checkNotNullParameter(searchPWTLogger, "searchPWTLogger");
        Intrinsics.checkNotNullParameter(productFilterAppliedCountSubject, "productFilterAppliedCountSubject");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(graphQLLegoUserRepPresenterFactory, "graphQLLegoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f26787a = searchPWTManager;
        this.f26788b = feedPWTLoggingEventListener;
        this.f26789c = searchPWTLogger;
        this.f26790d = i13;
        this.f26791e = productFilterAppliedCountSubject;
        this.f26792f = e0Var;
        this.f26793g = experiments;
        this.f26794h = z13;
        this.f26795i = apolloClient;
        this.f26796j = viewResources;
        this.f26797k = applicationInfoProvider;
        this.f26798l = graphQLLegoUserRepPresenterFactory;
        this.f26799m = activeUserManager;
        this.f26801o = searchParameters.f26730b;
        this.f26802p = searchParameters.f26728a;
        int i14 = 1;
        String str = searchParameters.P;
        this.f26803q = !(str == null || kotlin.text.z.j(str));
        xk2.m.b(new h(this, i14));
        this.f26804r = experiments.l();
        h0 h0Var = new h0(hf0.b.q());
        this.f26807u = h0Var;
        this.f26808v = searchParameters;
        this.A = new sq0.f(hs1.t.a(), device, h0Var, (List) null, 24);
        this.C = new HashSet();
        this.E = parameters.f130134e;
        this.F = xk2.m.b(g.f26763j);
        this.G = new a71.c(getPinalytics());
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.H = new e61.a(d0Var);
        this.I = xk2.m.b(new b01.c(23, this, networkStateStream));
    }

    public static final g1 u3(m mVar, com.pinterest.framework.multisection.datasource.pagedlist.p pVar) {
        if (d.f26758a[mVar.f26808v.f26728a.ordinal()] != 1) {
            throw new a(mVar, mVar.f26808v.f26728a, new e(mVar, 8));
        }
        b0 b0Var = mVar.f26808v;
        String str = b0Var.f26730b;
        q0 q0Var = new q0(Integer.valueOf(pVar.f49152a));
        String str2 = pVar.f49153b;
        return new g1(str, b0Var.f26739k, q0Var, str2 == null ? p0.f99597a : new q0(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.pinterest.framework.multisection.datasource.pagedlist.l v3(c71.m r17, pc.h r18) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.m.v3(c71.m, pc.h):com.pinterest.framework.multisection.datasource.pagedlist.l");
    }

    public static final k w3(m mVar) {
        if (d.f26758a[mVar.f26808v.f26728a.ordinal()] == 1) {
            return new k();
        }
        throw new a(mVar, mVar.f26808v.f26728a, new i(mVar, 3));
    }

    public final boolean B3(pc.h hVar) {
        e50.l lVar;
        e50.m mVar;
        c1 c1Var;
        m0 m0Var;
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 4));
        }
        pc.n0 n0Var = hVar.f99563c;
        f1 f1Var = n0Var instanceof f1 ? (f1) n0Var : null;
        if (f1Var != null && (lVar = f1Var.f57345a) != null) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            e1 e1Var = lVar instanceof e1 ? (e1) lVar : null;
            if (e1Var != null && (mVar = e1Var.f57320e) != null) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                d1 d1Var = mVar instanceof d1 ? (d1) mVar : null;
                if (d1Var != null && (c1Var = d1Var.f57313e) != null && (m0Var = c1Var.f57292f) != null) {
                    return m0Var.f57391a;
                }
            }
        }
        return false;
    }

    @Override // h61.i
    public final void C1(String str) {
        ((h61.k) getView()).x6(str);
        nx.d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        nx.d0.B(d0Var, h32.f1.JOURNEY_BACK_BUTTON_CLICK, null, null, null, 30);
    }

    public final ArrayList D3(pc.h hVar) {
        e50.l lVar;
        e50.m mVar;
        c1 c1Var;
        List<l0> list;
        g00 g00Var;
        xl xlVar;
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 5));
        }
        pc.n0 n0Var = hVar.f99563c;
        f1 f1Var = n0Var instanceof f1 ? (f1) n0Var : null;
        if (f1Var == null || (lVar = f1Var.f57345a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        e1 e1Var = lVar instanceof e1 ? (e1) lVar : null;
        if (e1Var == null || (mVar = e1Var.f57320e) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        d1 d1Var = mVar instanceof d1 ? (d1) mVar : null;
        if (d1Var == null || (c1Var = d1Var.f57313e) == null || (list = c1Var.f57290d) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (l0 l0Var : list) {
            if (l0Var != null) {
                int i13 = 0;
                d00 d00Var = new d00(0);
                j0 j0Var = l0Var.f57386b;
                if (j0Var != null) {
                    h00 h00Var = new h00(i13);
                    h00Var.b(j0Var.f57370a);
                    h00Var.f38216g = j0Var.f57373d;
                    boolean[] zArr = h00Var.f38224o;
                    if (zArr.length > 6) {
                        zArr[6] = true;
                    }
                    List<i0> list2 = j0Var.f57371b;
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (i0 i0Var : list2) {
                            if (i0Var != null) {
                                ul ulVar = new ul(i13);
                                g0 g0Var = i0Var.f57367d;
                                if (g0Var != null) {
                                    h00 h00Var2 = new h00(i13);
                                    h00Var2.b(g0Var.f57347a);
                                    ulVar.f42574c = h00Var2.a();
                                    boolean[] zArr2 = ulVar.f42579h;
                                    if (zArr2.length > 2) {
                                        zArr2[2] = true;
                                    }
                                }
                                e50.h0 h0Var = i0Var.f57365b;
                                if (h0Var != null) {
                                    l00 l00Var = new l00(0);
                                    l00Var.b(h0Var.f57355a);
                                    l00Var.c(h0Var.f57356b);
                                    l00Var.d(h0Var.f57357c);
                                    l00Var.e(h0Var.f57358d);
                                    l00Var.h(h0Var.f57361g);
                                    ulVar.f42576e = l00Var.a();
                                    boolean[] zArr3 = ulVar.f42579h;
                                    if (zArr3.length > 4) {
                                        zArr3[4] = true;
                                    }
                                }
                                ulVar.f42577f = i0Var.f57364a;
                                boolean[] zArr4 = ulVar.f42579h;
                                if (zArr4.length > 5) {
                                    zArr4[5] = true;
                                }
                                xlVar = ulVar.a();
                            } else {
                                xlVar = null;
                            }
                            if (xlVar != null) {
                                arrayList2.add(xlVar);
                            }
                        }
                        h00Var.f38217h = arrayList2;
                        boolean[] zArr5 = h00Var.f38224o;
                        if (zArr5.length > 7) {
                            zArr5[7] = true;
                        }
                    }
                    h00Var.f38220k = j0Var.f57374e;
                    boolean[] zArr6 = h00Var.f38224o;
                    if (zArr6.length > 10) {
                        zArr6[10] = true;
                    }
                    h00Var.f38221l = j0Var.f57375f;
                    if (zArr6.length > 11) {
                        zArr6[11] = true;
                    }
                    h00Var.f38222m = j0Var.f57376g;
                    if (zArr6.length > 12) {
                        zArr6[12] = true;
                    }
                    d00Var.b(h00Var.a());
                }
                d00Var.f36599d = l0Var.f57387c;
                boolean[] zArr7 = d00Var.f36605j;
                if (zArr7.length > 3) {
                    zArr7[3] = true;
                }
                k0 k0Var = l0Var.f57388d;
                if (k0Var != null) {
                    l00 l00Var2 = new l00(0);
                    l00Var2.b(k0Var.f57378a);
                    l00Var2.c(k0Var.f57379b);
                    l00Var2.d(k0Var.f57380c);
                    l00Var2.e(k0Var.f57381d);
                    l00Var2.h(k0Var.f57384g);
                    d00Var.c(l00Var2.a());
                }
                String str = l0Var.f57389e;
                if (str == null) {
                    str = "";
                }
                d00Var.f36596a = str;
                boolean[] zArr8 = d00Var.f36605j;
                if (zArr8.length > 0) {
                    zArr8[0] = true;
                }
                d00Var.f36602g = l0Var.f57390f;
                if (zArr8.length > 6) {
                    zArr8[6] = true;
                }
                g00Var = d00Var.a();
            } else {
                g00Var = null;
            }
            if (g00Var != null) {
                arrayList.add(g00Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List F3(pc.h r7) {
        /*
            r6 = this;
            c71.b0 r0 = r6.f26808v
            h61.h r0 = r0.f26728a
            int[] r1 = c71.d.f26758a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 != r1) goto L8d
            pc.n0 r7 = r7.f99563c
            boolean r0 = r7 instanceof e50.f1
            r1 = 0
            if (r0 == 0) goto L19
            e50.f1 r7 = (e50.f1) r7
            goto L1a
        L19:
            r7 = r1
        L1a:
            if (r7 == 0) goto L8a
            e50.l r7 = r7.f57345a
            if (r7 == 0) goto L8a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r2 = r7 instanceof e50.e1
            if (r2 == 0) goto L2c
            e50.e1 r7 = (e50.e1) r7
            goto L2d
        L2c:
            r7 = r1
        L2d:
            if (r7 == 0) goto L8a
            e50.m r7 = r7.f57320e
            if (r7 == 0) goto L8a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r2 = r7 instanceof e50.d1
            if (r2 == 0) goto L3d
            e50.d1 r7 = (e50.d1) r7
            goto L3e
        L3d:
            r7 = r1
        L3e:
            if (r7 == 0) goto L8a
            e50.c1 r7 = r7.f57313e
            if (r7 == 0) goto L8a
            java.util.List r7 = r7.f57288b
            if (r7 == 0) goto L8a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r7.next()
            e50.a0 r3 = (e50.a0) r3
            if (r3 == 0) goto L72
            e50.q r4 = r3.f57257a
            if (r4 == 0) goto L72
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r5 = r4 instanceof z40.y
            if (r5 == 0) goto L6f
            z40.y r4 = (z40.y) r4
            goto L70
        L6f:
            r4 = r1
        L70:
            if (r4 != 0) goto L84
        L72:
            if (r3 == 0) goto L83
            e50.q r3 = r3.f57257a
            if (r3 == 0) goto L83
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r4 = r3 instanceof e50.v
            if (r4 == 0) goto L83
            e50.v r3 = (e50.v) r3
            r4 = r3
            goto L84
        L83:
            r4 = r1
        L84:
            if (r4 == 0) goto L53
            r2.add(r4)
            goto L53
        L8a:
            kotlin.collections.q0 r2 = kotlin.collections.q0.f80391a
        L8c:
            return r2
        L8d:
            c71.a r7 = new c71.a
            c71.b0 r0 = r6.f26808v
            h61.h r0 = r0.f26728a
            c71.e r1 = new c71.e
            r2 = 6
            r1.<init>(r6, r2)
            r7.<init>(r6, r0, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.m.F3(pc.h):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final lh0 G3(pc.h hVar) {
        e50.l lVar;
        e50.m mVar;
        c1 c1Var;
        b1 b1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        int i13;
        boolean z13;
        Iterator it2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z14;
        List list;
        List list2;
        Iterator it3;
        Object obj;
        List list3;
        int i14 = 7;
        boolean z15 = 1;
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 7));
        }
        pc.n0 n0Var = hVar.f99563c;
        f1 f1Var = n0Var instanceof f1 ? (f1) n0Var : null;
        if (f1Var == null || (lVar = f1Var.f57345a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        e1 e1Var = lVar instanceof e1 ? (e1) lVar : null;
        if (e1Var == null || (mVar = e1Var.f57320e) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        d1 d1Var = mVar instanceof d1 ? (d1) mVar : null;
        if (d1Var == null || (c1Var = d1Var.f57313e) == null || (b1Var = c1Var.f57294h) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i15 = 0;
        ih0 ih0Var = new ih0(0);
        Object obj2 = b1Var.f57267b;
        ih0Var.f38785a = obj2 instanceof Integer ? (Integer) obj2 : null;
        boolean[] zArr = ih0Var.f38792h;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
        Object obj3 = b1Var.f57268c;
        ih0Var.f38790f = obj3 instanceof Integer ? (Integer) obj3 : null;
        int i16 = 5;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
        List list4 = b1Var.f57269d;
        if (list4 != null) {
            ArrayList Q = CollectionsKt.Q(list4);
            int i17 = 10;
            ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(Q, 10));
            Iterator it4 = Q.iterator();
            while (it4.hasNext()) {
                a1 a1Var = (a1) it4.next();
                xx xxVar = new xx(i15);
                Object obj4 = a1Var.f57258a;
                xxVar.f43823f = obj4 instanceof Integer ? (Integer) obj4 : null;
                boolean[] zArr2 = xxVar.f43826i;
                if (zArr2.length > i16) {
                    zArr2[i16] = z15;
                }
                xxVar.f43825h = a1Var.f57259b;
                if (zArr2.length > i14) {
                    zArr2[i14] = z15;
                }
                qm qmVar = new qm(i15);
                y0 y0Var = a1Var.f57260c;
                qmVar.b(y0Var != null ? y0Var.f57459a : null);
                if (y0Var == null || (list3 = y0Var.f57460b) == null) {
                    arrayList2 = null;
                } else {
                    List<x0> list5 = list3;
                    arrayList2 = new ArrayList(kotlin.collections.g0.q(list5, i17));
                    for (x0 x0Var : list5) {
                        qs0 h10 = ts0.h();
                        h10.b(x0Var != null ? x0Var.f57450a : null);
                        h10.c(x0Var != null ? x0Var.f57451b : null);
                        h10.d(x0Var != null ? x0Var.f57453d : null);
                        Object obj5 = x0Var != null ? x0Var.f57455f : null;
                        h10.f(obj5 instanceof Integer ? (Integer) obj5 : null);
                        h10.e(x0Var != null ? x0Var.f57454e : null);
                        arrayList2.add(h10.a());
                    }
                }
                qmVar.f41335b = arrayList2;
                boolean[] zArr3 = qmVar.f41336c;
                if (zArr3.length > z15) {
                    zArr3[z15 ? 1 : 0] = z15;
                }
                xxVar.f43820c = qmVar.a();
                boolean[] zArr4 = xxVar.f43826i;
                if (zArr4.length > 2) {
                    zArr4[2] = z15;
                }
                List list6 = a1Var.f57262e;
                if (list6 != null) {
                    ArrayList Q2 = CollectionsKt.Q(list6);
                    arrayList3 = new ArrayList(kotlin.collections.g0.q(Q2, i17));
                    Iterator it5 = Q2.iterator();
                    while (it5.hasNext()) {
                        v0 v0Var = (v0) it5.next();
                        cy cyVar = new cy(i15);
                        qm qmVar2 = new qm(i15);
                        u0 u0Var = v0Var.f57437c;
                        qmVar2.b(u0Var != null ? u0Var.f57429a : null);
                        u0 u0Var2 = v0Var.f57437c;
                        if (u0Var2 == null || (list2 = u0Var2.f57430b) == null) {
                            it2 = it4;
                            arrayList4 = null;
                        } else {
                            List<t0> list7 = list2;
                            arrayList4 = new ArrayList(kotlin.collections.g0.q(list7, i17));
                            for (t0 t0Var : list7) {
                                qs0 h13 = ts0.h();
                                h13.b(t0Var != null ? t0Var.f57422a : null);
                                h13.c(t0Var != null ? t0Var.f57423b : null);
                                h13.d(t0Var != null ? t0Var.f57425d : null);
                                if (t0Var != null) {
                                    obj = t0Var.f57427f;
                                    it3 = it4;
                                } else {
                                    it3 = it4;
                                    obj = null;
                                }
                                h13.f(obj instanceof Integer ? (Integer) obj : null);
                                h13.e(t0Var != null ? t0Var.f57426e : null);
                                arrayList4.add(h13.a());
                                it4 = it3;
                            }
                            it2 = it4;
                        }
                        qmVar2.f41335b = arrayList4;
                        boolean[] zArr5 = qmVar2.f41336c;
                        if (zArr5.length > 1) {
                            zArr5[1] = true;
                        }
                        cyVar.f36565c = qmVar2.a();
                        boolean[] zArr6 = cyVar.f36566d;
                        if (zArr6.length > 2) {
                            zArr6[2] = true;
                        }
                        qm qmVar3 = new qm(0);
                        r0 r0Var = v0Var.f57436b;
                        qmVar3.b(r0Var != null ? r0Var.f57411a : null);
                        if (r0Var == null || (list = r0Var.f57412b) == null) {
                            arrayList5 = null;
                        } else {
                            List<e50.q0> list8 = list;
                            arrayList5 = new ArrayList(kotlin.collections.g0.q(list8, 10));
                            for (e50.q0 q0Var : list8) {
                                qs0 h14 = ts0.h();
                                h14.b(q0Var != null ? q0Var.f57405a : null);
                                h14.c(q0Var != null ? q0Var.f57406b : null);
                                h14.d(q0Var != null ? q0Var.f57407c : null);
                                Object obj6 = q0Var != null ? q0Var.f57409e : null;
                                h14.f(obj6 instanceof Integer ? (Integer) obj6 : null);
                                h14.e(q0Var != null ? q0Var.f57408d : null);
                                arrayList5.add(h14.a());
                            }
                        }
                        qmVar3.f41335b = arrayList5;
                        boolean[] zArr7 = qmVar3.f41336c;
                        if (zArr7.length > 1) {
                            zArr7[1] = true;
                        }
                        cyVar.f36564b = qmVar3.a();
                        boolean[] zArr8 = cyVar.f36566d;
                        if (zArr8.length > 1) {
                            zArr8[1] = true;
                        }
                        gy gyVar = new gy(0);
                        e50.p0 p0Var = v0Var.f57435a;
                        String str = p0Var != null ? p0Var.f57403a : null;
                        gyVar.f38176c = str;
                        boolean[] zArr9 = gyVar.f38178e;
                        if (zArr9.length > 2) {
                            z14 = true;
                            zArr9[2] = true;
                        } else {
                            z14 = true;
                        }
                        String str2 = p0Var != null ? p0Var.f57404b : null;
                        gyVar.f38177d = str2;
                        if (zArr9.length > 3) {
                            zArr9[3] = z14;
                        }
                        jy jyVar = new jy(gyVar.f38174a, gyVar.f38175b, str, str2, zArr9, 0);
                        cyVar.f36563a = jyVar;
                        boolean[] zArr10 = cyVar.f36566d;
                        if (zArr10.length > 0) {
                            zArr10[0] = true;
                        }
                        arrayList3.add(new fy(jyVar, cyVar.f36564b, cyVar.f36565c, zArr10, 0));
                        it4 = it2;
                        i15 = 0;
                        i17 = 10;
                    }
                    it = it4;
                } else {
                    it = it4;
                    arrayList3 = null;
                }
                xxVar.f43818a = arrayList3;
                boolean[] zArr11 = xxVar.f43826i;
                if (zArr11.length > 0) {
                    i13 = 0;
                    zArr11[0] = true;
                } else {
                    i13 = 0;
                }
                dz dzVar = new dz(i13);
                z0 z0Var = a1Var.f57261d;
                String str3 = z0Var != null ? z0Var.f57476a : null;
                dzVar.f36997a = str3;
                boolean[] zArr12 = dzVar.f36999c;
                if (zArr12.length > 0) {
                    z13 = 1;
                    zArr12[i13] = true;
                } else {
                    z13 = 1;
                }
                String str4 = z0Var != null ? z0Var.f57477b : null;
                dzVar.f36998b = str4;
                if (zArr12.length > z13) {
                    zArr12[z13 ? 1 : 0] = z13;
                }
                gz gzVar = new gz(str3, str4, zArr12, 0);
                xxVar.f43821d = gzVar;
                boolean[] zArr13 = xxVar.f43826i;
                if (zArr13.length > 3) {
                    zArr13[3] = z13;
                }
                arrayList6.add(new ay(xxVar.f43818a, xxVar.f43819b, xxVar.f43820c, gzVar, xxVar.f43822e, xxVar.f43823f, xxVar.f43824g, xxVar.f43825h, zArr13, 0));
                i15 = 0;
                it4 = it;
                i14 = 7;
                z15 = 1;
                i16 = 5;
                i17 = 10;
            }
            arrayList = CollectionsKt.H0(arrayList6);
        } else {
            arrayList = null;
        }
        ih0Var.f38788d = arrayList;
        boolean[] zArr14 = ih0Var.f38792h;
        if (zArr14.length > 3) {
            zArr14[3] = true;
        }
        Intrinsics.checkNotNullExpressionValue(ih0Var, "apply(...)");
        return new lh0(ih0Var.f38785a, ih0Var.f38786b, ih0Var.f38787c, ih0Var.f38788d, ih0Var.f38789e, ih0Var.f38790f, ih0Var.f38791g, ih0Var.f38792h, 0);
    }

    public final tb0.p H3(kotlin.jvm.internal.p callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        if (d.f26758a[this.f26808v.f26728a.ordinal()] == 1) {
            return tb0.p.SEARCH_RESULTS_PROFILES_TAB;
        }
        throw new a(this, this.f26808v.f26728a, callable);
    }

    public final com.pinterest.framework.multisection.datasource.pagedlist.g I3() {
        return (com.pinterest.framework.multisection.datasource.pagedlist.g) this.I.getValue();
    }

    @Override // c71.t
    public final e0 J2() {
        return this.f26792f;
    }

    public final boolean J3() {
        return pe.i.P0(com.bumptech.glide.d.E(), new h(this, 0), this.f26802p, this.f26803q);
    }

    public final void K3(b0 b0Var) {
        if (d.f26758a[b0Var.f26728a.ordinal()] != 1) {
            throw new a(this, b0Var.f26728a, new e(this, 9));
        }
        h32.f1 f1Var = h32.f1.SEARCH_USERS;
        HashMap hashMap = new HashMap(2);
        hashMap.put("query", b0Var.f26730b);
        hashMap.put("commerce_only", String.valueOf(b0Var.n()));
        String str = b0Var.f26739k;
        hashMap.put("rs", str);
        if (Intrinsics.d(str, "shop_tab_bubble")) {
            bs1.c.G1("entered_query", b0Var.f26731c, hashMap);
            bs1.c.G1("story_id", b0Var.f26737i, hashMap);
        }
        getPinalytics().g(f1Var, "0", hashMap, false);
    }

    @Override // c71.t
    public final void L1() {
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: L3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r3(h61.k view) {
        d0 unifiedInlineFilterUpdateListener;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        boolean z13 = false;
        if (this.D) {
            this.D = false;
            ArrayList arrayList = this.B;
            if (arrayList != null) {
                h61.k.J(view, arrayList, this.f26801o, this.f26808v.f26749u, 4);
            }
        }
        if (J3() && (e0Var = this.f26792f) != null && !e0Var.f()) {
            ((Handler) this.F.getValue()).post(new v.k(this, e0Var.b(), 13));
        }
        boolean z14 = this.f26803q;
        int i13 = 1;
        int i14 = 2;
        if (z14) {
            view.S4(true);
            view.E3(false);
            view.p4();
        } else if (J3()) {
            h61.h hVar = this.f26808v.f26728a;
            int i15 = hVar == null ? -1 : d.f26758a[hVar.ordinal()];
            if ((i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5) && !z14 && this.f26808v.N == null) {
                de1.f j03 = j0();
                if (j03 != null) {
                    j03.g2();
                }
                de1.f j04 = j0();
                if (j04 != null) {
                    j04.B4(true);
                }
            }
        }
        Q3();
        List<wk1.e> dataSources = getDataSources();
        if (!(dataSources instanceof Collection) || !dataSources.isEmpty()) {
            Iterator<T> it = dataSources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.d((wk1.e) it.next(), I3())) {
                    z13 = true;
                    break;
                }
            }
        }
        view.g1(!z13);
        view.M(this);
        view.A3(this);
        view.k3(this);
        view.N0(this);
        view.G4(this.f26801o);
        view.B6(this);
        view.p6(new h(this, i14));
        h61.k kVar = (h61.k) getViewIfBound();
        if (kVar != null) {
            if (this.f26804r) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                unifiedInlineFilterUpdateListener = new s(this, kVar);
            } else {
                Intrinsics.checkNotNullParameter(this, "<this>");
                q gridFilterUpdater = new q(this, i13);
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(gridFilterUpdater, "gridFilterUpdater");
                unifiedInlineFilterUpdateListener = new r(kVar, gridFilterUpdater, this);
            }
            de1.f j05 = j0();
            if (j05 != null) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                Intrinsics.checkNotNullParameter(unifiedInlineFilterUpdateListener, "unifiedInlineFilterUpdateListener");
                j05.H2(new p(view, this, unifiedInlineFilterUpdateListener));
            }
        } else {
            unifiedInlineFilterUpdateListener = null;
        }
        this.f26805s = unifiedInlineFilterUpdateListener;
    }

    public final void M3() {
        if (isBound()) {
            h61.k kVar = (h61.k) getView();
            if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
                throw new a(this, this.f26808v.f26728a, new i(this, 2));
            }
            kVar.Q1(((yk1.a) this.f26796j).f139224a.getString(l42.e.empty_search_people_message, this.f26808v.f26730b));
        }
    }

    public final void N3(boolean z13, boolean z14) {
        b0 b0Var = this.f26808v;
        String str = b0Var.f26730b;
        if (d.f26758a[b0Var.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new j(this, 2));
        }
        com.pinterest.framework.multisection.datasource.pagedlist.g I3 = I3();
        if (Intrinsics.d(this.f26809w, str) && !z14) {
            b0 b0Var2 = this.f26808v;
            if ((!Intrinsics.d(b0Var2.f26739k, "typo_auto_original") || kotlin.text.z.i(b0Var2.f26733e, b0Var2.f26730b, true)) && !I3.f49103a.d().isEmpty()) {
                return;
            }
        }
        ((h61.k) getView()).i6();
        loadData();
        rebindPinalytics((yk1.r) getView());
        K3(this.f26808v);
        if (!z13) {
            getPinalytics().z(null);
        }
        this.f26809w = str;
    }

    @Override // c71.t
    public final HashSet O1() {
        return this.C;
    }

    public final void Q3() {
        h61.h hVar = this.f26808v.f26728a;
        int[] iArr = d.f26758a;
        if (iArr[hVar.ordinal()] == 6) {
            throw new a(this, hVar, new i(this, 5));
        }
        d4 d4Var = d4.SEARCH;
        if (iArr[hVar.ordinal()] != 1) {
            throw new a(this, hVar, new i(this, 4));
        }
        ((h61.k) getView()).b0(d4Var, a4.SEARCH_USERS);
    }

    @Override // h61.j
    public final void S0() {
    }

    @Override // h61.j
    public final void T0() {
        K3(this.f26808v);
    }

    @Override // h61.j
    public final void V1(e71.a skinTone) {
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        K3(this.f26808v);
    }

    @Override // c71.t
    public final b0 X2() {
        return this.f26808v;
    }

    @Override // h61.j
    public final boolean Y1(int i13) {
        sq0.o r13 = getDataSourceRegistry().r(i13);
        if (r13 != null) {
            wk1.e eVar = (wk1.e) r13.f115027a;
            nr0.j jVar = eVar instanceof nr0.j ? (nr0.j) eVar : null;
            Boolean valueOf = jVar != null ? Boolean.valueOf(jVar.n0(r13.f115028b)) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    @Override // c71.t
    public final void Y2(boolean z13) {
        this.f26806t = z13;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.H);
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 0));
        }
        iVar.b(I3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wk1.n
    public final List convertToPlankModels(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
                throw new a(this, this.f26808v.f26728a, new e(this, 1));
            }
            wy0 wy0Var = null;
            z40.y yVar = obj instanceof z40.y ? (z40.y) obj : null;
            if (yVar != null) {
                vy0 f23 = wy0.f2();
                f23.p1(yVar.a());
                f23.H(yVar.d());
                f23.L(yVar.c());
                f23.N(yVar.f());
                f23.b0(yVar.b());
                f23.r1(yVar.g());
                f23.C0(yVar.h());
                Pair[] pairArr = new Pair[1];
                List n13 = yVar.n();
                if (n13 != null) {
                    ArrayList Q = CollectionsKt.Q(n13);
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(Q, 10));
                    Iterator it = Q.iterator();
                    while (it.hasNext()) {
                        z40.w wVar = (z40.w) it.next();
                        pr f13 = sr.f();
                        f13.b(wVar.b());
                        f13.c(wVar.i() != null ? Double.valueOf(r9.intValue()) : null);
                        f13.d(wVar.getType());
                        f13.e(wVar.a());
                        f13.f(wVar.j() != null ? Double.valueOf(r7.intValue()) : null);
                        arrayList2.add(f13.a());
                    }
                    wy0Var = arrayList2;
                }
                pairArr[0] = new Pair("345x", wy0Var);
                f23.X0(kotlin.collections.z0.h(pairArr));
                f23.g1(yVar.k());
                wy0Var = f23.a();
                Intrinsics.checkNotNullExpressionValue(wy0Var, "build(...)");
            }
            if (wy0Var != null) {
                arrayList.add(wy0Var);
            }
        }
        return arrayList;
    }

    @Override // h61.j
    public final void d1(boolean z13) {
        h61.k kVar = (h61.k) getViewIfBound();
        if (kVar != null) {
            kVar.E3(z13);
        }
        de1.f j03 = j0();
        if (j03 != null) {
            j03.B4(z13);
        }
    }

    @Override // ov1.d
    public final void f2() {
        b0 value = b0.a(this.f26808v, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2096895);
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z13 = value.f26728a != this.f26808v.f26728a;
        this.f26808v = value;
        if (z13) {
            Q3();
        }
    }

    @Override // h61.j
    public final void g() {
        K3(this.f26808v);
    }

    @Override // c71.t
    public final boolean h1() {
        return this.f26806t;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f26794h) {
            return;
        }
        if (event instanceof cn1.s) {
            p0();
        } else if (event instanceof cn1.u) {
            l();
        }
    }

    @Override // c71.t
    public final de1.f j0() {
        yk1.n viewIfBound = getViewIfBound();
        if (viewIfBound instanceof de1.f) {
            return (de1.f) viewIfBound;
        }
        return null;
    }

    @Override // com.pinterest.feature.search.results.view.n0
    public final void l() {
        getPinalytics().F(h32.g0.SEARCH_BOX, h32.u0.FLASHLIGHT_CAMERA_BUTTON);
        this.E.d(Navigation.w1((ScreenLocation) u3.f51430a.getValue()));
    }

    @Override // wk1.q
    public final void loadData() {
        ((h61.k) getView()).b4();
        h61.h hVar = this.f26808v.f26728a;
        int[] iArr = d.f26758a;
        if (iArr[hVar.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new i(this, 0));
        }
        boolean isEmpty = I3().f49103a.d().isEmpty();
        int i13 = iArr[this.f26808v.f26728a.ordinal()];
        boolean z13 = i13 == 1 || i13 == 2 || i13 == 3;
        if (isEmpty && z13) {
            h61.h searchType = this.f26808v.f26728a;
            this.f26787a.getClass();
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            q1 pwtSearchType = searchType.toPWTSearchType();
            Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
            new h1(pwtSearchType).i();
        }
        super.loadData();
        ((h61.k) getView()).e2();
    }

    @Override // h61.j
    public final void n() {
        K3(this.f26808v);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        de1.f j03;
        p3();
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new i(this, 1));
        }
        if (I3().a() == 0) {
            this.f26788b.f101178m = true;
            N3(true, false);
        }
        if (!isBound() || (j03 = j0()) == null) {
            return;
        }
        j03.i2(this);
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        super.onDeactivate();
        h61.h hVar = this.f26808v.f26728a;
        this.f26787a.c(this.f26790d, hVar);
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        K3(this.f26808v);
        super.onRecyclerRefresh();
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        this.D = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // wk1.q
    public final void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        e0 e0Var;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new j(this, 1));
        }
        com.pinterest.framework.multisection.datasource.pagedlist.g I3 = I3();
        if (Intrinsics.d(remoteList, I3)) {
            boolean z13 = state instanceof wt1.i;
            z61.b bVar = this.f26787a;
            if (z13) {
                bVar.b(this.f26808v.f26728a);
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                Throwable th3 = ((wt1.i) state).f131121c;
                String message = th3.getMessage();
                if (message == null) {
                    message = "";
                }
                hVar.q(th3, message, H3(new j(this, 0)));
                return;
            }
            if (state instanceof wt1.p) {
                tl1.i iVar = state.f131096b;
                if (iVar != null && iVar.f118095a == 0 && I3.a() == 0) {
                    bVar.a(this.f26808v.f26728a);
                    M3();
                }
                if (isBound()) {
                    boolean z14 = this.f26810x;
                    if (z14) {
                        x();
                    } else {
                        String str = this.f26812z;
                        if (z14 && str != null) {
                            this.f26810x = false;
                        }
                    }
                    ((h61.k) getView()).Q2(this.f26801o);
                    ((h61.k) getView()).A0();
                    if (J3() && (e0Var = this.f26792f) != null && !e0Var.f()) {
                        ((Handler) this.F.getValue()).post(new v.k(this, e0Var.b(), 13));
                    }
                }
                if (this.H.a() == 0 && J3()) {
                    ((h61.k) getView()).S4(true);
                }
            }
        }
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        e0 e0Var = this.f26792f;
        if (e0Var != null) {
            e0Var.f141709d.clear();
        }
        super.onUnbind();
    }

    @Override // com.pinterest.feature.search.results.view.n0
    public final void p0() {
        this.f26787a.c(hashCode(), this.f26808v.f26728a);
        int i13 = d.f26758a[this.f26808v.f26728a.ordinal()];
        NavigationImpl w13 = Navigation.w1(i13 != 3 ? i13 != 6 ? i13 != 7 ? (ScreenLocation) u3.f51433d.getValue() : (ScreenLocation) u3.f51432c.getValue() : (ScreenLocation) u3.f51434e.getValue() : Intrinsics.d(this.f26808v.E, "personal_boutique") ? (ScreenLocation) u3.f51432c.getValue() : (ScreenLocation) u3.f51433d.getValue());
        w13.m0("com.pinterest.EXTRA_SEARCH_PREFILLED_QUERY", this.f26801o);
        w13.m0("com.pinterest.EXTRA_SEARCH_TYPE", this.f26802p.toString());
        String str = this.f26808v.E;
        if (str != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_SOURCE", str);
        }
        this.E.d(w13);
    }

    @Override // c71.t
    public final List q1() {
        return this.f26800n;
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // h61.j
    public final void v(v61.a hairPattern) {
        Intrinsics.checkNotNullParameter(hairPattern, "hairPattern");
        K3(this.f26808v);
    }

    @Override // de1.c0
    public final void w1(String productFilterType, boolean z13, de1.h0 unifiedInlineFilterDataModel) {
        String str;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        Intrinsics.checkNotNullParameter(unifiedInlineFilterDataModel, "unifiedInlineFilterDataModel");
        px0 px0Var = null;
        e0 e0Var = this.f26792f;
        Pair c13 = e0Var != null ? e0Var.c(productFilterType) : null;
        if (z13) {
            if (c13 == null || (arrayList = (ArrayList) c13.f80346a) == null) {
                return;
            }
            boolean z14 = !unifiedInlineFilterDataModel.f54579h;
            de1.a aVar = (z14 || e0Var == null || !e0Var.f()) ? de1.a.APPLY : de1.a.CLEAR;
            ph.a.H0(z14, arrayList);
            d0 d0Var = this.f26805s;
            if (d0Var != null) {
                t32.d dVar = t32.f.Companion;
                int parseInt = Integer.parseInt(productFilterType);
                dVar.getClass();
                d0.b3(d0Var, arrayList, 1, aVar, true, t32.d.a(parseInt), 32);
                return;
            }
            return;
        }
        if (c13 != null) {
            if (e0Var != null && (linkedHashMap = e0Var.f141706a) != null) {
                px0Var = (px0) linkedHashMap.get(productFilterType);
            }
            px0 px0Var2 = px0Var;
            de1.f j03 = j0();
            if (j03 != null) {
                if (px0Var2 == null || (str = px0Var2.p()) == null) {
                    str = "";
                }
                j03.g4(de1.h0.a(unifiedInlineFilterDataModel, px0Var2, str, (ArrayList) c13.f80346a, ((Boolean) c13.f80347b).booleanValue(), productFilterType, 480));
            }
        }
    }

    @Override // de1.d
    public final void x() {
        e0 e0Var;
        if (!isBound() || (e0Var = this.f26792f) == null) {
            return;
        }
        ArrayList a13 = e0Var.a(false);
        if (a13.isEmpty() && !this.f26810x) {
            this.G.e(a71.a.FILTER_MODULE_NO_DATA, this.f26802p, ph.a.c0(t32.f.PRODUCT_CONTENT_TYPE), e0Var.f141707b.size() > 0);
        }
        de1.f j03 = j0();
        if (j03 != null) {
            j03.X4(!this.f26810x, a13);
        }
        this.f26810x = a13.isEmpty();
    }

    public final String x3(pc.h hVar) {
        e50.l lVar;
        e50.m mVar;
        c1 c1Var;
        m0 m0Var;
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 2));
        }
        pc.n0 n0Var = hVar.f99563c;
        f1 f1Var = n0Var instanceof f1 ? (f1) n0Var : null;
        if (f1Var == null || (lVar = f1Var.f57345a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        e1 e1Var = lVar instanceof e1 ? (e1) lVar : null;
        if (e1Var == null || (mVar = e1Var.f57320e) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        d1 d1Var = mVar instanceof d1 ? (d1) mVar : null;
        if (d1Var == null || (c1Var = d1Var.f57313e) == null || (m0Var = c1Var.f57292f) == null) {
            return null;
        }
        return m0Var.f57394d;
    }

    public final ApolloException z3(pc.h hVar) {
        e50.l lVar;
        e50.m mVar;
        f fVar = f.f26760j;
        if (d.f26758a[this.f26808v.f26728a.ordinal()] != 1) {
            throw new a(this, this.f26808v.f26728a, new e(this, 3));
        }
        ArrayList arrayList = new ArrayList();
        pc.n0 n0Var = hVar.f99563c;
        f1 f1Var = n0Var instanceof f1 ? (f1) n0Var : null;
        if (f1Var != null && (lVar = f1Var.f57345a) != null) {
            if (lVar instanceof z40.b) {
                z40.a a13 = ((z40.b) lVar).a();
                arrayList.add((String) fVar.invoke(a13.a(), a13.getMessage()));
            }
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            e1 e1Var = lVar instanceof e1 ? (e1) lVar : null;
            if (e1Var != null && (mVar = e1Var.f57320e) != null && (mVar instanceof z40.b)) {
                z40.a a14 = ((z40.b) mVar).a();
                arrayList.add((String) fVar.invoke(a14.a(), a14.getMessage()));
            }
        }
        if (!arrayList.isEmpty()) {
            return new ApolloException(CollectionsKt.Z(arrayList, ", ", null, null, 0, null, null, 62), 2);
        }
        return null;
    }
}
