package ch;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class h extends zh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f27722a;

    public h(i iVar) {
        this.f27722a = iVar;
    }

    @Override // zh.e
    public final void m(Status status) {
        this.f27722a.f27721d.setException(new AccountTransferException(status));
    }

    @Override // zh.b, zh.e
    public final void zze() {
        this.f27722a.f27721d.setResult(null);
    }
}
