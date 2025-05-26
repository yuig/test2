package e0;

import android.util.CloseGuard;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CloseGuard f56700a = new CloseGuard();

    @Override // e0.e
    public final void a(String str) {
        this.f56700a.open(str);
    }

    @Override // e0.e
    public final void close() {
        this.f56700a.close();
    }

    @Override // e0.e
    public final void d() {
        this.f56700a.warnIfOpen();
    }
}
