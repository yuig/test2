package jp2;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* loaded from: classes4.dex */
public final class g0 extends NetworkQualityThroughputListener {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkQualityThroughputListener f77326a;

    public g0(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.f77326a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        return this.f77326a.equals(((g0) obj).f77326a);
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final Executor getExecutor() {
        return this.f77326a.getExecutor();
    }

    public final int hashCode() {
        return this.f77326a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i13, long j13, int i14) {
        this.f77326a.onThroughputObservation(i13, j13, i14);
    }
}
