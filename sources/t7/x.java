package t7;

import a7.o0;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import d7.d0;
import d7.k0;
import d7.n0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q8.c0;

/* loaded from: classes3.dex */
public final class x implements q8.s {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f116613i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f116614j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f116615a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f116616b;

    /* renamed from: d, reason: collision with root package name */
    public final l9.j f116618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f116619e;

    /* renamed from: f, reason: collision with root package name */
    public q8.u f116620f;

    /* renamed from: h, reason: collision with root package name */
    public int f116622h;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f116617c = new d0();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f116621g = new byte[1024];

    public x(String str, k0 k0Var, l9.j jVar, boolean z13) {
        this.f116615a = str;
        this.f116616b = k0Var;
        this.f116618d = jVar;
        this.f116619e = z13;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        throw new IllegalStateException();
    }

    public final q8.k0 c(long j13) {
        q8.k0 D = this.f116620f.D(0, 3);
        a7.q qVar = new a7.q();
        qVar.f1181n = o0.r("text/vtt");
        qVar.f1171d = this.f116615a;
        qVar.f1186s = j13;
        D.b(qVar.a());
        this.f116620f.A();
        return D;
    }

    @Override // q8.s
    public final int d(q8.t tVar, c0 c0Var) {
        String l13;
        this.f116620f.getClass();
        int length = (int) tVar.getLength();
        int i13 = this.f116622h;
        byte[] bArr = this.f116621g;
        if (i13 == bArr.length) {
            this.f116621g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f116621g;
        int i14 = this.f116622h;
        int read = tVar.read(bArr2, i14, bArr2.length - i14);
        if (read != -1) {
            int i15 = this.f116622h + read;
            this.f116622h = i15;
            if (length == -1 || i15 != length) {
                return 0;
            }
        }
        d0 d0Var = new d0(this.f116621g);
        u9.j.d(d0Var);
        String l14 = d0Var.l(StandardCharsets.UTF_8);
        long j13 = 0;
        long j14 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(l14)) {
                while (true) {
                    String l15 = d0Var.l(StandardCharsets.UTF_8);
                    if (l15 == null) {
                        break;
                    }
                    if (u9.j.f121166a.matcher(l15).matches()) {
                        do {
                            l13 = d0Var.l(StandardCharsets.UTF_8);
                            if (l13 != null) {
                            }
                        } while (!l13.isEmpty());
                    } else {
                        Matcher matcher2 = u9.i.f121162a.matcher(l15);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                } else {
                    String group = matcher.group(1);
                    group.getClass();
                    long c13 = u9.j.c(group);
                    int i16 = n0.f53866a;
                    long b13 = this.f116616b.b(n0.g0((j13 + c13) - j14, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                    q8.k0 c14 = c(b13 - c13);
                    byte[] bArr3 = this.f116621g;
                    int i17 = this.f116622h;
                    d0 d0Var2 = this.f116617c;
                    d0Var2.I(i17, bArr3);
                    c14.d(this.f116622h, 0, d0Var2);
                    c14.a(b13, 1, this.f116622h, 0, null);
                }
                return -1;
            }
            if (l14.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f116613i.matcher(l14);
                if (!matcher3.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(l14), null);
                }
                Matcher matcher4 = f116614j.matcher(l14);
                if (!matcher4.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(l14), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j14 = u9.j.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                int i18 = n0.f53866a;
                j13 = n0.g0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            l14 = d0Var.l(StandardCharsets.UTF_8);
        }
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        if (this.f116619e) {
            uVar = new l9.m(uVar, this.f116618d);
        }
        this.f116620f = uVar;
        uVar.j(new q8.w(-9223372036854775807L));
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        tVar.c(this.f116621g, 0, 6, false);
        byte[] bArr = this.f116621g;
        d0 d0Var = this.f116617c;
        d0Var.I(6, bArr);
        if (u9.j.a(d0Var)) {
            return true;
        }
        tVar.c(this.f116621g, 6, 3, false);
        d0Var.I(9, this.f116621g);
        return u9.j.a(d0Var);
    }
}
