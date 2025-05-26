package ho2;

import ao2.c1;
import ao2.d1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f69796b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public c1[] f69797a;

    public final void a(c1 c1Var) {
        c1Var.d((d1) this);
        c1[] c1VarArr = this.f69797a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69796b;
        if (c1VarArr == null) {
            c1VarArr = new c1[4];
            this.f69797a = c1VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= c1VarArr.length) {
            Object[] copyOf = Arrays.copyOf(c1VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            c1VarArr = (c1[]) copyOf;
            this.f69797a = c1VarArr;
        }
        int i13 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i13 + 1);
        c1VarArr[i13] = c1Var;
        c1Var.f20130b = i13;
        c(i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ao2.c1 b(int r9) {
        /*
            r8 = this;
            ao2.c1[] r0 = r8.f69797a
            kotlin.jvm.internal.Intrinsics.f(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ho2.z.f69796b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.f(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.f(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            ao2.c1[] r5 = r8.f69797a
            kotlin.jvm.internal.Intrinsics.f(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.f(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.f(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.f(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.f(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.f(r9)
            r2 = 0
            r9.d(r2)
            r9.f20130b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ho2.z.b(int):ao2.c1");
    }

    public final void c(int i13) {
        while (i13 > 0) {
            c1[] c1VarArr = this.f69797a;
            Intrinsics.f(c1VarArr);
            int i14 = (i13 - 1) / 2;
            c1 c1Var = c1VarArr[i14];
            Intrinsics.f(c1Var);
            c1 c1Var2 = c1VarArr[i13];
            Intrinsics.f(c1Var2);
            if (c1Var.compareTo(c1Var2) <= 0) {
                return;
            }
            d(i13, i14);
            i13 = i14;
        }
    }

    public final void d(int i13, int i14) {
        c1[] c1VarArr = this.f69797a;
        Intrinsics.f(c1VarArr);
        c1 c1Var = c1VarArr[i14];
        Intrinsics.f(c1Var);
        c1 c1Var2 = c1VarArr[i13];
        Intrinsics.f(c1Var2);
        c1VarArr[i13] = c1Var;
        c1VarArr[i14] = c1Var2;
        c1Var.f20130b = i13;
        c1Var2.f20130b = i14;
    }
}
