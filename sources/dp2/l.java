package dp2;

import J.N;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.ArrayList;
import l7.b0;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* loaded from: classes4.dex */
public final class l implements MessageQueue.IdleHandler {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f56058b;

    /* renamed from: c, reason: collision with root package name */
    public static l f56059c;

    /* renamed from: a, reason: collision with root package name */
    public long f56060a;

    public static void a() {
        PostTask.c(new v.h(17));
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f56060a;
        if (j13 != 0 && elapsedRealtime - j13 <= 1000) {
            return true;
        }
        this.f56060a = elapsedRealtime;
        if (!TraceEvent.f97319b || !N.MnfJQqTB()) {
            return true;
        }
        TraceEvent.a("instantAndroidViewHierarchy", null);
        ApplicationStatus.a();
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            Object obj = EarlyTraceEvent.f97302a;
            if (!TraceEvent.f97319b) {
                return true;
            }
            N.Mw73xTww("instantAndroidViewHierarchy", null, 0L);
            return true;
        }
        long hashCode = arrayList.hashCode();
        PostTask.b(0, new b0(hashCode, arrayList, 8));
        Object obj2 = EarlyTraceEvent.f97302a;
        if (!TraceEvent.f97319b) {
            return true;
        }
        N.Mw73xTww("instantAndroidViewHierarchy", null, hashCode);
        return true;
    }
}
