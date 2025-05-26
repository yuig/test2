package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f104648a;

    /* renamed from: b, reason: collision with root package name */
    public int f104649b;

    @Override // qo2.z0
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f104648a, this.f104649b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.j0(storage);
    }

    @Override // qo2.z0
    public final void b(int i13) {
        short[] sArr = this.f104648a;
        if (sArr.length < i13) {
            int length = sArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i13);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f104648a = storage;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104649b;
    }
}
