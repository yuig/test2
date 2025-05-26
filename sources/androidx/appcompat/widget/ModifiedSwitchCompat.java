package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.WeakHashMap;

@SuppressLint({"ObsoleteSdkInt", "RestrictedApi"})
/* loaded from: classes2.dex */
public class ModifiedSwitchCompat extends CompoundButton {
    public static final int[] G = {R.attr.state_checked};
    public StaticLayout A;
    public StaticLayout B;
    public final l.a C;
    public z1 D;
    public final Rect E;
    public final y F;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f16398a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f16399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16401d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16402e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16403f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f16404g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f16405h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16406i;

    /* renamed from: j, reason: collision with root package name */
    public int f16407j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16408k;

    /* renamed from: l, reason: collision with root package name */
    public float f16409l;

    /* renamed from: m, reason: collision with root package name */
    public float f16410m;

    /* renamed from: n, reason: collision with root package name */
    public final VelocityTracker f16411n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16412o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16413p;

    /* renamed from: q, reason: collision with root package name */
    public float f16414q;

    /* renamed from: r, reason: collision with root package name */
    public int f16415r;

    /* renamed from: s, reason: collision with root package name */
    public int f16416s;

    /* renamed from: t, reason: collision with root package name */
    public int f16417t;

    /* renamed from: u, reason: collision with root package name */
    public int f16418u;

    /* renamed from: v, reason: collision with root package name */
    public int f16419v;

    /* renamed from: w, reason: collision with root package name */
    public int f16420w;

    /* renamed from: x, reason: collision with root package name */
    public int f16421x;

    /* renamed from: y, reason: collision with root package name */
    public final TextPaint f16422y;

    /* renamed from: z, reason: collision with root package name */
    public final ColorStateList f16423z;

    public ModifiedSwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.switchStyle);
    }

    public final int a() {
        return this.f16413p ? getResources().getDimensionPixelSize(eo1.c.space_500) / 2 : getResources().getDimensionPixelSize(eo1.c.space_200);
    }

    public final int b() {
        return getResources().getDimensionPixelSize(eo1.c.space_400);
    }

    public final int c() {
        return (int) (((f() ? 1.0f - this.f16414q : this.f16414q) * e()) + 0.5f);
    }

    public final int d() {
        return getResources().getDimensionPixelSize(eo1.c.space_500);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i13 = this.f16418u;
        int i14 = this.f16419v;
        int i15 = this.f16420w;
        int i16 = this.f16421x;
        int c13 = c() + i13;
        Drawable drawable = this.f16398a;
        Rect c14 = drawable != null ? c1.c(drawable) : c1.f16529c;
        Drawable drawable2 = this.f16399b;
        if (drawable2 != null) {
            Rect rect = this.E;
            drawable2.getPadding(rect);
            c13 += rect.left;
            int intrinsicWidth = this.f16399b.getIntrinsicWidth();
            int intrinsicHeight = this.f16399b.getIntrinsicHeight();
            int i17 = (this.f16415r - intrinsicWidth) / 2;
            int i18 = (this.f16416s - intrinsicHeight) / 2;
            int i19 = i13 + i17;
            int i23 = i14 + i18;
            int i24 = i15 - i17;
            int i25 = i16 - i18;
            if (c14 != null) {
                int i26 = c14.left;
                int i27 = rect.left;
                if (i26 > i27) {
                    i19 += i26 - i27;
                }
                int i28 = c14.top;
                int i29 = rect.top;
                if (i28 > i29) {
                    i23 += i28 - i29;
                }
                int i33 = c14.right;
                int i34 = rect.right;
                if (i33 > i34) {
                    i24 -= i33 - i34;
                }
                int i35 = c14.bottom;
                int i36 = rect.bottom;
                if (i35 > i36) {
                    i25 -= i35 - i36;
                }
            }
            this.f16399b.setBounds(i19, i23, i24, i25);
        }
        if (this.f16398a != null) {
            if (this.f16413p) {
                c13 += a();
            }
            int i37 = this.f16417t + c13;
            if (this.f16413p) {
                if (isChecked()) {
                    int d2 = ((i16 - i14) / 2) - (d() / 2);
                    i14 += d2;
                    i16 -= d2;
                } else {
                    int b13 = ((i16 - i14) / 2) - (b() / 2);
                    i14 += b13;
                    i16 -= b13;
                    c13 -= getResources().getDimensionPixelSize(eo1.c.space_100) / 2;
                    i37 -= getResources().getDimensionPixelSize(eo1.c.space_100) / 2;
                }
            }
            this.f16398a.setBounds(c13, i14, i37, i16);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(c13, i14, i37, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f16398a;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
        Drawable drawable2 = this.f16399b;
        if (drawable2 != null) {
            drawable2.setHotspot(f13, f14);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16398a;
        if (drawable != null) {
            drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f16399b;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
        }
        invalidate();
    }

    public final int e() {
        int a13;
        int a14;
        Drawable drawable = this.f16399b;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.E;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f16398a;
        Rect c13 = drawable2 != null ? c1.c(drawable2) : c1.f16529c;
        if (!this.f16413p) {
            return ((((this.f16415r - this.f16417t) - rect.left) - rect.right) - c13.left) - c13.right;
        }
        if (isChecked()) {
            this.f16417t = d();
        } else {
            this.f16417t = b();
        }
        if (isChecked()) {
            a13 = (this.f16415r - (getResources().getDimensionPixelSize(eo1.c.space_300) / 2)) - this.f16417t;
            a14 = a();
        } else {
            a13 = (this.f16415r - a()) - this.f16417t;
            a14 = a();
        }
        return a13 - a14;
    }

    public final boolean f() {
        boolean z13 = l3.f16639a;
        return getLayoutDirection() == 1;
    }

    public final StaticLayout g(CharSequence charSequence) {
        l.a aVar = this.C;
        if (aVar != null) {
            charSequence = aVar.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f16422y, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!f()) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f16415r;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f16402e : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (f()) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f16415r;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f16402e : compoundPaddingRight;
    }

    public final void h(float f13) {
        this.f16414q = f13;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16398a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f16399b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        if (this.D != null) {
            clearAnimation();
            this.D = null;
        }
        h(isChecked() ? 1.0f : 0.0f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f16399b;
        Rect rect = this.E;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i13 = this.f16419v;
        int i14 = this.f16421x;
        int i15 = i13 + rect.top;
        int i16 = i14 - rect.bottom;
        Drawable drawable2 = this.f16398a;
        if (drawable != null) {
            if (!this.f16403f || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c13 = c1.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c13.left;
                rect.right -= c13.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = this.f16414q > 0.5f ? this.A : this.B;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f16423z;
            TextPaint textPaint = this.f16422y;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i15 + i16) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f16404g : this.f16405h;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(text);
        sb3.append(' ');
        sb3.append(charSequence);
        accessibilityNodeInfo.setText(sb3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int width;
        int i18;
        int i19;
        int i23;
        super.onLayout(z13, i13, i14, i15, i16);
        Drawable drawable = this.f16398a;
        Rect rect = this.E;
        int i24 = 0;
        if (drawable != null) {
            Drawable drawable2 = this.f16399b;
            if (drawable2 != null) {
                drawable2.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c13 = c1.c(this.f16398a);
            i17 = Math.max(0, c13.left - rect.left);
            i24 = Math.max(0, c13.right - rect.right);
        } else {
            i17 = 0;
        }
        if (f()) {
            i18 = getPaddingStart() + i17;
            width = ((this.f16415r + i18) - i17) - i24;
        } else {
            width = (getWidth() - getPaddingEnd()) - i24;
            i18 = (width - this.f16415r) + i17 + i24;
        }
        int gravity = getGravity() & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i25 = this.f16416s;
            int i26 = height - (i25 / 2);
            i19 = i25 + i26;
            i23 = i26;
        } else if (gravity != 80) {
            i23 = getPaddingTop();
            i19 = this.f16416s + i23;
        } else {
            i19 = getHeight() - getPaddingBottom();
            i23 = i19 - this.f16416s;
        }
        this.f16418u = i18;
        this.f16419v = i23;
        this.f16421x = i19;
        this.f16420w = width;
        if (this.f16413p) {
            int c14 = c() + i18;
            if (this.f16398a != null) {
                if (this.f16413p) {
                    if (isChecked()) {
                        int d2 = ((i19 - i23) / 2) - (d() / 2);
                        i23 += d2;
                        i19 -= d2;
                    } else {
                        int b13 = ((i19 - i23) / 2) - (b() / 2);
                        i23 += b13;
                        i19 -= b13;
                        c14 -= getResources().getDimensionPixelSize(eo1.c.space_100) / 2;
                    }
                    c14 += a();
                }
                this.f16398a.getPadding(rect);
                this.f16398a.setBounds(c14 - rect.left, i23, c14 + this.f16417t + rect.right, i19);
                invalidate();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        if (this.f16406i) {
            if (this.A == null) {
                this.A = g(this.f16404g);
            }
            if (this.B == null) {
                this.B = g(this.f16405h);
            }
        }
        Drawable drawable = this.f16398a;
        int i18 = 0;
        Rect rect = this.E;
        if (drawable != null) {
            drawable.getPadding(rect);
            i15 = (this.f16398a.getIntrinsicWidth() - rect.left) - rect.right;
            i16 = this.f16398a.getIntrinsicHeight();
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (this.f16406i) {
            i17 = (this.f16400c * 2) + Math.max(this.A.getWidth(), this.B.getWidth());
        } else {
            i17 = 0;
        }
        this.f16417t = Math.max(i17, i15);
        Drawable drawable2 = this.f16399b;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i18 = this.f16399b.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i19 = rect.left;
        int i23 = rect.right;
        Drawable drawable3 = this.f16398a;
        if (drawable3 != null) {
            Rect c13 = c1.c(drawable3);
            i19 = Math.max(i19, c13.left);
            i23 = Math.max(i23, c13.right);
        }
        int max = Math.max(this.f16401d, (this.f16417t * 2) + i19 + i23);
        int max2 = Math.max(i18, i16);
        this.f16415r = max;
        this.f16416s = max2;
        super.onMeasure(i13, i14);
        if (getMeasuredHeight() < max2) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f16404g : this.f16405h;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L84;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ModifiedSwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z13) {
        super.setChecked(z13);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = q5.v0.f102521a;
            if (isLaidOut() && isShown()) {
                z1 z1Var = this.D;
                if (z1Var != null && z1Var != null) {
                    clearAnimation();
                    this.D = null;
                }
                z1 z1Var2 = new z1(this, this.f16414q, isChecked ? 1.0f : 0.0f);
                this.D = z1Var2;
                z1Var2.setDuration(this.f16413p ? 300L : 250L);
                if (this.f16413p) {
                    this.D.setInterpolator(pl1.a.f100561c);
                }
                this.D.setAnimationListener(new y1(this, isChecked));
                startAnimation(this.D);
                return;
            }
        }
        if (this.D != null) {
            clearAnimation();
            this.D = null;
        }
        h(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16398a || drawable == this.f16399b;
    }

    public ModifiedSwitchCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16411n = VelocityTracker.obtain();
        this.f16413p = false;
        this.E = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f16422y = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        x92.b N = x92.b.N(context, attributeSet, i.j.SwitchCompat, i13, 0);
        Drawable x13 = N.x(i.j.SwitchCompat_android_thumb);
        this.f16398a = x13;
        if (x13 != null) {
            x13.setCallback(this);
        }
        Drawable x14 = N.x(i.j.SwitchCompat_track);
        this.f16399b = x14;
        if (x14 != null) {
            x14.setCallback(this);
        }
        this.f16404g = N.E(i.j.SwitchCompat_android_textOn);
        this.f16405h = N.E(i.j.SwitchCompat_android_textOff);
        this.f16406i = N.t(i.j.SwitchCompat_showText, true);
        this.f16400c = N.w(i.j.SwitchCompat_thumbTextPadding, 0);
        this.f16401d = N.w(i.j.SwitchCompat_switchMinWidth, 0);
        this.f16402e = N.w(i.j.SwitchCompat_switchPadding, 0);
        this.f16403f = N.t(i.j.SwitchCompat_splitTrack, false);
        int C = N.C(i.j.SwitchCompat_switchTextAppearance, 0);
        if (C != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C, i.j.TextAppearance);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(i.j.TextAppearance_android_textColor);
            if (colorStateList != null) {
                this.f16423z = colorStateList;
            } else {
                this.f16423z = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i.j.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f13 = dimensionPixelSize;
                if (f13 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f13);
                    requestLayout();
                }
            }
            int i14 = obtainStyledAttributes.getInt(i.j.TextAppearance_android_typeface, -1);
            int i15 = obtainStyledAttributes.getInt(i.j.TextAppearance_android_textStyle, -1);
            Typeface typeface = i14 != 1 ? i14 != 2 ? i14 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i15 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i15) : Typeface.create(typeface, i15);
                TextPaint textPaint2 = this.f16422y;
                if (textPaint2.getTypeface() != defaultFromStyle) {
                    textPaint2.setTypeface(defaultFromStyle);
                    requestLayout();
                    invalidate();
                }
                int i16 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i15;
                textPaint.setFakeBoldText((i16 & 1) != 0);
                textPaint.setTextSkewX((i16 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                TextPaint textPaint3 = this.f16422y;
                if (textPaint3.getTypeface() != typeface) {
                    textPaint3.setTypeface(typeface);
                    requestLayout();
                    invalidate();
                }
            }
            if (obtainStyledAttributes.getBoolean(i.j.TextAppearance_textAllCaps, false)) {
                this.C = new l.a(getContext());
            } else {
                this.C = null;
            }
            obtainStyledAttributes.recycle();
        }
        this.F = y.a();
        N.O();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16408k = viewConfiguration.getScaledTouchSlop();
        this.f16412o = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
