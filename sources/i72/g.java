package i72;

import android.content.Context;
import c72.u;
import kotlin.jvm.internal.Intrinsics;
import n72.m;

/* loaded from: classes4.dex */
public final class g implements s72.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f71691a;

    /* renamed from: b, reason: collision with root package name */
    public final k72.b f71692b;

    /* renamed from: c, reason: collision with root package name */
    public final u f71693c;

    /* renamed from: d, reason: collision with root package name */
    public final n72.a f71694d;

    /* renamed from: e, reason: collision with root package name */
    public final m f71695e;

    public g(Context context, k72.b cutoutEditorService, u cutoutEditorEntityMapper, n72.a dispatcherProvider, m72.a shuffleCoreLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cutoutEditorService, "cutoutEditorService");
        Intrinsics.checkNotNullParameter(cutoutEditorEntityMapper, "cutoutEditorEntityMapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        this.f71691a = context;
        this.f71692b = cutoutEditorService;
        this.f71693c = cutoutEditorEntityMapper;
        this.f71694d = dispatcherProvider;
        this.f71695e = shuffleCoreLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0164 A[PHI: r2
      0x0164: PHI (r2v23 java.lang.Object) = (r2v22 java.lang.Object), (r2v1 java.lang.Object) binds: [B:22:0x0161, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r20, android.graphics.RectF r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.g.a(java.lang.String, android.graphics.RectF, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[PHI: r8
      0x0064: PHI (r8v7 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0061, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i72.e
            if (r0 == 0) goto L13
            r0 = r8
            i72.e r0 = (i72.e) r0
            int r1 = r0.f71688u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71688u = r1
            goto L18
        L13:
            i72.e r0 = new i72.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f71686s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f71688u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            i72.g r7 = r0.f71685r
            ue.c.H(r8)
            goto L4d
        L38:
            ue.c.H(r8)
            java.util.List r7 = kotlin.collections.e0.b(r7)
            r0.f71685r = r6
            r0.f71688u = r4
            k72.b r8 = r6.f71692b
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r7 = r6
        L4d:
            d72.c r8 = (d72.c) r8
            n72.a r2 = r7.f71694d
            ao2.f0 r2 = r2.f89706b
            i72.f r4 = new i72.f
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f71685r = r5
            r0.f71688u = r3
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r0, r2, r4)
            if (r8 != r1) goto L64
            return r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i72.g.b(java.lang.String, bl2.c):java.lang.Object");
    }
}
