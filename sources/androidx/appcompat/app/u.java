package androidx.appcompat.app;

import com.pinterest.common.reporting.CrashReporting$InternalCrashReportingError;
import java.lang.Thread;
import java.util.Arrays;
import org.chromium.base.JavaHandlerThread;

/* loaded from: classes2.dex */
public final class u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16137a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16138b;

    public /* synthetic */ u(Object obj, int i13) {
        this.f16137a = i13;
        this.f16138b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th3) {
        Throwable th4;
        Throwable u13;
        int i13 = this.f16137a;
        Object obj = this.f16138b;
        switch (i13) {
            case 1:
                if (th3 != null) {
                    try {
                        u13 = tb0.h.z(th3.getMessage()) ? tb0.h.u("<filtered>", th3) : th3;
                    } catch (Throwable th5) {
                        th = th5;
                        th4 = th3;
                    }
                    try {
                        if (tb0.h.a(u13)) {
                            StackTraceElement[] stackTrace = u13.getStackTrace();
                            if (stackTrace.length > 1) {
                                u13.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 1, stackTrace.length));
                            }
                        }
                        th3 = u13;
                    } catch (Throwable th6) {
                        th4 = u13;
                        th = th6;
                        try {
                            ((Thread.UncaughtExceptionHandler) obj).uncaughtException(thread, new CrashReporting$InternalCrashReportingError(th, th3));
                            return;
                        } finally {
                            ((Thread.UncaughtExceptionHandler) obj).uncaughtException(thread, th4);
                        }
                    }
                }
                return;
            default:
                ((JavaHandlerThread) obj).f97307b = th3;
                return;
        }
    }
}
