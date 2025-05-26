package ic;

import bp1.h;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class d implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f72048e = new String[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];

    /* renamed from: a, reason: collision with root package name */
    public int f72049a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f72050b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f72051c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f72052d;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f72048e[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f72048e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void E();

    public abstract boolean R0();

    public abstract String Y0();

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        return h.o(this.f72049a, this.f72050b, this.f72051c, this.f72052d);
    }

    public abstract c g();

    public final void h(int i13) {
        int i14 = this.f72049a;
        int[] iArr = this.f72050b;
        if (i14 == iArr.length) {
            if (i14 == 256) {
                throw new a("Nesting too deep at " + f());
            }
            this.f72050b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f72051c;
            this.f72051c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f72052d;
            this.f72052d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f72050b;
        int i15 = this.f72049a;
        this.f72049a = i15 + 1;
        iArr3[i15] = i13;
    }

    public abstract boolean hasNext();

    public abstract int k(tb.c cVar);

    public abstract void m();

    public final void o(String str) {
        StringBuilder D = ep.b.D(str, " at path ");
        D.append(f());
        throw new b(D.toString());
    }

    public abstract int o0();

    public abstract double s1();
}
