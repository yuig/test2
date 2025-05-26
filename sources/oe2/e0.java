package oe2;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e0 extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final f f94320c = new f(3);

    /* renamed from: a, reason: collision with root package name */
    public final r f94321a;

    /* renamed from: b, reason: collision with root package name */
    public final r f94322b;

    public e0(h0 h0Var, Type type, Type type2) {
        this.f94321a = h0Var.b(type);
        this.f94322b = h0Var.b(type2);
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        d0 d0Var = new d0();
        vVar.c();
        while (vVar.hasNext()) {
            w wVar = (w) vVar;
            if (wVar.hasNext()) {
                wVar.f94393j = wVar.k0();
                wVar.f94390g = 11;
            }
            Object a13 = this.f94321a.a(vVar);
            Object a14 = this.f94322b.a(vVar);
            Object put = d0Var.put(a13, a14);
            if (put != null) {
                throw new JsonDataException("Map key '" + a13 + "' has multiple values at path " + vVar.f() + ": " + put + " and " + a14);
            }
        }
        vVar.e();
        return d0Var;
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        yVar.c();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + yVar.e());
            }
            int h10 = yVar.h();
            if (h10 != 5 && h10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            yVar.f94401e = true;
            this.f94321a.d(yVar, entry.getKey());
            this.f94322b.d(yVar, entry.getValue());
        }
        yVar.d();
    }

    public final String toString() {
        return "JsonAdapter(" + this.f94321a + "=" + this.f94322b + ")";
    }
}
