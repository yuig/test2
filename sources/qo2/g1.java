package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f104559a;

    /* renamed from: b, reason: collision with root package name */
    public int f104560b;

    @Override // qo2.z0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f104559a, this.f104560b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        short[] sArr = this.f104559a;
        if (sArr.length < i13) {
            int length = sArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104559a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104560b;
    }
}
