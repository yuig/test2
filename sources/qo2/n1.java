package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f104599a;

    /* renamed from: b, reason: collision with root package name */
    public int f104600b;

    @Override // qo2.z0
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f104599a, this.f104600b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.z(storage);
    }

    @Override // qo2.z0
    public final void b(int i13) {
        byte[] bArr = this.f104599a;
        if (bArr.length < i13) {
            int length = bArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i13);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f104599a = storage;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104600b;
    }
}
