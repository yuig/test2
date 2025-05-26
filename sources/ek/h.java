package ek;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i3;
import androidx.recyclerview.widget.y1;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import lb.l0;
import q5.o0;
import q5.v0;

/* loaded from: classes.dex */
public final class h extends LinearLayout {

    /* renamed from: a */
    public e f59138a;

    /* renamed from: b */
    public TextView f59139b;

    /* renamed from: c */
    public ImageView f59140c;

    /* renamed from: d */
    public View f59141d;

    /* renamed from: e */
    public TextView f59142e;

    /* renamed from: f */
    public ImageView f59143f;

    /* renamed from: g */
    public Drawable f59144g;

    /* renamed from: h */
    public int f59145h;

    /* renamed from: i */
    public final /* synthetic */ TabLayout f59146i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, TabLayout tabLayout) {
        super(context);
        this.f59146i = tabLayout;
        this.f59145h = 2;
        d(context);
        int i13 = tabLayout.f33129e;
        WeakHashMap weakHashMap = v0.f102521a;
        setPaddingRelative(i13, tabLayout.f33130f, tabLayout.f33131g, tabLayout.f33132h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        o0.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    public static float b(Layout layout, float f13) {
        return (f13 / layout.getPaint().getTextSize()) * layout.getLineWidth(0);
    }

    public final void c() {
        boolean z13;
        e();
        e eVar = this.f59138a;
        if (eVar != null) {
            TabLayout tabLayout = eVar.f59130g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int m13 = tabLayout.m();
            if (m13 != -1 && m13 == eVar.f59128e) {
                z13 = true;
                setSelected(z13);
            }
        }
        z13 = false;
        setSelected(z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, ek.h] */
    public final void d(Context context) {
        TabLayout tabLayout = this.f59146i;
        int i13 = tabLayout.f33144t;
        if (i13 != 0) {
            Drawable I = com.bumptech.glide.c.I(context, i13);
            this.f59144g = I;
            if (I != null && I.isStateful()) {
                this.f59144g.setState(getDrawableState());
            }
        } else {
            this.f59144g = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f33138n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a13 = zj.a.a(tabLayout.f33138n);
            boolean z13 = tabLayout.G;
            if (z13) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(a13, gradientDrawable, z13 ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = v0.f102521a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f59144g;
        if (drawable != null && drawable.isStateful() && this.f59144g.setState(drawableState)) {
            invalidate();
            this.f59146i.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.h.e():void");
    }

    public final void f(TextView textView, ImageView imageView, boolean z13) {
        Drawable drawable;
        e eVar = this.f59138a;
        Drawable mutate = (eVar == null || (drawable = eVar.f59125b) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.f59146i;
        if (mutate != null) {
            mutate.setTintList(tabLayout.f33137m);
            PorterDuff.Mode mode = tabLayout.f33141q;
            if (mode != null) {
                mutate.setTintMode(mode);
            }
        }
        e eVar2 = this.f59138a;
        CharSequence charSequence = eVar2 != null ? eVar2.f59126c : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z14 = true;
        boolean z15 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z15) {
                this.f59138a.getClass();
            } else {
                z14 = false;
            }
            textView.setText(z15 ? charSequence : null);
            textView.setVisibility(z14 ? 0 : 8);
            if (z15) {
                setVisibility(0);
            }
        } else {
            z14 = false;
        }
        if (z13 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int X = (z14 && imageView.getVisibility() == 0) ? (int) l0.X(getContext(), 8) : 0;
            if (tabLayout.D) {
                if (X != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(X);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (X != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = X;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        e eVar3 = this.f59138a;
        CharSequence charSequence2 = eVar3 != null ? eVar3.f59127d : null;
        if (!z15) {
            charSequence = charSequence2;
        }
        i3.a(this, charSequence);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) y1.j(0, 1, this.f59138a.f59128e, 1, false, isSelected()).f19715a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) r5.d.f106213g.f106227a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(fj.k.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        TabLayout tabLayout = this.f59146i;
        int i15 = tabLayout.f33145u;
        if (i15 > 0 && (mode == 0 || size > i15)) {
            i13 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
        if (this.f59139b != null) {
            float f13 = tabLayout.f33142r;
            int i16 = this.f59145h;
            ImageView imageView = this.f59140c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f59139b;
                if (textView != null && textView.getLineCount() > 1) {
                    f13 = tabLayout.f33143s;
                }
            } else {
                i16 = 1;
            }
            float textSize = this.f59139b.getTextSize();
            int lineCount = this.f59139b.getLineCount();
            int maxLines = this.f59139b.getMaxLines();
            if (f13 != textSize || (maxLines >= 0 && i16 != maxLines)) {
                if (tabLayout.C != 1 || f13 <= textSize || lineCount != 1 || ((layout = this.f59139b.getLayout()) != null && b(layout, f13) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.f59139b.setTextSize(0, f13);
                    this.f59139b.setMaxLines(i16);
                    super.onMeasure(i13, i14);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f59138a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f59138a.b();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        isSelected();
        super.setSelected(z13);
        TextView textView = this.f59139b;
        if (textView != null) {
            textView.setSelected(z13);
        }
        ImageView imageView = this.f59140c;
        if (imageView != null) {
            imageView.setSelected(z13);
        }
        View view = this.f59141d;
        if (view != null) {
            view.setSelected(z13);
        }
    }
}
