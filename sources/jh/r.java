package jh;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f76193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.i f76194b;

    public r(com.google.android.gms.common.api.internal.i iVar, Intent intent) {
        this.f76193a = intent;
        this.f76194b = iVar;
    }

    @Override // jh.s
    public final void a() {
        Intent intent = this.f76193a;
        if (intent != null) {
            this.f76194b.startActivityForResult(intent, 2);
        }
    }
}
