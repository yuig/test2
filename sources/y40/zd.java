package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zd implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd f137695a = new zd();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137696b = kotlin.collections.e0.b("v3MarkContactRequestReadMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.df value = (x40.df) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3MarkContactRequestReadMutation");
        pc.c.b(pc.c.c(yd.f137666a)).d(writer, customScalarAdapters, value.f132249a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.cf cfVar = null;
        while (reader.V1(f137696b) == 0) {
            cfVar = (x40.cf) pc.c.b(pc.c.c(yd.f137666a)).f(reader, customScalarAdapters);
        }
        return new x40.df(cfVar);
    }
}
