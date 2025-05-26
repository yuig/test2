package pq2;

import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f101067c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f101069e;

    /* renamed from: f, reason: collision with root package name */
    public final p f101070f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101071g;

    public o0(Method method, int i13, String str, p pVar, boolean z13) {
        this.f101067c = method;
        this.f101068d = i13;
        Objects.requireNonNull(str, "name == null");
        this.f101069e = str;
        this.f101070f = pVar;
        this.f101071g = z13;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        String str;
        String str2 = this.f101069e;
        if (obj == null) {
            throw k1.n(this.f101067c, this.f101068d, a.a.k("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        String str3 = (String) this.f101070f.a(obj);
        if (x0Var.f101103c == null) {
            throw new AssertionError();
        }
        int length = str3.length();
        int i13 = 0;
        while (i13 < length) {
            int codePointAt = str3.codePointAt(i13);
            boolean z13 = this.f101071g;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z13 && (codePointAt == 47 || codePointAt == 37))) {
                wo2.j jVar = new wo2.j();
                jVar.q0(0, i13, str3);
                x0.c(jVar, str3, i13, length, z13);
                str = jVar.M();
                break;
            }
            i13 += Character.charCount(codePointAt);
        }
        str = str3;
        String replace = x0Var.f101103c.replace("{" + str2 + "}", str);
        if (x0.f101100m.matcher(replace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str3));
        }
        x0Var.f101103c = replace;
    }
}
