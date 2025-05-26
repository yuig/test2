package s9;

import a.cb;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import bf.b;
import d7.d0;
import d7.i;
import d7.n0;
import d7.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import l9.k;
import l9.l;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f111950a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f111952c;

    /* renamed from: d, reason: collision with root package name */
    public final int f111953d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111954e;

    /* renamed from: f, reason: collision with root package name */
    public final float f111955f;

    /* renamed from: g, reason: collision with root package name */
    public final int f111956g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f111952c = 0;
            this.f111953d = -1;
            this.f111954e = "sans-serif";
            this.f111951b = false;
            this.f111955f = 0.85f;
            this.f111956g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f111952c = bArr[24];
        this.f111953d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f111954e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f111956g = i13;
        boolean z13 = (bArr[0] & 32) != 0;
        this.f111951b = z13;
        if (z13) {
            this.f111955f = n0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f111955f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i13 >>> 8) | ((i13 & 255) << 24)), i15, i16, i17 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            int i18 = i17 | 33;
            boolean z13 = (i13 & 1) != 0;
            boolean z14 = (i13 & 2) != 0;
            if (z13) {
                if (z14) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i15, i16, i18);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i15, i16, i18);
                }
            } else if (z14) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, i16, i18);
            }
            boolean z15 = (i13 & 4) != 0;
            if (z15) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, i16, i18);
            }
            if (z15 || z13 || z14) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i15, i16, i18);
        }
    }

    @Override // l9.l
    public final int E() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, k kVar, i iVar) {
        String w13;
        int i15;
        d0 d0Var = this.f111950a;
        d0Var.I(i13 + i14, bArr);
        d0Var.K(i13);
        int i16 = 1;
        int i17 = 2;
        int i18 = 0;
        b.i(d0Var.a() >= 2);
        int E = d0Var.E();
        if (E == 0) {
            w13 = "";
        } else {
            int i19 = d0Var.f53807b;
            Charset G = d0Var.G();
            int i23 = E - (d0Var.f53807b - i19);
            if (G == null) {
                G = StandardCharsets.UTF_8;
            }
            w13 = d0Var.w(i23, G);
        }
        if (w13.isEmpty()) {
            y0 y0Var = c1.f100372b;
            iVar.accept(new l9.a(-9223372036854775807L, -9223372036854775807L, v2.f100502e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w13);
        b(spannableStringBuilder, this.f111952c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f111953d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f111954e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f13 = this.f111955f;
        while (d0Var.a() >= 8) {
            int i24 = d0Var.f53807b;
            int k13 = d0Var.k();
            int k14 = d0Var.k();
            if (k14 == 1937013100) {
                b.i(d0Var.a() >= i17 ? i16 : i18);
                int E2 = d0Var.E();
                int i25 = i18;
                while (i25 < E2) {
                    b.i(d0Var.a() >= 12 ? i16 : i18);
                    int E3 = d0Var.E();
                    int E4 = d0Var.E();
                    d0Var.L(i17);
                    int y13 = d0Var.y();
                    d0Var.L(i16);
                    int k15 = d0Var.k();
                    if (E4 > spannableStringBuilder.length()) {
                        StringBuilder s13 = a.a.s("Truncating styl end (", E4, ") to cueText.length() (");
                        s13.append(spannableStringBuilder.length());
                        s13.append(").");
                        u.g("Tx3gParser", s13.toString());
                        E4 = spannableStringBuilder.length();
                    }
                    if (E3 >= E4) {
                        u.g("Tx3gParser", cb.j("Ignoring styl with start (", E3, ") >= end (", E4, ")."));
                    } else {
                        int i26 = E4;
                        b(spannableStringBuilder, y13, this.f111952c, E3, i26, 0);
                        a(spannableStringBuilder, k15, this.f111953d, E3, i26, 0);
                    }
                    i25++;
                    i16 = 1;
                    i17 = 2;
                    i18 = 0;
                }
                i15 = i17;
            } else if (k14 == 1952608120 && this.f111951b) {
                i15 = 2;
                b.i(d0Var.a() >= 2);
                f13 = n0.h(d0Var.E() / this.f111956g, 0.0f, 0.95f);
            } else {
                i15 = 2;
            }
            d0Var.K(i24 + k13);
            i17 = i15;
            i16 = 1;
            i18 = 0;
        }
        iVar.accept(new l9.a(-9223372036854775807L, -9223372036854775807L, c1.v(new c7.b(spannableStringBuilder, null, null, null, f13, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }
}
