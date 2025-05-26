package xl2;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i */
    public static final a f135261i = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceLoader load = ServiceLoader.load(c.class, c.class.getClassLoader());
        Intrinsics.f(load);
        c cVar = (c) CollectionsKt.T(load);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
