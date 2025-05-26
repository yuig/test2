package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {
    public static final v2 R = new v2(0, Float.class, "thumbPos");
    public static final int[] S = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f16441J;
    public StaticLayout K;
    public StaticLayout L;
    public final l.a M;
    public ObjectAnimator N;
    public AppCompatEmojiTextHelper O;
    public w2 P;
    public final Rect Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f16442a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f16443b;

    /* renamed from: c, reason: collision with root package name */
    public final PorterDuff.Mode f16444c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16445d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16446e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16447f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f16448g;

    /* renamed from: h, reason: collision with root package name */
    public final PorterDuff.Mode f16449h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16450i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16451j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16452k;

    /* renamed from: l, reason: collision with root package name */
    public int f16453l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16454m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f16455n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f16456o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f16457p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f16458q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f16459r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f16460s;

    /* renamed from: t, reason: collision with root package name */
    public int f16461t;

    /* renamed from: u, reason: collision with root package name */
    public final int f16462u;

    /* renamed from: v, reason: collision with root package name */
    public float f16463v;

    /* renamed from: w, reason: collision with root package name */
    public float f16464w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f16465x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16466y;

    /* renamed from: z, reason: collision with root package name */
    public float f16467z;

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.switchStyle);
    }

    public final void a() {
        Drawable drawable = this.f16442a;
        if (drawable != null) {
            boolean z13 = this.f16445d;
            boolean z14 = this.f16446e;
            if (z13 || z14) {
                Drawable mutate = drawable.mutate();
                this.f16442a = mutate;
                if (this.f16445d) {
                    mutate.setTintList(this.f16443b);
                }
                if (z14) {
                    this.f16442a.setTintMode(this.f16444c);
                }
                if (this.f16442a.isStateful()) {
                    this.f16442a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f16447f;
        if (drawable != null) {
            boolean z13 = this.f16450i;
            boolean z14 = this.f16451j;
            if (z13 || z14) {
                Drawable mutate = drawable.mutate();
                this.f16447f = mutate;
                if (this.f16450i) {
                    mutate.setTintList(this.f16448g);
                }
                if (z14) {
                    this.f16447f.setTintMode(this.f16449h);
                }
                if (this.f16447f.isStateful()) {
                    this.f16447f.setState(getDrawableState());
                }
            }
        }
    }

    public final AppCompatEmojiTextHelper c() {
        if (this.O == null) {
            this.O = new AppCompatEmojiTextHelper(this);
        }
        return this.O;
    }

    public final int d() {
        boolean z13 = l3.f16639a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f16467z : this.f16467z) * e()) + 0.5f);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i13;
        int i14;
        int i15 = this.D;
        int i16 = this.E;
        int i17 = this.F;
        int i18 = this.G;
        int d2 = d() + i15;
        Drawable drawable = this.f16442a;
        Rect c13 = drawable != null ? c1.c(drawable) : c1.f16529c;
        Drawable drawable2 = this.f16447f;
        Rect rect = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i19 = rect.left;
            d2 += i19;
            if (c13 != null) {
                int i23 = c13.left;
                if (i23 > i19) {
                    i15 += i23 - i19;
                }
                int i24 = c13.top;
                int i25 = rect.top;
                i13 = i24 > i25 ? (i24 - i25) + i16 : i16;
                int i26 = c13.right;
                int i27 = rect.right;
                if (i26 > i27) {
                    i17 -= i26 - i27;
                }
                int i28 = c13.bottom;
                int i29 = rect.bottom;
                if (i28 > i29) {
                    i14 = i18 - (i28 - i29);
                    this.f16447f.setBounds(i15, i13, i17, i14);
                }
            } else {
                i13 = i16;
            }
            i14 = i18;
            this.f16447f.setBounds(i15, i13, i17, i14);
        }
        Drawable drawable3 = this.f16442a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i33 = d2 - rect.left;
            int i34 = d2 + this.C + rect.right;
            this.f16442a.setBounds(i33, i16, i34, i18);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i33, i16, i34, i18);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f16442a;
        if (drawable != null) {
            drawable.setHotspot(f13, f14);
        }
        Drawable drawable2 = this.f16447f;
        if (drawable2 != null) {
            drawable2.setHotspot(f13, f14);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16442a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f16447f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final int e() {
        Drawable drawable = this.f16447f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f16442a;
        Rect c13 = drawable2 != null ? c1.c(drawable2) : c1.f16529c;
        return ((((this.A - this.C) - rect.left) - rect.right) - c13.left) - c13.right;
    }

    public final void f(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void g(CharSequence charSequence) {
        this.f16458q = charSequence;
        AppCompatEmojiTextHelper c13 = c();
        TransformationMethod n13 = ((e3.b) c13.f16304b.f66449b).n(this.M);
        if (n13 != null) {
            charSequence = n13.getTransformation(charSequence, this);
        }
        this.f16459r = charSequence;
        this.L = null;
        if (this.f16460s) {
            i();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        boolean z13 = l3.f16639a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f16454m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        boolean z13 = l3.f16639a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f16454m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.i(super.getCustomSelectionActionModeCallback());
    }

    public final void h(CharSequence charSequence) {
        this.f16456o = charSequence;
        AppCompatEmojiTextHelper c13 = c();
        TransformationMethod n13 = ((e3.b) c13.f16304b.f66449b).n(this.M);
        if (n13 != null) {
            charSequence = n13.getTransformation(charSequence, this);
        }
        this.f16457p = charSequence;
        this.K = null;
        if (this.f16460s) {
            i();
        }
    }

    public final void i() {
        if (this.P == null && ((e3.b) this.O.f16304b.f66449b).f() && h6.m.c()) {
            h6.m a13 = h6.m.a();
            int b13 = a13.b();
            if (b13 == 3 || b13 == 0) {
                w2 w2Var = new w2(this);
                this.P = w2Var;
                a13.h(w2Var);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16442a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f16447f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f16447f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i13 = this.E;
        int i14 = this.G;
        int i15 = i13 + rect.top;
        int i16 = i14 - rect.bottom;
        Drawable drawable2 = this.f16442a;
        if (drawable != null) {
            if (!this.f16455n || drawable2 == null) {
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
        StaticLayout staticLayout = this.f16467z > 0.5f ? this.K : this.L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f16441J;
            TextPaint textPaint = this.I;
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
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f16456o : this.f16458q;
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
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int width;
        int i18;
        int i19;
        int i23;
        super.onLayout(z13, i13, i14, i15, i16);
        int i24 = 0;
        if (this.f16442a != null) {
            Drawable drawable = this.f16447f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c13 = c1.c(this.f16442a);
            i17 = Math.max(0, c13.left - rect.left);
            i24 = Math.max(0, c13.right - rect.right);
        } else {
            i17 = 0;
        }
        boolean z14 = l3.f16639a;
        if (getLayoutDirection() == 1) {
            i18 = getPaddingLeft() + i17;
            width = ((this.A + i18) - i17) - i24;
        } else {
            width = (getWidth() - getPaddingRight()) - i24;
            i18 = (width - this.A) + i17 + i24;
        }
        int gravity = getGravity() & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i25 = this.B;
            int i26 = height - (i25 / 2);
            i19 = i25 + i26;
            i23 = i26;
        } else if (gravity != 80) {
            i23 = getPaddingTop();
            i19 = this.B + i23;
        } else {
            i19 = getHeight() - getPaddingBottom();
            i23 = i19 - this.B;
        }
        this.D = i18;
        this.E = i23;
        this.G = i19;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        boolean z13 = this.f16460s;
        int i17 = 0;
        if (z13) {
            StaticLayout staticLayout = this.K;
            TextPaint textPaint = this.I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f16457p;
                this.K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.L == null) {
                CharSequence charSequence2 = this.f16459r;
                this.L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f16442a;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i15 = (this.f16442a.getIntrinsicWidth() - rect.left) - rect.right;
            i16 = this.f16442a.getIntrinsicHeight();
        } else {
            i15 = 0;
            i16 = 0;
        }
        this.C = Math.max(z13 ? (this.f16452k * 2) + Math.max(this.K.getWidth(), this.L.getWidth()) : 0, i15);
        Drawable drawable2 = this.f16447f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i17 = this.f16447f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i18 = rect.left;
        int i19 = rect.right;
        Drawable drawable3 = this.f16442a;
        if (drawable3 != null) {
            Rect c13 = c1.c(drawable3);
            i18 = Math.max(i18, c13.left);
            i19 = Math.max(i19, c13.right);
        }
        int max = this.H ? Math.max(this.f16453l, (this.C * 2) + i18 + i19) : this.f16453l;
        int max2 = Math.max(i17, i16);
        this.A = max;
        this.B = max2;
        super.onMeasure(i13, i14);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f16456o : this.f16458q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r9.f16467z > 0.5f) goto L56;
     */
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
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        c().c(z13);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z13) {
        super.setChecked(z13);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f16456o;
                if (obj == null) {
                    obj = getResources().getString(i.h.abc_capital_on);
                }
                WeakHashMap weakHashMap = q5.v0.f102521a;
                new q5.h0(b5.c.tag_state_description, 64, 30, 2).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f16458q;
            if (obj2 == null) {
                obj2 = getResources().getString(i.h.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = q5.v0.f102521a;
            new q5.h0(b5.c.tag_state_description, 64, 30, 2).g(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.f16467z = isChecked ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, isChecked ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.j(callback, this));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().a(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16442a || drawable == this.f16447f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int resourceId;
        this.f16443b = null;
        this.f16444c = null;
        this.f16445d = false;
        this.f16446e = false;
        this.f16448g = null;
        this.f16449h = null;
        this.f16450i = false;
        this.f16451j = false;
        this.f16465x = VelocityTracker.obtain();
        this.H = true;
        this.Q = new Rect();
        x2.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        x92.b N = x92.b.N(context, attributeSet, i.j.SwitchCompat, i13, 0);
        q5.v0.n(this, context, i.j.SwitchCompat, attributeSet, (TypedArray) N.f134366c, i13, 0);
        Drawable x13 = N.x(i.j.SwitchCompat_android_thumb);
        this.f16442a = x13;
        if (x13 != null) {
            x13.setCallback(this);
        }
        Drawable x14 = N.x(i.j.SwitchCompat_track);
        this.f16447f = x14;
        if (x14 != null) {
            x14.setCallback(this);
        }
        h(N.E(i.j.SwitchCompat_android_textOn));
        g(N.E(i.j.SwitchCompat_android_textOff));
        this.f16460s = N.t(i.j.SwitchCompat_showText, true);
        this.f16452k = N.w(i.j.SwitchCompat_thumbTextPadding, 0);
        this.f16453l = N.w(i.j.SwitchCompat_switchMinWidth, 0);
        this.f16454m = N.w(i.j.SwitchCompat_switchPadding, 0);
        this.f16455n = N.t(i.j.SwitchCompat_splitTrack, false);
        ColorStateList u13 = N.u(i.j.SwitchCompat_thumbTint);
        if (u13 != null) {
            this.f16443b = u13;
            this.f16445d = true;
        }
        PorterDuff.Mode d2 = c1.d(N.B(i.j.SwitchCompat_thumbTintMode, -1), null);
        if (d2 != null) {
            this.f16444c = d2;
            this.f16446e = true;
        }
        if (this.f16445d || this.f16446e) {
            a();
        }
        ColorStateList u14 = N.u(i.j.SwitchCompat_trackTint);
        if (u14 != null) {
            this.f16448g = u14;
            this.f16450i = true;
        }
        PorterDuff.Mode d13 = c1.d(N.B(i.j.SwitchCompat_trackTintMode, -1), null);
        if (d13 != null) {
            this.f16449h = d13;
            this.f16451j = true;
        }
        if (this.f16450i || this.f16451j) {
            b();
        }
        int C = N.C(i.j.SwitchCompat_switchTextAppearance, 0);
        if (C != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C, i.j.TextAppearance);
            int i14 = i.j.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(i14) || (resourceId = obtainStyledAttributes.getResourceId(i14, 0)) == 0 || (colorStateList = d5.a.b(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(i14) : colorStateList;
            if (colorStateList != null) {
                this.f16441J = colorStateList;
            } else {
                this.f16441J = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i.j.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f13 = dimensionPixelSize;
                if (f13 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f13);
                    requestLayout();
                }
            }
            int i15 = obtainStyledAttributes.getInt(i.j.TextAppearance_android_typeface, -1);
            int i16 = obtainStyledAttributes.getInt(i.j.TextAppearance_android_textStyle, -1);
            Typeface typeface = i15 != 1 ? i15 != 2 ? i15 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i16 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i16) : Typeface.create(typeface, i16);
                f(defaultFromStyle);
                int i17 = i16 & (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0));
                textPaint.setFakeBoldText((i17 & 1) != 0);
                textPaint.setTextSkewX((i17 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                f(typeface);
            }
            if (obtainStyledAttributes.getBoolean(i.j.TextAppearance_textAllCaps, false)) {
                this.M = new l.a(getContext());
            } else {
                this.M = null;
            }
            h(this.f16456o);
            g(this.f16458q);
            obtainStyledAttributes.recycle();
        }
        new AppCompatTextHelper(this).f(attributeSet, i13);
        N.O();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16462u = viewConfiguration.getScaledTouchSlop();
        this.f16466y = viewConfiguration.getScaledMinimumFlingVelocity();
        c().b(attributeSet, i13);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
