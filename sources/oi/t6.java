package oi;

import J.N;

/* loaded from: classes3.dex */
public final class t6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95175a;

    /* renamed from: b, reason: collision with root package name */
    public final long f95176b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f95178d;

    public /* synthetic */ t6(long j13, Object obj, int i13, long j14) {
        this.f95175a = i13;
        this.f95178d = obj;
        this.f95176b = j13;
        this.f95177c = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95175a) {
            case 0:
                ((q6) ((bh.b) this.f95178d).f22799c).zzl().y(new androidx.appcompat.app.z(this, 25));
                break;
            default:
                N.MJcct7gJ(this.f95176b, this.f95177c);
                break;
        }
    }
}
