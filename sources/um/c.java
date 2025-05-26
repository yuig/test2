package um;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import nm.b0;
import nm.j;

/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f122666l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f122667m = new String[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f122668n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f122669a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f122670b;

    /* renamed from: c, reason: collision with root package name */
    public int f122671c;

    /* renamed from: d, reason: collision with root package name */
    public j f122672d;

    /* renamed from: e, reason: collision with root package name */
    public String f122673e;

    /* renamed from: f, reason: collision with root package name */
    public String f122674f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f122675g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f122676h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f122677i;

    /* renamed from: j, reason: collision with root package name */
    public String f122678j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f122679k;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f122667m[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f122667m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f122668n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f122670b = iArr;
        this.f122671c = 0;
        if (iArr.length == 0) {
            this.f122670b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f122670b;
        int i13 = this.f122671c;
        this.f122671c = i13 + 1;
        iArr2[i13] = 6;
        this.f122676h = b0.LEGACY_STRICT;
        this.f122679k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f122669a = writer;
        q(j.f91310d);
    }

    public void A(double d2) {
        P();
        if (this.f122676h == b0.LENIENT || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            a();
            this.f122669a.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    public void J(long j13) {
        P();
        a();
        this.f122669a.write(Long.toString(j13));
    }

    public void K(Boolean bool) {
        if (bool == null) {
            m();
            return;
        }
        P();
        a();
        this.f122669a.write(bool.booleanValue() ? "true" : "false");
    }

    public void L(Number number) {
        if (number == null) {
            m();
            return;
        }
        P();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f122666l.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f122676h != b0.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f122669a.append((CharSequence) obj);
    }

    public void M(String str) {
        if (str == null) {
            m();
            return;
        }
        P();
        a();
        z(str);
    }

    public void O(boolean z13) {
        P();
        a();
        this.f122669a.write(z13 ? "true" : "false");
    }

    public final void P() {
        if (this.f122678j != null) {
            int o13 = o();
            if (o13 == 5) {
                this.f122669a.write(this.f122674f);
            } else if (o13 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            k();
            this.f122670b[this.f122671c - 1] = 4;
            z(this.f122678j);
            this.f122678j = null;
        }
    }

    public final void a() {
        int o13 = o();
        if (o13 == 1) {
            this.f122670b[this.f122671c - 1] = 2;
            k();
            return;
        }
        Writer writer = this.f122669a;
        if (o13 == 2) {
            writer.append((CharSequence) this.f122674f);
            k();
        } else {
            if (o13 == 4) {
                writer.append((CharSequence) this.f122673e);
                this.f122670b[this.f122671c - 1] = 5;
                return;
            }
            if (o13 != 6) {
                if (o13 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f122676h != b0.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f122670b[this.f122671c - 1] = 7;
        }
    }

    public void c() {
        P();
        a();
        int i13 = this.f122671c;
        int[] iArr = this.f122670b;
        if (i13 == iArr.length) {
            this.f122670b = Arrays.copyOf(iArr, i13 * 2);
        }
        int[] iArr2 = this.f122670b;
        int i14 = this.f122671c;
        this.f122671c = i14 + 1;
        iArr2[i14] = 1;
        this.f122669a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f122669a.close();
        int i13 = this.f122671c;
        if (i13 > 1 || (i13 == 1 && this.f122670b[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f122671c = 0;
    }

    public void d() {
        P();
        a();
        int i13 = this.f122671c;
        int[] iArr = this.f122670b;
        if (i13 == iArr.length) {
            this.f122670b = Arrays.copyOf(iArr, i13 * 2);
        }
        int[] iArr2 = this.f122670b;
        int i14 = this.f122671c;
        this.f122671c = i14 + 1;
        iArr2[i14] = 3;
        this.f122669a.write(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
    }

    public final void e(int i13, int i14, char c13) {
        int o13 = o();
        if (o13 != i14 && o13 != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f122678j != null) {
            throw new IllegalStateException("Dangling name: " + this.f122678j);
        }
        this.f122671c--;
        if (o13 == i14) {
            k();
        }
        this.f122669a.write(c13);
    }

    public void f() {
        e(1, 2, ']');
    }

    public void flush() {
        if (this.f122671c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f122669a.flush();
    }

    public void g() {
        e(3, 5, '}');
    }

    public c h(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f122678j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int o13 = o();
        if (o13 != 3 && o13 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f122678j = str;
        return this;
    }

    public final void k() {
        if (this.f122675g) {
            return;
        }
        String str = this.f122672d.f91311a;
        Writer writer = this.f122669a;
        writer.write(str);
        int i13 = this.f122671c;
        for (int i14 = 1; i14 < i13; i14++) {
            writer.write(this.f122672d.f91312b);
        }
    }

    public c m() {
        if (this.f122678j != null) {
            if (!this.f122679k) {
                this.f122678j = null;
                return this;
            }
            P();
        }
        a();
        this.f122669a.write("null");
        return this;
    }

    public final int o() {
        int i13 = this.f122671c;
        if (i13 != 0) {
            return this.f122670b[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void q(j jVar) {
        Objects.requireNonNull(jVar);
        this.f122672d = jVar;
        this.f122674f = ",";
        if (jVar.f91313c) {
            this.f122673e = ": ";
            if (jVar.f91311a.isEmpty()) {
                this.f122674f = ", ";
            }
        } else {
            this.f122673e = ":";
        }
        this.f122675g = this.f122672d.f91311a.isEmpty() && this.f122672d.f91312b.isEmpty();
    }

    public final void w(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f122676h = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f122677i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = um.c.f122668n
            goto L9
        L7:
            java.lang.String[] r0 = um.c.f122667m
        L9:
            java.io.Writer r1 = r8.f122669a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um.c.z(java.lang.String):void");
    }
}
