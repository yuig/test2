package p00;

import kotlin.jvm.internal.Intrinsics;
import nm.o;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import pq2.p;
import vy.m;
import xk2.v;

/* loaded from: classes.dex */
public class d implements p {
    @Override // pq2.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) {
        v vVar = m.f126870h;
        Object value = m.f126870h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String k13 = ((o) value).k(obj);
        RequestBody.Companion companion = RequestBody.f95711a;
        Intrinsics.f(k13);
        MediaType.f95651d.getClass();
        MediaType a13 = MediaType.Companion.a("application/json");
        companion.getClass();
        return RequestBody.Companion.a(k13, a13);
    }
}
