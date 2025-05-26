package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f104541a;

    /* renamed from: b, reason: collision with root package name */
    public int f104542b;

    @Override // qo2.z0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f104541a, this.f104542b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        int[] iArr = this.f104541a;
        if (iArr.length < i13) {
            int length = iArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104541a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104542b;
    }
}
