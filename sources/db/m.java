package db;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Worker;
import ao2.m0;
import c50.c1;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.pdp.PdpCloseupCarouselView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.qk0;
import i32.w0;
import i32.y0;
import java.math.BigInteger;
import java.util.Iterator;
import kh2.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a0;
import lh0.j4;
import m60.u0;
import nx.b0;
import rq.g2;
import rq.k3;
import rq.p0;
import rq.w4;
import rq.x2;
import wo2.x;

/* loaded from: classes3.dex */
public final class m extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54283i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f54284j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i13) {
        super(0);
        this.f54283i = i13;
        this.f54284j = obj;
    }

    public final oq.b b() {
        int i13 = this.f54283i;
        Object obj = this.f54284j;
        switch (i13) {
            case 12:
                p0 p0Var = (p0) obj;
                xr.a aVar = p0Var.f109445m;
                if (aVar == null) {
                    Intrinsics.r("attributionReporting");
                    throw null;
                }
                b0 pinAuxHelper = p0Var.getPinAuxHelper();
                ur.a aVar2 = p0Var.f109447o;
                if (aVar2 == null) {
                    Intrinsics.r("adsCoreDependencies");
                    throw null;
                }
                es.a aVar3 = p0Var.f109448p;
                if (aVar3 == null) {
                    Intrinsics.r("adFormats");
                    throw null;
                }
                a0 a0Var = p0Var.f109444l;
                if (a0Var != null) {
                    return p0Var.getImpressionHelper(aVar, pinAuxHelper, aVar2, aVar3, a0Var.o());
                }
                Intrinsics.r("closeupExperiments");
                throw null;
            case 20:
                w4 w4Var = (w4) obj;
                xr.a aVar4 = w4Var.f109633i;
                if (aVar4 == null) {
                    Intrinsics.r("attributionReporting");
                    throw null;
                }
                b0 pinAuxHelper2 = w4Var.getPinAuxHelper();
                ur.a aVar5 = w4Var.f109635k;
                if (aVar5 == null) {
                    Intrinsics.r("adsCoreDependencies");
                    throw null;
                }
                es.a aVar6 = w4Var.f109636l;
                if (aVar6 == null) {
                    Intrinsics.r("adFormats");
                    throw null;
                }
                a0 a0Var2 = w4Var.f109634j;
                if (a0Var2 != null) {
                    return w4Var.getImpressionHelper(aVar4, pinAuxHelper2, aVar5, aVar6, a0Var2.o());
                }
                Intrinsics.r("closeupExperiments");
                throw null;
            default:
                tq.n nVar = (tq.n) obj;
                xr.a aVar7 = nVar.f118903m;
                if (aVar7 == null) {
                    Intrinsics.r("attributionReporting");
                    throw null;
                }
                b0 pinAuxHelper3 = nVar.getPinAuxHelper();
                ur.a aVar8 = nVar.f118905o;
                if (aVar8 == null) {
                    Intrinsics.r("adsCoreDependencies");
                    throw null;
                }
                es.a aVar9 = nVar.f118906p;
                if (aVar9 != null) {
                    return nVar.getImpressionHelper(aVar7, pinAuxHelper3, aVar8, aVar9, nVar.g().o());
                }
                Intrinsics.r("adFormats");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        dl0 v63;
        jo0 q13;
        qk0 k13;
        int i13 = this.f54283i;
        Object obj = this.f54284j;
        switch (i13) {
            case 11:
                return Boolean.valueOf(((PinCloseupBaseModule) obj).shouldRenderLandscapeConfiguration());
            case 14:
                f30 pin = ((g2) obj).getPin();
                boolean z13 = false;
                if (pin != null && (v63 = pin.v6()) != null && (q13 = v63.q()) != null && (k13 = q13.k()) != null && qg1.d.c(k13)) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 17:
                a0 a0Var = ((k3) obj).f109348k;
                if (a0Var != null) {
                    return Boolean.valueOf(a0Var.K());
                }
                Intrinsics.r("experiments");
                throw null;
            default:
                j4 j4Var = ((CommentComposerView) obj).f35075h;
                if (j4Var != null) {
                    return Boolean.valueOf(j4Var.b());
                }
                Intrinsics.r("experiments");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle extras;
        int i13 = this.f54283i;
        String str = null;
        int i14 = 0;
        Object obj = this.f54284j;
        switch (i13) {
            case 0:
                n nVar = (n) obj;
                return BigInteger.valueOf(nVar.f54286a).shiftLeft(32).or(BigInteger.valueOf(nVar.f54287b)).shiftLeft(32).or(BigInteger.valueOf(nVar.f54288c));
            case 1:
                ((Worker) obj).getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 2:
                qc.a aVar = new qc.a(new wo2.f());
                x h10 = m0.h(aVar);
                qc.j jVar = (qc.j) obj;
                jVar.c(h10);
                h10.flush();
                long j13 = aVar.f103426b;
                Iterator it = jVar.f103437a.values().iterator();
                if (!it.hasNext()) {
                    return Long.valueOf(j13);
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            case 3:
                m129invoke();
                return Unit.f80348a;
            case 4:
                m129invoke();
                return Unit.f80348a;
            case 5:
                jp.j jVar2 = (jp.j) obj;
                jVar2.getClass();
                com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s(jVar2.f77274a, new ex.d(3, 16), jp.g.f77258o, new z3.m(jVar2, 14), jp.g.f77257n, null, null, null, 8160);
                sVar.o(3, new ep.c(15));
                return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, new c1(0), "", null);
            case 6:
                m129invoke();
                return Unit.f80348a;
            case 7:
                m129invoke();
                return Unit.f80348a;
            case 8:
                m129invoke();
                return Unit.f80348a;
            case 9:
                m129invoke();
                return Unit.f80348a;
            case 10:
                Intent intent = ((NUXActivity) obj).getIntent();
                if (intent != null && (extras = intent.getExtras()) != null) {
                    str = extras.getString("com.pinterest.EXTRA_PLACEMENT_ID");
                }
                if (str != null && str.length() != 0) {
                    w0 w0Var = y0.Companion;
                    int parseInt = Integer.parseInt(str);
                    w0Var.getClass();
                    y0 a13 = w0.a(parseInt);
                    if (a13 != null) {
                        return a13;
                    }
                    throw new RuntimeException(str.concat(" is not a Placement value"));
                }
                return y0.ANDROID_MAIN_USER_ED;
            case 11:
                return invoke();
            case 12:
                return b();
            case 13:
                m129invoke();
                return Unit.f80348a;
            case 14:
                return invoke();
            case 15:
                m129invoke();
                return Unit.f80348a;
            case 16:
                x2 x2Var = (x2) obj;
                ca2.e eVar = new ca2.e(true, null, u0.anim_speed_superfast, x2Var.f109652h, null, 0, x2Var.getViewPinalytics(), null, false, false, 946);
                eVar.f27256o = true;
                return eVar;
            case 17:
                return invoke();
            case 18:
                m129invoke();
                return Unit.f80348a;
            case 19:
                m129invoke();
                return Unit.f80348a;
            case 20:
                return b();
            case 21:
                return b();
            case 22:
                PdpCloseupCarouselView pdpCloseupCarouselView = (PdpCloseupCarouselView) obj;
                if (!pdpCloseupCarouselView.f35067x) {
                    Context context = pdpCloseupCarouselView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    i14 = bs1.c.W(pdpCloseupCarouselView, g0.v(context));
                }
                Context context2 = pdpCloseupCarouselView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new com.pinterest.feature.pincarouselads.view.l(context2, i14, true, null, 56);
            case 23:
                m129invoke();
                return Unit.f80348a;
            case 24:
                return invoke();
            case 25:
                m129invoke();
                return Unit.f80348a;
            case 26:
                m129invoke();
                return Unit.f80348a;
            case 27:
                m129invoke();
                return Unit.f80348a;
            case 28:
                m129invoke();
                return Unit.f80348a;
            default:
                m129invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m129invoke() {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: db.m.m129invoke():void");
    }
}
