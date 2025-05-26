package qm2;

import am2.w0;
import java.util.Map;
import pn2.b0;

/* loaded from: classes4.dex */
public final class b implements bm2.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f104412a = new b();

    @Override // bm2.c
    public final Map a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // bm2.c
    public final w0 b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // bm2.c
    public final ym2.c c() {
        am2.g d2 = fn2.d.d(this);
        if (d2 == null) {
            return null;
        }
        if (rn2.m.g(d2)) {
            d2 = null;
        }
        if (d2 != null) {
            return fn2.d.c(d2);
        }
        return null;
    }

    @Override // bm2.c
    public final b0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
