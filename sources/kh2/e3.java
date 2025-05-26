package kh2;

import android.os.Process;
import android.os.StatFs;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.TraceEvent;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f79475a;

    /* renamed from: b */
    public final /* synthetic */ Object f79476b;

    public /* synthetic */ e3(Object obj, int i13) {
        this.f79475a = i13;
        this.f79476b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f79475a) {
            case 0:
                fi2.b a13 = ((f3) this.f79476b).a();
                long availableBytes = ((StatFs) a13.f62225c.f1628a.getValue()).getAvailableBytes();
                ArrayList c13 = a13.c(new df.f0(8));
                ArrayList arrayList = new ArrayList();
                for (Object obj : c13) {
                    if (((File) obj).isFile()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                long j13 = 0;
                while (it.hasNext()) {
                    j13 += ((File) it.next()).length();
                }
                Map storageTelemetry = kotlin.collections.z0.g(new Pair("emb.storage.used", String.valueOf(j13)), new Pair("emb.storage.available", String.valueOf(availableBytes)));
                gi2.a aVar = a13.f62224b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(storageTelemetry, "storageTelemetry");
                aVar.f65165d.putAll(storageTelemetry);
                return;
            case 1:
                ((mh2.k) this.f79476b).b();
                return;
            case 2:
                bi2.e eVar = (bi2.e) this.f79476b;
                eVar.f22895c.getLifecycle().a(eVar);
                return;
            case 3:
                hi2.a aVar2 = (hi2.a) this.f79476b;
                if (aVar2.f69237a.getViewTreeObserver().isAlive()) {
                    aVar2.f69237a.getViewTreeObserver().removeOnDrawListener(aVar2);
                    return;
                }
                return;
            case 4:
                ((CountDownLatch) this.f79476b).countDown();
                return;
            case 5:
                gp2.h hVar = (gp2.h) this.f79476b;
                TraceEvent c14 = TraceEvent.c(hVar.f65951b);
                try {
                    synchronized (hVar.f65955f) {
                        LinkedList linkedList = hVar.f65957h;
                        if (linkedList != null) {
                            Runnable runnable = (Runnable) linkedList.poll();
                            int i13 = hVar.f65950a;
                            if (i13 == 0 || i13 == 1) {
                                Process.setThreadPriority(10);
                            } else if (i13 == 2 || i13 == 3) {
                                Process.setThreadPriority(0);
                            } else if (i13 == 4 || i13 == 5) {
                                Process.setThreadPriority(-1);
                            }
                            runnable.run();
                            if (c14 == null) {
                                return;
                            }
                        } else if (c14 == null) {
                            return;
                        }
                    }
                    c14.close();
                    return;
                } catch (Throwable th3) {
                    if (c14 != null) {
                        try {
                            c14.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            default:
                ((CronetUrlRequestContext) this.f79476b).f97418d.decrementAndGet();
                return;
        }
    }
}
