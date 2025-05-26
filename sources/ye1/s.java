package ye1;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingstories.views.ShoppingUnitGridImageContainer;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageViewContainer;
import kotlin.jvm.internal.Intrinsics;
import lu.a0;
import we1.a2;

/* loaded from: classes5.dex */
public final class s extends a0 implements q, ky.h, nx.v, yk1.n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f138886i = 0;

    /* renamed from: d, reason: collision with root package name */
    public ku1.l f138887d;

    /* renamed from: e, reason: collision with root package name */
    public p f138888e;

    /* renamed from: f, reason: collision with root package name */
    public final ShoppingUnitGridImageContainer f138889f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageViewContainer f138890g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f138891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(f62.a.shopping_unit_text_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(f62.a.shopping_unit_invisible_matching_image_grid_height);
        ShoppingUnitGridImageContainer shoppingUnitGridImageContainer = new ShoppingUnitGridImageContainer(context, null, 0);
        shoppingUnitGridImageContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) shoppingUnitGridImageContainer.getResources().getDimension(f62.a.shopping_unit_image_container_height)));
        this.f138889f = shoppingUnitGridImageContainer;
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new a2(this, 3));
        View view = new View(context);
        view.setVisibility(4);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize2));
        WebImageViewContainer webImageViewContainer = new WebImageViewContainer(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        webImageViewContainer.setLayoutParams(layoutParams2);
        int i13 = eo1.b.color_background_default;
        Object obj = d5.a.f53679a;
        webImageViewContainer.setBackgroundColor(context.getColor(i13));
        this.f138890g = webImageViewContainer;
        final GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        final int dimensionPixelSize3 = getResources().getDimensionPixelSize(eo1.c.space_400);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimensionPixelSize, -2);
        Intrinsics.checkNotNullParameter(layoutParams3, "<this>");
        com.bumptech.glide.c.a1(layoutParams3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        gestaltText.setLayoutParams(layoutParams3);
        gestaltText.i(g.f138856l);
        gestaltText.j(new ca1.h(this, 22));
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ye1.r
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int dimensionPixelSize4;
                GestaltText it = GestaltText.this;
                Intrinsics.checkNotNullParameter(it, "$it");
                s this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (it.getLineCount() >= 1) {
                    this$0.getClass();
                    int i14 = f62.a.shopping_unit_invisible_matching_image_grid_height;
                    int lineCount = it.getLineCount();
                    Resources resources = this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    int i15 = f62.a.shopping_unit_single_line_text_height;
                    Intrinsics.checkNotNullParameter(resources, "resources");
                    int i16 = 0;
                    int i17 = dimensionPixelSize3;
                    if (lineCount < 1) {
                        dimensionPixelSize4 = 0;
                    } else {
                        dimensionPixelSize4 = (i17 * 2) + resources.getDimensionPixelSize(i14) + (resources.getDimensionPixelSize(i15) * lineCount);
                    }
                    this$0.f138889f.setLayoutParams(new FrameLayout.LayoutParams(-1, dimensionPixelSize4));
                    ImageView imageView = (ImageView) this$0.f138890g.b();
                    int i18 = f62.a.shopping_unit_no_text_height;
                    int lineCount2 = it.getLineCount();
                    Resources resources2 = this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    int i19 = f62.a.shopping_unit_single_line_text_height;
                    Intrinsics.checkNotNullParameter(resources2, "resources");
                    if (lineCount2 >= 1) {
                        i16 = (i17 * 2) + resources2.getDimensionPixelSize(i18) + (resources2.getDimensionPixelSize(i19) * lineCount2);
                    }
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, i16));
                }
                return true;
            }
        });
        this.f138891h = gestaltText;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(shoppingUnitGridImageContainer);
        webImageViewContainer.addView(gestaltText);
        linearLayout.addView(view);
        linearLayout.addView(webImageViewContainer);
        addView(linearLayout);
        setClipToOutline(true);
        setBackground(context.getDrawable(f62.b.shopping_unit_background));
        setForeground(context.getDrawable(f62.b.shopping_unit_background));
    }

    @Override // ye1.q
    public final void E1(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ku1.l lVar = this.f138887d;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ku1.l.b(lVar, context, url, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
    }

    @Override // ye1.q
    public final void I6(p listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f138888e = listener;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        p pVar = this.f138888e;
        if (pVar != null) {
            return ((u) pVar).I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        p pVar = this.f138888e;
        if (pVar != null) {
            return ((u) pVar).E1();
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
