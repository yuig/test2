package ln2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class j0 extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f84093a = new j0(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return kotlin.jvm.internal.k0.f80436a.b(ym2.b.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ym2.b p03 = (ym2.b) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return p03.f();
    }
}
