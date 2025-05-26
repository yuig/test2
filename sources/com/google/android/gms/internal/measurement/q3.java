package com.google.android.gms.internal.measurement;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class q3 extends a6 {
    private static final q3 zzc;
    private static volatile i7 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private i6 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private s3 zzas;
    private g6 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private m3 zzbc;
    private String zzbd;
    private i6 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private b3 zzbn;
    private int zze;
    private int zzf;
    private int zzg;
    private i6 zzh;
    private i6 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        q3 q3Var = new q3();
        zzc = q3Var;
        a6.j(q3.class, q3Var);
    }

    public q3() {
        m7 m7Var = m7.f31525d;
        this.zzh = m7Var;
        this.zzi = m7Var;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = m7Var;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = d6.f31357d;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = m7Var;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
    }

    public static void A(q3 q3Var, ArrayList arrayList) {
        List list = q3Var.zzat;
        if (!((i5) list).f31439a) {
            int size = list.size();
            int i13 = size == 0 ? 10 : size << 1;
            d6 d6Var = (d6) list;
            if (i13 < d6Var.f31359c) {
                throw new IllegalArgumentException();
            }
            q3Var.zzat = new d6(Arrays.copyOf(d6Var.f31358b, i13), d6Var.f31359c, true);
        }
        g5.b(arrayList, q3Var.zzat);
    }

    public static void B(q3 q3Var, boolean z13) {
        q3Var.zzf |= 65536;
        q3Var.zzbh = z13;
    }

    public static void B1(q3 q3Var) {
        q3Var.getClass();
        q3Var.zzag = m7.f31525d;
    }

    public static void C(q3 q3Var) {
        q3Var.zze &= Integer.MAX_VALUE;
        q3Var.zzao = zzc.zzao;
    }

    public static void C1(q3 q3Var, long j13) {
        q3Var.zze |= 524288;
        q3Var.zzab = j13;
    }

    public static void D1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= 2048;
        q3Var.zzt = str;
    }

    public static void F0(q3 q3Var) {
        q3Var.getClass();
        q3Var.zzh = m7.f31525d;
    }

    public static void F1(q3 q3Var) {
        q3Var.zze &= -268435457;
        q3Var.zzal = zzc.zzal;
    }

    public static void G0(q3 q3Var, int i13) {
        q3Var.zzf |= 1048576;
        q3Var.zzbl = i13;
    }

    public static void G1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= 4096;
        q3Var.zzu = str;
    }

    public static void H0(q3 q3Var, long j13) {
        q3Var.zzf |= 32;
        q3Var.zzav = j13;
    }

    public static void I0(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        q3Var.zzax = str;
    }

    public static void I1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= 8192;
        q3Var.zzv = str;
    }

    public static void J0(q3 q3Var, ArrayList arrayList) {
        q3Var.L0();
        g5.b(arrayList, q3Var.zzh);
    }

    public static void K0(q3 q3Var, boolean z13) {
        q3Var.zze |= 131072;
        q3Var.zzz = z13;
    }

    public static void K1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= 65536;
        q3Var.zzy = str;
    }

    public static void M1(q3 q3Var, String str) {
        q3Var.getClass();
        q3Var.zze |= 262144;
        q3Var.zzaa = str;
    }

    public static void O0(q3 q3Var) {
        q3Var.zze &= -17;
        q3Var.zzm = 0L;
    }

    public static void O1(q3 q3Var, String str) {
        q3Var.getClass();
        q3Var.zze |= 2097152;
        q3Var.zzad = str;
    }

    public static void P0(q3 q3Var, int i13) {
        q3Var.L0();
        q3Var.zzh.remove(i13);
    }

    public static void Q0(q3 q3Var, long j13) {
        q3Var.zzf |= 32768;
        q3Var.zzbg = j13;
    }

    public static void Q1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= 4194304;
        q3Var.zzae = str;
    }

    public static void R0(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= 8192;
        q3Var.zzbd = str;
    }

    public static void S0(q3 q3Var) {
        q3Var.zze |= 8388608;
        q3Var.zzaf = false;
    }

    public static void S1(q3 q3Var, String str) {
        q3Var.getClass();
        q3Var.zze |= 16777216;
        q3Var.zzah = str;
    }

    public static void U0(q3 q3Var) {
        q3Var.zze &= -33;
        q3Var.zzn = 0L;
    }

    public static p3 U1() {
        return (p3) zzc.l();
    }

    public static void V0(q3 q3Var, int i13) {
        q3Var.M0();
        q3Var.zzi.remove(i13);
    }

    public static void W0(q3 q3Var, long j13) {
        q3Var.zze |= 2;
        q3Var.zzj = j13;
    }

    public static void X0(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= 16384;
        q3Var.zzbf = str;
    }

    public static void Y0(q3 q3Var, ArrayList arrayList) {
        i6 i6Var = q3Var.zzag;
        if (!((i5) i6Var).f31439a) {
            q3Var.zzag = a6.e(i6Var);
        }
        g5.b(arrayList, q3Var.zzag);
    }

    public static void a1(q3 q3Var) {
        q3Var.zze &= -129;
        q3Var.zzp = zzc.zzp;
    }

    public static void b1(q3 q3Var, int i13) {
        q3Var.zze |= 1024;
        q3Var.zzs = i13;
    }

    public static void c1(q3 q3Var, long j13) {
        q3Var.zze |= 4;
        q3Var.zzk = j13;
    }

    public static void d1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= 131072;
        q3Var.zzbi = str;
    }

    public static void f0(q3 q3Var) {
        q3Var.zze |= 1;
        q3Var.zzg = 1;
    }

    public static void f1(q3 q3Var) {
        q3Var.zze &= -257;
        q3Var.zzq = zzc.zzq;
    }

    public static void g0(q3 q3Var, long j13) {
        q3Var.zzf |= 16;
        q3Var.zzau = j13;
    }

    public static void g1(q3 q3Var, int i13) {
        q3Var.zze |= 1048576;
        q3Var.zzac = i13;
    }

    public static void h0(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= 4;
        q3Var.zzar = str;
    }

    public static void h1(q3 q3Var, long j13) {
        q3Var.zze |= 8;
        q3Var.zzl = j13;
    }

    public static void i0(q3 q3Var, Set set) {
        i6 i6Var = q3Var.zzbe;
        if (!((i5) i6Var).f31439a) {
            q3Var.zzbe = a6.e(i6Var);
        }
        g5.b(set, q3Var.zzbe);
    }

    public static void i1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zzf |= 524288;
        q3Var.zzbk = str;
    }

    public static void j0(q3 q3Var, boolean z13) {
        q3Var.zzf |= 262144;
        q3Var.zzbj = z13;
    }

    public static void k0(q3 q3Var) {
        q3Var.zzf &= -8193;
        q3Var.zzbd = zzc.zzbd;
    }

    public static void k1(q3 q3Var) {
        q3Var.getClass();
        q3Var.zze |= 64;
        q3Var.zzo = "android";
    }

    public static void l1(q3 q3Var, int i13) {
        q3Var.zze |= 33554432;
        q3Var.zzai = i13;
    }

    public static void m1(q3 q3Var, long j13) {
        q3Var.zze |= 16;
        q3Var.zzm = j13;
    }

    public static void n1(q3 q3Var) {
        q3Var.zze &= -65537;
        q3Var.zzy = zzc.zzy;
    }

    public static void p1(q3 q3Var) {
        q3Var.zze &= -131073;
        q3Var.zzz = false;
    }

    public static void q1(q3 q3Var, long j13) {
        q3Var.zze |= 32;
        q3Var.zzn = j13;
    }

    public static void r1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        q3Var.zzp = str;
    }

    public static void t(q3 q3Var, int i13) {
        q3Var.zzf |= 2;
        q3Var.zzaq = i13;
    }

    public static void t1(q3 q3Var) {
        q3Var.zze &= -262145;
        q3Var.zzaa = zzc.zzaa;
    }

    public static void u(q3 q3Var, int i13, h3 h3Var) {
        q3Var.getClass();
        q3Var.L0();
        q3Var.zzh.set(i13, h3Var);
    }

    public static void u1(q3 q3Var, long j13) {
        q3Var.zze |= 16384;
        q3Var.zzw = j13;
    }

    public static void v(q3 q3Var, int i13, y3 y3Var) {
        q3Var.getClass();
        q3Var.M0();
        q3Var.zzi.set(i13, y3Var);
    }

    public static void v1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        q3Var.zzq = str;
    }

    public static void w(q3 q3Var, long j13) {
        q3Var.zze |= 536870912;
        q3Var.zzam = j13;
    }

    public static void x(q3 q3Var, b3 b3Var) {
        q3Var.getClass();
        q3Var.zzbn = b3Var;
        q3Var.zzf |= 4194304;
    }

    public static void x1(q3 q3Var) {
        q3Var.zze |= 32768;
        q3Var.zzx = 82001L;
    }

    public static void y(q3 q3Var, h3 h3Var) {
        q3Var.getClass();
        q3Var.L0();
        q3Var.zzh.add(h3Var);
    }

    public static void y1(q3 q3Var, String str) {
        q3Var.getClass();
        str.getClass();
        q3Var.zze |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        q3Var.zzr = str;
    }

    public static void z(q3 q3Var, y3 y3Var) {
        q3Var.getClass();
        q3Var.M0();
        q3Var.zzi.add(y3Var);
    }

    public static void z1(q3 q3Var) {
        q3Var.zze &= -2097153;
        q3Var.zzad = zzc.zzad;
    }

    public final boolean A0() {
        return (this.zzf & 32768) != 0;
    }

    public final long A1() {
        return this.zzl;
    }

    public final boolean B0() {
        return (this.zze & 1024) != 0;
    }

    public final boolean C0() {
        return (this.zze & 2) != 0;
    }

    public final String D() {
        return this.zzv;
    }

    public final boolean D0() {
        return (this.zze & 32768) != 0;
    }

    public final String E() {
        return this.zzbi;
    }

    public final int E0() {
        return this.zzac;
    }

    public final long E1() {
        return this.zzw;
    }

    public final String F() {
        return this.zzax;
    }

    public final String G() {
        return this.zzbk;
    }

    public final String H() {
        return this.zzq;
    }

    public final long H1() {
        return this.zzn;
    }

    public final String I() {
        return this.zzao;
    }

    public final String J() {
        return this.zzah;
    }

    public final long J1() {
        return this.zzm;
    }

    public final String K() {
        return this.zzae;
    }

    public final String L() {
        return this.zzad;
    }

    public final void L0() {
        i6 i6Var = this.zzh;
        if (((i5) i6Var).f31439a) {
            return;
        }
        this.zzh = a6.e(i6Var);
    }

    public final long L1() {
        return this.zzk;
    }

    public final String M() {
        return this.zzp;
    }

    public final void M0() {
        i6 i6Var = this.zzi;
        if (((i5) i6Var).f31439a) {
            return;
        }
        this.zzi = a6.e(i6Var);
    }

    public final String N() {
        return this.zzo;
    }

    public final int N0() {
        return this.zzh.size();
    }

    public final long N1() {
        return this.zzbg;
    }

    public final String O() {
        return this.zzy;
    }

    public final String P() {
        return this.zzbd;
    }

    public final long P1() {
        return this.zzj;
    }

    public final String Q() {
        return this.zzr;
    }

    public final i6 R() {
        return this.zzag;
    }

    public final long R1() {
        return this.zzx;
    }

    public final i6 S() {
        return this.zzh;
    }

    public final i6 T() {
        return this.zzi;
    }

    public final int T0() {
        return this.zzg;
    }

    public final b3 T1() {
        b3 b3Var = this.zzbn;
        return b3Var == null ? b3.u() : b3Var;
    }

    public final boolean U() {
        return this.zzbh;
    }

    public final boolean V() {
        return this.zzbj;
    }

    public final String V1() {
        return this.zzar;
    }

    public final boolean W() {
        return this.zzz;
    }

    public final String W1() {
        return this.zzu;
    }

    public final boolean X() {
        return this.zzaf;
    }

    public final String X1() {
        return this.zzaa;
    }

    public final boolean Y() {
        return (this.zze & 33554432) != 0;
    }

    public final String Y1() {
        return this.zzt;
    }

    public final boolean Z() {
        return (this.zzf & 4194304) != 0;
    }

    public final int Z0() {
        return this.zzaq;
    }

    public final boolean a0() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean b0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean c0() {
        return (this.zzf & 131072) != 0;
    }

    public final int d0() {
        return this.zzai;
    }

    public final y3 e0(int i13) {
        return (y3) this.zzi.get(i13);
    }

    public final int e1() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final Object g(int i13) {
        switch (y2.f31711a[i13 - 1]) {
            case 1:
                return new q3();
            case 2:
                return new p3(zzc);
            case 3:
                return new l7(zzc, "\u0001<\u0000\u0002\u0001L<\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6", new Object[]{"zze", "zzf", "zzg", "zzh", h3.class, "zzi", y3.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", d3.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", z3.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn"});
            case 4:
                return zzc;
            case 5:
                i7 i7Var = zzd;
                if (i7Var == null) {
                    synchronized (q3.class) {
                        try {
                            i7Var = zzd;
                            if (i7Var == null) {
                                i7Var = new y5();
                                zzd = i7Var;
                            }
                        } finally {
                        }
                    }
                }
                return i7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int j1() {
        return this.zzi.size();
    }

    public final boolean l0() {
        return (this.zzf & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
    }

    public final boolean m0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean n0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean o0() {
        return (this.zzf & 16) != 0;
    }

    public final long o1() {
        return this.zzam;
    }

    public final boolean p0() {
        return (this.zze & 8) != 0;
    }

    public final boolean q0() {
        return (this.zze & 16384) != 0;
    }

    public final int r() {
        return this.zzbl;
    }

    public final boolean r0() {
        return (this.zzf & 262144) != 0;
    }

    public final h3 s(int i13) {
        return (h3) this.zzh.get(i13);
    }

    public final boolean s0() {
        return (this.zze & 131072) != 0;
    }

    public final long s1() {
        return this.zzab;
    }

    public final boolean t0() {
        return (this.zze & 32) != 0;
    }

    public final boolean u0() {
        return (this.zze & 16) != 0;
    }

    public final boolean v0() {
        return (this.zze & 1) != 0;
    }

    public final boolean w0() {
        return (this.zzf & 2) != 0;
    }

    public final long w1() {
        return this.zzau;
    }

    public final boolean x0() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean y0() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean z0() {
        return (this.zze & 4) != 0;
    }
}
