package i60;

import android.util.Log;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dt0.q;
import fz0.o;
import g60.d;
import h32.f1;
import h32.i0;
import h80.p;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import n70.a0;
import n70.b0;
import n70.c0;
import n70.z;
import ou1.b;
import q52.c;
import r52.s;
import rd.j;
import sk0.k;
import sk0.l;
import sk0.m;
import tk0.d0;
import u50.r;
import u52.s0;
import u52.t0;
import u52.u0;
import u52.v0;
import v52.f;

/* loaded from: classes5.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71624a;

    /* renamed from: b, reason: collision with root package name */
    public final j f71625b;

    public a(j pinalytics, int i13) {
        this.f71624a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                this.f71625b = pinalytics;
                break;
            default:
                Intrinsics.checkNotNullParameter(pinalytics, "stateBasedPinalytics");
                this.f71625b = pinalytics;
                break;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        f1 f1Var;
        int i13 = this.f71624a;
        j jVar = this.f71625b;
        switch (i13) {
            case 0:
                d request = (d) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof d) {
                    i0 i0Var = request.f63698a;
                    f1 f1Var2 = f1.AUTO_CLUSTER_SELECTED;
                    HashMap hashMap = new HashMap();
                    hashMap.put("cluster_selected_index", request.f63699b);
                    hashMap.put("cluster_selected_name", request.f63700c);
                    hashMap.put("source", b.AUTO_ORGANIZE.getValue());
                    String R0 = dl2.b.R0(request.f63703f);
                    if (R0 != null) {
                        hashMap.put("navigation_source", R0);
                    }
                    Unit unit = Unit.f80348a;
                    jVar.n(new zy.a(i0Var, f1Var2, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                    return;
                }
                return;
            case 1:
                c0 request2 = (c0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof z) {
                    f1Var = f1.TAP;
                } else if (request2 instanceof a0) {
                    f1Var = f1.PIN_REPIN;
                } else {
                    if (!(request2 instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var = f1.PIN_DELETE;
                }
                jVar.n(new zy.a(request2.getContext(), f1Var, null, request2.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                return;
            case 2:
                p request3 = (p) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                Log.e("Pusheen", "ImageOutpaintLoggingSEP, " + request3);
                boolean z13 = request3 instanceof p;
                if (z13) {
                    Log.e("Pusheen", "ImageOutpaintLoggingSEP2, " + request3.f68112b);
                }
                if (z13) {
                    jVar.n(new zy.a(request3.f68111a, request3.f68113c ? f1.IMAGE_UPLOAD_UPLOADED : f1.IMAGE_UPLOAD_FAILED, request3.f68114d, request3.f68112b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
                    return;
                }
                return;
            case 3:
                j(scope, (m) hVar, eventIntake);
                return;
            case 4:
                k(scope, (d0) hVar, eventIntake);
                return;
            case 5:
                q request4 = (q) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request4 instanceof q) {
                    jVar.p(request4.f56252a);
                    return;
                }
                return;
            case 6:
                fz0.q request5 = (fz0.q) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof fz0.p) {
                    fz0.p pVar = (fz0.p) request5;
                    jVar.n(new zy.a(com.bumptech.glide.d.z0(pVar.f63146a, gz0.b.f66361j), f1.TAP, pVar.f63148c, pVar.f63147b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
                    return;
                } else {
                    if (request5 instanceof o) {
                        o oVar = (o) request5;
                        jVar.n(new zy.a(com.bumptech.glide.d.z0(oVar.f63144a, gz0.b.f66362k), f1.TAP, null, oVar.f63145b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                        return;
                    }
                    return;
                }
            case 7:
                s request6 = (s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request6 instanceof r52.q) {
                    r52.q qVar = (r52.q) request6;
                    jVar.n(new zy.a(com.bumptech.glide.d.z0(qVar.f106294a, c.f102580k), f1.TAP, null, qVar.f106295b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                    return;
                } else {
                    if (request6 instanceof r52.r) {
                        r52.r rVar = (r52.r) request6;
                        jVar.n(new zy.a(com.bumptech.glide.d.z0(rVar.f106296a, c.f102581l), f1.TAP, null, rVar.f106297b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                        return;
                    }
                    return;
                }
            default:
                v0 request7 = (v0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request7 instanceof s0) {
                    s0 s0Var = (s0) request7;
                    jVar.n(new zy.a(com.bumptech.glide.d.z0(s0Var.f120730a, f.f124182j), f1.TAP, null, s0Var.f120731b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                    return;
                } else if (request7 instanceof t0) {
                    t0 t0Var = (t0) request7;
                    jVar.n(new zy.a(com.bumptech.glide.d.z0(t0Var.f120735a, f.f124183k), f1.TAP, null, t0Var.f120736b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                    return;
                } else {
                    if (request7 instanceof u0) {
                        u0 u0Var = (u0) request7;
                        jVar.n(new zy.a(com.bumptech.glide.d.z0(u0Var.f120738a, f.f124184l), f1.TAP, null, u0Var.f120739b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
                        return;
                    }
                    return;
                }
        }
    }

    public final void j(j0 scope, m request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof k;
        j jVar = this.f71625b;
        if (z13) {
            k kVar = (k) request;
            jVar.n(new zy.a(kVar.f113068a, f1.TAP, null, kVar.f113069b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
        } else if (request instanceof l) {
            l lVar = (l) request;
            jVar.n(new zy.a(lVar.f113070a, f1.VIEW, null, lVar.f113071b, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
        }
    }

    public final void k(j0 scope, d0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f71625b.n(new zy.a(request.getContext(), request instanceof tk0.c0 ? f1.VIEW : f1.TAP, null, request.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }
}
