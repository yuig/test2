package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i8 f137154a = new i8();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137155b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b9 value = (x40.b9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(h8.f137123a)).d(writer, customScalarAdapters, value.f132036a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.a9 a9Var = null;
        while (reader.V1(f137155b) == 0) {
            a9Var = (x40.a9) pc.c.b(pc.c.c(h8.f137123a)).f(reader, customScalarAdapters);
        }
        return new x40.b9(a9Var);
    }
}
