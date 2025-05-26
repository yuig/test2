package t72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final s72.b f116667a;

    public l(s72.b cutoutEditorRepository, int i13) {
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(cutoutEditorRepository, "cutoutEditorRepository");
            this.f116667a = cutoutEditorRepository;
        } else {
            Intrinsics.checkNotNullParameter(cutoutEditorRepository, "cutoutEditorRepository");
            this.f116667a = cutoutEditorRepository;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, android.graphics.RectF r6, bl2.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t72.k
            if (r0 == 0) goto L13
            r0 = r7
            t72.k r0 = (t72.k) r0
            int r1 = r0.f116666t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116666t = r1
            goto L18
        L13:
            t72.k r0 = new t72.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f116664r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116666t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r7)
            s72.b r7 = r4.f116667a     // Catch: java.lang.Throwable -> L27
            r0.f116666t = r3     // Catch: java.lang.Throwable -> L27
            i72.g r7 = (i72.g) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L27
            n72.j r5 = new n72.j     // Catch: java.lang.Throwable -> L27
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L27
            goto L57
        L49:
            n72.i r6 = new n72.i
            java.lang.String r7 = r5.getMessage()
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            r6.<init>(r7, r5)
            r5 = r6
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.l.a(java.lang.String, android.graphics.RectF, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t72.m
            if (r0 == 0) goto L13
            r0 = r6
            t72.m r0 = (t72.m) r0
            int r1 = r0.f116670t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116670t = r1
            goto L18
        L13:
            t72.m r0 = new t72.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f116668r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f116670t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ue.c.H(r6)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            s72.b r6 = r4.f116667a     // Catch: java.lang.Throwable -> L27
            r0.f116670t = r3     // Catch: java.lang.Throwable -> L27
            i72.g r6 = (i72.g) r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.b(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L27
            n72.j r5 = new n72.j     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            goto L57
        L49:
            n72.i r6 = new n72.i
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L53
            java.lang.String r0 = ""
        L53:
            r6.<init>(r0, r5)
            r5 = r6
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.l.b(java.lang.String, bl2.c):java.lang.Object");
    }
}
