package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f104626a;

    /* renamed from: b, reason: collision with root package name */
    public int f104627b;

    @Override // qo2.z0
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f104626a, this.f104627b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.f0(storage);
    }

    @Override // qo2.z0
    public final void b(int i13) {
        long[] jArr = this.f104626a;
        if (jArr.length < i13) {
            int length = jArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            long[] storage = Arrays.copyOf(jArr, i13);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f104626a = storage;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104627b;
    }
}
