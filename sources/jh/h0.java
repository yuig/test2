package jh;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class h0 extends w {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f76157g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f fVar, int i13) {
        super(fVar, i13, null);
        this.f76157g = fVar;
    }

    @Override // jh.w
    public final void b(ConnectionResult connectionResult) {
        f fVar = this.f76157g;
        if (fVar.enableLocalFallback() && f.zzo(fVar)) {
            f.zzk(fVar, 16);
        } else {
            fVar.zzc.b(connectionResult);
            fVar.onConnectionFailed(connectionResult);
        }
    }

    @Override // jh.w
    public final boolean c() {
        this.f76157g.zzc.b(ConnectionResult.f30730j);
        return true;
    }
}
