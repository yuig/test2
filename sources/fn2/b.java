package fn2;

import am2.i1;
import dm2.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.o;
import rl2.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f62725a = new b(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.e
    public final f getOwner() {
        return k0.f80436a.b(i1.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i1 p03 = (i1) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return Boolean.valueOf(((b1) p03).r0());
    }
}
