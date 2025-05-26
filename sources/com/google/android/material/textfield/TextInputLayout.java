package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c1;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.e0;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kh2.c3;
import lb.l0;
import org.chromium.net.NetError;
import q5.v0;
import ua.t0;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int B0 = fj.l.Widget_Design_TextInputLayout;
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public final ColorStateList A;
    public boolean A0;
    public final ColorStateList B;
    public final boolean C;
    public CharSequence D;
    public boolean E;
    public bk.i F;
    public bk.i G;
    public StateListDrawable H;
    public boolean I;

    /* renamed from: J */
    public bk.i f33160J;
    public bk.i K;
    public bk.o L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;

    /* renamed from: a */
    public final FrameLayout f33161a;

    /* renamed from: a0 */
    public final RectF f33162a0;

    /* renamed from: b */
    public final v f33163b;

    /* renamed from: b0 */
    public ColorDrawable f33164b0;

    /* renamed from: c */
    public final n f33165c;

    /* renamed from: c0 */
    public int f33166c0;

    /* renamed from: d */
    public EditText f33167d;

    /* renamed from: d0 */
    public final LinkedHashSet f33168d0;

    /* renamed from: e */
    public CharSequence f33169e;

    /* renamed from: e0 */
    public ColorDrawable f33170e0;

    /* renamed from: f */
    public int f33171f;

    /* renamed from: f0 */
    public int f33172f0;

    /* renamed from: g */
    public int f33173g;

    /* renamed from: g0 */
    public Drawable f33174g0;

    /* renamed from: h */
    public int f33175h;

    /* renamed from: h0 */
    public ColorStateList f33176h0;

    /* renamed from: i */
    public int f33177i;

    /* renamed from: i0 */
    public ColorStateList f33178i0;

    /* renamed from: j */
    public final q f33179j;

    /* renamed from: j0 */
    public int f33180j0;

    /* renamed from: k */
    public final boolean f33181k;

    /* renamed from: k0 */
    public int f33182k0;

    /* renamed from: l */
    public final int f33183l;

    /* renamed from: l0 */
    public int f33184l0;

    /* renamed from: m */
    public boolean f33185m;

    /* renamed from: m0 */
    public final ColorStateList f33186m0;

    /* renamed from: n */
    public final c3.e f33187n;

    /* renamed from: n0 */
    public int f33188n0;

    /* renamed from: o */
    public final AppCompatTextView f33189o;

    /* renamed from: o0 */
    public final int f33190o0;

    /* renamed from: p */
    public final int f33191p;

    /* renamed from: p0 */
    public int f33192p0;

    /* renamed from: q */
    public final int f33193q;

    /* renamed from: q0 */
    public int f33194q0;

    /* renamed from: r */
    public CharSequence f33195r;

    /* renamed from: r0 */
    public int f33196r0;

    /* renamed from: s */
    public boolean f33197s;

    /* renamed from: s0 */
    public int f33198s0;

    /* renamed from: t */
    public AppCompatTextView f33199t;

    /* renamed from: t0 */
    public boolean f33200t0;

    /* renamed from: u */
    public final ColorStateList f33201u;

    /* renamed from: u0 */
    public final com.google.android.material.internal.c f33202u0;

    /* renamed from: v */
    public int f33203v;

    /* renamed from: v0 */
    public final boolean f33204v0;

    /* renamed from: w */
    public Fade f33205w;

    /* renamed from: w0 */
    public final boolean f33206w0;

    /* renamed from: x */
    public Fade f33207x;

    /* renamed from: x0 */
    public ValueAnimator f33208x0;

    /* renamed from: y */
    public ColorStateList f33209y;

    /* renamed from: y0 */
    public boolean f33210y0;

    /* renamed from: z */
    public ColorStateList f33211z;

    /* renamed from: z0 */
    public boolean f33212z0;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* renamed from: c */
        public CharSequence f33213c;

        /* renamed from: d */
        public boolean f33214d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f33213c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f33214d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f33213c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            TextUtils.writeToParcel(this.f33213c, parcel, i13);
            parcel.writeInt(this.f33214d ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.textInputStyle);
    }

    public static void A(ViewGroup viewGroup, boolean z13) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            childAt.setEnabled(z13);
            if (childAt instanceof ViewGroup) {
                A((ViewGroup) childAt, z13);
            }
        }
    }

    public static RippleDrawable o(bk.i iVar, int i13, int i14, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{b7.c.F(i14, 0.1f, i13), i13}), iVar, iVar);
    }

    public static LayerDrawable u(Context context, bk.i iVar, int i13, int[][] iArr) {
        int i14;
        TypedValue Y0 = com.bumptech.glide.c.Y0(fj.c.colorSurface, context, "TextInputLayout");
        int i15 = Y0.resourceId;
        if (i15 != 0) {
            Object obj = d5.a.f53679a;
            i14 = context.getColor(i15);
        } else {
            i14 = Y0.data;
        }
        bk.i iVar2 = new bk.i(iVar.f23052a.f23030a);
        int F = b7.c.F(i13, 0.1f, i14);
        iVar2.t(new ColorStateList(iArr, new int[]{F, 0}));
        iVar2.setTint(i14);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{F, i14});
        bk.i iVar3 = new bk.i(iVar.f23052a.f23030a);
        iVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
    }

    public final void B() {
        AppCompatTextView appCompatTextView = this.f33199t;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
    }

    public final void C(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f33180j0 = colorStateList.getDefaultColor();
            this.f33196r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f33182k0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f33184l0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f33184l0 != colorStateList.getDefaultColor()) {
            this.f33184l0 = colorStateList.getDefaultColor();
        }
        e0();
    }

    public final void D(ColorStateList colorStateList) {
        if (this.f33211z != colorStateList) {
            this.f33211z = colorStateList;
            V();
        }
    }

    public final void E(ColorStateList colorStateList) {
        if (this.f33209y != colorStateList) {
            this.f33209y = colorStateList;
            V();
        }
    }

    public final void F(View.OnClickListener onClickListener) {
        n nVar = this.f33165c;
        View.OnLongClickListener onLongClickListener = nVar.f33263m;
        CheckableImageButton checkableImageButton = nVar.f33256f;
        checkableImageButton.setOnClickListener(onClickListener);
        l0.k1(checkableImageButton, onLongClickListener);
    }

    public final void G(CharSequence charSequence) {
        q qVar = this.f33179j;
        if (!qVar.f33297q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                H(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.h();
            return;
        }
        qVar.c();
        qVar.f33296p = charSequence;
        qVar.f33298r.setText(charSequence);
        int i13 = qVar.f33294n;
        if (i13 != 1) {
            qVar.f33295o = 1;
        }
        qVar.o(i13, qVar.f33295o, qVar.m(qVar.f33298r, charSequence));
    }

    public final void H(boolean z13) {
        q qVar = this.f33179j;
        if (qVar.f33297q == z13) {
            return;
        }
        qVar.c();
        TextInputLayout textInputLayout = qVar.f33288h;
        if (z13) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f33287g, null);
            qVar.f33298r = appCompatTextView;
            appCompatTextView.setId(fj.g.textinput_error);
            qVar.f33298r.setTextAlignment(5);
            int i13 = qVar.f33301u;
            qVar.f33301u = i13;
            AppCompatTextView appCompatTextView2 = qVar.f33298r;
            if (appCompatTextView2 != null) {
                textInputLayout.R(appCompatTextView2, i13);
            }
            qVar.k(qVar.f33302v);
            CharSequence charSequence = qVar.f33299s;
            qVar.f33299s = charSequence;
            AppCompatTextView appCompatTextView3 = qVar.f33298r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setContentDescription(charSequence);
            }
            int i14 = qVar.f33300t;
            qVar.f33300t = i14;
            AppCompatTextView appCompatTextView4 = qVar.f33298r;
            if (appCompatTextView4 != null) {
                WeakHashMap weakHashMap = v0.f102521a;
                appCompatTextView4.setAccessibilityLiveRegion(i14);
            }
            qVar.f33298r.setVisibility(4);
            qVar.a(qVar.f33298r, 0);
        } else {
            qVar.h();
            qVar.j(qVar.f33298r, 0);
            qVar.f33298r = null;
            textInputLayout.Y();
            textInputLayout.e0();
        }
        qVar.f33297q = z13;
    }

    public final void I(ColorStateList colorStateList) {
        this.f33179j.k(colorStateList);
    }

    public final void J(ColorStateList colorStateList) {
        this.f33179j.l(colorStateList);
    }

    public final void K(boolean z13) {
        q qVar = this.f33179j;
        if (qVar.f33304x == z13) {
            return;
        }
        qVar.c();
        int i13 = 1;
        if (z13) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.f33287g, null);
            qVar.f33305y = appCompatTextView;
            appCompatTextView.setId(fj.g.textinput_helper_text);
            qVar.f33305y.setTextAlignment(5);
            qVar.f33305y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = qVar.f33305y;
            WeakHashMap weakHashMap = v0.f102521a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i14 = qVar.f33306z;
            qVar.f33306z = i14;
            AppCompatTextView appCompatTextView3 = qVar.f33305y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i14);
            }
            qVar.l(qVar.A);
            qVar.a(qVar.f33305y, 1);
            qVar.f33305y.setAccessibilityDelegate(new androidx.appcompat.widget.t(qVar, i13));
        } else {
            qVar.i();
            qVar.j(qVar.f33305y, 1);
            qVar.f33305y = null;
            TextInputLayout textInputLayout = qVar.f33288h;
            textInputLayout.Y();
            textInputLayout.e0();
        }
        qVar.f33304x = z13;
    }

    public final void L(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        com.google.android.material.internal.c cVar = this.f33202u0;
        if (charSequence == null || !TextUtils.equals(cVar.G, charSequence)) {
            cVar.G = charSequence;
            cVar.H = null;
            Bitmap bitmap = cVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.K = null;
            }
            cVar.n(false);
        }
        if (this.f33200t0) {
            return;
        }
        y();
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f33178i0 != colorStateList) {
            if (this.f33176h0 == null) {
                this.f33202u0.r(colorStateList);
            }
            this.f33178i0 = colorStateList;
            if (this.f33167d != null) {
                b0(false, false);
            }
        }
    }

    public final void N(int i13) {
        this.f33173g = i13;
        EditText editText = this.f33167d;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMaxEms(i13);
    }

    public final void O(int i13) {
        this.f33171f = i13;
        EditText editText = this.f33167d;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMinEms(i13);
    }

    public final void P(CharSequence charSequence) {
        if (this.f33199t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f33199t = appCompatTextView;
            appCompatTextView.setId(fj.g.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f33199t;
            WeakHashMap weakHashMap = v0.f102521a;
            appCompatTextView2.setImportantForAccessibility(2);
            Fade j13 = j();
            this.f33205w = j13;
            j13.f19834b = 67L;
            this.f33207x = j();
            int i13 = this.f33203v;
            this.f33203v = i13;
            AppCompatTextView appCompatTextView3 = this.f33199t;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i13);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            boolean z13 = this.f33197s;
            if (!z13 && !z13) {
                b();
                this.f33197s = true;
            }
            this.f33195r = charSequence;
        } else if (this.f33197s) {
            B();
            this.f33199t = null;
            this.f33197s = false;
        }
        EditText editText = this.f33167d;
        c0(editText != null ? editText.getText() : null);
    }

    public final void Q(bk.o oVar) {
        bk.i iVar = this.F;
        if (iVar == null || iVar.f23052a.f23030a == oVar) {
            return;
        }
        this.L = oVar;
        d();
    }

    public final void R(TextView textView, int i13) {
        try {
            textView.setTextAppearance(i13);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(fj.l.TextAppearance_AppCompat_Caption);
        Context context = getContext();
        int i14 = fj.d.design_error;
        Object obj = d5.a.f53679a;
        textView.setTextColor(context.getColor(i14));
    }

    public final boolean S() {
        q qVar = this.f33179j;
        return (qVar.f33295o != 1 || qVar.f33298r == null || TextUtils.isEmpty(qVar.f33296p)) ? false : true;
    }

    public final void T() {
        if (this.f33189o != null) {
            EditText editText = this.f33167d;
            U(editText == null ? null : editText.getText());
        }
    }

    public final void U(Editable editable) {
        this.f33187n.getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z13 = this.f33185m;
        int i13 = this.f33183l;
        if (i13 == -1) {
            this.f33189o.setText(String.valueOf(length));
            this.f33189o.setContentDescription(null);
            this.f33185m = false;
        } else {
            this.f33185m = length > i13;
            Context context = getContext();
            this.f33189o.setContentDescription(context.getString(this.f33185m ? fj.k.character_counter_overflowed_content_description : fj.k.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f33183l)));
            if (z13 != this.f33185m) {
                V();
            }
            this.f33189o.setText(o5.c.a().b(getContext().getString(fj.k.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f33183l))));
        }
        if (this.f33167d == null || z13 == this.f33185m) {
            return;
        }
        b0(false, false);
        e0();
        Y();
    }

    public final void V() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f33189o;
        if (appCompatTextView != null) {
            R(appCompatTextView, this.f33185m ? this.f33191p : this.f33193q);
            if (!this.f33185m && (colorStateList2 = this.f33209y) != null) {
                this.f33189o.setTextColor(colorStateList2);
            }
            if (!this.f33185m || (colorStateList = this.f33211z) == null) {
                return;
            }
            this.f33189o.setTextColor(colorStateList);
        }
    }

    public final void W() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue W0 = com.bumptech.glide.c.W0(context, fj.c.colorControlActivated);
            if (W0 != null) {
                int i13 = W0.resourceId;
                if (i13 != 0) {
                    colorStateList2 = d5.a.b(context, i13);
                } else {
                    int i14 = W0.data;
                    if (i14 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i14);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f33167d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f33167d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((S() || (this.f33189o != null && this.f33185m)) && (colorStateList = this.B) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    public final boolean X() {
        boolean z13;
        if (this.f33167d == null) {
            return false;
        }
        v vVar = this.f33163b;
        boolean z14 = true;
        if ((vVar.f33318d.getDrawable() != null || (vVar.f33317c != null && v().getVisibility() == 0)) && vVar.getMeasuredWidth() > 0) {
            int measuredWidth = vVar.getMeasuredWidth() - this.f33167d.getPaddingLeft();
            if (this.f33164b0 == null || this.f33166c0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f33164b0 = colorDrawable;
                this.f33166c0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f33167d.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            ColorDrawable colorDrawable2 = this.f33164b0;
            if (drawable != colorDrawable2) {
                this.f33167d.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z13 = true;
            }
            z13 = false;
        } else {
            if (this.f33164b0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f33167d.getCompoundDrawablesRelative();
                this.f33167d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f33164b0 = null;
                z13 = true;
            }
            z13 = false;
        }
        n nVar = this.f33165c;
        if ((nVar.g() || ((nVar.f33258h != 0 && nVar.f()) || nVar.f33264n != null)) && nVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = nVar.e().getMeasuredWidth() - this.f33167d.getPaddingRight();
            CheckableImageButton b13 = nVar.b();
            if (b13 != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) b13.getLayoutParams()).getMarginStart() + b13.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f33167d.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f33170e0;
            if (colorDrawable3 == null || this.f33172f0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f33170e0 = colorDrawable4;
                    this.f33172f0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative3[2];
                ColorDrawable colorDrawable5 = this.f33170e0;
                if (drawable2 != colorDrawable5) {
                    this.f33174g0 = drawable2;
                    this.f33167d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                } else {
                    z14 = z13;
                }
            } else {
                this.f33172f0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f33167d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f33170e0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f33170e0 == null) {
                return z13;
            }
            Drawable[] compoundDrawablesRelative4 = this.f33167d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f33170e0) {
                this.f33167d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f33174g0, compoundDrawablesRelative4[3]);
            } else {
                z14 = z13;
            }
            this.f33170e0 = null;
        }
        return z14;
    }

    public final void Y() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f33167d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = c1.f16527a;
        Drawable mutate = background.mutate();
        if (S()) {
            mutate.setColorFilter(androidx.appcompat.widget.y.c(n(), PorterDuff.Mode.SRC_IN));
        } else if (this.f33185m && (appCompatTextView = this.f33189o) != null) {
            mutate.setColorFilter(androidx.appcompat.widget.y.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f33167d.refreshDrawableState();
        }
    }

    public final void Z() {
        Drawable drawable;
        EditText editText = this.f33167d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            EditText editText2 = this.f33167d;
            if (!(editText2 instanceof AutoCompleteTextView) || c3.d0(editText2)) {
                drawable = this.F;
            } else {
                int u13 = b7.c.u(this.f33167d, fj.c.colorControlHighlight);
                int i13 = this.O;
                int[][] iArr = C0;
                drawable = i13 == 2 ? u(getContext(), this.F, u13, iArr) : i13 == 1 ? o(this.F, this.U, u13, iArr) : null;
            }
            EditText editText3 = this.f33167d;
            WeakHashMap weakHashMap = v0.f102521a;
            editText3.setBackground(drawable);
            this.I = true;
        }
    }

    public final void a0() {
        if (this.O != 1) {
            FrameLayout frameLayout = this.f33161a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int g13 = g();
            if (g13 != layoutParams.topMargin) {
                layoutParams.topMargin = g13;
                frameLayout.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i13, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
        FrameLayout frameLayout = this.f33161a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        a0();
        EditText editText = (EditText) view;
        if (this.f33167d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        n nVar = this.f33165c;
        if (nVar.f33258h != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f33167d = editText;
        int i14 = this.f33171f;
        if (i14 != -1) {
            O(i14);
        } else {
            int i15 = this.f33175h;
            this.f33175h = i15;
            if (editText != null && i15 != -1) {
                editText.setMinWidth(i15);
            }
        }
        int i16 = this.f33173g;
        if (i16 != -1) {
            N(i16);
        } else {
            int i17 = this.f33177i;
            this.f33177i = i17;
            EditText editText2 = this.f33167d;
            if (editText2 != null && i17 != -1) {
                editText2.setMaxWidth(i17);
            }
        }
        this.I = false;
        x();
        x xVar = new x(this);
        EditText editText3 = this.f33167d;
        if (editText3 != null) {
            v0.o(editText3, xVar);
        }
        Typeface typeface = this.f33167d.getTypeface();
        com.google.android.material.internal.c cVar = this.f33202u0;
        boolean s13 = cVar.s(typeface);
        boolean v13 = cVar.v(typeface);
        if (s13 || v13) {
            cVar.n(false);
        }
        float textSize = this.f33167d.getTextSize();
        if (cVar.f32729l != textSize) {
            cVar.f32729l = textSize;
            cVar.n(false);
        }
        int i18 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f33167d.getLetterSpacing();
        if (cVar.f32720g0 != letterSpacing) {
            cVar.f32720g0 = letterSpacing;
            cVar.n(false);
        }
        int gravity = this.f33167d.getGravity();
        int i19 = (gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48;
        if (cVar.f32727k != i19) {
            cVar.f32727k = i19;
            cVar.n(false);
        }
        if (cVar.f32725j != gravity) {
            cVar.f32725j = gravity;
            cVar.n(false);
        }
        WeakHashMap weakHashMap = v0.f102521a;
        this.f33198s0 = editText.getMinimumHeight();
        this.f33167d.addTextChangedListener(new w(this, editText));
        if (this.f33176h0 == null) {
            this.f33176h0 = this.f33167d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f33167d.getHint();
                this.f33169e = hint;
                if (this.C) {
                    L(hint);
                    sendAccessibilityEvent(2048);
                }
                this.f33167d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i18 >= 29) {
            W();
        }
        if (this.f33189o != null) {
            U(this.f33167d.getText());
        }
        Y();
        this.f33179j.b();
        this.f33163b.bringToFront();
        nVar.bringToFront();
        Iterator it = this.f33168d0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        nVar.p();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        b0(false, true);
    }

    public final void b() {
        AppCompatTextView appCompatTextView = this.f33199t;
        if (appCompatTextView != null) {
            this.f33161a.addView(appCompatTextView);
            this.f33199t.setVisibility(0);
        }
    }

    public final void b0(boolean z13, boolean z14) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f33167d;
        boolean z15 = false;
        boolean z16 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f33167d;
        if (editText2 != null && editText2.hasFocus()) {
            z15 = true;
        }
        ColorStateList colorStateList2 = this.f33176h0;
        com.google.android.material.internal.c cVar = this.f33202u0;
        if (colorStateList2 != null) {
            cVar.o(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f33176h0;
            cVar.o(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f33196r0) : this.f33196r0));
        } else if (S()) {
            cVar.o(this.f33179j.g());
        } else if (this.f33185m && (appCompatTextView = this.f33189o) != null) {
            cVar.o(appCompatTextView.getTextColors());
        } else if (z15 && (colorStateList = this.f33178i0) != null) {
            cVar.r(colorStateList);
        }
        if (z16 || !this.f33204v0 || (isEnabled() && z15)) {
            if (z14 || this.f33200t0) {
                i(z13);
                return;
            }
            return;
        }
        if (z14 || !this.f33200t0) {
            ValueAnimator valueAnimator = this.f33208x0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f33208x0.cancel();
            }
            if (z13 && this.f33206w0) {
                c(0.0f);
            } else {
                cVar.w(0.0f);
            }
            if (k() && ((i) this.F).D()) {
                h();
            }
            this.f33200t0 = true;
            AppCompatTextView appCompatTextView2 = this.f33199t;
            if (appCompatTextView2 != null && this.f33197s) {
                appCompatTextView2.setText((CharSequence) null);
                t0.a(this.f33161a, this.f33207x);
                this.f33199t.setVisibility(4);
            }
            v vVar = this.f33163b;
            vVar.f33323i = true;
            vVar.e();
            n nVar = this.f33165c;
            nVar.f33266p = true;
            nVar.q();
        }
    }

    public final void c(float f13) {
        com.google.android.material.internal.c cVar = this.f33202u0;
        if (cVar.f32709b == f13) {
            return;
        }
        if (this.f33208x0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f33208x0 = valueAnimator;
            valueAnimator.setInterpolator(tb.f.d0(getContext(), fj.c.motionEasingEmphasizedInterpolator, gj.a.f65168b));
            this.f33208x0.setDuration(tb.f.c0(getContext(), fj.c.motionDurationMedium4, RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD));
            this.f33208x0.addUpdateListener(new e0(this, 6));
        }
        this.f33208x0.setFloatValues(cVar.f32709b, f13);
        this.f33208x0.start();
    }

    public final void c0(Editable editable) {
        this.f33187n.getClass();
        FrameLayout frameLayout = this.f33161a;
        if ((editable != null && editable.length() != 0) || this.f33200t0) {
            AppCompatTextView appCompatTextView = this.f33199t;
            if (appCompatTextView == null || !this.f33197s) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            t0.a(frameLayout, this.f33207x);
            this.f33199t.setVisibility(4);
            return;
        }
        if (this.f33199t == null || !this.f33197s || TextUtils.isEmpty(this.f33195r)) {
            return;
        }
        this.f33199t.setText(this.f33195r);
        t0.a(frameLayout, this.f33205w);
        this.f33199t.setVisibility(0);
        this.f33199t.bringToFront();
        announceForAccessibility(this.f33195r);
    }

    public final void d() {
        int i13;
        int i14;
        bk.i iVar = this.F;
        if (iVar == null) {
            return;
        }
        bk.o oVar = iVar.f23052a.f23030a;
        bk.o oVar2 = this.L;
        if (oVar != oVar2) {
            iVar.Y0(oVar2);
        }
        if (this.O == 2 && (i13 = this.Q) > -1 && (i14 = this.T) != 0) {
            bk.i iVar2 = this.F;
            iVar2.f23052a.f23040k = i13;
            iVar2.invalidateSelf();
            iVar2.y(ColorStateList.valueOf(i14));
        }
        int i15 = this.U;
        if (this.O == 1) {
            i15 = f5.c.g(this.U, b7.c.t(getContext(), fj.c.colorSurface, 0));
        }
        this.U = i15;
        this.F.t(ColorStateList.valueOf(i15));
        bk.i iVar3 = this.f33160J;
        if (iVar3 != null && this.K != null) {
            if (this.Q > -1 && this.T != 0) {
                iVar3.t(this.f33167d.isFocused() ? ColorStateList.valueOf(this.f33180j0) : ColorStateList.valueOf(this.T));
                this.K.t(ColorStateList.valueOf(this.T));
            }
            invalidate();
        }
        Z();
    }

    public final void d0(boolean z13, boolean z14) {
        int defaultColor = this.f33186m0.getDefaultColor();
        int colorForState = this.f33186m0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f33186m0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z13) {
            this.T = colorForState2;
        } else if (z14) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i13) {
        EditText editText = this.f33167d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i13);
            return;
        }
        if (this.f33169e != null) {
            boolean z13 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f33167d.setHint(this.f33169e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i13);
                return;
            } finally {
                this.f33167d.setHint(hint);
                this.E = z13;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i13);
        onProvideAutofillVirtualStructure(viewStructure, i13);
        FrameLayout frameLayout = this.f33161a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i14 = 0; i14 < frameLayout.getChildCount(); i14++) {
            View childAt = frameLayout.getChildAt(i14);
            ViewStructure newChild = viewStructure.newChild(i14);
            childAt.dispatchProvideAutofillStructure(newChild, i13);
            if (childAt == this.f33167d) {
                newChild.setHint(p());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f33212z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f33212z0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        bk.i iVar;
        super.draw(canvas);
        boolean z13 = this.C;
        com.google.android.material.internal.c cVar = this.f33202u0;
        if (z13) {
            cVar.f(canvas);
        }
        if (this.K == null || (iVar = this.f33160J) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.f33167d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.f33160J.getBounds();
            float j13 = cVar.j();
            int centerX = bounds2.centerX();
            bounds.left = gj.a.c(centerX, j13, bounds2.left);
            bounds.right = gj.a.c(centerX, j13, bounds2.right);
            this.K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f33210y0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f33210y0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.google.android.material.internal.c r3 = r4.f33202u0
            if (r3 == 0) goto L2f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.f32735o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f32733n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.n(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f33167d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = q5.v0.f102521a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.b0(r0, r2)
        L47:
            r4.Y()
            r4.e0()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f33210y0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final Rect e(Rect rect) {
        if (this.f33167d == null) {
            throw new IllegalStateException();
        }
        boolean H0 = l0.H0(this);
        int i13 = rect.bottom;
        Rect rect2 = this.W;
        rect2.bottom = i13;
        int i14 = this.O;
        if (i14 == 1) {
            rect2.left = q(rect.left, H0);
            rect2.top = rect.top + this.P;
            rect2.right = r(rect.right, H0);
            return rect2;
        }
        if (i14 != 2) {
            rect2.left = q(rect.left, H0);
            rect2.top = getPaddingTop();
            rect2.right = r(rect.right, H0);
            return rect2;
        }
        rect2.left = this.f33167d.getPaddingLeft() + rect.left;
        rect2.top = rect.top - g();
        rect2.right = rect.right - this.f33167d.getPaddingRight();
        return rect2;
    }

    public final void e0() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z13 = false;
        boolean z14 = isFocused() || ((editText2 = this.f33167d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f33167d) != null && editText.isHovered())) {
            z13 = true;
        }
        if (!isEnabled()) {
            this.T = this.f33196r0;
        } else if (S()) {
            if (this.f33186m0 != null) {
                d0(z14, z13);
            } else {
                this.T = n();
            }
        } else if (!this.f33185m || (appCompatTextView = this.f33189o) == null) {
            if (z14) {
                this.T = this.f33184l0;
            } else if (z13) {
                this.T = this.f33182k0;
            } else {
                this.T = this.f33180j0;
            }
        } else if (this.f33186m0 != null) {
            d0(z14, z13);
        } else {
            this.T = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            W();
        }
        n nVar = this.f33165c;
        nVar.o();
        ColorStateList colorStateList = nVar.f33254d;
        CheckableImageButton checkableImageButton = nVar.f33253c;
        TextInputLayout textInputLayout = nVar.f33251a;
        l0.W0(textInputLayout, checkableImageButton, colorStateList);
        l0.W0(textInputLayout, nVar.f33256f, nVar.f33260j);
        if (nVar.c() instanceof k) {
            nVar.m(textInputLayout.S());
        }
        v vVar = this.f33163b;
        l0.W0(vVar.f33315a, vVar.f33318d, vVar.f33319e);
        if (this.O == 2) {
            int i13 = this.Q;
            if (z14 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i13) {
                z();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.f33190o0;
            } else if (z13 && !z14) {
                this.U = this.f33194q0;
            } else if (z14) {
                this.U = this.f33192p0;
            } else {
                this.U = this.f33188n0;
            }
        }
        d();
    }

    public final Rect f(Rect rect) {
        if (this.f33167d == null) {
            throw new IllegalStateException();
        }
        com.google.android.material.internal.c cVar = this.f33202u0;
        TextPaint textPaint = cVar.U;
        textPaint.setTextSize(cVar.f32729l);
        textPaint.setTypeface(cVar.f32748z);
        textPaint.setLetterSpacing(cVar.f32720g0);
        float f13 = -textPaint.ascent();
        int compoundPaddingLeft = this.f33167d.getCompoundPaddingLeft() + rect.left;
        Rect rect2 = this.W;
        rect2.left = compoundPaddingLeft;
        rect2.top = (this.O != 1 || this.f33167d.getMinLines() > 1) ? rect.top + this.f33167d.getCompoundPaddingTop() : (int) (rect.centerY() - (f13 / 2.0f));
        rect2.right = rect.right - this.f33167d.getCompoundPaddingRight();
        rect2.bottom = (this.O != 1 || this.f33167d.getMinLines() > 1) ? rect.bottom - this.f33167d.getCompoundPaddingBottom() : (int) (rect2.top + f13);
        return rect2;
    }

    public final int g() {
        float g13;
        if (!this.C) {
            return 0;
        }
        int i13 = this.O;
        com.google.android.material.internal.c cVar = this.f33202u0;
        if (i13 == 0) {
            g13 = cVar.g();
        } else {
            if (i13 != 2) {
                return 0;
            }
            g13 = cVar.g() / 2.0f;
        }
        return (int) g13;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.f33167d;
        if (editText == null) {
            return super.getBaseline();
        }
        return g() + getPaddingTop() + editText.getBaseline();
    }

    public final void h() {
        if (k()) {
            ((i) this.F).E();
        }
    }

    public final void i(boolean z13) {
        ValueAnimator valueAnimator = this.f33208x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33208x0.cancel();
        }
        if (z13 && this.f33206w0) {
            c(1.0f);
        } else {
            this.f33202u0.w(1.0f);
        }
        this.f33200t0 = false;
        if (k()) {
            y();
        }
        EditText editText = this.f33167d;
        c0(editText == null ? null : editText.getText());
        v vVar = this.f33163b;
        vVar.f33323i = false;
        vVar.e();
        n nVar = this.f33165c;
        nVar.f33266p = false;
        nVar.q();
    }

    public final Fade j() {
        Fade fade = new Fade();
        fade.f19835c = tb.f.c0(getContext(), fj.c.motionDurationShort2, 87);
        fade.f19836d = tb.f.d0(getContext(), fj.c.motionEasingLinearInterpolator, gj.a.f65167a);
        return fade;
    }

    public final boolean k() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof i);
    }

    public final bk.i l(boolean z13) {
        int i13;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(fj.e.mtrl_shape_corner_size_small_component);
        float f13 = z13 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f33167d;
        float d2 = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).d() : getResources().getDimensionPixelOffset(fj.e.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(fj.e.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        bk.m mVar = new bk.m();
        mVar.g(f13);
        mVar.h(f13);
        mVar.e(dimensionPixelOffset);
        mVar.f(dimensionPixelOffset);
        bk.o a13 = mVar.a();
        EditText editText2 = this.f33167d;
        ColorStateList c13 = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).c() : null;
        Context context = getContext();
        if (c13 == null) {
            Paint paint = bk.i.f23051x;
            TypedValue Y0 = com.bumptech.glide.c.Y0(fj.c.colorSurface, context, bk.i.class.getSimpleName());
            int i14 = Y0.resourceId;
            if (i14 != 0) {
                Object obj = d5.a.f53679a;
                i13 = context.getColor(i14);
            } else {
                i13 = Y0.data;
            }
            c13 = ColorStateList.valueOf(i13);
        }
        bk.i iVar = new bk.i();
        iVar.o(context);
        iVar.t(c13);
        iVar.s(d2);
        iVar.Y0(a13);
        bk.h hVar = iVar.f23052a;
        if (hVar.f23037h == null) {
            hVar.f23037h = new Rect();
        }
        iVar.f23052a.f23037h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        iVar.invalidateSelf();
        return iVar;
    }

    public final CharSequence m() {
        q qVar = this.f33179j;
        if (qVar.f33297q) {
            return qVar.f();
        }
        return null;
    }

    public final int n() {
        AppCompatTextView appCompatTextView = this.f33179j.f33298r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f33202u0.m(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        n nVar = this.f33165c;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z13 = false;
        this.A0 = false;
        if (this.f33167d != null && this.f33167d.getMeasuredHeight() < (max = Math.max(nVar.getMeasuredHeight(), this.f33163b.getMeasuredHeight()))) {
            this.f33167d.setMinimumHeight(max);
            z13 = true;
        }
        boolean X = X();
        if (z13 || X) {
            this.f33167d.post(new androidx.activity.d(this, 22));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        EditText editText = this.f33167d;
        if (editText != null) {
            Rect rect = this.V;
            com.google.android.material.internal.d.a(this, editText, rect);
            bk.i iVar = this.f33160J;
            if (iVar != null) {
                int i17 = rect.bottom;
                iVar.setBounds(rect.left, i17 - this.R, rect.right, i17);
            }
            bk.i iVar2 = this.K;
            if (iVar2 != null) {
                int i18 = rect.bottom;
                iVar2.setBounds(rect.left, i18 - this.S, rect.right, i18);
            }
            if (this.C) {
                float textSize = this.f33167d.getTextSize();
                com.google.android.material.internal.c cVar = this.f33202u0;
                if (cVar.f32729l != textSize) {
                    cVar.f32729l = textSize;
                    cVar.n(false);
                }
                int gravity = this.f33167d.getGravity();
                int i19 = (gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48;
                if (cVar.f32727k != i19) {
                    cVar.f32727k = i19;
                    cVar.n(false);
                }
                if (cVar.f32725j != gravity) {
                    cVar.f32725j = gravity;
                    cVar.n(false);
                }
                cVar.p(e(rect));
                cVar.t(f(rect));
                cVar.n(false);
                if (!k() || this.f33200t0) {
                    return;
                }
                y();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        EditText editText;
        super.onMeasure(i13, i14);
        boolean z13 = this.A0;
        n nVar = this.f33165c;
        if (!z13) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.A0 = true;
        }
        if (this.f33199t != null && (editText = this.f33167d) != null) {
            this.f33199t.setGravity(editText.getGravity());
            this.f33199t.setPadding(this.f33167d.getCompoundPaddingLeft(), this.f33167d.getCompoundPaddingTop(), this.f33167d.getCompoundPaddingRight(), this.f33167d.getCompoundPaddingBottom());
        }
        nVar.p();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        G(savedState.f33213c);
        if (savedState.f33214d) {
            post(new z(this, 28));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        boolean z13 = i13 == 1;
        if (z13 != this.M) {
            bk.d dVar = this.L.f23095e;
            RectF rectF = this.f33162a0;
            float a13 = dVar.a(rectF);
            float a14 = this.L.f23096f.a(rectF);
            float a15 = this.L.f23098h.a(rectF);
            float a16 = this.L.f23097g.a(rectF);
            bk.o oVar = this.L;
            bs1.c cVar = oVar.f23091a;
            bs1.c cVar2 = oVar.f23092b;
            bs1.c cVar3 = oVar.f23094d;
            bs1.c cVar4 = oVar.f23093c;
            bk.m a17 = bk.o.a();
            a17.f23078a = cVar2;
            bk.m.b(cVar2);
            a17.f23079b = cVar;
            bk.m.b(cVar);
            a17.f23081d = cVar4;
            bk.m.b(cVar4);
            a17.f23080c = cVar3;
            bk.m.b(cVar3);
            a17.g(a14);
            a17.h(a13);
            a17.e(a16);
            a17.f(a15);
            bk.o a18 = a17.a();
            this.M = z13;
            Q(a18);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (S()) {
            savedState.f33213c = m();
        }
        n nVar = this.f33165c;
        savedState.f33214d = nVar.f33258h != 0 && nVar.f33256f.f32663d;
        return savedState;
    }

    public final CharSequence p() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final int q(int i13, boolean z13) {
        int compoundPaddingLeft;
        if (!z13) {
            v vVar = this.f33163b;
            if (vVar.f33317c != null) {
                compoundPaddingLeft = vVar.a();
                return compoundPaddingLeft + i13;
            }
        }
        if (z13) {
            n nVar = this.f33165c;
            if (nVar.f33264n != null) {
                compoundPaddingLeft = nVar.d();
                return compoundPaddingLeft + i13;
            }
        }
        compoundPaddingLeft = this.f33167d.getCompoundPaddingLeft();
        return compoundPaddingLeft + i13;
    }

    public final int r(int i13, boolean z13) {
        int compoundPaddingRight;
        if (!z13) {
            n nVar = this.f33165c;
            if (nVar.f33264n != null) {
                compoundPaddingRight = nVar.d();
                return i13 - compoundPaddingRight;
            }
        }
        if (z13) {
            v vVar = this.f33163b;
            if (vVar.f33317c != null) {
                compoundPaddingRight = vVar.a();
                return i13 - compoundPaddingRight;
            }
        }
        compoundPaddingRight = this.f33167d.getCompoundPaddingRight();
        return i13 - compoundPaddingRight;
    }

    public final StateListDrawable s() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, t());
            this.H.addState(new int[0], l(false));
        }
        return this.H;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        A(this, z13);
        super.setEnabled(z13);
    }

    public final bk.i t() {
        if (this.G == null) {
            this.G = l(true);
        }
        return this.G;
    }

    public final TextView v() {
        return this.f33163b.f33316b;
    }

    public final boolean w() {
        return this.f33179j.f33297q;
    }

    public final void x() {
        int i13 = this.O;
        if (i13 == 0) {
            this.F = null;
            this.f33160J = null;
            this.K = null;
        } else if (i13 == 1) {
            this.F = new bk.i(this.L);
            this.f33160J = new bk.i();
            this.K = new bk.i();
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException(a.a.n(new StringBuilder(), this.O, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.C || (this.F instanceof i)) {
                this.F = new bk.i(this.L);
            } else {
                this.F = i.C(this.L);
            }
            this.f33160J = null;
            this.K = null;
        }
        Z();
        e0();
        if (this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.P = getResources().getDimensionPixelSize(fj.e.material_font_2_0_box_collapsed_padding_top);
            } else if (com.bumptech.glide.d.d0(getContext())) {
                this.P = getResources().getDimensionPixelSize(fj.e.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f33167d != null && this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f33167d;
                WeakHashMap weakHashMap = v0.f102521a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(fj.e.material_filled_edittext_font_2_0_padding_top), this.f33167d.getPaddingEnd(), getResources().getDimensionPixelSize(fj.e.material_filled_edittext_font_2_0_padding_bottom));
            } else if (com.bumptech.glide.d.d0(getContext())) {
                EditText editText2 = this.f33167d;
                WeakHashMap weakHashMap2 = v0.f102521a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(fj.e.material_filled_edittext_font_1_3_padding_top), this.f33167d.getPaddingEnd(), getResources().getDimensionPixelSize(fj.e.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.O != 0) {
            a0();
        }
        EditText editText3 = this.f33167d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i14 = this.O;
                if (i14 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(t());
                } else if (i14 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(s());
                }
            }
        }
    }

    public final void y() {
        float f13;
        float f14;
        float f15;
        RectF rectF;
        float f16;
        int i13;
        int i14;
        if (k()) {
            int width = this.f33167d.getWidth();
            int gravity = this.f33167d.getGravity();
            com.google.android.material.internal.c cVar = this.f33202u0;
            boolean c13 = cVar.c(cVar.G);
            cVar.I = c13;
            Rect rect = cVar.f32721h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c13) {
                        i14 = rect.left;
                        f15 = i14;
                    } else {
                        f13 = rect.right;
                        f14 = cVar.f32726j0;
                    }
                } else if (c13) {
                    f13 = rect.right;
                    f14 = cVar.f32726j0;
                } else {
                    i14 = rect.left;
                    f15 = i14;
                }
                float max = Math.max(f15, rect.left);
                rectF = this.f33162a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f16 = (width / 2.0f) + (cVar.f32726j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cVar.I) {
                        f16 = max + cVar.f32726j0;
                    } else {
                        i13 = rect.right;
                        f16 = i13;
                    }
                } else if (cVar.I) {
                    i13 = rect.right;
                    f16 = i13;
                } else {
                    f16 = cVar.f32726j0 + max;
                }
                rectF.right = Math.min(f16, rect.right);
                rectF.bottom = cVar.g() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f17 = rectF.left;
                float f18 = this.N;
                rectF.left = f17 - f18;
                rectF.right += f18;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
                ((i) this.F).G(rectF);
                return;
            }
            f13 = width / 2.0f;
            f14 = cVar.f32726j0 / 2.0f;
            f15 = f13 - f14;
            float max2 = Math.max(f15, rect.left);
            rectF = this.f33162a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f16 = (width / 2.0f) + (cVar.f32726j0 / 2.0f);
            rectF.right = Math.min(f16, rect.right);
            rectF.bottom = cVar.g() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void z() {
        if (!k() || this.f33200t0) {
            return;
        }
        h();
        y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
