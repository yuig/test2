package com.pinterest.design.brio.widget;

import a.z0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.search.e;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import d5.a;
import eo1.d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import lm1.b;
import mj.m;
import pe0.c;
import sh.f;
import te0.g;
import te0.h;
import te0.i;
import yk1.n;

/* loaded from: classes5.dex */
public class PinterestEditText extends AppCompatEditText implements n {

    /* renamed from: r, reason: collision with root package name */
    public static int f44834r;

    /* renamed from: g, reason: collision with root package name */
    public h f44835g;

    /* renamed from: h, reason: collision with root package name */
    public b f44836h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44837i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f44838j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f44839k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f44840l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f44841m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44842n;

    /* renamed from: o, reason: collision with root package name */
    public e f44843o;

    /* renamed from: p, reason: collision with root package name */
    public z0 f44844p;

    /* renamed from: q, reason: collision with root package name */
    public final c f44845q;

    public PinterestEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44845q = new c(this);
        g(context, attributeSet);
    }

    public final void g(Context context, AttributeSet attributeSet) {
        this.f44843o = null;
        this.f44842n = false;
        if (attributeSet != null) {
            this.f44835g = h.TEXT_NONE;
            this.f44836h = i.f117495b;
        }
        if (this.f44835g != h.TEXT_NONE) {
            if (this.f44836h != i.f117495b) {
                Context context2 = getContext();
                b fontType = this.f44836h;
                pe0.b bVar = new pe0.b(this, 0);
                LinkedHashMap linkedHashMap = g.f117488a;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(fontType, "fontType");
                setTypeface(g.a(context2, fontType, bVar, 8));
            }
            setTextSize(0, i.a(this.f44835g, getResources()).f58831a);
        }
        this.f44839k = getCompoundDrawables()[0];
        Context context3 = getContext();
        int i13 = d.ic_lego_clear_nonpds;
        Object obj = a.f53679a;
        Drawable drawable = context3.getDrawable(i13);
        this.f44840l = drawable;
        drawable.setTint(getContext().getColor(eo1.b.color_themed_text_default));
        f44834r = (int) context.getResources().getDimension(eo1.c.button_height);
        this.f44841m = new int[]{getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom()};
        int i14 = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, le0.i.PinterestEditText);
            this.f44837i = obtainStyledAttributes.getBoolean(le0.i.PinterestEditText_iconTinted, false);
            if (!obtainStyledAttributes.getBoolean(le0.i.PinterestEditText_hasClearIcon, false)) {
                removeTextChangedListener(this.f44843o);
                this.f44843o = null;
            } else if (this.f44843o == null) {
                e eVar = new e(this, i14);
                this.f44843o = eVar;
                addTextChangedListener(eVar);
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f44837i) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            setCompoundDrawablesRelative(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
        setOnFocusChangeListener(this.f44845q);
    }

    public final boolean i(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        editorInfo.contentMimeTypes = new String[]{"image/*", "image/png", "image/gif", "image/jpeg", "video/*"};
        return new t5.b(onCreateInputConnection, new m(1));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i13, KeyEvent keyEvent) {
        if (!this.f44842n || i13 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i13, keyEvent);
        }
        clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        z0 z0Var = this.f44844p;
        if (z0Var != null) {
            AttributeInputTextViewLegacy this$0 = (AttributeInputTextViewLegacy) z0Var.f196b;
            int i14 = AttributeInputTextViewLegacy.f47197g;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f47201d.requestFocus();
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i13, int i14) {
        super.onSelectionChanged(i13, i14);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44838j && motionEvent.getAction() == 0) {
            int x13 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            if (x13 >= (getRight() - this.f44840l.getBounds().width()) - f44834r && x13 <= (getRight() - getPaddingEnd()) + f44834r && y13 >= getPaddingTop() - f44834r && y13 <= (getHeight() - getPaddingBottom()) + f44834r) {
                setText("");
            }
        }
        requestFocusFromTouch();
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.f44837i) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            int i13 = eo1.b.color_gray_500;
            super.setCompoundDrawables(f.e(i13, getContext(), drawable), f.e(i13, getContext(), drawable2), f.e(i13, getContext(), drawable3), f.e(i13, getContext(), drawable4));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.f44837i) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            int i13 = eo1.b.color_gray_500;
            super.setCompoundDrawablesRelative(f.e(i13, getContext(), drawable), f.e(i13, getContext(), drawable2), f.e(i13, getContext(), drawable3), f.e(i13, getContext(), drawable4));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (!this.f44837i) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            int i13 = eo1.b.color_gray_500;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(f.e(i13, getContext(), drawable), f.e(i13, getContext(), drawable2), f.e(i13, getContext(), drawable3), f.e(i13, getContext(), drawable4));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (!this.f44837i) {
            super.setCompoundDrawablesWithIntrinsicBounds(i13, i14, i15, i16);
        } else {
            int i17 = eo1.b.color_gray_500;
            super.setCompoundDrawablesWithIntrinsicBounds(f.f(getContext(), i13, i17), f.f(getContext(), i14, i17), f.f(getContext(), i15, i17), f.f(getContext(), i16, i17));
        }
    }

    public PinterestEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44845q = new c(this);
        g(context, attributeSet);
    }
}
