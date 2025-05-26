package oe2;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f94381a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f94382b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f94383c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f94384d;

    public abstract void B1();

    public abstract void E();

    public abstract String Y0();

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        return kg.t.J(this.f94381a, this.f94382b, this.f94383c, this.f94384d);
    }

    public abstract u g();

    public final void h(int i13) {
        int i14 = this.f94381a;
        int[] iArr = this.f94382b;
        if (i14 == iArr.length) {
            if (i14 == 256) {
                throw new JsonDataException("Nesting too deep at " + f());
            }
            this.f94382b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f94383c;
            this.f94383c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f94384d;
            this.f94384d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f94382b;
        int i15 = this.f94381a;
        this.f94381a = i15 + 1;
        iArr3[i15] = i13;
    }

    public abstract boolean hasNext();

    public abstract int k(mc2.k kVar);

    public abstract void m();

    public final void o(String str) {
        StringBuilder D = ep.b.D(str, " at path ");
        D.append(f());
        throw new JsonEncodingException(D.toString());
    }

    public abstract int o0();

    public abstract double s1();
}
