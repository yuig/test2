package pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f99573a;

    public k0(a wrappedAdapter) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.f99573a = wrappedAdapter;
        if (!(!(wrappedAdapter instanceof k0))) {
            throw new IllegalStateException("The adapter is already nullable".toString());
        }
    }

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (obj == null) {
            writer.a2();
        } else {
            this.f99573a.d(writer, customScalarAdapters, obj);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() != tc.e.NULL) {
            return this.f99573a.f(reader, customScalarAdapters);
        }
        reader.E();
        return null;
    }
}
