package ui2;

import io.opentelemetry.api.trace.StatusCode;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface j extends vi2.f {
    static j c(vi2.b bVar) {
        if (bVar == null) {
            ri2.a.a();
            return i.f122314b;
        }
        j jVar = (j) ((vi2.a) bVar).a(m.f122316a);
        return jVar == null ? i.f122314b : jVar;
    }

    @Override // vi2.f
    default vi2.a a(vi2.b bVar) {
        return ((vi2.a) bVar).b(m.f122316a, this);
    }

    boolean b();

    j d(String str);

    j e(String str, qi2.a aVar, long j13, TimeUnit timeUnit);

    default void f(String str, String str2) {
        o(ri2.e.a(qi2.c.STRING, str), str2);
    }

    void g(long j13, TimeUnit timeUnit);

    l h();

    j i(StatusCode statusCode, String str);

    j o(ri2.e eVar, Object obj);
}
