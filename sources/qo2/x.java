package qo2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f104650a;

    /* renamed from: b, reason: collision with root package name */
    public int f104651b;

    @Override // qo2.z0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f104650a, this.f104651b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // qo2.z0
    public final void b(int i13) {
        float[] fArr = this.f104650a;
        if (fArr.length < i13) {
            int length = fArr.length * 2;
            if (i13 < length) {
                i13 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f104650a = copyOf;
        }
    }

    @Override // qo2.z0
    public final int d() {
        return this.f104651b;
    }
}
