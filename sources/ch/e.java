package ch;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class e extends zh.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f27718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f27719b;

    public e(f fVar, g gVar) {
        this.f27719b = fVar;
        this.f27718a = gVar;
    }

    @Override // zh.e
    public final void m(Status status) {
        this.f27718a.f27721d.setException(new AccountTransferException(status));
    }

    @Override // zh.b, zh.e
    public final void zzb(byte[] bArr) {
        this.f27719b.f27721d.setResult(bArr);
    }
}
