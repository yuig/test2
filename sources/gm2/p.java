package gm2;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f65785a = new p(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return k0.f80436a.b(z.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method p03 = (Method) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new z(p03);
    }
}
