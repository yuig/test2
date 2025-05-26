package pq2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes4.dex */
public final class n0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101062c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Method f101063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101064e;

    /* renamed from: f, reason: collision with root package name */
    public final p f101065f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f101066g;

    public n0(Method method, int i13, Headers headers, p pVar) {
        this.f101063d = method;
        this.f101064e = i13;
        this.f101066g = headers;
        this.f101065f = pVar;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        int i13 = this.f101062c;
        p pVar = this.f101065f;
        Object obj2 = this.f101066g;
        Method method = this.f101063d;
        int i14 = this.f101064e;
        switch (i13) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    RequestBody body = (RequestBody) pVar.a(obj);
                    MultipartBody.Builder builder = x0Var.f101109i;
                    builder.getClass();
                    Intrinsics.checkNotNullParameter(body, "body");
                    MultipartBody.Part.f95670c.getClass();
                    MultipartBody.Part part = MultipartBody.Part.Companion.a((Headers) obj2, body);
                    Intrinsics.checkNotNullParameter(part, "part");
                    builder.f95669c.add(part);
                    return;
                } catch (IOException e13) {
                    throw k1.n(method, i14, "Unable to convert " + obj + " to RequestBody", e13);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw k1.n(method, i14, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw k1.n(method, i14, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw k1.n(method, i14, a.a.k("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", a.a.k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    Headers.f95626b.getClass();
                    Headers d2 = Headers.Companion.d(strArr);
                    RequestBody body2 = (RequestBody) pVar.a(value);
                    MultipartBody.Builder builder2 = x0Var.f101109i;
                    builder2.getClass();
                    Intrinsics.checkNotNullParameter(body2, "body");
                    MultipartBody.Part.f95670c.getClass();
                    MultipartBody.Part part2 = MultipartBody.Part.Companion.a(d2, body2);
                    Intrinsics.checkNotNullParameter(part2, "part");
                    builder2.f95669c.add(part2);
                }
                return;
        }
    }

    public n0(Method method, int i13, p pVar, String str) {
        this.f101063d = method;
        this.f101064e = i13;
        this.f101065f = pVar;
        this.f101066g = str;
    }
}
