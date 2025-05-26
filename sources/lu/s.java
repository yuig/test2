package lu;

import android.content.Context;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends a0 implements ft.e {

    /* renamed from: d, reason: collision with root package name */
    public final vt.e f84932d;

    /* renamed from: e, reason: collision with root package name */
    public nx.f0 f84933e;

    /* renamed from: f, reason: collision with root package name */
    public uj2.q f84934f;

    /* renamed from: g, reason: collision with root package name */
    public lh0.g f84935g;

    /* renamed from: h, reason: collision with root package name */
    public vt.i f84936h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIconButton f84937i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f84938j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltIconButton f84939k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialCardView f84940l;

    /* renamed from: m, reason: collision with root package name */
    public final WebImageView f84941m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f84942n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f84943o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltButton f84944p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f84945q;

    /* renamed from: r, reason: collision with root package name */
    public final PinterestVideoView f84946r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f84947s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f84948t;

    /* renamed from: u, reason: collision with root package name */
    public int f84949u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, vt.e adsQuizManager, yk1.j mvpBinder) {
        super(context, null, 0, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        this.f84932d = adsQuizManager;
        this.f84947s = true;
        this.f84948t = true;
        this.f84949u = ps.s.ads_quiz_promoted_by;
        View inflate = View.inflate(context, ps.q.quiz_results_expanded_view, this);
        View findViewById = inflate.findViewById(ps.p.body);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = inflate.findViewById(ps.p.modal_header_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84937i = (GestaltIconButton) findViewById2;
        View findViewById3 = inflate.findViewById(ps.p.your_result_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84938j = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(ps.p.expanded_results_location_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f84942n = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(ps.p.expanded_results_details_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f84943o = (GestaltText) findViewById5;
        View findViewById6 = inflate.findViewById(ps.p.attribution);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f84945q = (GestaltText) findViewById6;
        View findViewById7 = inflate.findViewById(ps.p.results_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f84939k = (GestaltIconButton) findViewById7;
        View findViewById8 = inflate.findViewById(ps.p.quiz_expanded_results_container_view);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f84940l = (MaterialCardView) findViewById8;
        View findViewById9 = inflate.findViewById(ps.p.expanded_results_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f84941m = (WebImageView) findViewById9;
        View findViewById10 = inflate.findViewById(ps.p.expanded_results_cta_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f84944p = (GestaltButton) findViewById10;
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, adsQuizManager.f126574a, sy1.b.video_view_one_tap_ad, 8);
        GestaltIcon gestaltIcon = (GestaltIcon) z13.findViewById(androidx.media3.ui.h0.exo_play);
        if (gestaltIcon != null) {
            gestaltIcon.g2(a.f84851r);
        }
        GestaltIcon gestaltIcon2 = (GestaltIcon) z13.findViewById(androidx.media3.ui.h0.exo_pause);
        if (gestaltIcon2 != null) {
            gestaltIcon2.g2(a.f84852s);
        }
        this.f84946r = z13;
        nx.f0 pinalyticsFactory = this.f84933e;
        if (pinalyticsFactory == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        uj2.q networkStateStream = this.f84934f;
        if (networkStateStream == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        vt.i iVar = new vt.i(new uk1.d(pinalyticsFactory), networkStateStream);
        iVar.f126600a = adsQuizManager;
        mvpBinder.d(this, iVar);
    }
}
