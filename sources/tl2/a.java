package tl2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.o;
import ln2.a0;
import rl2.f;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends o implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f118112a = new a(2);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.e
    public final f getOwner() {
        return k0.f80436a.b(a0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a0 p03 = (a0) obj;
        tm2.a0 p13 = (tm2.a0) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        return p03.e(p13);
    }
}
