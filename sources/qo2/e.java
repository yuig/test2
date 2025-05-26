package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f104544a;

    /* renamed from: b, reason: collision with root package name */
    public int f104545b;

    @Override // qo2.z0
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f104544a, this.f104545b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        boolean[] zArr = this.f104544a;
        if (zArr.length < i13) {
            int length = zArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104544a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104545b;
    }
}
