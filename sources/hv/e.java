package hv;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.a0;
import ck2.i;
import com.pinterest.ads.onetap.view.CloseupCarouselView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import i1.f1;
import java.util.Iterator;
import java.util.List;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;
import l21.g;
import l21.h;
import lh0.g1;
import lh0.l2;
import lh0.p2;
import lh0.z3;
import m60.u;
import m60.w;
import n21.f;
import nx.f0;
import sq0.b0;
import uj2.q;
import x02.i2;
import yk1.n;
import yk1.r;

/* loaded from: classes3.dex */
public final class e extends vq0.b implements g, h {

    /* renamed from: c, reason: collision with root package name */
    public List f70436c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70437d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70438e;

    /* renamed from: f, reason: collision with root package name */
    public final String f70439f;

    /* renamed from: g, reason: collision with root package name */
    public final i2 f70440g;

    /* renamed from: h, reason: collision with root package name */
    public final w f70441h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f70442i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List pinImages, q networkStateStream, d4 d4Var, a4 a4Var, f0 pinalyticsFactory, boolean z13, boolean z14, String str, i2 pinRepository, w eventManager, l2 experiments, p2 carouselAdsExperiments, boolean z15) {
        super(new gv.a(d4Var, a4Var, pinalyticsFactory), networkStateStream);
        Intrinsics.checkNotNullParameter(pinImages, "pinImages");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(carouselAdsExperiments, "carouselAdsExperiments");
        this.f70436c = pinImages;
        this.f70437d = z13;
        this.f70438e = z14;
        this.f70439f = str;
        this.f70440g = pinRepository;
        this.f70441h = eventManager;
        this.f70442i = z15;
        a aVar = new a(this, 0);
        b bVar = b.f70431j;
        a aVar2 = new a(this, 1);
        z3 z3Var = lh0.a4.f83298b;
        g1 g1Var = (g1) experiments.f83417a;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new n21.d(this, aVar, this, bVar, aVar2, g1Var.o("android_load_medium_res_image_in_pdp_closeup", "enabled", z3Var) || g1Var.l("android_load_medium_res_image_in_pdp_closeup"), new a(this, 2)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, new f(getPresenterPinalytics(), carouselAdsExperiments));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO, new d91.g(this.f70438e, str, new gv.a(d4.PIN, a4.PIN_CLOSEUP, pinalyticsFactory), networkStateStream));
    }

    public final void D3(String pinId, d completion) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(completion, "completion");
        e0 M = this.f70440g.M(pinId);
        hk2.b bVar = new hk2.b(new dv.a(3, new f1(8, completion)), new dv.a(4, c.f70433i), i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        addDisposable(bVar);
    }

    @Override // l21.h
    public final void F1() {
        if (isBound()) {
            ((CloseupCarouselView) getView()).getClass();
        }
    }

    public final void F3(List images) {
        Object obj;
        Intrinsics.checkNotNullParameter(images, "images");
        if (this.f70438e && isBound()) {
            Iterator it = images.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((m21.a) obj).e()) {
                        break;
                    }
                }
            }
            if (obj == null) {
                androidx.recyclerview.widget.w e13 = a0.e(new vs.c(1, this.f70436c, images));
                Intrinsics.checkNotNullExpressionValue(e13, "calculateDiff(...)");
                B3(e13, images);
                this.f70436c = images;
            }
        }
        x3(images);
        this.f70436c = images;
    }

    @Override // l21.g
    public final void I1(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        CloseupCarouselView closeupCarouselView = (CloseupCarouselView) getView();
        View.OnLongClickListener onLongClickListener = closeupCarouselView.f35427n;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(closeupCarouselView);
        }
    }

    @Override // l21.g
    public final void U() {
        if (this.f70436c.isEmpty()) {
            return;
        }
        u.f85943a.d(new ls1.i(((m21.a) this.f70436c.get(0)).getPinId(), System.currentTimeMillis() * 1000000));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((m21.a) d().get(i13)).n() != null ? RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL : ((m21.a) d().get(i13)).q() ? RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO : RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
    }

    @Override // l21.h
    public final void k1() {
        if (isBound()) {
            ((CloseupCarouselView) getView()).getClass();
        }
    }

    @Override // vq0.g, yk1.b
    public final void onActivate() {
        q3();
        String str = this.f70439f;
        if (str != null) {
            D3(str, new d(this, 1));
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        CloseupCarouselView view = (CloseupCarouselView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f70436c);
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // vq0.g
    public final void r3(b0 b0Var) {
        CloseupCarouselView view = (CloseupCarouselView) b0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f70436c);
    }

    @Override // l21.g
    public final void y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CloseupCarouselView closeupCarouselView = (CloseupCarouselView) getView();
        View.OnClickListener onClickListener = closeupCarouselView.f35426m;
        if (onClickListener != null) {
            onClickListener.onClick(closeupCarouselView);
        }
    }

    @Override // vq0.g, yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        CloseupCarouselView view = (CloseupCarouselView) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x3(this.f70436c);
    }
}
