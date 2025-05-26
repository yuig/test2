package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f104578a;

    /* renamed from: b, reason: collision with root package name */
    public int f104579b;

    @Override // qo2.z0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f104578a, this.f104579b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        long[] jArr = this.f104578a;
        if (jArr.length < i13) {
            int length = jArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104578a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104579b;
    }
}
