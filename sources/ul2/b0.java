package ul2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.o implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f122495a = new b0(2);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return kotlin.jvm.internal.k0.f80436a.b(ln2.a0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ln2.a0 p03 = (ln2.a0) obj;
        tm2.i0 p13 = (tm2.i0) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        return p03.f(p13);
    }
}
