package h30;

import g30.s;
import g30.t;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f66798a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final List f66799b = e0.b("v3ResendUserEmailMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3ResendUserEmailMutation");
        pc.c.b(pc.c.c(q.f66797a)).d(writer, customScalarAdapters, value.f63439a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        s sVar = null;
        while (reader.V1(f66799b) == 0) {
            sVar = (s) pc.c.b(pc.c.c(q.f66797a)).f(reader, customScalarAdapters);
        }
        return new t(sVar);
    }
}
