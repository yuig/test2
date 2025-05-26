package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f104610a;

    /* renamed from: b, reason: collision with root package name */
    public int f104611b;

    @Override // qo2.z0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f104610a, this.f104611b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        double[] dArr = this.f104610a;
        if (dArr.length < i13) {
            int length = dArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104610a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104611b;
    }
}
