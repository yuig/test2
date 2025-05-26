package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final r f114787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f114788b;

    public g(r writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f114787a = writer;
        this.f114788b = true;
    }

    public void a() {
        this.f114788b = true;
    }

    public void b() {
        this.f114788b = false;
    }

    public void c() {
        this.f114788b = false;
    }

    public void d(byte b13) {
        long j13 = b13;
        r rVar = this.f114787a;
        rVar.getClass();
        rVar.c(String.valueOf(j13));
    }

    public final void e(char c13) {
        r rVar = this.f114787a;
        rVar.a(rVar.f114810b, 1);
        char[] cArr = rVar.f114809a;
        int i13 = rVar.f114810b;
        rVar.f114810b = i13 + 1;
        cArr[i13] = c13;
    }

    public void f(int i13) {
        long j13 = i13;
        r rVar = this.f114787a;
        rVar.getClass();
        rVar.c(String.valueOf(j13));
    }

    public void g(long j13) {
        r rVar = this.f114787a;
        rVar.getClass();
        rVar.c(String.valueOf(j13));
    }

    public final void h(String v13) {
        Intrinsics.checkNotNullParameter(v13, "v");
        this.f114787a.c(v13);
    }

    public void i(short s13) {
        long j13 = s13;
        r rVar = this.f114787a;
        rVar.getClass();
        rVar.c(String.valueOf(j13));
    }

    public void j(String text) {
        int i13;
        Intrinsics.checkNotNullParameter(text, "value");
        r rVar = this.f114787a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        rVar.a(rVar.f114810b, text.length() + 2);
        char[] cArr = rVar.f114809a;
        int i14 = rVar.f114810b;
        int i15 = i14 + 1;
        cArr[i14] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i15);
        int i16 = length + i15;
        int i17 = i15;
        while (i17 < i16) {
            char c13 = cArr[i17];
            byte[] bArr = h0.f114796b;
            if (c13 < bArr.length && bArr[c13] != 0) {
                int length2 = text.length();
                for (int i18 = i17 - i15; i18 < length2; i18++) {
                    rVar.a(i17, 2);
                    char charAt = text.charAt(i18);
                    byte[] bArr2 = h0.f114796b;
                    if (charAt < bArr2.length) {
                        byte b13 = bArr2[charAt];
                        if (b13 == 0) {
                            i13 = i17 + 1;
                            rVar.f114809a[i17] = charAt;
                        } else {
                            if (b13 == 1) {
                                String str = h0.f114795a[charAt];
                                Intrinsics.f(str);
                                rVar.a(i17, str.length());
                                str.getChars(0, str.length(), rVar.f114809a, i17);
                                int length3 = str.length() + i17;
                                rVar.f114810b = length3;
                                i17 = length3;
                            } else {
                                char[] cArr2 = rVar.f114809a;
                                cArr2[i17] = '\\';
                                cArr2[i17 + 1] = (char) b13;
                                i17 += 2;
                                rVar.f114810b = i17;
                            }
                        }
                    } else {
                        i13 = i17 + 1;
                        rVar.f114809a[i17] = charAt;
                    }
                    i17 = i13;
                }
                rVar.a(i17, 1);
                rVar.f114809a[i17] = '\"';
                rVar.f114810b = i17 + 1;
                return;
            }
            i17++;
        }
        cArr[i16] = '\"';
        rVar.f114810b = i16 + 1;
    }

    public void k() {
    }

    public void l() {
    }
}
