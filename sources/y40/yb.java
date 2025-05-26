package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb f137662a = new yb();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137663b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.vc value = (x40.vc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(xb.f137630a)).d(writer, customScalarAdapters, value.f133553a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.uc ucVar = null;
        while (reader.V1(f137663b) == 0) {
            ucVar = (x40.uc) pc.c.b(pc.c.c(xb.f137630a)).f(reader, customScalarAdapters);
        }
        return new x40.vc(ucVar);
    }
}
