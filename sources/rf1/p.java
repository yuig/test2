package rf1;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.om0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wo0;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.w1;
import nx.d1;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class p extends yk1.p {

    /* renamed from: a, reason: collision with root package name */
    public final float f107803a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f107804b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f107805c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107806d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f107807e;

    /* renamed from: f, reason: collision with root package name */
    public final as1.b f107808f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f107809g;

    /* renamed from: h, reason: collision with root package name */
    public final x02.u f107810h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f107811i;

    /* renamed from: j, reason: collision with root package name */
    public final a11.d f107812j;

    /* renamed from: k, reason: collision with root package name */
    public final pb0.a f107813k;

    /* renamed from: l, reason: collision with root package name */
    public final d1 f107814l;

    /* renamed from: m, reason: collision with root package name */
    public final w1 f107815m;

    /* renamed from: n, reason: collision with root package name */
    public final es.a f107816n;

    /* renamed from: o, reason: collision with root package name */
    public final String f107817o;

    /* renamed from: p, reason: collision with root package name */
    public final String f107818p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f107819q;

    /* renamed from: r, reason: collision with root package name */
    public final wo0 f107820r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f107821s;

    /* renamed from: t, reason: collision with root package name */
    public long f107822t;

    /* renamed from: u, reason: collision with root package name */
    public final h f107823u;

    /* renamed from: v, reason: collision with root package name */
    public final i f107824v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f107825w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(dl1.s pageModel, uk1.d presenterPinalytics, sf1.s0 s0Var, float f13, HashMap hashMap, HashMap hashMap2, String sessionId, uj2.q networkStateStream, i2 pinRepository, as1.b dynamicImageUtils, m60.w eventManager, x02.u aggregatedCommentRepository, x0 boardRepository, a11.d clickThroughHelperFactory, pb0.a clock, d1 trackingParamAttacher, w1 experiments, es.a adFormats) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pageModel, "pageModel");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(dynamicImageUtils, "dynamicImageUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f107803a = f13;
        this.f107804b = hashMap;
        this.f107805c = hashMap2;
        this.f107806d = sessionId;
        this.f107807e = pinRepository;
        this.f107808f = dynamicImageUtils;
        this.f107809g = eventManager;
        this.f107810h = aggregatedCommentRepository;
        this.f107811i = boardRepository;
        this.f107812j = clickThroughHelperFactory;
        this.f107813k = clock;
        this.f107814l = trackingParamAttacher;
        this.f107815m = experiments;
        this.f107816n = adFormats;
        String b13 = dynamicImageUtils.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getDisplayLargeImageWidth(...)");
        this.f107817o = b13;
        String e13 = dynamicImageUtils.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getFallbackLargeImageResolution(...)");
        this.f107818p = e13;
        this.f107819q = s0Var != null ? s0Var.f112726g : false;
        this.f107820r = (wo0) pageModel;
        this.f107823u = new h(this);
        this.f107824v = new i(this);
        this.f107825w = xk2.m.b(new ee1.d(this, 11));
    }

    @Override // yk1.p
    public final void bindPinalytics(yk1.r rVar) {
        sf1.t view = (sf1.t) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        sf1.s sVar = (sf1.s) ((sf1.t) getView());
        PinterestVideoView o13 = sVar.o();
        if (o13 != null) {
            o13.u0(null);
        }
        try {
            sVar.removeAllViews();
        } catch (NullPointerException unused) {
        }
        m60.w wVar = this.f107809g;
        wVar.j(this.f107823u);
        wVar.j(this.f107824v);
        super.onUnbind();
        wo0 wo0Var = this.f107820r;
        int i13 = wo0Var.f43311b;
        f30 f30Var = wo0Var.f43312c;
        if (f30Var == null || b40.P0(f30Var)) {
            return;
        }
        f30 f30Var2 = wo0Var.f43312c;
        String uid = f30Var2 != null ? f30Var2.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        String ideaPinPageUid = uid + "-" + i13;
        Intrinsics.checkNotNullParameter(ideaPinPageUid, "ideaPinPageUid");
        new oy.q0(ideaPinPageUid, 0, 0).i();
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(sf1.t view) {
        Map d2;
        sr srVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        sf1.s sVar = (sf1.s) view;
        float f13 = this.f107803a;
        sVar.N = f13;
        sVar.f112700g = (int) (sVar.f112699f / f13);
        wo0 wo0Var = this.f107820r;
        uo0 uo0Var = wo0Var.f43310a;
        int i13 = wo0Var.f43311b;
        if (this.f107819q) {
            this.f107821s = true;
            sf1.t tVar = (sf1.t) getView();
            as1.b bVar = this.f107808f;
            String b13 = bVar.b();
            Intrinsics.checkNotNullExpressionValue(b13, "getDisplayLargeImageWidth(...)");
            String e13 = bVar.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getFallbackLargeImageResolution(...)");
            String imageUrl = com.bumptech.glide.d.M(uo0Var, b13, e13);
            Intrinsics.checkNotNullParameter(uo0Var, "<this>");
            om0 p13 = uo0Var.p();
            String previewImageUrl = (p13 == null || (d2 = p13.d()) == null || (srVar = (sr) d2.get("474x")) == null) ? null : srVar.j();
            if (previewImageUrl == null) {
                previewImageUrl = "";
            }
            f30 f30Var = wo0Var.f43312c;
            String uid = f30Var != null ? f30Var.getUid() : null;
            String pinId = uid != null ? uid : "";
            String pageIndex = String.valueOf(i13);
            sf1.s sVar2 = (sf1.s) tVar;
            sVar2.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
            WebImageView webImageView = new WebImageView(sVar2.getContext());
            webImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
            webImageView.x2(previewImageUrl);
            webImageView.f52564p = new kz0.d(pinId, pageIndex, sVar2, 1);
            webImageView.V1(imageUrl, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
            sVar2.addView(webImageView);
        } else {
            this.f107821s = true;
            r3(uo0Var, i13, wo0Var.f43320k);
        }
        m60.w wVar = this.f107809g;
        wVar.h(this.f107823u);
        wVar.h(this.f107824v);
    }

    public final void q3() {
        h hVar = this.f107823u;
        m60.w wVar = this.f107809g;
        wVar.j(hVar);
        wVar.j(this.f107824v);
        super.onUnbind();
    }

    public final void r3(uo0 uo0Var, int i13, String str) {
        o oVar = new o(this, str, i13, uo0Var, Unit.f80348a);
        List o13 = uo0Var.o();
        if (o13 != null) {
            Iterator it = o13.iterator();
            while (it.hasNext()) {
                ((ro0) it.next()).a(oVar);
            }
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }
}
