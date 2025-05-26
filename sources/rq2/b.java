package rq2;

import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import nm.i0;
import nm.o;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import pq2.p;
import wo2.i;
import wo2.j;
import wo2.k;
import wo2.m;

/* loaded from: classes4.dex */
public final class b implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f109692c;

    /* renamed from: a, reason: collision with root package name */
    public final o f109693a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f109694b;

    static {
        MediaType.f95651d.getClass();
        f109692c = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public b(o oVar, i0 i0Var) {
        this.f109693a = oVar;
        this.f109694b = i0Var;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        j jVar = new j();
        um.c j13 = this.f109693a.j(new OutputStreamWriter(new i(jVar), StandardCharsets.UTF_8));
        this.f109694b.e(j13, obj);
        j13.close();
        final m content = jVar.a1(jVar.f130711b);
        RequestBody.f95711a.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        final MediaType mediaType = f109692c;
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
            @Override // okhttp3.RequestBody
            public final long a() {
                return content.b();
            }

            @Override // okhttp3.RequestBody
            /* renamed from: b, reason: from getter */
            public final MediaType getF95714b() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public final void d(k sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.t1(content);
            }
        };
    }
}
