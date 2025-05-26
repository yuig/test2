package pc;

import java.text.DateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99601a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99602b;

    public s0() {
        this.f99601a = 1;
        this.f99602b = xk2.m.b(v00.b.f123767i);
    }

    public final void a(tc.g writer, v customScalarAdapters, q0 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        ((a) this.f99602b).d(writer, customScalarAdapters, value.f99599a);
    }

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        switch (this.f99601a) {
            case 0:
                a(writer, customScalarAdapters, (q0) obj);
                break;
            default:
                Date value = (Date) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                String format = ((DateFormat) ((xk2.k) this.f99602b).getValue()).format(value);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                writer.n1(format);
                break;
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        switch (this.f99601a) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return new q0(((a) this.f99602b).f(reader, customScalarAdapters));
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Date c13 = vb0.g.c(reader.Y0(), false);
                Intrinsics.checkNotNullExpressionValue(c13, "stringToDate(...)");
                return c13;
        }
    }

    public s0(a wrappedAdapter) {
        this.f99601a = 0;
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.f99602b = wrappedAdapter;
    }
}
