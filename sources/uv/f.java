package uv;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutDetailsView;
import com.pinterest.adsCollageHeroCutout.item.HeroCollagesCarouselCutoutImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uq.w;

/* loaded from: classes3.dex */
public final class f extends w {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f123150d;

    /* renamed from: e, reason: collision with root package name */
    public final HeroCollagesCarouselCutoutImageView f123151e;

    /* renamed from: f, reason: collision with root package name */
    public final HeroCollagesCarouselCutoutDetailsView f123152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Function1 cutoutClickListener) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cutoutClickListener, "cutoutClickListener");
        this.f123150d = cutoutClickListener;
        View.inflate(context, qv.c.hero_cutout_item_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -1));
        View findViewById = findViewById(qv.b.cutout_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f123151e = (HeroCollagesCarouselCutoutImageView) findViewById;
        View findViewById2 = findViewById(qv.b.cutout_details);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f123152f = (HeroCollagesCarouselCutoutDetailsView) findViewById2;
    }
}
