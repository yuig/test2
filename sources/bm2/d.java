package bm2;

import am2.w0;
import an2.y;
import java.util.Map;
import pn2.b0;
import pn2.h0;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f23532a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f23533b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f23534c;

    public d(h0 h0Var, Map map, w0 w0Var) {
        if (h0Var == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        if (w0Var == null) {
            d(2);
            throw null;
        }
        this.f23532a = h0Var;
        this.f23533b = map;
        this.f23534c = w0Var;
    }

    public static /* synthetic */ void d(int i13) {
        String str = (i13 == 3 || i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 4 || i13 == 5) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "valueArguments";
        } else if (i13 == 2) {
            objArr[0] = "source";
        } else if (i13 == 3 || i13 == 4 || i13 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i13 == 3) {
            objArr[1] = "getType";
        } else if (i13 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // bm2.c
    public final Map a() {
        Map map = this.f23533b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // bm2.c
    public final w0 b() {
        w0 w0Var = this.f23534c;
        if (w0Var != null) {
            return w0Var;
        }
        d(5);
        throw null;
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
        b0 b0Var = this.f23532a;
        if (b0Var != null) {
            return b0Var;
        }
        d(3);
        throw null;
    }

    public final String toString() {
        return y.f15818c.A(this, null);
    }
}
