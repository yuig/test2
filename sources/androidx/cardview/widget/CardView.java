package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import e1.a;
import e1.c;
import e1.d;
import gi2.b;
import sp2.i;

/* loaded from: classes2.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f17051f = {R.attr.colorBackground};

    /* renamed from: g */
    public static final b f17052g = new b();

    /* renamed from: a */
    public final boolean f17053a;

    /* renamed from: b */
    public final boolean f17054b;

    /* renamed from: c */
    public final Rect f17055c;

    /* renamed from: d */
    public final Rect f17056d;

    /* renamed from: e */
    public final i f17057e;

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.cardViewStyle);
    }

    public void k(int i13) {
        i iVar = this.f17057e;
        ColorStateList valueOf = ColorStateList.valueOf(i13);
        f1.a g03 = b.g0(iVar);
        if (valueOf == null) {
            g03.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        g03.f60766h = valueOf;
        g03.f60760b.setColor(valueOf.getColorForState(g03.getState(), g03.f60766h.getDefaultColor()));
        g03.invalidateSelf();
    }

    public void l(float f13) {
        ((CardView) this.f17057e.f114929c).setElevation(f13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
    }

    public void s(int i13, int i14, int i15, int i16) {
        this.f17055c.set(i13, i14, i15, i16);
        f17052g.r0(this.f17057e);
    }

    @Override // android.view.View
    public final void setMinimumHeight(int i13) {
        super.setMinimumHeight(i13);
    }

    @Override // android.view.View
    public final void setMinimumWidth(int i13) {
        super.setMinimumWidth(i13);
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
    }

    public void t(float f13) {
        f1.a g03 = b.g0(this.f17057e);
        if (f13 == g03.f60759a) {
            return;
        }
        g03.f60759a = f13;
        g03.b(null);
        g03.invalidateSelf();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f17055c = rect;
        this.f17056d = new Rect();
        i iVar = new i(this);
        this.f17057e = iVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.CardView, i13, c.CardView);
        if (obtainStyledAttributes.hasValue(d.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(d.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f17051f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(e1.b.cardview_light_background) : getResources().getColor(e1.b.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(d.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(d.CardView_cardMaxElevation, 0.0f);
        this.f17053a = obtainStyledAttributes.getBoolean(d.CardView_cardUseCompatPadding, false);
        this.f17054b = obtainStyledAttributes.getBoolean(d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minWidth, 0);
        obtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        b bVar = f17052g;
        f1.a aVar = new f1.a(dimension, valueOf);
        iVar.f114928b = aVar;
        ((CardView) iVar.f114929c).setBackgroundDrawable(aVar);
        CardView cardView = (CardView) iVar.f114929c;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        f1.a aVar2 = (f1.a) ((Drawable) iVar.f114928b);
        Object obj = iVar.f114929c;
        boolean z13 = ((CardView) obj).f17053a;
        boolean z14 = ((CardView) obj).f17054b;
        if (dimension3 != aVar2.f60763e || aVar2.f60764f != z13 || aVar2.f60765g != z14) {
            aVar2.f60763e = dimension3;
            aVar2.f60764f = z13;
            aVar2.f60765g = z14;
            aVar2.b(null);
            aVar2.invalidateSelf();
        }
        bVar.r0(iVar);
    }
}
