package s3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f110784a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f110785b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public k2.e[] f110786c = new k2.e[16];

    public final boolean a() {
        int i13 = this.f110784a;
        return i13 > 0 && this.f110785b[i13 - 1] >= 0;
    }

    public final Object b() {
        int i13 = this.f110784a;
        if (i13 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
        }
        int i14 = i13 - 1;
        int i15 = this.f110785b[i14];
        k2.e eVar = this.f110786c[i14];
        Intrinsics.f(eVar);
        if (i15 > 0) {
            this.f110785b[i14] = r3[i14] - 1;
        } else if (i15 == 0) {
            this.f110786c[i14] = null;
            this.f110784a--;
        }
        return eVar.f78182a[i15];
    }

    public final void c(k2.e eVar) {
        if (eVar.l()) {
            return;
        }
        int i13 = this.f110784a;
        int[] iArr = this.f110785b;
        if (i13 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f110785b = copyOf;
            k2.e[] eVarArr = this.f110786c;
            Object[] copyOf2 = Arrays.copyOf(eVarArr, eVarArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f110786c = (k2.e[]) copyOf2;
        }
        this.f110785b[i13] = eVar.f78184c - 1;
        this.f110786c[i13] = eVar;
        this.f110784a++;
    }
}
