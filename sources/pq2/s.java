package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class s extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f101081a;

    public s(Executor executor) {
        this.f101081a = executor;
    }

    @Override // pq2.j
    public final k a(Type type, Annotation[] annotationArr, d1 d1Var) {
        if (k1.g(type) != i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new q(k1.f(0, (ParameterizedType) type), k1.j(annotationArr, f1.class) ? null : this.f101081a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
