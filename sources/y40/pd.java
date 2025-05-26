package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pd implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final pd f137388a = new pd();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137389b = kotlin.collections.e0.b("v3LogDeviceScreenStateMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.re value = (x40.re) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3LogDeviceScreenStateMutation");
        pc.c.b(pc.c.c(od.f137356a)).d(writer, customScalarAdapters, value.f133189a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.qe qeVar = null;
        while (reader.V1(f137389b) == 0) {
            qeVar = (x40.qe) pc.c.b(pc.c.c(od.f137356a)).f(reader, customScalarAdapters);
        }
        return new x40.re(qeVar);
    }
}
