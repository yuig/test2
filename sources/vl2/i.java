package vl2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f126181e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(java.lang.reflect.Constructor r6, int r7) {
        /*
            r5 = this;
            r5.f126181e = r7
            r0 = 0
            java.lang.String r1 = "getGenericParameterTypes(...)"
            java.lang.String r2 = "getDeclaringClass(...)"
            java.lang.String r3 = "constructor"
            r4 = 1
            if (r7 == r4) goto L30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Class r7 = r6.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.reflect.Type[] r2 = r6.getGenericParameterTypes()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 > r4) goto L24
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
            goto L2a
        L24:
            int r1 = r2.length
            int r1 = r1 - r4
            java.lang.Object[] r1 = kotlin.collections.z.n(r3, r1, r2)
        L2a:
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            r5.<init>(r6, r7, r0, r1)
            return
        L30:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Class r7 = r6.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.Class r2 = r6.getDeclaringClass()
            java.lang.Class r3 = r2.getDeclaringClass()
            if (r3 == 0) goto L4f
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L4f
            r0 = r3
        L4f:
            java.lang.reflect.Type[] r2 = r6.getGenericParameterTypes()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r5.<init>(r6, r7, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.i.<init>(java.lang.reflect.Constructor, int):void");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        int i13 = this.f126181e;
        Member member = this.f126192a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                b20.c cVar = new b20.c(2);
                cVar.c(args);
                cVar.b(null);
                return ((Constructor) member).newInstance(cVar.D(new Object[cVar.C()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                return ((Constructor) member).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
