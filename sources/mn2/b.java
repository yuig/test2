package mn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.o;
import rl2.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends o implements Function1 {
    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.e
    public final f getOwner() {
        return k0.f80436a.b(e.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p03 = (String) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        ((e) this.receiver).getClass();
        return e.a(p03);
    }
}
