package qo2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a implements no2.b {
    @Override // no2.a
    public Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return j(decoder);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object f13 = f();
        int g13 = g(f13);
        po2.a b13 = decoder.b(a());
        while (true) {
            int o13 = b13.o(a());
            if (o13 == -1) {
                b13.a(a());
                return m(f13);
            }
            k(b13, o13 + g13, f13, true);
        }
    }

    public abstract void k(po2.a aVar, int i13, Object obj, boolean z13);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
