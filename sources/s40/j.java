package s40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f111126a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final List f111127b = e0.b("v3DeleteAddressBookMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        r40.j value = (r40.j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3DeleteAddressBookMutation");
        pc.c.b(pc.c.c(d.f111116a)).d(writer, customScalarAdapters, value.f106169a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        r40.d dVar = null;
        while (reader.V1(f111127b) == 0) {
            dVar = (r40.d) pc.c.b(pc.c.c(d.f111116a)).f(reader, customScalarAdapters);
        }
        return new r40.j(dVar);
    }
}
