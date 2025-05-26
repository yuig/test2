package pq2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class g extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101025a;

    public g(int i13) {
        this.f101025a = i13;
    }

    @Override // pq2.o
    public final p a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, d1 d1Var) {
        switch (this.f101025a) {
            case 0:
                if (RequestBody.class.isAssignableFrom(k1.g(type))) {
                    return b.f100992a;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // pq2.o
    public final p b(Type type, Annotation[] annotationArr, d1 d1Var) {
        switch (this.f101025a) {
            case 0:
                if (type == ResponseBody.class) {
                    return k1.j(annotationArr, sq2.w.class) ? c.f100998a : a.f100986a;
                }
                if (type == Void.class) {
                    return f.f101022a;
                }
                if (k1.k(type)) {
                    return e.f101018a;
                }
                return null;
            default:
                if (k1.g(type) != Optional.class) {
                    return null;
                }
                return new h0(d1Var.e(k1.f(0, (ParameterizedType) type), annotationArr));
        }
    }
}
