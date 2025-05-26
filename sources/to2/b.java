package to2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f118705a;

    public b(Function1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f118705a = provider;
    }

    @Override // to2.c
    public final no2.b a(List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return (no2.b) this.f118705a.invoke(typeArgumentsSerializers);
    }
}
