package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final mg f137295a = new mg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137296b = kotlin.collections.e0.b("v3RelatedPinsForConversationQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.sh value = (x40.sh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RelatedPinsForConversationQuery");
        pc.c.b(pc.c.c(df.f136999a)).d(writer, customScalarAdapters, value.f133277a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.jg jgVar = null;
        while (reader.V1(f137296b) == 0) {
            jgVar = (x40.jg) pc.c.b(pc.c.c(df.f136999a)).f(reader, customScalarAdapters);
        }
        return new x40.sh(jgVar);
    }
}
