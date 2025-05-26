package qp0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
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
import pk.a0;

/* loaded from: classes5.dex */
public final class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public v32.c f104723a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f104724b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f104725c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f104726d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f104727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f104728f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104729g;

    /* renamed from: h, reason: collision with root package name */
    public final int f104730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f104731i;

    /* renamed from: j, reason: collision with root package name */
    public final int f104732j;

    /* renamed from: k, reason: collision with root package name */
    public final float f104733k;

    /* renamed from: l, reason: collision with root package name */
    public final float f104734l;

    /* renamed from: m, reason: collision with root package name */
    public AnimatorSet f104735m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f104736n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f104737o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104723a = v32.c.NONE;
        this.f104724b = true;
        List list = pp0.b.f100910a;
        this.f104726d = new ArrayList(list.size());
        this.f104727e = new ArrayList(list.size());
        int dimensionPixelSize = getResources().getDimensionPixelSize(cb0.a.comment_reaction_context_menu_icon_padding);
        this.f104728f = dimensionPixelSize;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_width);
        this.f104729g = dimensionPixelOffset;
        this.f104730h = getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_height);
        this.f104731i = (dimensionPixelOffset / list.size()) - dimensionPixelSize;
        this.f104732j = -getResources().getDimensionPixelOffset(cb0.a.comment_reaction_context_menu_icon_margin);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(c.f104720j);
        dl2.b.y2(gestaltText);
        int dimensionPixelSize2 = gestaltText.getResources().getDimensionPixelSize(r0.margin_quarter);
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), dimensionPixelSize2, gestaltText.getPaddingEnd(), dimensionPixelSize2);
        int dimensionPixelSize3 = gestaltText.getResources().getDimensionPixelSize(r0.margin_three_quarter);
        gestaltText.setPaddingRelative(dimensionPixelSize3, gestaltText.getPaddingTop(), dimensionPixelSize3, gestaltText.getPaddingBottom());
        this.f104736n = gestaltText;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(eo1.d.pin_reactions_text_background);
        frameLayout.addView(gestaltText, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.setAlpha(0.0f);
        this.f104737o = frameLayout;
        setClipChildren(false);
        setClipToPadding(false);
        addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 16));
        float f13 = ((-r3) - dimensionPixelSize) * 0.5f;
        int i13 = 0;
        for (Object obj : com.bumptech.glide.c.w0(this) ? CollectionsKt.q0(list) : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            pp0.a aVar = (pp0.a) obj;
            this.f104726d.add(new Rect());
            a0.o(this.f104736n, aVar.f100908b, new Object[0]);
            FrameLayout frameLayout2 = this.f104737o;
            frameLayout2.measure(0, 0);
            this.f104727e.add(Integer.valueOf(frameLayout2.getMeasuredWidth()));
            View fVar = new f(context, f13, aVar);
            fVar.setTag(aVar);
            int i15 = this.f104728f;
            fVar.setPadding(i15, i15, i15, i15);
            int i16 = this.f104731i;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i16, i16, 16);
            int i17 = (i13 * this.f104731i) + this.f104732j;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i18 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i19 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            layoutParams.setMargins(i17, i18, i19, marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
            Unit unit = Unit.f80348a;
            addView(fVar, layoutParams);
            i13 = i14;
        }
        float f14 = -this.f104731i;
        this.f104734l = f14;
        this.f104733k = f14 + f13 + this.f104728f;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f104729g, this.f104730h);
        layoutParams5.gravity = 1;
        setLayoutParams(layoutParams5);
    }
}
