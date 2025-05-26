package com.google.android.material.textfield;

import a.l2;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class u extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f33312e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f33313f;

    /* renamed from: g, reason: collision with root package name */
    public final l2 f33314g;

    public u(n nVar, int i13) {
        super(nVar);
        this.f33312e = fj.f.design_password_eye;
        this.f33314g = new l2(this, 10);
        if (i13 != 0) {
            this.f33312e = i13;
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void b() {
        q();
    }

    @Override // com.google.android.material.textfield.o
    public final int c() {
        return fj.k.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.o
    public final int d() {
        return this.f33312e;
    }

    @Override // com.google.android.material.textfield.o
    public final View.OnClickListener f() {
        return this.f33314g;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.material.textfield.o
    public final boolean l() {
        EditText editText = this.f33313f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.o
    public final void m(EditText editText) {
        this.f33313f = editText;
        q();
    }

    @Override // com.google.android.material.textfield.o
    public final void r() {
        EditText editText = this.f33313f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f33313f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.o
    public final void s() {
        EditText editText = this.f33313f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
