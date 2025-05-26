package e21;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final class i extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public v32.c f56960a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f56961b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f56962c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f56963d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f56964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56965f;

    /* renamed from: g, reason: collision with root package name */
    public final int f56966g;

    /* renamed from: h, reason: collision with root package name */
    public final int f56967h;

    /* renamed from: i, reason: collision with root package name */
    public final int f56968i;

    /* renamed from: j, reason: collision with root package name */
    public final int f56969j;

    /* renamed from: k, reason: collision with root package name */
    public final float f56970k;

    /* renamed from: l, reason: collision with root package name */
    public final float f56971l;

    /* renamed from: m, reason: collision with root package name */
    public final float f56972m;

    /* renamed from: n, reason: collision with root package name */
    public AnimatorSet f56973n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f56974o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56960a = v32.c.NONE;
        this.f56961b = true;
        List list = b21.b.f21287a;
        this.f56963d = new ArrayList(list.size());
        this.f56964e = new ArrayList(list.size());
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.pin_reaction_context_menu_icon_padding);
        int dimensionPixelOffset = (dimensionPixelSize * 2) + getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_width_applied_padding);
        this.f56965f = dimensionPixelOffset;
        this.f56966g = getResources().getDimensionPixelOffset(r0.pin_reaction_context_menu_height);
        int size = dimensionPixelOffset / list.size();
        this.f56967h = size;
        int i13 = (int) (dimensionPixelSize * 3.0f);
        this.f56968i = i13;
        float f13 = size;
        this.f56969j = (int) (3.0f * f13);
        float f14 = f13 * (-1.3333334f);
        this.f56970k = f14;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        int i14 = eo1.d.pin_reactions_text_background;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i14);
        if (drawable != null) {
            gestaltText.setBackground(drawable);
        }
        gestaltText.setAlpha(0.0f);
        gestaltText.setMaxLines(1);
        gestaltText.setSingleLine();
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize2, gestaltText.getPaddingEnd(), dimensionPixelSize2);
        int dimensionPixelSize3 = gestaltText.getResources().getDimensionPixelSize(r0.margin_three_quarter);
        gestaltText.setPaddingRelative(dimensionPixelSize3, gestaltText.getPaddingTop(), dimensionPixelSize3, gestaltText.getPaddingBottom());
        this.f56974o = gestaltText;
        int i15 = 0;
        setClipChildren(false);
        setClipToPadding(false);
        addView(gestaltText, new FrameLayout.LayoutParams(-2, -2, 16));
        float f15 = f14 - i13;
        int i16 = 0;
        for (Object obj2 : com.bumptech.glide.c.w0(this) ? CollectionsKt.q0(list) : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                f0.p();
                throw null;
            }
            b21.a aVar = (b21.a) obj2;
            this.f56963d.add(new Rect());
            GestaltText gestaltText2 = this.f56974o;
            gestaltText2.i(new h(aVar, i15));
            gestaltText2.measure(0, 0);
            this.f56964e.add(Integer.valueOf(gestaltText2.getMeasuredWidth()));
            View fVar = new f(context, f15, aVar);
            fVar.setTag(aVar);
            int i18 = this.f56968i;
            fVar.setPadding(i18, i18, i18, i18);
            int i19 = this.f56969j;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i19, i19, 16);
            int i23 = (int) ((i16 * this.f56967h) + this.f56970k);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i24 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i25 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            layoutParams.setMargins(i23, i24, i25, marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            Unit unit = Unit.f80348a;
            addView(fVar, layoutParams);
            i16 = i17;
        }
        float measuredHeight = this.f56970k - this.f56974o.getMeasuredHeight();
        this.f56972m = measuredHeight;
        this.f56971l = measuredHeight + f15 + this.f56968i;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f56965f, this.f56966g);
        layoutParams5.gravity = 1;
        setLayoutParams(layoutParams5);
    }
}
