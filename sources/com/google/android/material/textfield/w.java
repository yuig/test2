package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes.dex */
public final class w implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f33324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f33325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f33326c;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f33326c = textInputLayout;
        this.f33325b = editText;
        this.f33324a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f33326c;
        textInputLayout.b0(!textInputLayout.f33212z0, false);
        if (textInputLayout.f33181k) {
            textInputLayout.U(editable);
        }
        if (textInputLayout.f33197s) {
            textInputLayout.c0(editable);
        }
        EditText editText = this.f33325b;
        int lineCount = editText.getLineCount();
        int i13 = this.f33324a;
        if (lineCount != i13) {
            if (lineCount < i13) {
                WeakHashMap weakHashMap = v0.f102521a;
                int minimumHeight = editText.getMinimumHeight();
                int i14 = textInputLayout.f33198s0;
                if (minimumHeight != i14) {
                    editText.setMinimumHeight(i14);
                }
            }
            this.f33324a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }
}
