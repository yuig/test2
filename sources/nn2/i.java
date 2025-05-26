package nn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.o implements Function1 {
    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return k0.f80436a.b(f.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qn2.i p03 = (qn2.i) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new f((j) this.receiver, p03);
    }
}
