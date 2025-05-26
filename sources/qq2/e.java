package qq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import pq2.a1;
import pq2.d1;
import pq2.j;
import pq2.k;
import pq2.k1;
import uj2.b0;
import uj2.h;
import uj2.l;
import uj2.q;

/* loaded from: classes2.dex */
public final class e extends j {
    @Override // pq2.j
    public final k a(Type type, Annotation[] annotationArr, d1 d1Var) {
        Type type2;
        boolean z13;
        boolean z14;
        Class g13 = k1.g(type);
        if (g13 == uj2.b.class) {
            return new d(Void.class, false, true, false, false, false, true);
        }
        boolean z15 = g13 == h.class;
        boolean z16 = g13 == b0.class;
        boolean z17 = g13 == l.class;
        if (g13 != q.class && !z15 && !z16 && !z17) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z15 ? !z16 ? z17 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type f13 = k1.f(0, (ParameterizedType) type);
        Class g14 = k1.g(f13);
        if (g14 == a1.class) {
            if (!(f13 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = k1.f(0, (ParameterizedType) f13);
            z14 = false;
            z13 = false;
        } else if (g14 != c.class) {
            type2 = f13;
            z13 = true;
            z14 = false;
        } else {
            if (!(f13 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = k1.f(0, (ParameterizedType) f13);
            z14 = true;
            z13 = false;
        }
        return new d(type2, z14, z13, z15, z16, z17, false);
    }
}
