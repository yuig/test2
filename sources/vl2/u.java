package vl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends x implements f {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f126189f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(java.lang.reflect.Method r4, java.lang.Object[] r5) {
        /*
            r3 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "boundReceiverComponents"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
            java.lang.String r1 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r5.length
            java.util.List r0 = kotlin.collections.c0.z(r1, r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r3.<init>(r4, r1, r0)
            r3.f126189f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.u.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        b20.c cVar = new b20.c(2);
        cVar.c(this.f126189f);
        cVar.c(args);
        return e(cVar.D(new Object[cVar.C()]), null);
    }
}
