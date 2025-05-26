package h4;

import kh2.a1;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final z f67586a;

    /* renamed from: b, reason: collision with root package name */
    public int f67587b;

    /* renamed from: c, reason: collision with root package name */
    public int f67588c;

    /* renamed from: d, reason: collision with root package name */
    public int f67589d;

    /* renamed from: e, reason: collision with root package name */
    public int f67590e;

    public l(b4.g gVar, long j13) {
        String str = gVar.f21571a;
        z zVar = new z();
        zVar.f67613a = str;
        zVar.f67615c = -1;
        zVar.f67616d = -1;
        this.f67586a = zVar;
        this.f67587b = b4.p0.e(j13);
        this.f67588c = b4.p0.d(j13);
        this.f67589d = -1;
        this.f67590e = -1;
        int e13 = b4.p0.e(j13);
        int d2 = b4.p0.d(j13);
        String str2 = gVar.f21571a;
        if (e13 < 0 || e13 > str2.length()) {
            StringBuilder s13 = a.a.s("start (", e13, ") offset is outside of text region ");
            s13.append(str2.length());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (d2 < 0 || d2 > str2.length()) {
            StringBuilder s14 = a.a.s("end (", d2, ") offset is outside of text region ");
            s14.append(str2.length());
            throw new IndexOutOfBoundsException(s14.toString());
        }
        if (e13 > d2) {
            throw new IllegalArgumentException(a.a.f("Do not set reversed range: ", e13, " > ", d2));
        }
    }

    public final void a(int i13, int i14) {
        long h10 = b7.c.h(i13, i14);
        this.f67586a.b(i13, i14, "");
        long G0 = a1.G0(b7.c.h(this.f67587b, this.f67588c), h10);
        h(b4.p0.e(G0));
        g(b4.p0.d(G0));
        int i15 = this.f67589d;
        if (i15 != -1) {
            long G02 = a1.G0(b7.c.h(i15, this.f67590e), h10);
            if (b4.p0.b(G02)) {
                this.f67589d = -1;
                this.f67590e = -1;
            } else {
                this.f67589d = b4.p0.e(G02);
                this.f67590e = b4.p0.d(G02);
            }
        }
    }

    public final char b(int i13) {
        z zVar = this.f67586a;
        y1.p pVar = zVar.f67614b;
        if (pVar != null && i13 >= zVar.f67615c) {
            int e13 = pVar.e();
            int i14 = zVar.f67615c;
            return i13 < e13 + i14 ? pVar.d(i13 - i14) : zVar.f67613a.charAt(i13 - ((e13 - zVar.f67616d) + i14));
        }
        return zVar.f67613a.charAt(i13);
    }

    public final b4.p0 c() {
        int i13 = this.f67589d;
        if (i13 != -1) {
            return new b4.p0(b7.c.h(i13, this.f67590e));
        }
        return null;
    }

    public final void d(int i13, int i14, String str) {
        z zVar = this.f67586a;
        if (i13 < 0 || i13 > zVar.a()) {
            StringBuilder s13 = a.a.s("start (", i13, ") offset is outside of text region ");
            s13.append(zVar.a());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 < 0 || i14 > zVar.a()) {
            StringBuilder s14 = a.a.s("end (", i14, ") offset is outside of text region ");
            s14.append(zVar.a());
            throw new IndexOutOfBoundsException(s14.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("Do not set reversed range: ", i13, " > ", i14));
        }
        zVar.b(i13, i14, str);
        h(str.length() + i13);
        g(str.length() + i13);
        this.f67589d = -1;
        this.f67590e = -1;
    }

    public final void e(int i13, int i14) {
        z zVar = this.f67586a;
        if (i13 < 0 || i13 > zVar.a()) {
            StringBuilder s13 = a.a.s("start (", i13, ") offset is outside of text region ");
            s13.append(zVar.a());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 < 0 || i14 > zVar.a()) {
            StringBuilder s14 = a.a.s("end (", i14, ") offset is outside of text region ");
            s14.append(zVar.a());
            throw new IndexOutOfBoundsException(s14.toString());
        }
        if (i13 >= i14) {
            throw new IllegalArgumentException(a.a.f("Do not set reversed or empty range: ", i13, " > ", i14));
        }
        this.f67589d = i13;
        this.f67590e = i14;
    }

    public final void f(int i13, int i14) {
        z zVar = this.f67586a;
        if (i13 < 0 || i13 > zVar.a()) {
            StringBuilder s13 = a.a.s("start (", i13, ") offset is outside of text region ");
            s13.append(zVar.a());
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 < 0 || i14 > zVar.a()) {
            StringBuilder s14 = a.a.s("end (", i14, ") offset is outside of text region ");
            s14.append(zVar.a());
            throw new IndexOutOfBoundsException(s14.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("Do not set reversed range: ", i13, " > ", i14));
        }
        h(i13);
        g(i14);
    }

    public final void g(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("Cannot set selectionEnd to a negative value: ", i13).toString());
        }
        this.f67588c = i13;
    }

    public final void h(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.d("Cannot set selectionStart to a negative value: ", i13).toString());
        }
        this.f67587b = i13;
    }

    public final String toString() {
        return this.f67586a.toString();
    }
}
