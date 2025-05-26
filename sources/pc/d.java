package pc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99529a;

    /* renamed from: b, reason: collision with root package name */
    public final a f99530b;

    public d(a wrappedAdapter, int i13) {
        this.f99529a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
            this.f99530b = wrappedAdapter;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
            this.f99530b = wrappedAdapter;
        } else {
            Intrinsics.checkNotNullParameter(wrappedAdapter, "apolloAdapter");
            this.f99530b = wrappedAdapter;
        }
    }

    public final ArrayList a(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        reader.u();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            arrayList.add(this.f99530b.f(reader, customScalarAdapters));
        }
        reader.t();
        return arrayList;
    }

    public final void b(tc.g writer, v customScalarAdapters, List value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.u();
        Iterator it = value.iterator();
        while (it.hasNext()) {
            this.f99530b.d(writer, customScalarAdapters, it.next());
        }
        writer.t();
    }

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        int i13 = this.f99529a;
        a aVar = this.f99530b;
        switch (i13) {
            case 0:
                r0 value = (r0) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!(value instanceof q0)) {
                    writer.a2();
                    break;
                } else {
                    aVar.d(writer, customScalarAdapters, ((q0) value).f99599a);
                    break;
                }
            case 1:
                b(writer, customScalarAdapters, (List) obj);
                break;
            default:
                n0 value2 = (n0) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                aVar.d(writer, customScalarAdapters, value2);
                break;
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        int i13 = this.f99529a;
        a aVar = this.f99530b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                if (reader.peek() != tc.e.NULL) {
                    return new q0(aVar.f(reader, customScalarAdapters));
                }
                reader.E();
                return p0.f99597a;
            case 1:
                return a(reader, customScalarAdapters);
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                new ey.h().i();
                n0 n0Var = (n0) aVar.f(reader, customScalarAdapters);
                new ey.i().i();
                return n0Var;
        }
    }
}
