package bj0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bc2.k;
import com.pinterest.api.model.xk;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import h32.r;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.d0;
import nx.v;
import tq.j;

/* loaded from: classes5.dex */
public abstract class g extends FrameLayout implements zi0.a, v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22953e = 0;

    /* renamed from: a, reason: collision with root package name */
    public aj0.b f22954a;

    /* renamed from: b, reason: collision with root package name */
    public RoundedCornersImageView f22955b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f22956c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltAvatar f22957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        setOnClickListener(new j(this, 29));
    }

    public final GestaltAvatar a() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        int p13 = kh2.d.p(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388659);
        com.bumptech.glide.c.a1(layoutParams, p13, p13, 0, 0);
        gestaltAvatar.setLayoutParams(layoutParams);
        return gestaltAvatar;
    }

    public RoundedCornersImageView b() {
        RoundedCornersImageView roundedCornersImageView = new RoundedCornersImageView(getContext());
        int dimensionPixelSize = roundedCornersImageView.getResources().getDimensionPixelSize(r0.bubble_large_size);
        roundedCornersImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        roundedCornersImageView.G2(re0.a.PROPORTIONAL_USE_LAYOUT_PARAMS);
        roundedCornersImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RoundedCornersImageView roundedCornersImageView2 = this.f22955b;
        if (roundedCornersImageView2 != null) {
            roundedCornersImageView2.setColorFilter(dl2.b.y0(this, eo1.a.color_background_dark_opacity_200));
        }
        roundedCornersImageView.f52564p = new yv1.g(1);
        return roundedCornersImageView;
    }

    public GestaltText e() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(gestaltText.getResources().getDimensionPixelSize(r0.bubble_large_size), -2, 8388691));
        int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.space_200);
        gestaltText.setPaddingRelative(dimensionPixelSize, gestaltText.getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
        gestaltText.i(a.f22940l);
        return gestaltText;
    }

    public final void g() {
        GestaltAvatar gestaltAvatar = this.f22957d;
        if (gestaltAvatar != null) {
            gestaltAvatar.H2(a.f22941m);
        }
    }

    public void h(String buttonText) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
    }

    @Override // zi0.a
    public void k1(k metadata, HashMap auxData) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        r rVar;
        r rVar2;
        aj0.b bVar = this.f22954a;
        if (bVar == null) {
            return null;
        }
        View view = getRootView();
        Intrinsics.checkNotNullExpressionValue(view, "getRootView(...)");
        Intrinsics.checkNotNullParameter(view, "view");
        xk xkVar = bVar.f15417h;
        if (xkVar == null) {
            return null;
        }
        r source = bVar.f15418i;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            rVar2 = new r(xkVar.getId(), source.f67200b, source.f67201c, source.f67202d, Long.valueOf(((pb0.g) bVar.f15413d).a()), source.f67204f, source.f67205g, source.f67206h, source.f67207i, source.f67208j, source.f67209k, source.f67210l, source.f67211m, source.f67212n);
            rVar = null;
        } else {
            rVar = null;
            rVar2 = null;
        }
        bVar.f15418i = rVar;
        return rVar2;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        aj0.b bVar = this.f22954a;
        if (bVar == null) {
            return null;
        }
        View view = getRootView();
        Intrinsics.checkNotNullExpressionValue(view, "getRootView(...)");
        Intrinsics.checkNotNullParameter(view, "view");
        if (bVar.f15418i == null) {
            xk xkVar = bVar.f15417h;
            String id3 = xkVar != null ? xkVar.getId() : null;
            Long valueOf = Long.valueOf(((pb0.g) bVar.f15413d).a());
            xk xkVar2 = bVar.f15417h;
            Integer j13 = xkVar2 != null ? xkVar2.j() : null;
            bVar.f15418i = new r(id3, null, null, valueOf, null, null, null, null, null, null, null, null, null, Integer.valueOf(j13 == null ? 0 : j13.intValue()));
        }
        return bVar.f15418i;
    }
}
