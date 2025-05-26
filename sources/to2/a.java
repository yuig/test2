package to2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f118704a;

    public a(no2.b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f118704a = serializer;
    }

    @Override // to2.c
    public final no2.b a(List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return this.f118704a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && Intrinsics.d(((a) obj).f118704a, this.f118704a);
    }

    public final int hashCode() {
        return this.f118704a.hashCode();
    }
}
