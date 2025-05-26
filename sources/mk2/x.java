package mk2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f87425a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f87426b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f87427c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f87428d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[LOOP:0: B:11:0x003a->B:19:0x006c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            mk2.x.f87427c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            mk2.x.f87428d = r0
            java.lang.String r0 = "rx2.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
        L18:
            r0 = r1
            goto L21
        L1a:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L18
        L21:
            mk2.x.f87425a = r0
            java.lang.String r2 = "rx2.purge-period-seconds"
            if (r0 == 0) goto L2e
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
        L2e:
            r0 = r1
            goto L34
        L30:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2e
        L34:
            mk2.x.f87426b = r0
            boolean r0 = mk2.x.f87425a
            if (r0 == 0) goto L70
        L3a:
            java.util.concurrent.atomic.AtomicReference r0 = mk2.x.f87427c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L45
            goto L70
        L45:
            mk2.t r3 = new mk2.t
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L50:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L66
            h6.r r6 = new h6.r
            r0 = 3
            r6.<init>(r0)
            int r0 = mk2.x.f87426b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L70
        L66:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L50
            r5.shutdownNow()
            goto L3a
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mk2.x.<clinit>():void");
    }
}
