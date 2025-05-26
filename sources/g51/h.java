package g51;

import ab1.q;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import bb1.p;
import bb1.z;
import com.facebook.login.x;
import com.pinterest.feature.settings.shared.view.RestrictedLockView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.p3;
import h32.f1;
import h32.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import lh0.a4;
import lh0.n1;
import lh0.z3;
import m60.u;
import m60.w;
import n02.o;
import nx.d0;
import p91.c0;
import q91.d1;
import q91.g1;
import x02.z1;
import yq1.s2;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63612b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f63611a = i13;
        this.f63612b = obj;
    }

    @Override // ak2.a
    public final void run() {
        switch (this.f63611a) {
            case 0:
                n this$0 = (n) this.f63612b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.w3().i2();
                this$0.A.i2();
                return;
            case 1:
                p91.f this$02 = (p91.f) this.f63612b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (this$02.isBound()) {
                    ep.b.C(null, ((k91.e) ((l91.b) this$02.getView())).f7());
                    return;
                }
                return;
            case 2:
                c0 this$03 = (c0) this.f63612b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                l91.j jVar = (l91.j) this$03.getViewIfBound();
                if (jVar != null) {
                    g1 g1Var = (g1) jVar;
                    g1Var.f8(false);
                    g1Var.e8(true);
                    return;
                }
                return;
            case 3:
                d1 this$04 = (d1) this.f63612b;
                int i13 = d1.f103082m0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.f7().d(new p91.k(bd1.b.ADDITIONAL_LOCALES, CollectionsKt.Z(this$04.f103087g0, ",", null, null, 0, null, null, 62)));
                w f73 = this$04.f7();
                String string = this$04.getString(h52.c.additional_languages_updated);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                f73.e(1000L, new i92.i(new i92.g(string)));
                return;
            case 4:
                t91.e this$05 = (t91.e) this.f63612b;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ep.b.C(null, this$05.f116835b);
                return;
            case 5:
                wa1.k this$06 = (wa1.k) this.f63612b;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                boolean isBound = this$06.isBound();
                Boolean valueOf = Boolean.valueOf(isBound);
                if (!isBound) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    ep.b.C(null, ((xa1.l) ((com.pinterest.feature.settings.menu.b) this$06.getView())).f7());
                    return;
                }
                return;
            case 6:
                ab1.h this$07 = (ab1.h) this.f63612b;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                ((p) ((ya1.c) this$07.getView())).b8(false);
                return;
            case 7:
                ab1.n this$08 = (ab1.n) this.f63612b;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.isBound()) {
                    ((bb1.w) ((ya1.e) this$08.getView())).c8(false);
                    return;
                }
                return;
            case 8:
                q this$09 = (q) this.f63612b;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                if (this$09.isBound()) {
                    ((z) ((ya1.f) this$09.getView())).b8(false);
                    return;
                }
                return;
            case 9:
                ob1.b this$010 = (ob1.b) this.f63612b;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                LinearLayout linearLayout = ((tb1.h) ((com.pinterest.feature.settings.passcode.e) this$010.getView())).f117144n0;
                if (linearLayout == null) {
                    return;
                }
                linearLayout.setVisibility(8);
                return;
            case 10:
                xb1.b this$011 = (xb1.b) this.f63612b;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                if (this$011.isBound()) {
                    this$011.loadData();
                    return;
                }
                return;
            case 11:
                rc1.a this$012 = (rc1.a) this.f63612b;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                ((sc1.b) ((qc1.a) this$012.getView())).b8(true);
                return;
            case 12:
                RestrictedLockView this$013 = (RestrictedLockView) this.f63612b;
                Unit unit = RestrictedLockView.f48326e;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                d0 d0Var = this$013.f48327c;
                if (d0Var != null) {
                    d0.B(d0Var, f1.VIEW, g0.PROFILE_VISIBILITY_EDUCATION_POPUP, null, null, 28);
                }
                Context context = this$013.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (bs1.c.c1(context)) {
                    Context context2 = this$013.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Activity k03 = bs1.c.k0(context2);
                    Intrinsics.g(k03, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
                    String string2 = this$013.getContext().getString(c52.e.settings_private_profile_restricted_setting_education);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    ((cp1.p) k03).showInlineEducation(string2, this$013);
                    return;
                }
                return;
            case 13:
                oh1.m this$014 = (oh1.m) this.f63612b;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                ep.b.C(null, this$014.f94520b);
                return;
            case 14:
                j0 disposable = (j0) this.f63612b;
                int i14 = qh1.d.f103895h;
                Intrinsics.checkNotNullParameter(disposable, "$disposable");
                xj2.c cVar = (xj2.c) disposable.f80434a;
                if (cVar != null) {
                    cVar.dispose();
                    return;
                }
                return;
            case 15:
                nk1.f this$015 = (nk1.f) this.f63612b;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                nk1.f.b(this$015.f91124m);
                this$015.f91124m = null;
                nk1.f.b(this$015.f91125n);
                this$015.f91125n = null;
                nk1.f.b(this$015.f91126o);
                this$015.f91126o = null;
                return;
            case 16:
                com.pinterest.identity.account.k this$016 = (com.pinterest.identity.account.k) this.f63612b;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                com.pinterest.identity.account.h hVar = (com.pinterest.identity.account.h) ((com.pinterest.identity.account.d) this$016.getView());
                d0.v(hVar.s7(), f1.UNLINK_ACCOUNT, null, false, 12);
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.pinterest.EXTRA_UNLINK_ACCOUNT_CONFIRMATION_TOAST", true);
                bundle.putString("com.pinterest.EXTRA_UNLINK_ACCOUNT_LBA_FULL_NAME", hVar.f49786o0);
                bundle.putString("com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_URL", hVar.f49787p0);
                mo1.d dVar = hVar.f49784m0;
                if (dVar != null) {
                    mo1.d.a(dVar, false, null, null, bundle, 7);
                    return;
                } else {
                    Intrinsics.r("intentHelper");
                    throw null;
                }
            case 17:
                s2 this$017 = (s2) this.f63612b;
                int i15 = s2.f139988y0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                ep.b.C(null, this$017.f7());
                return;
            case 18:
                x loginManager = (x) this.f63612b;
                Intrinsics.checkNotNullParameter(loginManager, "$loginManager");
                loginManager.d();
                return;
            case 19:
                fw1.d this$018 = (fw1.d) this.f63612b;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                ((fw1.i) ((fw1.c) this$018.getView())).C(fw1.e.SENT);
                return;
            case 20:
                zz1.p this$019 = (zz1.p) this.f63612b;
                int i16 = zz1.p.f143223r0;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.b8(true);
                return;
            case 21:
                o oVar = (o) this.f63612b;
                n1 n1Var = oVar.f88860h;
                n1Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var2 = (lh0.g1) n1Var.f83439a;
                u.f85943a.d((g1Var2.o("android_unified_inbox", "enabled", z3Var) || g1Var2.l("android_unified_inbox")) ? Navigation.w1((ScreenLocation) p3.f51204b.getValue()) : Navigation.w1((ScreenLocation) p3.f51203a.getValue()));
                oVar.f88863k.k(w02.b.report_confirmation_toast_message);
                return;
            default:
                z1 this$020 = (z1) this.f63612b;
                gi2.b bVar = z1.f131544c;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : z1.f131548g.entrySet()) {
                    ((ReentrantReadWriteLock) entry.getValue()).writeLock();
                }
                this$020.f131549a.evictAll();
                mc.g gVar = this$020.f131550b;
                synchronized (gVar) {
                    try {
                        File[] listFiles = gVar.f86898c.a().listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                file.delete();
                            }
                        }
                        gVar.f86896a.clear();
                        gVar.f86897b = 0L;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ReentrantReadWriteLock.WriteLock) it.next()).unlock();
                }
                return;
        }
    }
}
