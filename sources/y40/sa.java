package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sa implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final sa f137474a = new sa();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.mb value = (x40.mb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.lb) {
            List list = ra.f137445a;
            x40.lb value2 = (x40.lb) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132747a);
            writer.M0("connection");
            pc.c.b(pc.c.c(qa.f137415a)).d(writer, customScalarAdapters, value2.f132748b);
            return;
        }
        if (value instanceof x40.fb) {
            List list2 = la.f137252a;
            x40.fb value3 = (x40.fb) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f132408a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "UserUsersConnectionContainer")) {
            List list = la.f137252a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(la.f137252a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new x40.fb(typename);
        }
        List list2 = ra.f137445a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.kb kbVar = null;
        while (true) {
            int V1 = reader.V1(ra.f137445a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new x40.lb(typename, kbVar);
                }
                kbVar = (x40.kb) pc.c.b(pc.c.c(qa.f137415a)).f(reader, customScalarAdapters);
            }
        }
    }
}
