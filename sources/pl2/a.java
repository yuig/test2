package pl2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends ol2.a {
    @Override // ol2.f
    public final double c() {
        return ThreadLocalRandom.current().nextDouble(1.0d);
    }

    @Override // ol2.f
    public final int f(int i13, int i14) {
        return ThreadLocalRandom.current().nextInt(i13, i14);
    }

    @Override // ol2.a
    public final Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
