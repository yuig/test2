package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class c implements q3.w0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f17224b;

    /* renamed from: c, reason: collision with root package name */
    public bl2.f f17225c;

    public final void l() {
        if (this.f17224b) {
            return;
        }
        this.f17224b = true;
        bl2.f fVar = this.f17225c;
        if (fVar != null) {
            xk2.q qVar = xk2.s.f135225b;
            fVar.resumeWith(Unit.f80348a);
        }
        this.f17225c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.b r0 = (androidx.compose.foundation.lazy.layout.b) r0
            int r1 = r0.f17220u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17220u = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.b r0 = new androidx.compose.foundation.lazy.layout.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17218s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f17220u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bl2.c r0 = r0.f17217r
            ue.c.H(r6)
            goto L62
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            ue.c.H(r6)
            boolean r6 = r5.f17224b
            if (r6 != 0) goto L6b
            bl2.f r6 = r5.f17225c
            r0.getClass()
            r0.f17217r = r6
            r0.f17220u = r3
            bl2.f r2 = new bl2.f
            bl2.c r3 = cl2.h.b(r0)
            java.lang.String r4 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            cl2.a r4 = cl2.a.UNDECIDED
            r2.<init>(r4, r3)
            r5.f17225c = r2
            java.lang.Object r2 = r2.a()
            if (r2 != r1) goto L5e
            java.lang.String r3 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
        L5e:
            if (r2 != r1) goto L61
            return r1
        L61:
            r0 = r6
        L62:
            if (r0 == 0) goto L6b
            xk2.q r6 = xk2.s.f135225b
            kotlin.Unit r6 = kotlin.Unit.f80348a
            r0.resumeWith(r6)
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.c.m(bl2.c):java.lang.Object");
    }
}
