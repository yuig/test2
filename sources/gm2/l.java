package gm2;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l f65781a = new l(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return k0.f80436a.b(Member.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p03 = (Member) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return Boolean.valueOf(p03.isSynthetic());
    }
}
