package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t9 f137506a = new t9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137507b = kotlin.collections.e0.b("url");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.na value = (x40.na) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("url");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132882a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137507b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new x40.na(str);
    }
}
