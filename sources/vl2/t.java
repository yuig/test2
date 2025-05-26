package vl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends x implements f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f126188f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(java.lang.Object r5, java.lang.reflect.Method r6) {
        /*
            r4 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.reflect.Type[] r0 = r6.getGenericParameterTypes()
            java.lang.String r1 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L16
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            goto L1b
        L16:
            int r1 = r0.length
            java.lang.Object[] r0 = kotlin.collections.z.n(r3, r1, r0)
        L1b:
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r4.<init>(r6, r2, r0)
            r4.f126188f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.t.<init>(java.lang.Object, java.lang.reflect.Method):void");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        b20.c cVar = new b20.c(2);
        cVar.b(this.f126188f);
        cVar.c(args);
        return e(cVar.D(new Object[cVar.C()]), null);
    }
}
