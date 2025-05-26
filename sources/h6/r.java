package h6;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.net.impl.CronetLibraryLoader;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67747a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r() {
        this(1);
        this.f67747a = 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67747a) {
            case 0:
                try {
                    int i13 = j5.k.f74682a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (m.c()) {
                        m.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    int i14 = j5.k.f74682a;
                    Trace.endSection();
                    throw th3;
                }
            case 1:
            case 2:
                return;
            case 3:
                Iterator it = new ArrayList(mk2.x.f87428d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        mk2.x.f87428d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            default:
                CronetLibraryLoader.b();
                return;
        }
    }

    public final String toString() {
        switch (this.f67747a) {
            case 2:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(int i13) {
        this.f67747a = i13;
    }
}
