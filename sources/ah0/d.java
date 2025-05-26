package ah0;

import a11.y;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import ll.j;
import nx.d0;
import nx.v;
import so.jb;
import so.oa;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends FrameLayout implements yg0.a, n, v, h, af2.c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f15176o = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f15177a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15178b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15179c;

    /* renamed from: d, reason: collision with root package name */
    public String f15180d;

    /* renamed from: e, reason: collision with root package name */
    public String f15181e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f15182f;

    /* renamed from: g, reason: collision with root package name */
    public final ProportionalImageView f15183g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f15184h;

    /* renamed from: i, reason: collision with root package name */
    public final PinterestVideoView f15185i;

    /* renamed from: j, reason: collision with root package name */
    public zg0.a f15186j;

    /* renamed from: k, reason: collision with root package name */
    public final j f15187k;

    /* renamed from: l, reason: collision with root package name */
    public final a11.d f15188l;

    /* renamed from: m, reason: collision with root package name */
    public final a11.n f15189m;

    /* renamed from: n, reason: collision with root package name */
    public final y f15190n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, d0 pinalytics, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f15178b) {
            this.f15178b = true;
            oa oaVar = ((jb) ((e) generatedComponent())).f113483a;
            this.f15188l = (a11.d) oaVar.f113668ec.get();
            this.f15190n = (y) oaVar.f113633cc.get();
        }
        this.f15179c = z13;
        this.f15187k = new j(16, 0);
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.lego_image_corner_radius);
        View.inflate(context, jk1.b.view_feed_card_story, this);
        View findViewById = findViewById(jk1.a.feed_card_complete_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f15182f = gestaltButton;
        View findViewById2 = findViewById(jk1.a.feed_card_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById2;
        this.f15183g = proportionalImageView;
        View findViewById3 = findViewById(jk1.a.feed_card_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f15184h = (GestaltText) findViewById3;
        View findViewById4 = findViewById(jk1.a.feed_card_video_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById4;
        this.f15185i = pinterestVideoView;
        WebImageView webImageView = pinterestVideoView.K0;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        proportionalImageView.f52576J = 1.33f;
        proportionalImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setVisibility(8);
        setOnClickListener(new tq.j(this, 25));
        a11.d dVar = this.f15188l;
        if (dVar == null) {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
        this.f15189m = dVar.a(pinalytics);
        if (z13) {
            gestaltButton.d(a.f15169i);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f15177a == null) {
            this.f15177a = new o(this);
        }
        return this.f15177a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f15177a == null) {
            this.f15177a = new o(this);
        }
        return this.f15177a.generatedComponent();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f15180d;
        if (str == null) {
            return null;
        }
        return j.x(this.f15187k, str, 0, 0, this.f15181e, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f15187k.y(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f15179c) {
            super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13), 1073741824));
        } else {
            super.onMeasure(i13, i14);
        }
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }
}
