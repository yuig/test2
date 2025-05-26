package vl2;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m extends y {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.reflect.Field r3, boolean r4) {
        /*
            r2 = this;
            java.lang.reflect.Type r0 = r3.getGenericType()
            java.lang.String r1 = "getGenericType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r4 == 0) goto L10
            java.lang.Class r4 = r3.getDeclaringClass()
            goto L11
        L10:
            r4 = 0
        L11:
            r1 = 0
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.m.<init>(java.lang.reflect.Field, boolean):void");
    }

    @Override // vl2.g
    public Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        c(args);
        return ((Field) this.f126192a).get(this.f126194c != null ? kotlin.collections.c0.B(args) : null);
    }
}
