package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sf implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final sf f137482a = new sf();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137483b = kotlin.collections.e0.b("officialUser");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.yg value = (x40.yg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("officialUser");
        pc.c.b(pc.c.c(rf.f137453a)).d(writer, customScalarAdapters, value.f133752a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.xg xgVar = null;
        while (reader.V1(f137483b) == 0) {
            xgVar = (x40.xg) pc.c.b(pc.c.c(rf.f137453a)).f(reader, customScalarAdapters);
        }
        return new x40.yg(xgVar);
    }
}
