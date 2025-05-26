package rq2;

import com.google.gson.JsonIOException;
import java.io.Reader;
import nm.b0;
import nm.i0;
import nm.o;
import okhttp3.ResponseBody;
import pq2.p;

/* loaded from: classes2.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final o f109695a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f109696b;

    public c(o oVar, i0 i0Var) {
        this.f109695a = oVar;
        this.f109696b = i0Var;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        Reader charStream = responseBody.charStream();
        o oVar = this.f109695a;
        oVar.getClass();
        um.a aVar = new um.a(charStream);
        b0 b0Var = oVar.f91332n;
        if (b0Var == null) {
            b0Var = b0.LEGACY_STRICT;
        }
        aVar.O(b0Var);
        try {
            Object c13 = this.f109696b.c(aVar);
            if (aVar.K() == um.b.END_DOCUMENT) {
                return c13;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
