package ex1;

import ay1.z;
import c50.w2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.qrCodeLogin.j0;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import h32.f1;
import h32.g0;
import h32.u0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import jx1.t;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import px1.q;
import r02.r;
import rb1.w;
import s02.x;
import u50.f0;
import u50.k0;
import zy.d0;

/* loaded from: classes4.dex */
public final class n extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f60422j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i13) {
        super(1);
        this.f60421i = i13;
        this.f60422j = obj;
    }

    public final on1.k b(on1.k it) {
        int i13 = this.f60421i;
        Object obj = this.f60422j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, ((zx.l) obj).f142982j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.k.e(it, on1.b.e(it.f96740a, ((zx.g) obj).f142970b, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f60421i;
        Object obj = this.f60422j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = (q) obj;
                return rn1.a.y(it, bs1.c.h2(String.valueOf(qVar.f101684d)), null, null, null, null, 0, d7.b.Z(qVar.f101684d != null), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                Date date = (Date) obj;
                if (date == null) {
                    return rn1.a.y(it, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
                }
                int i14 = com.pinterest.partnerAnalytics.g.pin_stats_created_at;
                String[] formatArgs = {DateFormat.getDateInstance(3).format(date)};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new f0(formatArgs[0]));
                return rn1.a.y(it, new k0(i14, arrayList), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((cy1.d) obj).f53442c;
                return rn1.a.y(it, ep.b.x(str, "string", str), vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(String.valueOf(((LinkedBA) obj).f50426a)), null, null, e0.b(vn1.e.BOLD), vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, com.bumptech.glide.d.G((r02.j) obj, "EXTRA_SHOW_APPEAL_BUTTON", false) ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((r) obj).getResources().getString(h02.e.rvc_account_text) + ":"), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final void f(l82.n buildAndStart) {
        int i13 = this.f60421i;
        Object obj = this.f60422j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                t tVar = (t) obj;
                l82.n.b(buildAndStart, tVar.f77697c);
                w60.d dVar = tVar.f77698d;
                buildAndStart.a(dVar, new w(27), dVar.a());
                break;
            case 11:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                tx1.n nVar = (tx1.n) obj;
                l82.n.b(buildAndStart, nVar.f119693c);
                w60.d dVar2 = nVar.f119694d;
                buildAndStart.a(dVar2, new w(28), dVar2.a());
                break;
            case 14:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                z zVar = (z) obj;
                l82.n.b(buildAndStart, zVar.f20690c);
                sw1.b bVar = zVar.f20691d;
                buildAndStart.a(bVar, new w(29), bVar.a());
                break;
            case 18:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                j0 j0Var = (j0) obj;
                l82.n.b(buildAndStart, j0Var.f50322d);
                w60.d dVar3 = j0Var.f50321c;
                buildAndStart.a(dVar3, new w2(0), dVar3.a());
                k92.l lVar = j0Var.f50323e;
                buildAndStart.a(lVar, new w2(1), lVar.a());
                d0 d0Var = j0Var.f50324f;
                buildAndStart.a(d0Var, new w2(2), d0Var.a());
                break;
            case 24:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                gx.e eVar = ((s02.i) obj).f110319c;
                buildAndStart.a(eVar, new w2(3), eVar.a());
                break;
            case 25:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                s02.n nVar2 = (s02.n) obj;
                mb0.a aVar = (mb0.a) nVar2.f110332f.f63225b;
                buildAndStart.a(aVar, new w2(4), aVar.a());
                l82.n.b(buildAndStart, nVar2.f110329c);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                l82.n.b(buildAndStart, ((x) obj).f110362c);
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                w60.d dVar4 = ((t02.o) obj).f115734c;
                buildAndStart.a(dVar4, new w2(5), dVar4.a());
                break;
        }
    }

    public final void h(ox1.a locationType) {
        int i13 = this.f60421i;
        Object obj = this.f60422j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(locationType, "locationType");
                int i14 = ix1.f.f73801m0;
                kh2.j.x2((t) ((ix1.f) obj).f73802c0.getValue(), new jx1.k(locationType));
                break;
            default:
                Intrinsics.checkNotNullParameter(locationType, "locationType");
                nx1.a aVar = (nx1.a) obj;
                aVar.getClass();
                aVar.f92492a.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : locationType == ox1.a.METROS ? u0.ANALYTICS_AUDIENCE_LOCATION_METROS_TAB : u0.ANALYTICS_AUDIENCE_LOCATION_COUNTRIES_TAB, (r18 & 4) != 0 ? null : g0.ANALYTICS_AUDIENCE_LOCATION_TABS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0261, code lost:
    
        if (r8.booleanValue() != false) goto L91;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.n.invoke(java.lang.Object):java.lang.Object");
    }
}
