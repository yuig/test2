package vl2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends y implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f126179e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f126180f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.lang.reflect.Constructor r6, java.lang.Object r7, int r8) {
        /*
            r5 = this;
            r5.f126179e = r8
            r0 = 0
            java.lang.String r1 = "getGenericParameterTypes(...)"
            java.lang.String r2 = "getDeclaringClass(...)"
            java.lang.String r3 = "constructor"
            r4 = 1
            if (r8 == r4) goto L33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Class r8 = r6.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            java.lang.reflect.Type[] r2 = r6.getGenericParameterTypes()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = r2.length
            r3 = 2
            if (r1 > r3) goto L25
            r1 = 0
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            goto L2b
        L25:
            int r1 = r2.length
            int r1 = r1 - r4
            java.lang.Object[] r1 = kotlin.collections.z.n(r4, r1, r2)
        L2b:
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            r5.<init>(r6, r8, r0, r1)
            r5.f126180f = r7
            return
        L33:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.Class r8 = r6.getDeclaringClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            java.lang.reflect.Type[] r2 = r6.getGenericParameterTypes()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r5.<init>(r6, r8, r0, r2)
            r5.f126180f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.h.<init>(java.lang.reflect.Constructor, java.lang.Object, int):void");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        int i13 = this.f126179e;
        Object obj = this.f126180f;
        Member member = this.f126192a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                b20.c cVar = new b20.c(3);
                cVar.b(obj);
                cVar.c(args);
                cVar.b(null);
                return ((Constructor) member).newInstance(cVar.D(new Object[cVar.C()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                dl2.b.F(this, args);
                b20.c cVar2 = new b20.c(2);
                cVar2.b(obj);
                cVar2.c(args);
                return ((Constructor) member).newInstance(cVar2.D(new Object[cVar2.C()]));
        }
    }
}
