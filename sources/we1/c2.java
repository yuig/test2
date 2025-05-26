package we1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c2 extends LinearLayout implements re1.y, ky.h {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f129308j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f129309a;

    /* renamed from: b, reason: collision with root package name */
    public final GrayWebImageView f129310b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f129311c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.p f129312d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f129313e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton.SmallSecondaryButton f129314f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129315g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129316h;

    /* renamed from: i, reason: collision with root package name */
    public final int f129317i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f129309a = frameLayout;
        GrayWebImageView grayWebImageView = new GrayWebImageView(context, null);
        grayWebImageView.i2(false);
        grayWebImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimensionPixelSize = grayWebImageView.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        grayWebImageView.g2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        grayWebImageView.f52564p = new xd1.c(grayWebImageView, 5);
        frameLayout.addView(grayWebImageView);
        this.f129310b = grayWebImageView;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Resources resources = constraintLayout.getResources();
        int i13 = m60.s0.dimming_layer;
        ThreadLocal threadLocal = e5.n.f57243a;
        constraintLayout.setBackground(resources.getDrawable(i13, null));
        frameLayout.addView(constraintLayout);
        this.f129311c = constraintLayout;
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        this.f129312d = pVar;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b2.f129285j);
        dl2.b.y2(gestaltText);
        this.f129313e = gestaltText;
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f129314f = smallSecondaryButton;
        this.f129315g = getResources().getDimensionPixelOffset(m60.r0.margin_quarter);
        int generateViewId = View.generateViewId();
        this.f129316h = generateViewId;
        int generateViewId2 = View.generateViewId();
        int generateViewId3 = View.generateViewId();
        this.f129317i = generateViewId3;
        int generateViewId4 = View.generateViewId();
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setVisibility(8);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_200);
        constraintLayout.addView(gestaltText);
        Unit unit = Unit.f80348a;
        pVar.j(constraintLayout);
        pVar.s(generateViewId, 1);
        pVar.F(generateViewId, dimensionPixelOffset);
        pVar.s(generateViewId2, 1);
        pVar.F(generateViewId2, dimensionPixelOffset);
        pVar.s(generateViewId3, 0);
        pVar.F(generateViewId3, dimensionPixelOffset);
        pVar.s(generateViewId4, 0);
        pVar.F(generateViewId4, dimensionPixelOffset);
        pVar.o(gestaltText.getId(), -2);
        pVar.n(gestaltText.getId(), -2);
        pVar.l(gestaltText.getId(), 1, generateViewId, 2);
        pVar.l(gestaltText.getId(), 2, generateViewId2, 1);
        pVar.l(gestaltText.getId(), 3, generateViewId3, 4);
        pVar.l(gestaltText.getId(), 4, generateViewId4, 3);
        pVar.f(gestaltText.getId());
        pVar.e(gestaltText.getId(), 1, 2);
        pVar.b(constraintLayout);
        addView(frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        com.bumptech.glide.c.a1(marginLayoutParams, 0, dimensionPixelOffset, 0, 0);
        addView(smallSecondaryButton, marginLayoutParams);
    }

    @Override // re1.y
    public final void b(re1.x singleImageUpsellModel) {
        Intrinsics.checkNotNullParameter(singleImageUpsellModel, "singleImageUpsellModel");
        float f13 = hf0.b.f69002b;
        int i13 = this.f129315g;
        int i14 = (int) ((f13 - (((i13 * ((int) 2.0f)) * 2) + (i13 * 2))) / 2.0f);
        int i15 = (int) (i14 * singleImageUpsellModel.f107688e);
        FrameLayout frameLayout = this.f129309a;
        frameLayout.getLayoutParams().width = i14;
        frameLayout.getLayoutParams().height = i15;
        GrayWebImageView grayWebImageView = this.f129310b;
        grayWebImageView.getLayoutParams().width = i14;
        grayWebImageView.getLayoutParams().height = i15;
        ConstraintLayout constraintLayout = this.f129311c;
        constraintLayout.getLayoutParams().width = i14;
        constraintLayout.getLayoutParams().height = i15;
        post(new s81.g(this, 5));
        Context context = getContext();
        int i16 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        grayWebImageView.V1(singleImageUpsellModel.f107685b, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(context.getColor(i16)), (r18 & 64) != 0 ? null : null, null);
        pk.a0.p(this.f129313e, singleImageUpsellModel.f107687d);
        setVisibility(0);
        setOnClickListener(new a2(singleImageUpsellModel, 0));
        n1 n1Var = new n1(singleImageUpsellModel, 2);
        GestaltButton.SmallSecondaryButton smallSecondaryButton = this.f129314f;
        smallSecondaryButton.d(n1Var);
        smallSecondaryButton.e(new ca1.h(singleImageUpsellModel, 20));
        yd1.a aVar = singleImageUpsellModel.f107686c;
        if (aVar != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltAvatar H2 = new GestaltAvatar(6, context2, (AttributeSet) null).H2(new xd1.d(aVar, 2));
            constraintLayout.addView(H2);
            Unit unit = Unit.f80348a;
            androidx.constraintlayout.widget.p pVar = this.f129312d;
            pVar.k(pVar);
            pVar.o(H2.getId(), -2);
            pVar.n(H2.getId(), -2);
            pVar.l(H2.getId(), 1, this.f129316h, 2);
            pVar.l(H2.getId(), 3, this.f129317i, 4);
            pVar.b(constraintLayout);
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
