package q2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f102114a;

    public j(int i13) {
        this.f102114a = i13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntRef(element = ");
        sb3.append(this.f102114a);
        sb3.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb3.append(num);
        return sb3.toString();
    }
}
