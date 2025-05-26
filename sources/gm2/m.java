package gm2;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f65782a = new m(1);

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        return k0.f80436a.b(w.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field p03 = (Field) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return new w(p03);
    }
}
