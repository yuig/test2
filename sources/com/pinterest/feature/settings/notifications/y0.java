package com.pinterest.feature.settings.notifications;

import android.text.SpannableStringBuilder;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.q3;
import lh0.z3;
import va1.f1;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48286i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f48287j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, int i13) {
        super(1);
        this.f48286i = i13;
        this.f48287j = obj;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f48286i;
        Object obj = this.f48287j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(((yb1.p) obj).f138574d), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = hc1.i.f68719q0;
                Navigation navigation = ((hc1.i) obj).I;
                String v03 = navigation != null ? navigation.v0("about_arg_key") : null;
                if (v03 == null) {
                    v03 = "";
                }
                return ao1.b.e(it, bs1.c.h2(new SpannableStringBuilder(v03)), null, null, null, null, false, 0, 0, 500, false, false, false, null, false, null, null, null, null, null, 0, 4192766);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0121, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.split$default(r1, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(com.pinterest.api.model.wy0 r21) {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.notifications.y0.e(com.pinterest.api.model.wy0):java.util.List");
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f48286i;
        Object obj = this.f48287j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                pb1.m mVar = (pb1.m) obj;
                CharSequence a03 = j1.a0(mVar.getResources().getString(c52.e.settings_parental_code_instructions, mVar.getResources().getString(c52.e.manage_parental_passcode_url)));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((sb1.b) obj).f112239b;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                tb1.h hVar = (tb1.h) obj;
                CharSequence a04 = j1.a0(hVar.getResources().getString(c52.e.settings_parental_code_instructions, hVar.getResources().getString(c52.e.manage_parental_passcode_url)));
                Intrinsics.checkNotNullExpressionValue(a04, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a04), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    public final void h(wy0 wy0Var) {
        int i13 = this.f48286i;
        Object obj = this.f48287j;
        switch (i13) {
            case 15:
                ((xb1.b) obj).f134502c.k(g52.c.mention_control_settings_updated);
                break;
            default:
                bc1.d dVar = (bc1.d) obj;
                Intrinsics.f(wy0Var);
                dVar.f22645g = wy0Var;
                dVar.f22641c.h(dVar.f22647i);
                dVar.loadData();
                break;
        }
    }

    public final void i(l82.n buildAndStart) {
        int i13 = this.f48286i;
        Object obj = this.f48287j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                mb0.a aVar = (mb0.a) ((z0) obj).f48290c.f63225b;
                buildAndStart.a(aVar, new kp.n(21), aVar.a());
                break;
            case 4:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                l82.n.b(buildAndStart, (da1.c) obj);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                pb1.f0 f0Var = (pb1.f0) obj;
                gx.e eVar = f0Var.f99455c;
                buildAndStart.a(eVar, new kp.n(24), eVar.a());
                nu.b bVar = f0Var.f99456d;
                buildAndStart.a(bVar, new kp.n(25), bVar.a());
                k92.l lVar = f0Var.f99458f;
                buildAndStart.a(lVar, new kp.n(26), lVar.a());
                zy.d0 d0Var = f0Var.f99457e;
                buildAndStart.a(d0Var, new kp.n(27), d0Var.a());
                break;
            case 7:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                rb1.x xVar = (rb1.x) obj;
                mb0.a aVar2 = (mb0.a) xVar.f107102f.f63225b;
                buildAndStart.a(aVar2, new kp.n(28), aVar2.a());
                w60.d dVar = xVar.f107099c;
                buildAndStart.a(dVar, new kp.n(29), dVar.a());
                zy.d0 d0Var2 = xVar.f107100d;
                buildAndStart.a(d0Var2, new rb1.w(0), d0Var2.a());
                break;
            case 9:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                sb1.t tVar = (sb1.t) obj;
                mb0.a aVar3 = tVar.f112269c;
                buildAndStart.a(aVar3, new rb1.w(1), aVar3.a());
                k92.l lVar2 = tVar.f112271e;
                buildAndStart.a(lVar2, new rb1.w(2), lVar2.a());
                w60.d dVar2 = tVar.f112270d;
                buildAndStart.a(dVar2, new rb1.w(3), dVar2.a());
                zy.d0 d0Var3 = tVar.f112272f;
                buildAndStart.a(d0Var3, new rb1.w(4), d0Var3.a());
                break;
            case 11:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                ub1.a0 a0Var = (ub1.a0) obj;
                l82.n.b(buildAndStart, a0Var.f121709c);
                k92.l lVar3 = a0Var.f121710d;
                buildAndStart.a(lVar3, new rb1.w(5), lVar3.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                mb0.a aVar4 = (mb0.a) ((kc1.j) obj).f79162f.f63225b;
                buildAndStart.a(aVar4, new rb1.w(6), aVar4.a());
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2, r3.B0()) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
    
        if (r2.K3().booleanValue() == false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.notifications.y0.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(f1 item) {
        int i13 = this.f48286i;
        Object obj = this.f48287j;
        switch (i13) {
            case 18:
                Intrinsics.checkNotNullParameter(item, "item");
                com.pinterest.feature.settings.permissions.c cVar = ((yb1.j) obj).B0;
                if (cVar != null) {
                    xb1.d dVar = (xb1.d) cVar;
                    Intrinsics.checkNotNullParameter(item, "item");
                    NavigationImpl L = Navigation.L(item.j(), "", item.c());
                    if (item instanceof wb1.j0) {
                        L.y0(((wb1.j0) item).f129030k, "com.pinterest.EXTRA_MESSAGING_GROUP");
                    }
                    dVar.f134505a.d(L);
                    return;
                }
                return;
            case 21:
                Intrinsics.checkNotNullParameter(item, "item");
                com.pinterest.feature.settings.permissions.e eVar = ((yb1.t) obj).F0;
                if (eVar != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((xb1.j) eVar).f134525a.d(Navigation.L(item.j(), "", item.c()));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                bc1.d dVar2 = ((cc1.d) obj).B0;
                if (dVar2 != null) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    NavigationImpl L2 = Navigation.L(item.j(), "", item.c());
                    if (item instanceof ac1.e) {
                        wy0 wy0Var = dVar2.f22645g;
                        if (wy0Var == null) {
                            Intrinsics.r("user");
                            throw null;
                        }
                        L2.y0(wy0Var.a3(), "com.pinterst.EXTRA_SETTINGS_GENDER");
                        wy0 wy0Var2 = dVar2.f22645g;
                        if (wy0Var2 == null) {
                            Intrinsics.r("user");
                            throw null;
                        }
                        L2.y0(wy0Var2.J2(), "com.pinterst.EXTRA_SETTINGS_CUSTOM_GENDER");
                    } else if (item instanceof ac1.b) {
                        wy0 wy0Var3 = dVar2.f22645g;
                        if (wy0Var3 == null) {
                            Intrinsics.r("user");
                            throw null;
                        }
                        v10 Y3 = wy0Var3.Y3();
                        L2.y0(Y3 != null ? Y3.z() : null, "com.pinterst.EXTRA_SETTINGS_BUSINESS_TYPE");
                    } else if (item instanceof ac1.c) {
                        wy0 wy0Var4 = dVar2.f22645g;
                        if (wy0Var4 == null) {
                            Intrinsics.r("user");
                            throw null;
                        }
                        v10 Y32 = wy0Var4.Y3();
                        L2.y0(Y32 != null ? Y32.D() : null, "com.pinterst.EXTRA_SETTINGS_CONTACT_NAME");
                    } else {
                        if (item instanceof ac1.d) {
                            gk2.f0 u03 = com.bumptech.glide.d.u0(dVar2.f22639a.c(new m40.h()));
                            uj2.a0 a0Var = tk2.e.f118017c;
                            int i14 = 28;
                            kk2.t r13 = u03.l(a0Var).k(new t81.a(i14, bc1.c.f22637k)).r(a0Var);
                            Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                            nl.b.t(r13, new y71.b(i14, dVar2, L2), null, 2);
                            return;
                        }
                        if (item instanceof ac1.a) {
                            dVar2.getPinalytics().h(h32.g0.USER_BIRTHDAY_COLLECTION, h32.u0.USER_BIRTHDAY_OPTION, null);
                            wy0 wy0Var5 = dVar2.f22645g;
                            if (wy0Var5 == null) {
                                Intrinsics.r("user");
                                throw null;
                            }
                            L2.y0(Long.valueOf((long) wy0Var5.r2().doubleValue()), "com.pinterest.EXTRA_SETTINGS_BIRTHDAY");
                        } else if (item instanceof ac1.f) {
                            h32.u0 u0Var = h32.u0.LANGUAGE_BUTTON;
                            h32.g0 g0Var = h32.g0.EDIT_SETTINGS_PAGE;
                            q3 q3Var = dVar2.f22643e;
                            q3Var.getClass();
                            z3 z3Var = a4.f83297a;
                            g1 g1Var = (g1) q3Var.f83464a;
                            String str = "android_additional_languages";
                            if (!g1Var.o("android_additional_languages", "enabled", z3Var) && !g1Var.l("android_additional_languages")) {
                                str = null;
                            }
                            dVar2.getPinalytics().h(g0Var, u0Var, str != null ? ep.b.o("experiment", str) : null);
                            wy0 wy0Var6 = dVar2.f22645g;
                            if (wy0Var6 == null) {
                                Intrinsics.r("user");
                                throw null;
                            }
                            L2.y0(wy0Var6.R3(), "com.pinterest.EXTRA_SETTINGS_LANGUAGE");
                        }
                    }
                    dVar2.f22641c.d(L2);
                    return;
                }
                return;
        }
    }
}
