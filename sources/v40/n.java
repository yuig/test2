package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f124073a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124074b = kotlin.collections.f0.j("v3UsersMeViewerResponse", "v3EditSettingsHandlerResponse", "clientMutationId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.n value = (u40.n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3UsersMeViewerResponse");
        pc.c.b(pc.c.c(f.f124049a)).d(writer, customScalarAdapters, value.f120391a);
        writer.M0("v3EditSettingsHandlerResponse");
        pc.c.b(pc.c.c(e.f124044a)).d(writer, customScalarAdapters, value.f120392b);
        writer.M0("clientMutationId");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f120393c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.f fVar = null;
        u40.e eVar = null;
        String str = null;
        while (true) {
            int V1 = reader.V1(f124074b);
            if (V1 == 0) {
                fVar = (u40.f) pc.c.b(pc.c.c(f.f124049a)).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                eVar = (u40.e) pc.c.b(pc.c.c(e.f124044a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new u40.n(fVar, eVar, str);
                }
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
