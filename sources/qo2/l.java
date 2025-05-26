package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f104584a;

    /* renamed from: b, reason: collision with root package name */
    public int f104585b;

    @Override // qo2.z0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f104584a, this.f104585b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        char[] cArr = this.f104584a;
        if (cArr.length < i13) {
            int length = cArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104584a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104585b;
    }
}
