package com.google.android.material.textfield;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f33249a;

    public m(n nVar) {
        this.f33249a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f33249a;
        EditText editText = nVar.f33267q;
        if (editText == textInputLayout.f33167d) {
            return;
        }
        l lVar = nVar.f33270t;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.f33267q.getOnFocusChangeListener() == nVar.c().e()) {
                nVar.f33267q.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.f33167d;
        nVar.f33267q = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.c().m(nVar.f33267q);
        nVar.l(nVar.c());
    }
}
