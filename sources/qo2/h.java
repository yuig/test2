package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f104561a;

    /* renamed from: b, reason: collision with root package name */
    public int f104562b;

    @Override // qo2.z0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f104561a, this.f104562b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        byte[] bArr = this.f104561a;
        if (bArr.length < i13) {
            int length = bArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104561a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104562b;
    }
}
