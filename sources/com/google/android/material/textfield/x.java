package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class x extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f33327d;

    public x(TextInputLayout textInputLayout) {
        this.f33327d = textInputLayout;
    }

    @Override // q5.b
    public void d(View view, r5.e eVar) {
        AppCompatTextView appCompatTextView;
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f33327d;
        EditText editText = textInputLayout.f33167d;
        CharSequence charSequence = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence p13 = textInputLayout.p();
        CharSequence m13 = textInputLayout.m();
        CharSequence charSequence2 = textInputLayout.f33197s ? textInputLayout.f33195r : null;
        int i13 = textInputLayout.f33183l;
        if (textInputLayout.f33181k && textInputLayout.f33185m && (appCompatTextView = textInputLayout.f33189o) != null) {
            charSequence = appCompatTextView.getContentDescription();
        }
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean z13 = !isEmpty;
        boolean z14 = true;
        boolean z15 = !TextUtils.isEmpty(p13);
        boolean z16 = !textInputLayout.f33200t0;
        boolean z17 = !TextUtils.isEmpty(m13);
        if (!z17 && TextUtils.isEmpty(charSequence)) {
            z14 = false;
        }
        String charSequence3 = z15 ? p13.toString() : "";
        v vVar = textInputLayout.f33163b;
        AppCompatTextView appCompatTextView2 = vVar.f33316b;
        if (appCompatTextView2.getVisibility() == 0) {
            eVar.z(appCompatTextView2);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView2);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f33318d);
        }
        if (z13) {
            eVar.F(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            eVar.F(charSequence3);
            if (z16 && charSequence2 != null) {
                eVar.F(charSequence3 + ", " + ((Object) charSequence2));
            }
        } else if (charSequence2 != null) {
            eVar.F(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            eVar.y(charSequence3);
            eVar.E(isEmpty);
        }
        if (text == null || text.length() != i13) {
            i13 = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(i13);
        if (z14) {
            if (!z17) {
                m13 = charSequence;
            }
            eVar.w(m13);
        }
        AppCompatTextView appCompatTextView3 = textInputLayout.f33179j.f33305y;
        if (appCompatTextView3 != null) {
            eVar.z(appCompatTextView3);
        }
        textInputLayout.f33165c.c().n(eVar);
    }

    @Override // q5.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f33327d.f33165c.c().o(accessibilityEvent);
    }
}
