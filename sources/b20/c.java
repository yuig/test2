package b20;

import a.cb;
import ac2.e;
import am2.g;
import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.k0;
import com.google.common.util.concurrent.w;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.base.LockableViewPager;
import df.j1;
import i92.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d2;
import lh0.g1;
import lh0.q1;
import lh0.x1;
import lh0.z3;
import m60.r0;
import n60.o;
import pk.a0;
import pn2.b0;
import qm2.q;
import qr1.f;
import qr1.h;
import qr1.l;
import qr1.m;
import rl2.u;
import tu1.b1;
import tu1.x0;
import u5.x;
import vb0.j;
import wa2.g0;
import zl2.r;

/* loaded from: classes.dex */
public final class c implements w, com.pinterest.pushnotification.d, wn2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21278a;

    public c() {
        lm2.b javaResolverSettings = lm2.b.f83955a;
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.f21278a = javaResolverSettings;
    }

    public static /* synthetic */ void B(c cVar, k92.a aVar, z80.c cVar2, z80.c cVar3, int i13) {
        Function0 function0 = cVar2;
        if ((i13 & 2) != 0) {
            function0 = l92.a.f82335j;
        }
        Function0 function02 = function0;
        Function0 function03 = cVar3;
        if ((i13 & 4) != 0) {
            function03 = l92.a.f82336k;
        }
        cVar.A(aVar, function02, function03, l92.a.f82337l, l92.a.f82338m);
    }

    public static boolean p() {
        if (ly1.d.a() < 2000000000) {
            ly1.d.a();
            return false;
        }
        double d2 = j.f125485t;
        return d2 <= 0.0d || d2 >= 1000000.0d;
    }

    public static boolean q(g0 g0Var, boolean z13, boolean z14) {
        if (!z13 && !z14) {
            if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.SHOP_TAB_UPSELL) {
                if ((g0Var != null ? g0Var.f128727i : null) != h32.g0.STELA_PRODUCTS) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A(k92.a toast, Function0 onButtonClicked, Function0 onToastClicked, Function0 onToastCompleted, Function0 onToastCancelled) {
        Intrinsics.checkNotNullParameter(toast, "toast");
        Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
        Intrinsics.checkNotNullParameter(onToastClicked, "onToastClicked");
        Intrinsics.checkNotNullParameter(onToastCompleted, "onToastCompleted");
        Intrinsics.checkNotNullParameter(onToastCancelled, "onToastCancelled");
        ax1.a listener = new ax1.a(16, onButtonClicked);
        toast.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        toast.f78866d = listener;
        ax1.a listener2 = new ax1.a(17, onToastClicked);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        toast.f78867e = listener2;
        ax1.a listener3 = new ax1.a(18, onToastCompleted);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        toast.f78868f = listener3;
        Intrinsics.checkNotNullParameter(new ax1.a(19, onToastCancelled), "listener");
        ((m60.w) this.f21278a).d(new i(toast));
    }

    public final int C() {
        return ((ArrayList) this.f21278a).size();
    }

    public final Object[] D(Object[] objArr) {
        return ((ArrayList) this.f21278a).toArray(objArr);
    }

    @Override // wn2.a
    public final Iterable a(Object obj) {
        r this$0 = (r) this.f21278a;
        u[] uVarArr = r.f142144h;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection c13 = ((g) obj).e().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            am2.j b13 = ((b0) it.next()).w0().b();
            mm2.i iVar = null;
            am2.j o03 = b13 != null ? b13.o0() : null;
            g gVar = o03 instanceof g ? (g) o03 : null;
            if (gVar != null && (iVar = this$0.h(gVar)) == null) {
                iVar = gVar;
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public final void b(Object obj) {
        ((ArrayList) this.f21278a).add(obj);
    }

    public final void c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z13 = obj instanceof Object[];
        Object obj2 = this.f21278a;
        if (z13) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                Collections.addAll((ArrayList) obj2, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            ((ArrayList) obj2).addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                ((ArrayList) obj2).add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            ((ArrayList) obj2).add(it2.next());
        }
    }

    public final b0 d(am2.d dVar, bm2.a aVar, boolean z13, rg.a aVar2, im2.b bVar, q qVar, boolean z14, Function1 function1) {
        x xVar = new x(aVar, z13, aVar2, bVar, false);
        b0 b0Var = (b0) function1.invoke(dVar);
        Collection h10 = dVar.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getOverriddenDescriptors(...)");
        Collection<am2.d> collection = h10;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(collection, 10));
        for (am2.d dVar2 : collection) {
            Intrinsics.f(dVar2);
            arrayList.add((b0) function1.invoke(dVar2));
        }
        return e(xVar, b0Var, arrayList, qVar, z14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0447, code lost:
    
        if (r10 == qm2.f.NULLABLE) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x02d0, code lost:
    
        if (r2.compareTo(r4) <= 0) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pn2.b0 e(u5.x r27, pn2.b0 r28, java.util.List r29, qm2.q r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.c.e(u5.x, pn2.b0, java.util.List, qm2.q, boolean):pn2.b0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o5.a f(pn2.h0 r18, br1.a0 r19, int r20, qm2.p r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.c.f(pn2.h0, br1.a0, int, qm2.p, boolean, boolean):o5.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r13 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ck2.a g(pn2.v1 r12, br1.a0 r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.c.g(pn2.v1, br1.a0, int, boolean):ck2.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d3  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList h(rg.a r28, java.util.Collection r29) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.c.h(rg.a, java.util.Collection):java.util.ArrayList");
    }

    public final String i() {
        List s13 = s();
        if (s13.size() < 2 || !a0.N((CharSequence) s13.get(0), "board")) {
            return null;
        }
        return s13.size() == 2 ? (String) s13.get(1) : j1.V("%s/%s", s13.get(1), s13.get(2));
    }

    public final int j() {
        return ((LockableViewPager) this.f21278a).f19893f;
    }

    public final String k() {
        List s13 = s();
        if (s13.size() == 3 && a0.N((CharSequence) s13.get(1), "explore")) {
            return (String) s13.get(2);
        }
        return null;
    }

    public final String l() {
        List s13 = s();
        if (s13.size() < 2 || !a0.N((CharSequence) s13.get(0), "pin")) {
            return null;
        }
        return (String) s13.get(1);
    }

    public final String m(String pinTitle, String productDomain, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pinTitle, "pinTitle");
        Intrinsics.checkNotNullParameter(productDomain, "productDomain");
        if (z13) {
            return pinTitle;
        }
        if (z14) {
            return productDomain;
        }
        Object obj = this.f21278a;
        if (!o.B((f30) obj, "getIsPromoted(...)")) {
            return "";
        }
        wy0 N = b40.N((f30) obj);
        return String.valueOf(N != null ? N.Z2() : null);
    }

    public final String n() {
        String d2 = ((lb0.r) this.f21278a).d("PREF_GCM_REG_ID", "");
        return (d2 == null || d2.length() == 0) ? "" : d2;
    }

    public final boolean o(m authority) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        boolean z13 = authority instanceof f;
        Object obj = this.f21278a;
        if (z13) {
            x1 x1Var = (x1) obj;
            x1Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) x1Var.f83504a;
            if (g1Var.o("android_facebook_auth_disabled", "enabled", z3Var) || g1Var.l("android_facebook_auth_disabled")) {
                return false;
            }
        } else if (authority instanceof qr1.i) {
            x1 x1Var2 = (x1) obj;
            x1Var2.getClass();
            z3 z3Var2 = a4.f83297a;
            g1 g1Var2 = (g1) x1Var2.f83504a;
            if (g1Var2.o("android_line_auth_disabled", "enabled", z3Var2) || g1Var2.l("android_line_auth_disabled")) {
                return false;
            }
        } else {
            if (((authority instanceof qr1.g) || (authority instanceof h)) ? true : authority instanceof l) {
                x1 x1Var3 = (x1) obj;
                x1Var3.getClass();
                z3 z3Var3 = a4.f83297a;
                g1 g1Var3 = (g1) x1Var3.f83504a;
                if (g1Var3.o("android_google_auth_disabled", "enabled", z3Var3) || g1Var3.l("android_google_auth_disabled")) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.w
    public final void onFailure(Throwable th3) {
        b1 b1Var = ((x0) this.f21278a).f119467h;
        b1Var.f119355c.set(th3);
        Pair pair = (Pair) b1Var.f119353a.poll();
        if (pair != null) {
            ((k0) pair.second).w(th3);
        }
    }

    @Override // com.google.common.util.concurrent.w
    public final void onSuccess(Object obj) {
    }

    public final boolean r(z3 shouldActivate) {
        Intrinsics.checkNotNullParameter(shouldActivate, "shouldActivate");
        z3 z3Var = z3.ACTIVATE_EXPERIMENT;
        Object obj = this.f21278a;
        if (shouldActivate == z3Var) {
            q1 q1Var = (q1) obj;
            q1Var.getClass();
            z3 z3Var2 = a4.f83298b;
            g1 g1Var = (g1) q1Var.f83462a;
            if (g1Var.o("hfp_tuner_ui_changes_android", "enabled", z3Var2) || g1Var.l("hfp_tuner_ui_changes_android")) {
                return true;
            }
        } else {
            q1 q1Var2 = (q1) obj;
            q1Var2.getClass();
            z3 z3Var3 = a4.f83297a;
            g1 g1Var2 = (g1) q1Var2.f83462a;
            if (g1Var2.o("hfp_tuner_ui_changes_android", "enabled", z3Var3) || g1Var2.l("hfp_tuner_ui_changes_android")) {
                return true;
            }
        }
        return false;
    }

    public final List s() {
        Object obj = this.f21278a;
        return ((nm.u) obj).v("deeplink_path") != null ? Uri.parse(((nm.u) obj).v("deeplink_path").p()).getPathSegments() : ((nm.u) obj).v("$android_deeplink_path") != null ? Uri.parse(a0.b1(((nm.u) obj).v("$android_deeplink_path").p(), "pinterest://", "")).getPathSegments() : new ArrayList();
    }

    public final String t(boolean z13, boolean z14, g0 g0Var, boolean z15, boolean z16, String str, boolean z17) {
        String z63;
        if (z14 && !z13) {
            return u(g0Var, z15, z16);
        }
        if (!z17) {
            if (str != null && str.length() != 0) {
                return str;
            }
            Object obj = this.f21278a;
            if (b40.l0((f30) obj)) {
                String S = b40.S((f30) obj);
                if (S != null) {
                    return S;
                }
            } else {
                String z64 = ((f30) obj).z6();
                if (z64 != null && z64.length() != 0 && (z63 = ((f30) obj).z6()) != null) {
                    return z63;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u(wa2.g0 r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f21278a
            com.pinterest.api.model.f30 r0 = (com.pinterest.api.model.f30) r0
            com.pinterest.api.model.se0 r1 = r0.g6()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            java.util.List r1 = r1.y()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.pinterest.api.model.we0 r1 = (com.pinterest.api.model.we0) r1
            if (r1 == 0) goto L2e
            com.pinterest.api.model.cb r1 = r1.o()
            if (r1 == 0) goto L2e
            java.lang.String r1 = r1.g()
            if (r1 == 0) goto L2e
            boolean r4 = kotlin.text.z.j(r1)
            r4 = r4 ^ r3
            if (r4 == 0) goto L2e
            r2 = r1
        L2e:
            java.lang.String r0 = bs1.c.P0(r0)
            java.lang.String r1 = ""
            if (r6 == 0) goto L3b
            boolean r4 = r6.f128736r
            if (r4 != r3) goto L3b
            goto L41
        L3b:
            boolean r6 = q(r6, r7, r8)
            if (r6 == 0) goto L47
        L41:
            if (r0 != 0) goto L4c
            if (r2 != 0) goto L4d
        L45:
            r2 = r1
            goto L4d
        L47:
            if (r2 != 0) goto L4d
            if (r0 != 0) goto L4c
            goto L45
        L4c:
            r2 = r0
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.c.u(wa2.g0, boolean, boolean):java.lang.String");
    }

    public final ru1.a v(boolean z13, boolean z14, boolean z15) {
        return new ru1.a(((r70.f) this.f21278a).b(z15), z13 ? new u50.b0(ks1.a.lego_floating_nav_phone_elevation) : new u50.b0(r0.lego_floating_nav_elevation), z14, new ru1.b(new u50.b0(ks1.a.floating_nav_bar_start_padding), new u50.b0(ks1.a.floating_nav_bar_end_padding), new u50.b0(ks1.a.floating_nav_bar_top_padding), new u50.b0(ks1.a.floating_nav_bar_bottom_padding), z13 ? new u50.b0(ks1.a.floating_nav_bar_bottom_margin) : new u50.b0(ks1.a.floating_nav_bar_bottom_margin_tablets_vr), new u50.g(eo1.b.sema_color_background_elevation)), new ru1.c(new u50.b0(z13 ? ks1.a.floating_nav_bar_tab_height : ks1.a.floating_nav_bar_tab_height_tablets), new u50.b0(ks1.a.floating_nav_bar_tab_width), new u50.b0(ks1.a.floating_nav_bar_tab_minimum_width), new u50.b0(ks1.a.floating_nav_bar_tab_left_margin), new u50.b0(ks1.a.floating_nav_bar_tab_right_margin), z14 ? z13 ? new u50.b0(ks1.a.floating_nav_bar_tab_top_margin_with_label) : new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin_tablets_with_label) : z13 ? new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin) : new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin_tablet), z14 ? z13 ? new u50.b0(ks1.a.floating_nav_bar_tab_bottom_margin_with_label) : new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin_tablets_with_label) : z13 ? new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin) : new u50.b0(ks1.a.floating_nav_bar_tab_vertical_margin_tablet), z14 ? new u50.b0(ks1.a.floating_nav_bar_tab_icon_bottom_margin_with_label) : new u50.b0(ks1.a.floating_nav_bar_tab_icon_bottom_margin), z14 ? rm1.i.MD : rm1.i.LG));
    }

    public final void w(int i13, boolean z13) {
        ((LockableViewPager) this.f21278a).B(i13, z13);
    }

    public final void x(boolean z13) {
        ((LockableViewPager) this.f21278a).f44544a0 = z13;
    }

    public final void y(xa.i iVar) {
        ((LockableViewPager) this.f21278a).P = iVar;
    }

    public final boolean z(g0 g0Var, boolean z13, boolean z14, boolean z15) {
        if ((g0Var != null && g0Var.f128735q) || z13 || q(g0Var, z13, z14) || z15) {
            f30 f30Var = (f30) this.f21278a;
            if (j1.F1(f30Var) && !f30Var.d5().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public c(c typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.f21278a = typeEnhancement;
    }

    public c(d sessionService) {
        Intrinsics.checkNotNullParameter(sessionService, "sessionService");
        this.f21278a = sessionService;
    }

    public c(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f21278a = pin;
    }

    public c(LockableViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f21278a = viewPager;
    }

    public c(gz1.b googlePlayServices) {
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f21278a = googlePlayServices;
    }

    public c(hf0.c deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f21278a = deviceInfoProvider;
    }

    public /* synthetic */ c(Object obj) {
        this.f21278a = obj;
    }

    public c(lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f21278a = prefsManagerUser;
    }

    public c(q1 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f21278a = experiments;
    }

    public c(x1 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f21278a = experiments;
    }

    public c(d2 locationlibraryExperiments) {
        Intrinsics.checkNotNullParameter(locationlibraryExperiments, "locationlibraryExperiments");
        this.f21278a = locationlibraryExperiments;
    }

    public c(m60.w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f21278a = eventManager;
    }

    public c(nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f21278a = pinAuxHelper;
    }

    public c(r70.f bottomNavConfiguration) {
        Intrinsics.checkNotNullParameter(bottomNavConfiguration, "bottomNavConfiguration");
        this.f21278a = bottomNavConfiguration;
    }

    public c(wa2.i pinFeatureConfig, int i13) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f21278a = pinFeatureConfig;
    }

    public c(cb cbVar) {
        this.f21278a = xk2.m.b(e.f1943l);
    }

    public c(int i13) {
        this.f21278a = new ArrayList(i13);
    }
}
