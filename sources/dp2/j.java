package dp2;

import J.N;
import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* loaded from: classes2.dex */
public final class j implements Closeable {

    /* renamed from: a */
    public final StrictMode.ThreadPolicy f56055a;

    /* renamed from: b */
    public final StrictMode.VmPolicy f56056b;

    public j(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        long hashCode = hashCode();
        if (EarlyTraceEvent.a()) {
            System.nanoTime();
            synchronized (EarlyTraceEvent.f97302a) {
                if (EarlyTraceEvent.a()) {
                    throw null;
                }
            }
        }
        if (TraceEvent.f97319b) {
            N.MHopMqLX("StrictModeContext", hashCode);
        }
        this.f56055a = threadPolicy;
        this.f56056b = vmPolicy;
    }

    public static j a() {
        TraceEvent c13 = TraceEvent.c("StrictModeContext.allowAllVmPolicies");
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            j jVar = new j(null, vmPolicy);
            if (c13 != null) {
                c13.close();
            }
            return jVar;
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static j c() {
        TraceEvent c13 = TraceEvent.c("StrictModeContext.allowDiskReads");
        try {
            j jVar = new j(StrictMode.allowThreadDiskReads(), null);
            if (c13 != null) {
                c13.close();
            }
            return jVar;
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static j d() {
        TraceEvent c13 = TraceEvent.c("StrictModeContext.allowDiskWrites");
        try {
            j jVar = new j(StrictMode.allowThreadDiskWrites(), null);
            if (c13 != null) {
                c13.close();
            }
            return jVar;
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f56055a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f56056b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
        long hashCode = hashCode();
        if (EarlyTraceEvent.a()) {
            System.nanoTime();
            synchronized (EarlyTraceEvent.f97302a) {
                if (EarlyTraceEvent.a()) {
                    throw null;
                }
            }
        }
        if (TraceEvent.f97319b) {
            N.MffNhCLU("StrictModeContext", hashCode);
        }
    }
}
