package u12;

import kotlin.jvm.internal.Intrinsics;
import n60.o;

/* loaded from: classes2.dex */
public final class c implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f120007a;

    public c(ke0.b interestListDeserializer) {
        Intrinsics.checkNotNullParameter(interestListDeserializer, "interestListDeserializer");
        this.f120007a = interestListDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c cVar) {
        return this.f120007a.c(o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)"));
    }
}
