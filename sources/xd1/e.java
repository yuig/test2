package xd1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.ui.imageview.GrayWebImageView;
import da2.i;
import java.util.List;
import kh2.b0;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import sl1.j;
import u50.k0;

/* loaded from: classes5.dex */
public final class e extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f134630e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f134631a;

    /* renamed from: b, reason: collision with root package name */
    public Object f134632b;

    /* renamed from: c, reason: collision with root package name */
    public final View f134633c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f134634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i13, Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f62.d.view_flashlight_bottom_sheet_header_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i14));
        setBackgroundResource(s0.rounded_top_rect_radius_40);
        View findViewById = findViewById(f62.c.back_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        this.f134631a = gestaltIconButton;
        gestaltIconButton.u(new v02.d(this, 3));
        View findViewById2 = findViewById(f62.c.unified_flashlight_shop_tab_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById2;
        this.f134633c = gestaltTabLayout;
        k0 j23 = bs1.c.j2(new String[0], f62.e.explore_tab);
        i iVar = i.TAB_EXPLORE;
        ek.e V = b0.V(gestaltTabLayout, j23, iVar.getValue(), 8);
        V.f59124a = Integer.valueOf(iVar.getValue());
        Unit unit = Unit.f80348a;
        k0 j24 = bs1.c.j2(new String[0], f62.e.shop_tab);
        i iVar2 = i.TAB_SHOP;
        ek.e V2 = b0.V(gestaltTabLayout, j24, iVar2.getValue(), 8);
        V2.f59124a = Integer.valueOf(iVar2.getValue());
        List j13 = f0.j(V, V2);
        this.f134634d = j13;
        gestaltTabLayout.E(i13, j13);
        gestaltTabLayout.b(new ek.i(this, 5));
    }

    public final void a() {
        ek.e n13 = ((GestaltTabLayout) this.f134633c).n(i.TAB_EXPLORE.getValue());
        if (n13 != null) {
            n13.b();
        }
    }

    public final void b() {
        ek.e n13 = ((GestaltTabLayout) this.f134633c).n(i.TAB_SHOP.getValue());
        if (n13 != null) {
            n13.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, b cornerRadii) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        GrayWebImageView grayWebImageView = new GrayWebImageView(context, null);
        grayWebImageView.i2(false);
        grayWebImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f13 = cornerRadii.f134625d;
        grayWebImageView.g2(cornerRadii.f134622a, cornerRadii.f134623b, cornerRadii.f134624c, f13);
        grayWebImageView.f52564p = new c(grayWebImageView, 0);
        addView(grayWebImageView, 0);
        this.f134631a = grayWebImageView;
        View relativeLayout = new RelativeLayout(context);
        addView(relativeLayout);
        this.f134632b = relativeLayout;
        View jVar = new j(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(20);
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        jVar.setLayoutParams(layoutParams);
        ((RelativeLayout) this.f134632b).addView(jVar);
        this.f134633c = jVar;
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f134632b;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(21);
        com.bumptech.glide.c.a1(layoutParams2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        relativeLayout2.addView(gestaltAvatar, layoutParams2);
        pe.i.K(gestaltAvatar);
        this.f134634d = gestaltAvatar;
    }
}
