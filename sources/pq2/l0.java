package pq2;

import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class l0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101054c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f101055d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101056e;

    /* renamed from: f, reason: collision with root package name */
    public final p f101057f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101058g;

    public l0(Method method, int i13, p pVar, boolean z13, int i14) {
        this.f101054c = i14;
        this.f101055d = method;
        this.f101056e = i13;
        this.f101057f = pVar;
        this.f101058g = z13;
    }

    @Override // pq2.k1
    public final /* bridge */ /* synthetic */ void a(x0 x0Var, Object obj) {
        switch (this.f101054c) {
            case 0:
                s(x0Var, (Map) obj);
                break;
            case 1:
                s(x0Var, (Map) obj);
                break;
            default:
                s(x0Var, (Map) obj);
                break;
        }
    }

    public final void s(x0 x0Var, Map map) {
        int i13 = this.f101054c;
        boolean z13 = this.f101058g;
        p pVar = this.f101057f;
        Method method = this.f101055d;
        int i14 = this.f101056e;
        switch (i13) {
            case 0:
                if (map == null) {
                    throw k1.n(method, i14, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw k1.n(method, i14, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw k1.n(method, i14, a.a.k("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String str2 = (String) pVar.a(value);
                    if (str2 == null) {
                        throw k1.n(method, i14, "Field map value '" + value + "' converted to null by " + pVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    FormBody.Builder builder = x0Var.f101110j;
                    if (z13) {
                        builder.b(str, str2);
                    } else {
                        builder.a(str, str2);
                    }
                }
                return;
            case 1:
                if (map == null) {
                    throw k1.n(method, i14, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw k1.n(method, i14, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw k1.n(method, i14, a.a.k("Header map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    x0Var.a(str3, (String) pVar.a(value2), z13);
                }
                return;
            default:
                if (map == null) {
                    throw k1.n(method, i14, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    if (str4 == null) {
                        throw k1.n(method, i14, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw k1.n(method, i14, a.a.k("Query map contained null value for key '", str4, "'."), new Object[0]);
                    }
                    String str5 = (String) pVar.a(value3);
                    if (str5 == null) {
                        throw k1.n(method, i14, "Query map value '" + value3 + "' converted to null by " + pVar.getClass().getName() + " for key '" + str4 + "'.", new Object[0]);
                    }
                    x0Var.b(str4, str5, z13);
                }
                return;
        }
    }
}
