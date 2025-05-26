package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f104612a;

    /* renamed from: b, reason: collision with root package name */
    public int f104613b;

    @Override // qo2.z0
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f104612a, this.f104613b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.c0(storage);
    }

    @Override // qo2.z0
    public final void b(int i13) {
        int[] iArr = this.f104612a;
        if (iArr.length < i13) {
            int length = iArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f104612a = storage;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104613b;
    }
}
