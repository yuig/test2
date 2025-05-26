package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pa implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final pa f137384a = new pa();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137385b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.jb value = (x40.jb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(oa.f137351a)).d(writer, customScalarAdapters, value.f132614a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ib ibVar = null;
        while (reader.V1(f137385b) == 0) {
            ibVar = (x40.ib) pc.c.b(pc.c.c(oa.f137351a)).f(reader, customScalarAdapters);
        }
        return new x40.jb(ibVar);
    }
}
