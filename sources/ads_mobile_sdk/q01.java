package ads_mobile_sdk;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9890a;

    public q01(a.o8 o8Var) {
        this.f9890a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.v0 randomGenerator = (a.v0) this.f9890a.get();
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        randomGenerator.getClass();
        String valueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        kh2.a1.p(valueOf);
        return valueOf;
    }
}
