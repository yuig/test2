package xg2;

import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f134955a;

    /* renamed from: b, reason: collision with root package name */
    public Future f134956b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f134957c;

    public c(a crashFileMarker) {
        Intrinsics.checkNotNullParameter(crashFileMarker, "crashFileMarker");
        this.f134955a = crashFileMarker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (((java.io.File) r0.f134953a.getValue()).delete() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            xg2.a r0 = r5.f134955a
            xg2.b r0 = (xg2.b) r0
            java.lang.Object r1 = r0.f134954b
            monitor-enter(r1)
            java.lang.Object r2 = r0.f134954b     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            xk2.k r4 = r0.f134953a     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L24
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L24
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L24
            boolean r4 = r4.exists()     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L24
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.SecurityException -> L1c java.lang.Throwable -> L24
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r4 == 0) goto L26
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Throwable -> L24
            goto L42
        L24:
            r0 = move-exception
            goto L3d
        L26:
            xk2.k r4 = r0.f134953a     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L36
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L36
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L36
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L36
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L24 java.lang.SecurityException -> L36
        L36:
            if (r3 == 0) goto L41
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L24
            goto L42
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            goto L7b
        L41:
            r3 = 0
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r0.f134954b     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3f
            xk2.k r4 = r0.f134953a     // Catch: java.lang.Throwable -> L78
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L78
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L78
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L6d
            xk2.k r4 = r0.f134953a     // Catch: java.lang.SecurityException -> L62 java.lang.Throwable -> L78
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.SecurityException -> L62 java.lang.Throwable -> L78
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.SecurityException -> L62 java.lang.Throwable -> L78
            boolean r4 = r4.delete()     // Catch: java.lang.SecurityException -> L62 java.lang.Throwable -> L78
            if (r4 != 0) goto L6d
        L62:
            xk2.k r0 = r0.f134953a     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L78
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L78
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L78
            r0.delete()     // Catch: java.lang.SecurityException -> L6d java.lang.Throwable -> L78
        L6d:
            kotlin.Unit r0 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L78
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.f134957c = r0
            return r3
        L78:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L7b:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xg2.c.a():boolean");
    }
}
