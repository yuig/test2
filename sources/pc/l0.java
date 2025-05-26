package pc;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f99580a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99581b;

    public l0(a wrappedAdapter, boolean z13) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.f99580a = wrappedAdapter;
        this.f99581b = z13;
    }

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        boolean z13 = this.f99581b;
        a aVar = this.f99580a;
        if (!z13 || (writer instanceof tc.m)) {
            writer.s();
            aVar.d(writer, customScalarAdapters, obj);
            writer.v();
            return;
        }
        tc.m mVar = new tc.m();
        mVar.s();
        aVar.d(mVar, customScalarAdapters, obj);
        mVar.v();
        Object c13 = mVar.c();
        Intrinsics.f(c13);
        bs1.c.z2(writer, c13);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (this.f99581b) {
            Intrinsics.checkNotNullParameter(reader, "<this>");
            if (reader instanceof tc.i) {
                reader = (tc.i) reader;
            } else {
                tc.e peek = reader.peek();
                if (peek != tc.e.BEGIN_OBJECT) {
                    throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + peek + "` json token").toString());
                }
                ArrayList r13 = reader.r();
                Object Z = bf.b.Z(reader);
                Intrinsics.g(Z, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                reader = new tc.i(r13, (Map) Z);
            }
        }
        reader.s();
        Object f13 = this.f99580a.f(reader, customScalarAdapters);
        reader.v();
        return f13;
    }
}
