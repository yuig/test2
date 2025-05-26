package sv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.adsCollageHeroCutout.container.HeroCutoutToolbarModule;
import com.pinterest.adsCollageHeroCutout.layoutmanager.HeroCollagesCarouselLayoutManager;
import com.pinterest.adsCollageHeroCutout.view.HeroCutoutCarouselView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.x3;
import java.util.HashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsv/e;", "Lnl1/d;", "Lsv/b0;", "<init>", "()V", "adsCollageHeroCutout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends d0 implements b0 {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f115274q0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public np0.g f115275c0;

    /* renamed from: d0, reason: collision with root package name */
    public pb0.a f115276d0;

    /* renamed from: e0, reason: collision with root package name */
    public nx.k f115277e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d4 f115278f0 = d4.PIN;

    /* renamed from: g0, reason: collision with root package name */
    public final xk2.v f115279g0 = xk2.m.b(new lr.v(this, 16));

    /* renamed from: h0, reason: collision with root package name */
    public long f115280h0;

    /* renamed from: i0, reason: collision with root package name */
    public WebImageView f115281i0;

    /* renamed from: j0, reason: collision with root package name */
    public HeroCutoutToolbarModule f115282j0;

    /* renamed from: k0, reason: collision with root package name */
    public HeroCutoutCarouselView f115283k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltSpinner f115284l0;

    /* renamed from: m0, reason: collision with root package name */
    public final m1 f115285m0;

    /* renamed from: n0, reason: collision with root package name */
    public zy.a0 f115286n0;

    /* renamed from: o0, reason: collision with root package name */
    public i f115287o0;

    /* renamed from: p0, reason: collision with root package name */
    public final a4 f115288p0;

    public e() {
        xk2.k q13 = jq.b.q(9, new q1(this, 9), xk2.n.NONE);
        int i13 = 8;
        this.f115285m0 = a1.s(this, k0.f80436a.b(g.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
        this.f115286n0 = new zy.a0();
        this.f115287o0 = new i();
        this.E = qv.c.collage_hero_cutout_fragment;
        this.f115288p0 = a4.PIN_SHUFFLE_CUTOUT;
    }

    public final String Y7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        return f49940b == null ? "" : f49940b;
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return this.f115286n0.e();
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getF68106k0() {
        return z0.f(new Pair("pin_id", Y7()), new Pair("shuffle_asset_id", com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", "")));
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f115286n0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getW0() {
        return this.f115288p0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getV0() {
        return this.f115278f0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f115276d0 == null) {
            Intrinsics.r("clock");
            throw null;
        }
        this.f115280h0 = System.currentTimeMillis();
        ((g) this.f115285m0.getValue()).h(Y7(), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", ""), com.bumptech.glide.d.i0(null, this.f115288p0, this.f115278f0, ""), this.f115286n0.f(), Y7(), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_ROOT_PIN_ID", ""), com.bumptech.glide.d.Z(this, "EXTRA_COLLAGES_CUTOUT_UID", ""));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(qv.b.collage_hero_cutout_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f115282j0 = (HeroCutoutToolbarModule) findViewById;
        View findViewById2 = onCreateView.findViewById(qv.b.collage_hero_cutout_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f115281i0 = (WebImageView) findViewById2;
        View findViewById3 = onCreateView.findViewById(qv.b.hero_cutout_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f115283k0 = (HeroCutoutCarouselView) findViewById3;
        View findViewById4 = onCreateView.findViewById(qv.b.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f115284l0 = (GestaltSpinner) findViewById4;
        WebImageView webImageView = this.f115281i0;
        if (webImageView == null) {
            Intrinsics.r("backgroundImage");
            throw null;
        }
        int i13 = WebImageView.I;
        webImageView.Y(new bb2.k(webImageView, 0.3f, 3.0f));
        WebImageView webImageView2 = this.f115281i0;
        if (webImageView2 == null) {
            Intrinsics.r("backgroundImage");
            throw null;
        }
        webImageView2.loadUrl(com.bumptech.glide.d.Z(this, "EXTRA_PIN_IMAGE_MEDIUM_URL", ""));
        HeroCutoutToolbarModule heroCutoutToolbarModule = this.f115282j0;
        if (heroCutoutToolbarModule == null) {
            Intrinsics.r("toolbarModule");
            throw null;
        }
        heroCutoutToolbarModule.L(this);
        HeroCutoutCarouselView heroCutoutCarouselView = this.f115283k0;
        if (heroCutoutCarouselView == null) {
            Intrinsics.r("cutoutCarousel");
            throw null;
        }
        int q13 = kg.t.q(heroCutoutCarouselView.getWidth(), bs1.c.W(heroCutoutCarouselView, qv.a.collages_hero_carousel_item_size));
        cr.d dVar = new cr.d(3);
        Context context = heroCutoutCarouselView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        heroCutoutCarouselView.R2(new HeroCollagesCarouselLayoutManager(dVar, context, new a(this, heroCutoutCarouselView), q13, vv.a.LINEAR));
        heroCutoutCarouselView.H2(new rv.a(new wt.c(this, 14)));
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new c(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f115286n0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
