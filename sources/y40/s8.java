package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s8 f137470a = new s8();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137471b = kotlin.collections.e0.b("v3GetConversationQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.l9 value = (x40.l9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetConversationQuery");
        pc.c.b(pc.c.c(r8.f137442a)).d(writer, customScalarAdapters, value.f132726a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.k9 k9Var = null;
        while (reader.V1(f137471b) == 0) {
            k9Var = (x40.k9) pc.c.b(pc.c.c(r8.f137442a)).f(reader, customScalarAdapters);
        }
        return new x40.l9(k9Var);
    }
}
