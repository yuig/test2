package t00;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final c f115700a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f115701b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f115702c;

    public k(c baseErrorDialogChecks) {
        Intrinsics.checkNotNullParameter(baseErrorDialogChecks, "baseErrorDialogChecks");
        this.f115700a = baseErrorDialogChecks;
        this.f115701b = z0.g(new Pair(8, Integer.valueOf(yu1.a.slow_down)), new Pair(9, Integer.valueOf(yu1.a.oops)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qz.d a(int r2, qz.d r3, java.lang.Integer r4) {
        /*
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 != 0) goto L8
            goto L23
        L8:
            int r4 = r4.intValue()
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 != r0) goto L23
            t00.c r4 = r1.f115700a
            r4.getClass()
            java.util.List r4 = t00.h.f115688b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            r1.f115702c = r2
            if (r2 == 0) goto L4e
            java.util.Map r2 = r1.f115701b
            int r4 = r3.f105387g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L4e
            int r4 = r3.f105387g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L4e
            int r2 = r2.intValue()
            java.lang.String r2 = bs1.c.b2(r2)
            r3.f105384d = r2
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.k.a(int, qz.d, java.lang.Integer):qz.d");
    }
}
