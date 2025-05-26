package p00;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import pq2.d1;
import pq2.o;
import pq2.p;
import rz.e;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: a, reason: collision with root package name */
    public final e f98347a;

    /* renamed from: b, reason: collision with root package name */
    public final d f98348b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f98349c;

    public b(e registry, d dVar, s0 s0Var) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f98347a = registry;
        this.f98348b = dVar;
        this.f98349c = s0Var;
    }

    @Override // pq2.o
    public final p a(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f98348b;
    }

    @Override // pq2.o
    public final p b(Type type, Annotation[] annotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        TypeToken token = new TypeToken(type);
        e eVar = this.f98347a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        rz.d dVar = (rz.d) eVar.f110229a.get(token);
        if (dVar != null) {
            return new a(dVar);
        }
        return null;
    }

    @Override // pq2.o
    public final p c(Type type, Annotation[] annotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f98349c;
    }
}
