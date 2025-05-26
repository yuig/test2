package vl2;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class q extends y {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f126186e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(java.lang.reflect.Field r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            java.lang.String r1 = "TYPE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r7 == 0) goto Le
            java.lang.Class r7 = r5.getDeclaringClass()
            goto Lf
        Le:
            r7 = 0
        Lf:
            java.lang.reflect.Type r1 = r5.getGenericType()
            java.lang.String r2 = "getGenericType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r1
            r4.<init>(r5, r0, r7, r2)
            r4.f126186e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.q.<init>(java.lang.reflect.Field, boolean, boolean):void");
    }

    @Override // vl2.y
    public void c(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        if (this.f126186e && kotlin.collections.c0.N(args) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    @Override // vl2.g
    public Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        c(args);
        ((Field) this.f126192a).set(this.f126194c != null ? kotlin.collections.c0.B(args) : null, kotlin.collections.c0.N(args));
        return Unit.f80348a;
    }
}
