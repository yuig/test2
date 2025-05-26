package qn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.o implements Function1 {
    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return k0.f80436a.b(g.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sn2.f p03 = (sn2.f) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return ((g) this.receiver).a(p03);
    }
}
