package o7;

import android.os.SystemClock;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long f93024a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public long f93025b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f93026c;

    public final void a(Exception exc) {
        boolean z13;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f93026c) == null) {
            this.f93026c = exc;
        }
        if (this.f93024a == -9223372036854775807L) {
            synchronized (f0.f93049k0) {
                z13 = f0.f93051m0 > 0;
            }
            if (!z13) {
                this.f93024a = 200 + elapsedRealtime;
            }
        }
        long j13 = this.f93024a;
        if (j13 == -9223372036854775807L || elapsedRealtime < j13) {
            this.f93025b = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f93026c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f93026c;
        this.f93026c = null;
        this.f93024a = -9223372036854775807L;
        this.f93025b = -9223372036854775807L;
        throw exc3;
    }
}
