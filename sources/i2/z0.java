package i2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f71423a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f71424b;

    public final int a() {
        int[] iArr = this.f71423a;
        int i13 = this.f71424b - 1;
        this.f71424b = i13;
        return iArr[i13];
    }

    public final void b(int i13) {
        int i14 = this.f71424b;
        int[] iArr = this.f71423a;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f71423a = copyOf;
        }
        int[] iArr2 = this.f71423a;
        int i15 = this.f71424b;
        this.f71424b = i15 + 1;
        iArr2[i15] = i13;
    }
}
