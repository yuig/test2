package o3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f92849a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f92850b = new long[2];

    public final void a(long j13) {
        if (c(j13)) {
            return;
        }
        int i13 = this.f92849a;
        long[] jArr = this.f92850b;
        if (i13 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i13 + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f92850b = copyOf;
        }
        this.f92850b[i13] = j13;
        if (i13 >= this.f92849a) {
            this.f92849a = i13 + 1;
        }
    }

    public final void b() {
        this.f92849a = 0;
    }

    public final boolean c(long j13) {
        int i13 = this.f92849a;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f92850b[i14] == j13) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i13) {
        return this.f92850b[i13];
    }

    public final int e() {
        return this.f92849a;
    }

    public final boolean f() {
        return this.f92849a == 0;
    }

    public final boolean g(long j13) {
        int i13 = this.f92849a;
        for (int i14 = 0; i14 < i13; i14++) {
            if (j13 == this.f92850b[i14]) {
                i(i14);
                return true;
            }
        }
        return false;
    }

    public final void h(long j13) {
        g(j13);
    }

    public final void i(int i13) {
        int i14 = this.f92849a;
        if (i13 < i14) {
            int i15 = i14 - 1;
            while (i13 < i15) {
                long[] jArr = this.f92850b;
                int i16 = i13 + 1;
                jArr[i13] = jArr[i16];
                i13 = i16;
            }
            this.f92849a--;
        }
    }
}
