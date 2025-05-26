package com.google.android.material.textfield;

import android.text.Editable;
import com.google.android.material.internal.c0;

/* loaded from: classes.dex */
public final class l extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f33248a;

    public l(n nVar) {
        this.f33248a = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f33248a.c().a();
    }

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f33248a.c().b();
    }
}
