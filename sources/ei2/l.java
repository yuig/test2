package ei2;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements nj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final pj2.c f59017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59018b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f59019c;

    public l(g spanExporter, String processIdentifier) {
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        Intrinsics.checkNotNullParameter(processIdentifier, "processIdentifier");
        this.f59017a = spanExporter;
        this.f59018b = processIdentifier;
        this.f59019c = new AtomicLong(1L);
    }

    @Override // nj2.q
    public final boolean F() {
        return true;
    }

    @Override // nj2.q
    public final void T(vi2.b parentContext, nj2.i span) {
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(span, "span");
        c0.d.F2(span, sh2.h.f112956e, String.valueOf(this.f59019c.getAndIncrement()));
        c0.d.F2(span, sh2.h.f112955d, this.f59018b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:4:0x0014, B:6:0x0018, B:9:0x001f, B:11:0x002a, B:13:0x002e, B:15:0x004b, B:17:0x004f, B:20:0x0056, B:22:0x005c, B:24:0x007a, B:27:0x0086, B:30:0x009d, B:39:0x0083, B:40:0x0060, B:41:0x0077, B:42:0x0034, B:44:0x003a, B:45:0x003f, B:46:0x0025), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:4:0x0014, B:6:0x0018, B:9:0x001f, B:11:0x002a, B:13:0x002e, B:15:0x004b, B:17:0x004f, B:20:0x0056, B:22:0x005c, B:24:0x007a, B:27:0x0086, B:30:0x009d, B:39:0x0083, B:40:0x0060, B:41:0x0077, B:42:0x0034, B:44:0x003a, B:45:0x003f, B:46:0x0025), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:4:0x0014, B:6:0x0018, B:9:0x001f, B:11:0x002a, B:13:0x002e, B:15:0x004b, B:17:0x004f, B:20:0x0056, B:22:0x005c, B:24:0x007a, B:27:0x0086, B:30:0x009d, B:39:0x0083, B:40:0x0060, B:41:0x0077, B:42:0x0034, B:44:0x003a, B:45:0x003f, B:46:0x0025), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:4:0x0014, B:6:0x0018, B:9:0x001f, B:11:0x002a, B:13:0x002e, B:15:0x004b, B:17:0x004f, B:20:0x0056, B:22:0x005c, B:24:0x007a, B:27:0x0086, B:30:0x009d, B:39:0x0083, B:40:0x0060, B:41:0x0077, B:42:0x0034, B:44:0x003a, B:45:0x003f, B:46:0x0025), top: B:3:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:4:0x0014, B:6:0x0018, B:9:0x001f, B:11:0x002a, B:13:0x002e, B:15:0x004b, B:17:0x004f, B:20:0x0056, B:22:0x005c, B:24:0x007a, B:27:0x0086, B:30:0x009d, B:39:0x0083, B:40:0x0060, B:41:0x0077, B:42:0x0034, B:44:0x003a, B:45:0x003f, B:46:0x0025), top: B:3:0x0014 }] */
    @Override // nj2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(nj2.g r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "span"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = r21
            pj2.c r2 = r1.f59017a
            r3 = 1
            nj2.r[] r4 = new nj2.r[r3]
            r6 = r0
            nj2.i r6 = (nj2.i) r6
            java.lang.Object r15 = r6.f91010j
            monitor-enter(r15)
            java.util.List r0 = r6.f91015o     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L25
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L1f
            goto L25
        L1f:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> Lb3
        L23:
            r7 = r0
            goto L2a
        L25:
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb3
            goto L23
        L2a:
            java.util.ArrayList r0 = r6.f91013m     // Catch: java.lang.Throwable -> Lb3
            if (r0 != 0) goto L34
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb3
        L32:
            r8 = r0
            goto L4b
        L34:
            nj2.h r5 = r6.f91019s     // Catch: java.lang.Throwable -> Lb3
            nj2.h r8 = nj2.h.ENDED     // Catch: java.lang.Throwable -> Lb3
            if (r5 != r8) goto L3f
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L32
        L3f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb3
            java.util.ArrayList r5 = r6.f91013m     // Catch: java.lang.Throwable -> Lb3
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L32
        L4b:
            aj2.b r0 = r6.f91012l     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L77
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L56
            goto L77
        L56:
            nj2.h r0 = r6.f91019s     // Catch: java.lang.Throwable -> Lb3
            nj2.h r5 = nj2.h.ENDED     // Catch: java.lang.Throwable -> Lb3
            if (r0 != r5) goto L60
            aj2.b r0 = r6.f91012l     // Catch: java.lang.Throwable -> Lb3
        L5e:
            r9 = r0
            goto L7a
        L60:
            aj2.b r0 = r6.f91012l     // Catch: java.lang.Throwable -> Lb3
            r0.getClass()     // Catch: java.lang.Throwable -> Lb3
            qi2.b r5 = new qi2.b     // Catch: java.lang.Throwable -> Lb3
            r5.<init>()     // Catch: java.lang.Throwable -> Lb3
            g72.c0 r9 = new g72.c0     // Catch: java.lang.Throwable -> Lb3
            r9.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lb3
            r0.forEach(r9)     // Catch: java.lang.Throwable -> Lb3
            qi2.a r0 = r5.a()     // Catch: java.lang.Throwable -> Lb3
            goto L5e
        L77:
            qi2.a r0 = qi2.a.f104005d     // Catch: java.lang.Throwable -> Lb3
            goto L5e
        L7a:
            aj2.b r0 = r6.f91012l     // Catch: java.lang.Throwable -> Lb3
            r18 = 0
            if (r0 != 0) goto L83
            r10 = r18
            goto L86
        L83:
            int r0 = r0.f15432c     // Catch: java.lang.Throwable -> Lb3
            r10 = r0
        L86:
            int r11 = r6.f91014n     // Catch: java.lang.Throwable -> Lb3
            int r12 = r6.f91016p     // Catch: java.lang.Throwable -> Lb3
            oj2.b r13 = r6.f91017q     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r14 = r6.f91011k     // Catch: java.lang.Throwable -> Lb3
            r19 = r4
            long r3 = r6.f91018r     // Catch: java.lang.Throwable -> Lb3
            nj2.h r5 = r6.f91019s     // Catch: java.lang.Throwable -> Lb3
            nj2.h r0 = nj2.h.ENDED     // Catch: java.lang.Throwable -> Lb3
            if (r5 != r0) goto L9b
            r17 = 1
            goto L9d
        L9b:
            r17 = r18
        L9d:
            nj2.b r0 = new nj2.b     // Catch: java.lang.Throwable -> Lb3
            r5 = r0
            r20 = r15
            r15 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb1
            r19[r18] = r0
            java.util.ArrayList r0 = kotlin.collections.f0.l(r19)
            r2.b(r0)
            return
        Lb1:
            r0 = move-exception
            goto Lb6
        Lb3:
            r0 = move-exception
            r20 = r15
        Lb6:
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.l.X(nj2.g):void");
    }

    @Override // nj2.q
    public final boolean e2() {
        return true;
    }
}
