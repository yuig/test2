package jp2;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* loaded from: classes4.dex */
public final class f0 extends NetworkQualityRttListener {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkQualityRttListener f77325a;

    public f0(NetworkQualityRttListener networkQualityRttListener) {
        super(networkQualityRttListener.getExecutor());
        this.f77325a = networkQualityRttListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        return this.f77325a.equals(((f0) obj).f77325a);
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final Executor getExecutor() {
        return this.f77325a.getExecutor();
    }

    public final int hashCode() {
        return this.f77325a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i13, long j13, int i14) {
        this.f77325a.onRttObservation(i13, j13, i14);
    }
}
