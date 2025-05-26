package p90;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import so.o3;
import so.oa;
import so.r8;
import so.s6;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements o82.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99203b;

    public /* synthetic */ n(Object obj, int i13) {
        this.f99202a = i13;
        this.f99203b = obj;
    }

    @Override // o82.q
    public final wt1.d b(ao2.j0 it) {
        int i13 = this.f99202a;
        Object obj = this.f99203b;
        switch (i13) {
            case 0:
                w this$0 = (w) obj;
                int i14 = w.Y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                s6 s6Var = this$0.M0;
                if (s6Var != null) {
                    return s6Var.a(this$0.m9().f99239f, bf.b.S(this$0));
                }
                Intrinsics.r("cutoutEditorViewModelFactory");
                throw null;
            case 1:
                cj0.p this$02 = (cj0.p) obj;
                int i15 = cj0.p.X0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "scope");
                t2 t2Var = this$02.P0;
                if (t2Var != null) {
                    return t2.a(t2Var, it, null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            case 2:
                jm0.j this$03 = (jm0.j) obj;
                int i16 = jm0.j.f76978k1;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "scope");
                t2 t2Var2 = this$03.N0;
                if (t2Var2 != null) {
                    return t2.a(t2Var2, it, null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            case 3:
                qm0.p0 this$04 = (qm0.p0) obj;
                int i17 = qm0.p0.f104322d1;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it, "scope");
                t2 t2Var3 = this$04.M0;
                if (t2Var3 != null) {
                    return t2.a(t2Var3, it, null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            case 4:
                ys0.h this$05 = (ys0.h) obj;
                int i18 = ys0.h.L0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                xs0.l lVar = this$05.G0;
                if (lVar != null) {
                    return lVar.b(bf.b.S(this$05));
                }
                Intrinsics.r("sbaHfBoardToggleSettingCellViewBinder");
                throw null;
            case 5:
                dt0.n this$06 = (dt0.n) obj;
                int i19 = dt0.n.S0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                xs0.l lVar2 = this$06.M0;
                if (lVar2 != null) {
                    return lVar2.b(bf.b.S(this$06));
                }
                Intrinsics.r("sbaPinActivityCellViewBinder");
                throw null;
            case 6:
                yw0.e this$07 = (yw0.e) obj;
                int i23 = yw0.e.f140272s;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                r8 r8Var = this$07.f140278f.f113549a;
                Application h10 = com.pinterest.widget.configuration.k.h(r8Var.f114090a.f113603b);
                oa oaVar = r8Var.f114091b.f114255d;
                return new ax0.i(this$07.f140275c, h10, new gx.e((m60.w) oaVar.f113885r0.get(), new rd.j(oaVar.T2())));
            case 7:
                bx0.i this$08 = (bx0.i) obj;
                int i24 = bx0.i.f24043t;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return new cx0.j(this$08.f24046c, com.pinterest.widget.configuration.k.h(this$08.f24048e.f113548a.f114090a.f113603b));
            case 8:
                iz0.n this$09 = (iz0.n) obj;
                int i25 = iz0.n.Y0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(it, "scope");
                t2 t2Var4 = this$09.T0;
                if (t2Var4 != null) {
                    return t2.a(t2Var4, it, null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            case 9:
                com.pinterest.feature.settings.notifications.v this$010 = (com.pinterest.feature.settings.notifications.v) obj;
                int i26 = com.pinterest.feature.settings.notifications.v.J0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                o3 o3Var = this$010.H0;
                if (o3Var != null) {
                    return o3Var.a(bf.b.S(this$010));
                }
                Intrinsics.r("notifSettingsExpandableSectionViewModelFactory");
                throw null;
            case 10:
                kd1.k this$011 = (kd1.k) obj;
                int i27 = kd1.k.X0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(it, "scope");
                t2 t2Var5 = this$011.M0;
                if (t2Var5 != null) {
                    return t2.a(t2Var5, it, null, 14);
                }
                Intrinsics.r("pinRepViewModelFactory");
                throw null;
            default:
                r02.e0 this$012 = (r02.e0) obj;
                int i28 = r02.e0.P0;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return new bx0.j(bf.b.S(this$012));
        }
    }
}
