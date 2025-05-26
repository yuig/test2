package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.app.Dialog;

/* loaded from: classes3.dex */
public final class t0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f30875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f30876b;

    public t0(u0 u0Var, AlertDialog alertDialog) {
        this.f30876b = u0Var;
        this.f30875a = alertDialog;
    }

    @Override // com.google.android.gms.common.api.internal.d0
    public final void a() {
        u uVar = (u) this.f30876b.f30885c;
        uVar.f30878b.set(null);
        bi.f fVar = uVar.f30882f.f30819n;
        fVar.sendMessage(fVar.obtainMessage(3));
        Dialog dialog = this.f30875a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
