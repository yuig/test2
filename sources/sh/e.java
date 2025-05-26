package sh;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import ln2.k;

/* loaded from: classes.dex */
public final class e extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112905a = 1;

    public e() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        wo2.e e13;
        switch (this.f112905a) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = wo2.e.f130680i;
                reentrantLock = wo2.e.f130680i;
                reentrantLock.lock();
                try {
                    e13 = k.e();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (e13 == wo2.e.f130684m) {
                wo2.e.f130684m = null;
                return;
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
            if (e13 != null) {
                e13.m();
            }
        }
    }

    public e(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
}
