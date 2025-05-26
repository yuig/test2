package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes2.dex */
public final class n extends j {
    @Override // pq2.j
    public final k a(Type type, Annotation[] annotationArr, d1 d1Var) {
        if (k1.g(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type f13 = k1.f(0, (ParameterizedType) type);
        if (k1.g(f13) != a1.class) {
            return new pm.f(0, f13);
        }
        if (f13 instanceof ParameterizedType) {
            return new pm.f(1, k1.f(0, (ParameterizedType) f13));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
