package v;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements r4.j, d7.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f123433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123434b;

    public /* synthetic */ e(long j13, Object obj) {
        this.f123434b = obj;
        this.f123433a = j13;
    }

    @Override // r4.j
    public final Object C(final r4.i iVar) {
        n nVar = (n) this.f123434b;
        nVar.getClass();
        final long j13 = this.f123433a;
        nVar.n(new m() { // from class: v.f
            @Override // v.m
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                if (!n.v(totalCaptureResult, j13)) {
                    return false;
                }
                iVar.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        ((n7.c) obj).getClass();
    }
}
