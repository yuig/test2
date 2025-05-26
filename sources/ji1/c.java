package ji1;

import ab2.p;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.api.model.f30;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import ek1.a2;
import h32.h2;
import h32.k0;
import h32.y1;
import h32.z1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.s0;
import m60.t0;
import m60.v0;
import nc2.j;
import nx.d0;
import nx.d1;
import nx.v;
import rq.n0;
import wa2.j0;

/* loaded from: classes5.dex */
public final class c extends RelativeLayout implements hi1.b, v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f76283m = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f76284a;

    /* renamed from: b, reason: collision with root package name */
    public ii1.b f76285b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f76286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76287d;

    /* renamed from: e, reason: collision with root package name */
    public final WebImageView f76288e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f76289f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f76290g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f76291h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltAvatar f76292i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f76293j;

    /* renamed from: k, reason: collision with root package name */
    public p f76294k;

    /* renamed from: l, reason: collision with root package name */
    public final PinterestVideoView f76295l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        j0 j0Var = new j0(context);
        this.f76286c = j0Var;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.video_carousel_square_dimen);
        this.f76287d = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.video_carousel_square_dimen);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.legacy_image_corner_radius);
        WebImageView webImageView = new WebImageView(context);
        webImageView.setLayoutParams(new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f23 = webImageView.f2();
        webImageView.g2(f23, f23, f23, f23);
        webImageView.setId(t0.image_view);
        webImageView.f52564p = new yv1.g(1);
        this.f76288e = webImageView;
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context);
        int i13 = dimensionPixelSize * 2;
        roundedCornersLayout.setLayoutParams(new RelativeLayout.LayoutParams(i13, dimensionPixelSize2));
        roundedCornersLayout.g(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalytics, sc2.d.video_view_simple, 8);
        z13.setLayoutParams(new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        z13.g0(j.AUTOPLAY_BY_STATE_WITH_NETWORK);
        z13.P(true);
        z13.setForeground(j0Var);
        z13.z(4);
        this.f76295l = z13;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(i13, -2));
        setLayoutParams(new RelativeLayout.LayoutParams(i13, -2));
        int i14 = s0.rounded_2dp_card_border;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i14));
        View inflate = View.inflate(context, v0.search_carousel_metadata, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(17, t0.image_view);
        inflate.setLayoutParams(layoutParams);
        View findViewById = inflate.findViewById(t0.attribution_label_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f76290g = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(t0.attribution_name_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f76291h = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(t0.attribution_avatar_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f76292i = (GestaltAvatar) findViewById3;
        View findViewById4 = inflate.findViewById(t0.title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f76289f = (TextView) findViewById4;
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        relativeLayout.addView(webImageView);
        relativeLayout.addView(z13);
        relativeLayout.addView(inflate);
        roundedCornersLayout.addView(relativeLayout);
        addView(roundedCornersLayout);
        z13.u0(new e1(this, 6));
        setOnClickListener(new b(this, 0));
        setOnLongClickListener(new n0(this, 9));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        z1 z1Var;
        ii1.b bVar = this.f76285b;
        if (bVar == null) {
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Intrinsics.checkNotNullParameter(this, "view");
        f30 f30Var = bVar.f72314l;
        if (f30Var == null) {
            return null;
        }
        z1 z1Var2 = bVar.f72315m;
        if (z1Var2 != null) {
            y1 y1Var = new y1(z1Var2);
            y1Var.f67439e = Long.valueOf(bVar.f72313k.a());
            int i13 = bVar.f72316n;
            bVar.f72310h.getClass();
            String a13 = d1.a(f30Var);
            ur.b bVar2 = (ur.b) bVar.f72312j;
            bs1.c.Q1(y1Var, f30Var, null, -1L, measuredWidth, measuredHeight, i13, a13, null, false, false, false, null, es.h.c(bVar2.f123060c, f30Var), ((es.c) bVar2.f123058a).j0(bVar.f72314l) ? new h32.f() : null, null, ((vr.b) bVar2.f123059b).g(f30Var), ((es.v) bVar2.f123060c).o(bVar.f72314l), null, null, 827136);
            z1Var = y1Var.a();
        } else {
            z1Var = null;
        }
        bVar.f72315m = null;
        bVar.f72306d.getClass();
        return z1Var;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ii1.b bVar = this.f76285b;
        if (bVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "view");
        z1 z1Var = bVar.f72315m;
        if (z1Var != null) {
            return z1Var;
        }
        f30 f30Var = bVar.f72314l;
        String uid = f30Var != null ? f30Var.getUid() : null;
        Long valueOf = Long.valueOf(bVar.f72313k.a());
        h2 h2Var = h2.STORY_CAROUSEL;
        String str = (String) bVar.f72305c.get("story_id");
        ur.b bVar2 = (ur.b) bVar.f72312j;
        k0 c13 = es.h.c(bVar2.f123060c, bVar.f72314l);
        h32.f fVar = ((es.c) bVar2.f123058a).j0(bVar.f72314l) ? new h32.f() : null;
        String g13 = ((vr.b) bVar2.f123059b).g(bVar.f72314l);
        Short o13 = ((es.v) bVar2.f123060c).o(bVar.f72314l);
        bVar.f72315m = new z1(null, valueOf, uid, null, null, null, null, null, null, h2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c13, null, null, null, null, fVar, null, null, g13, o13 != null ? Short.valueOf(o13.shortValue()) : null, null, null, null);
        f30 pin = bVar.f72314l;
        if (pin != null) {
            bVar.f72306d.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
        }
        return bVar.f72315m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.f76293j) {
            String str = this.f76284a;
            if (str == null) {
                Intrinsics.r("pinUid");
                throw null;
            }
            this.f76295l.getClass();
            nc2.h hVar = nc2.h.f90405a;
            com.bumptech.glide.d.E0(str, new a2(0L, 3));
            p pVar = this.f76294k;
            if (pVar == null) {
                Intrinsics.r("endFrame");
                throw null;
            }
            pVar.setVisibility(4);
        }
        super.onDetachedFromWindow();
    }
}
