package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x f25759a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25760b = kotlin.collections.f0.j("pins", "users", "interests", "usersDidItData", "boards");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.z value = (b40.z) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pins");
        pc.c.b(pc.c.a(pc.c.c(u.f25753a))).d(writer, customScalarAdapters, value.f21768a);
        writer.M0("users");
        pc.c.b(pc.c.a(pc.c.c(v.f25755a))).d(writer, customScalarAdapters, value.f21769b);
        writer.M0("interests");
        pc.c.b(pc.c.a(pc.c.c(t.f25751a))).d(writer, customScalarAdapters, value.f21770c);
        writer.M0("usersDidItData");
        pc.c.b(pc.c.a(pc.c.c(w.f25757a))).d(writer, customScalarAdapters, value.f21771d);
        writer.M0("boards");
        pc.c.b(pc.c.a(pc.c.c(s.f25749a))).d(writer, customScalarAdapters, value.f21772e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        while (true) {
            int V1 = reader.V1(f25760b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.c(u.f25753a))).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                list2 = (List) pc.c.b(pc.c.a(pc.c.c(v.f25755a))).f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                list3 = (List) pc.c.b(pc.c.a(pc.c.c(t.f25751a))).f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                list4 = (List) pc.c.b(pc.c.a(pc.c.c(w.f25757a))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new b40.z(list, list2, list3, list4, list5);
                }
                list5 = (List) pc.c.b(pc.c.a(pc.c.c(s.f25749a))).f(reader, customScalarAdapters);
            }
        }
    }
}
