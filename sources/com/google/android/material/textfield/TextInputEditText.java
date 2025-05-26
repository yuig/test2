package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.d0;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g, reason: collision with root package name */
    public final Rect f33158g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33159h;

    public TextInputEditText(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.editTextStyle);
    }

    public final TextInputLayout g() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout g13 = g();
        if (g13 == null || !this.f33159h || rect == null) {
            return;
        }
        Rect rect2 = this.f33158g;
        g13.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout g13 = g();
        if (g13 == null || !this.f33159h) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = g13.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout g13 = g();
        return (g13 == null || !g13.E) ? super.getHint() : g13.p();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout g13 = g();
        if (g13 != null && g13.E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout g13 = g();
            editorInfo.hintText = g13 != null ? g13.p() : null;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout g13 = g();
        if (g13 == null || !this.f33159h || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = g13.getHeight() - getHeight();
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom + height;
        Rect rect2 = this.f33158g;
        rect2.set(i13, i14, i15, i16);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(fk.a.a(context, attributeSet, i13, 0), attributeSet, i13);
        this.f33158g = new Rect();
        int[] iArr = fj.m.TextInputEditText;
        int i14 = fj.l.Widget_Design_TextInputEditText;
        d0.a(context, attributeSet, i13, i14);
        d0.c(context, attributeSet, iArr, i13, i14, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        this.f33159h = obtainStyledAttributes.getBoolean(fj.m.TextInputEditText_textInputLayoutFocusedRectEnabled, false);
        obtainStyledAttributes.recycle();
    }
}
