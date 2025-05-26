package on;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import pq2.d1;
import pq2.o;
import pq2.p;

/* loaded from: classes3.dex */
public final class b extends o {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f96694a;

    /* renamed from: b, reason: collision with root package name */
    public final d f96695b;

    public b(MediaType contentType, d serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f96694a = contentType;
        this.f96695b = serializer;
    }

    @Override // pq2.o
    public final p a(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        d dVar = this.f96695b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new c(this.f96694a, w.w0(((ro2.c) dVar.f96699a).f108977b, type), dVar);
    }

    @Override // pq2.o
    public final p b(Type type, Annotation[] annotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        d dVar = this.f96695b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new a(w.w0(((ro2.c) dVar.f96699a).f108977b, type), dVar);
    }
}
