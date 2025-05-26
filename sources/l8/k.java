package l8;

import a7.c1;
import a7.o0;
import android.net.Uri;
import d7.n0;
import java.util.Objects;
import java.util.regex.Pattern;
import pk.h1;
import pk.l0;
import pk.n3;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f82027m = Pattern.compile(".*-.*");

    /* renamed from: a, reason: collision with root package name */
    public final k0.a f82028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82029b;

    /* renamed from: c, reason: collision with root package name */
    public k8.t f82030c;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f82033f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82034g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f82035h;

    /* renamed from: j, reason: collision with root package name */
    public String f82037j;

    /* renamed from: k, reason: collision with root package name */
    public String f82038k;

    /* renamed from: l, reason: collision with root package name */
    public String f82039l;

    /* renamed from: d, reason: collision with root package name */
    public long f82031d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public float f82032e = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public long f82036i = -9223372036854775807L;

    public k(k0.a aVar, String str) {
        this.f82028a = aVar;
        this.f82029b = str;
    }

    public final l a() {
        long j13;
        int i13;
        int i14;
        long j14;
        v2 v2Var;
        String str;
        long j15;
        long j16;
        String str2;
        String str3;
        boolean equals = Objects.equals(this.f82037j, "m");
        if (!equals) {
            bf.b.x(this.f82030c, "Track selection must be set");
        }
        if (this.f82037j == null) {
            k8.t tVar = this.f82030c;
            tVar.getClass();
            androidx.media3.common.b r13 = tVar.r();
            String b13 = o0.b(r13.f18761k);
            String l13 = o0.l(r13.f18761k);
            if (b13 == null || l13 == null) {
                int j17 = o0.j(r13.f18765o);
                if (j17 == -1) {
                    j17 = o0.j(r13.f18764n);
                }
                str3 = j17 == 1 ? "a" : j17 == 2 ? "v" : null;
            } else {
                str3 = "av";
            }
            this.f82037j = str3;
        }
        String str4 = this.f82037j;
        boolean z13 = Objects.equals(str4, "a") || Objects.equals(str4, "v") || Objects.equals(str4, "av");
        if (z13) {
            bf.b.s("Buffered duration must be set", this.f82031d != -9223372036854775807L);
            bf.b.s("Chunk duration must be set", this.f82036i != -9223372036854775807L);
        }
        k0.a aVar = this.f82028a;
        ((v5.x) aVar.f77780d).getClass();
        l0 l0Var = l0.f100446f;
        n3 it = l0Var.f100447d.keySet().iterator();
        while (it.hasNext()) {
            for (String str5 : l0Var.get((String) it.next())) {
                int i15 = n0.f53866a;
                bf.b.t(f82027m.matcher(str5.split("=", -1)[0]).matches());
            }
        }
        Object obj = aVar.f77780d;
        if (equals) {
            j13 = -2147483647L;
            i13 = -2147483647;
            i14 = -2147483647;
        } else {
            k8.t tVar2 = this.f82030c;
            tVar2.getClass();
            int i16 = tVar2.r().f18760j;
            int f13 = n0.f(i16, 1000);
            c1 m13 = tVar2.m();
            for (int i17 = 0; i17 < m13.f964a; i17++) {
                i16 = Math.max(i16, m13.f967d[i17].f18760j);
            }
            i14 = n0.f(i16, 1000);
            j13 = tVar2.b() != -2147483647L ? (tVar2.b() + 999) / 1000 : -2147483647L;
            ((v5.x) obj).getClass();
            i13 = f13;
        }
        y0 y0Var = pk.c1.f100372b;
        v2 v2Var2 = v2.f100502e;
        ((v5.x) obj).getClass();
        bf.b.i(i13 >= 0 || i13 == -2147483647);
        ((v5.x) obj).getClass();
        bf.b.i(i14 >= 0 || i14 == -2147483647);
        if (z13) {
            ((v5.x) obj).getClass();
            j14 = n0.o0(this.f82036i);
            bf.b.i(j14 >= 0 || j14 == -9223372036854775807L);
        } else {
            j14 = -9223372036854775807L;
        }
        ((v5.x) obj).getClass();
        String str6 = this.f82037j;
        h1 h1Var = l0Var.f100447d;
        pk.c1 r14 = h1Var.containsKey("CMCD-Object") ? pk.c1.r(l0Var.get("CMCD-Object")) : v2Var2;
        if (z13) {
            ((v5.x) obj).getClass();
            v2Var = v2Var2;
            str = "v";
            long o03 = n0.o0(this.f82031d);
            if (o03 != -9223372036854775807L) {
                if (o03 < 0) {
                    throw new IllegalArgumentException();
                }
                o03 = ((o03 + 50) / 100) * 100;
            }
            ((v5.x) obj).getClass();
            long j18 = o03;
            long o04 = n0.o0((long) (this.f82031d / this.f82032e));
            if (o04 != -9223372036854775807L) {
                if (o04 < 0) {
                    throw new IllegalArgumentException();
                }
                o04 = ((o04 + 50) / 100) * 100;
            }
            j16 = o04;
            j15 = j18;
        } else {
            v2Var = v2Var2;
            str = "v";
            j15 = -9223372036854775807L;
            j16 = -9223372036854775807L;
        }
        ((v5.x) obj).getClass();
        if (j13 != -2147483647L) {
            if (j13 < 0) {
                throw new IllegalArgumentException();
            }
            j13 = ((j13 + 50) / 100) * 100;
        }
        ((v5.x) obj).getClass();
        String str7 = str;
        boolean z14 = this.f82034g || this.f82035h;
        ((v5.x) obj).getClass();
        boolean z15 = z14;
        String str8 = this.f82038k;
        String encode = str8 == null ? null : Uri.encode(str8);
        ((v5.x) obj).getClass();
        String str9 = encode;
        String str10 = this.f82039l;
        pk.c1 r15 = h1Var.containsKey("CMCD-Request") ? pk.c1.r(l0Var.get("CMCD-Request")) : v2Var;
        ((v5.x) obj).getClass();
        pk.c1 c1Var = r15;
        String str11 = (String) aVar.f77779c;
        long j19 = j13;
        bf.b.i(str11 == null || str11.length() <= 64);
        ((v5.x) obj).getClass();
        String str12 = (String) aVar.f77778b;
        bf.b.i(str12 == null || str12.length() <= 64);
        ((v5.x) obj).getClass();
        if (this.f82033f != null) {
            ((v5.x) obj).getClass();
            Boolean bool = this.f82033f;
            bool.getClass();
            str2 = bool.booleanValue() ? "l" : str7;
        } else {
            str2 = null;
        }
        ((v5.x) obj).getClass();
        float f14 = this.f82032e;
        bf.b.i(f14 > 0.0f || f14 == -3.4028235E38f);
        pk.c1 r16 = h1Var.containsKey("CMCD-Session") ? pk.c1.r(l0Var.get("CMCD-Session")) : v2Var;
        ((v5.x) obj).getClass();
        ((v5.x) obj).getClass();
        boolean z16 = this.f82034g;
        pk.c1 r17 = h1Var.containsKey("CMCD-Status") ? pk.c1.r(l0Var.get("CMCD-Status")) : v2Var;
        g gVar = new g();
        gVar.f82006a = i13;
        gVar.f82007b = i14;
        gVar.f82008c = j14;
        gVar.f82009d = str6;
        gVar.f82010e = r14;
        h hVar = new h();
        hVar.f82011a = j15;
        hVar.f82012b = j19;
        hVar.f82013c = j16;
        hVar.f82014d = z15;
        hVar.f82015e = str9;
        hVar.f82016f = str10;
        hVar.f82017g = c1Var;
        i iVar = new i();
        iVar.f82018a = str11;
        iVar.f82019b = str12;
        iVar.f82020c = this.f82029b;
        iVar.f82021d = str2;
        iVar.f82022e = f14;
        iVar.f82023f = r16;
        j jVar = new j();
        jVar.f82024a = -2147483647;
        jVar.f82025b = z16;
        jVar.f82026c = r17;
        return new l(gVar, hVar, iVar, jVar, aVar.f77777a);
    }

    public final void b(long j13) {
        bf.b.i(j13 >= 0);
        this.f82036i = j13;
    }

    public final void c(float f13) {
        bf.b.i(f13 == -3.4028235E38f || f13 > 0.0f);
        this.f82032e = f13;
    }
}
