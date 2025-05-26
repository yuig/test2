package d91;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bc2.q;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import t3.s1;

/* loaded from: classes5.dex */
public final class g extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54074a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f54075b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f54076c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f54077d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f54078e;

    public g(uk1.d presenterPinalytics, c91.f onDemandModuleController, boolean z13, nu1.a inAppNavigator) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f54075b = presenterPinalytics;
        this.f54077d = onDemandModuleController;
        this.f54076c = z13;
        this.f54078e = inAppNavigator;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        e91.a aVar;
        int i14 = this.f54074a;
        boolean z13 = this.f54076c;
        switch (i14) {
            case 0:
                e view = (e) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter((m21.a) obj, "model");
                if (z13) {
                    view.getLayoutParams().width = (int) (hf0.b.f69002b * 0.8f);
                    view.requestLayout();
                    break;
                } else {
                    view.getClass();
                    break;
                }
            default:
                Object view2 = (rj0.c) nVar;
                vh model = (vh) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                List list = model.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
                    }
                }
                f30 f30Var = (f30) CollectionsKt.firstOrNull(arrayList);
                if (f30Var != null) {
                    as1.b a13 = as1.b.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                    sr b13 = bs1.b.b(f30Var, a13);
                    ((m) view2).m0(b13 != null ? b13.j() : null);
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    q videoTracks = dl2.b.S0(f30Var, null);
                    float k03 = b40.h0(f30Var) == 0.0d ? 1.0f : ((float) b40.k0(f30Var)) / ((float) b40.h0(f30Var));
                    n nVar2 = (n) view2;
                    Intrinsics.checkNotNullParameter(uid, "uid");
                    i0 p13 = nVar2.f54106l.p();
                    if (videoTracks != null) {
                        d4 d4Var = p13 != null ? p13.f67081a : null;
                        a4 a4Var = p13 != null ? p13.f67082b : null;
                        Intrinsics.checkNotNullParameter(uid, "uid");
                        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                        bc2.k kVar = new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null);
                        float f13 = nVar2.f54108n;
                        if (!z13) {
                            f13 /= hf0.b.f69004d;
                        }
                        oc2.i.g(nVar2.f54109o, kVar, new ec2.g((int) f13, bc2.j.OTHER, true, 58), 4);
                    }
                    nVar2.f54107m = k03;
                    if (z13) {
                        GestaltText gestaltText = nVar2.f54103i;
                        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
                        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.addRule(14);
                        layoutParams2.topMargin = nVar2.getResources().getDimensionPixelSize(r0.margin_half);
                        gestaltText.setLayoutParams(layoutParams2);
                        gestaltText.setTextSize(gestaltText.getResources().getDimension(eo1.c.internal_24_size));
                    }
                }
                ih ihVar = model.f42857o;
                m mVar = (m) view2;
                mVar.h(ihVar != null ? ihVar.g() : null);
                kj kjVar = model.f42855m;
                mVar.p(kjVar != null ? kjVar.a() : null);
                kj kjVar2 = model.f42856n;
                if (kjVar2 != null) {
                    kjVar2.a();
                }
                View view3 = view2 instanceof View ? (View) view2 : null;
                if (view3 != null) {
                    yk1.m j13 = s1.j(view3);
                    if (!(j13 instanceof e91.a)) {
                        j13 = null;
                    }
                    aVar = (e91.a) j13;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ih ihVar2 = model.f42857o;
                    aVar.f57915d = ihVar2 != null ? ihVar2.e() : null;
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        int i13 = this.f54074a;
        uk1.d dVar = this.f54075b;
        Object obj = this.f54077d;
        Object obj2 = this.f54078e;
        switch (i13) {
            case 0:
                return new a91.b(dVar, (uj2.q) obj2, (String) obj);
            default:
                return new e91.a((c91.f) obj, dVar, (nu1.a) obj2);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f54074a) {
            case 0:
                m21.a model = (m21.a) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }

    public g(boolean z13, String str, gv.a presenterPinalytics, uj2.q networkStateStream) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f54076c = z13;
        this.f54077d = str;
        this.f54075b = presenterPinalytics;
        this.f54078e = networkStateStream;
    }
}
