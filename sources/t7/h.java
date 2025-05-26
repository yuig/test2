package t7;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends k8.c {

    /* renamed from: g, reason: collision with root package name */
    public int f116478g;

    @Override // k8.t
    public final int a() {
        return this.f116478g;
    }

    @Override // k8.t
    public final Object j() {
        return null;
    }

    @Override // k8.t
    public final int t() {
        return 0;
    }

    @Override // k8.t
    public final void u(long j13, long j14, long j15, List list, h8.q[] qVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c(this.f116478g, elapsedRealtime)) {
            for (int i13 = this.f78495b - 1; i13 >= 0; i13--) {
                if (!c(i13, elapsedRealtime)) {
                    this.f116478g = i13;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
