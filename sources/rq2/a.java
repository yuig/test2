package rq2;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import pq2.d1;
import pq2.o;
import pq2.p;

/* loaded from: classes2.dex */
public final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f109691a;

    public a(nm.o oVar) {
        this.f109691a = oVar;
    }

    @Override // pq2.o
    public final p a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, d1 d1Var) {
        TypeToken typeToken = new TypeToken(type);
        nm.o oVar = this.f109691a;
        return new b(oVar, oVar.g(typeToken));
    }

    @Override // pq2.o
    public final p b(Type type, Annotation[] annotationArr, d1 d1Var) {
        TypeToken typeToken = new TypeToken(type);
        nm.o oVar = this.f109691a;
        return new c(oVar, oVar.g(typeToken));
    }
}
