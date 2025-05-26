package vl2;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class x extends y {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f126191e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ x(java.lang.reflect.Method r2, boolean r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto Le
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            r3 = r3 ^ 1
        Le:
            java.lang.reflect.Type[] r4 = r2.getGenericParameterTypes()
            java.lang.String r0 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.x.<init>(java.lang.reflect.Method, boolean, int):void");
    }

    public final Object e(Object[] args, Object obj) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f126191e ? Unit.f80348a : ((Method) this.f126192a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(java.lang.reflect.Method r3, boolean r4, java.lang.reflect.Type[] r5) {
        /*
            r2 = this;
            java.lang.reflect.Type r0 = r3.getGenericReturnType()
            java.lang.String r1 = "getGenericReturnType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r4 == 0) goto L10
            java.lang.Class r4 = r3.getDeclaringClass()
            goto L11
        L10:
            r4 = 0
        L11:
            r2.<init>(r3, r0, r4, r5)
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            r2.f126191e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.x.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
    }
}
