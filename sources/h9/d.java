package h9;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import e7.q;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l0.k;
import l9.j;
import l9.m;
import q8.k0;
import q8.l0;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class d implements s {

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f68190f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f68191g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f68192h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f68193i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f68194j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f68195k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public k F;
    public k G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f68196J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f68197a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f68198a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f68199b;

    /* renamed from: b0, reason: collision with root package name */
    public int f68200b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f68201c;

    /* renamed from: c0, reason: collision with root package name */
    public byte f68202c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68203d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f68204d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68205e;

    /* renamed from: e0, reason: collision with root package name */
    public u f68206e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f68207f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f68208g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f68209h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f68210i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f68211j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f68212k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f68213l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f68214m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f68215n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f68216o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f68217p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f68218q;

    /* renamed from: r, reason: collision with root package name */
    public long f68219r;

    /* renamed from: s, reason: collision with root package name */
    public long f68220s;

    /* renamed from: t, reason: collision with root package name */
    public long f68221t;

    /* renamed from: u, reason: collision with root package name */
    public long f68222u;

    /* renamed from: v, reason: collision with root package name */
    public long f68223v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f68224w;

    /* renamed from: x, reason: collision with root package name */
    public c f68225x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f68226y;

    /* renamed from: z, reason: collision with root package name */
    public int f68227z;

    static {
        int i13 = n0.f53866a;
        f68191g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f68192h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f68193i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f68194j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        a.c.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a.c.o(RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, hashMap, "htc_video_rotA-180", RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, "htc_video_rotA-270");
        f68195k0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i13, j jVar) {
        b bVar = new b();
        this.f68220s = -1L;
        this.f68221t = -9223372036854775807L;
        this.f68222u = -9223372036854775807L;
        this.f68223v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f68197a = bVar;
        bVar.f68158d = new t5.e(this);
        this.f68207f = jVar;
        this.f68203d = (i13 & 1) == 0;
        this.f68205e = (i13 & 2) == 0;
        this.f68199b = new e();
        this.f68201c = new SparseArray();
        this.f68210i = new d0(4);
        this.f68211j = new d0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f68212k = new d0(4);
        this.f68208g = new d0(q.f57591a);
        this.f68209h = new d0(4);
        this.f68213l = new d0();
        this.f68214m = new d0();
        this.f68215n = new d0(8);
        this.f68216o = new d0();
        this.f68217p = new d0();
        this.O = new int[1];
    }

    public static byte[] h(String str, long j13, long j14) {
        bf.b.i(j13 != -9223372036854775807L);
        int i13 = (int) (j13 / 3600000000L);
        long j15 = j13 - (i13 * 3600000000L);
        int i14 = (int) (j15 / 60000000);
        long j16 = j15 - (i14 * 60000000);
        int i15 = (int) (j16 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf((int) ((j16 - (i15 * 1000000)) / j14)));
        int i16 = n0.f53866a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.E = -9223372036854775807L;
        this.f68196J = 0;
        b bVar = this.f68197a;
        bVar.f68159e = 0;
        bVar.f68156b.clear();
        e eVar = bVar.f68157c;
        eVar.f68230b = 0;
        eVar.f68231c = 0;
        e eVar2 = this.f68199b;
        eVar2.f68230b = 0;
        eVar2.f68231c = 0;
        l();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f68201c;
            if (i13 >= sparseArray.size()) {
                return;
            }
            l0 l0Var = ((c) sparseArray.valueAt(i13)).V;
            if (l0Var != null) {
                l0Var.f102951b = false;
                l0Var.f102952c = 0;
            }
            i13++;
        }
    }

    public final void c(int i13) {
        if (this.F == null || this.G == null) {
            throw ParserException.a("Element " + i13 + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b0, code lost:
    
        throw androidx.media3.common.ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0859, code lost:
    
        if (r1.s() == r4.getLeastSignificantBits()) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0b83, code lost:
    
        r5 = true;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0ceb, code lost:
    
        if (r5 == false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ced, code lost:
    
        r3 = r34.h();
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0cf5, code lost:
    
        if (r1.B == false) goto L725;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d03, code lost:
    
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d07, code lost:
    
        if (r1.f68226y == false) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d09, code lost:
    
        r6 = r1.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d0f, code lost:
    
        if (r6 == (-1)) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0d38, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0d39, code lost:
    
        if (r5 != false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0d3b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0d42, code lost:
    
        if (r3 >= r1.f68201c.size()) goto L805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0d44, code lost:
    
        r0 = (h9.c) r1.f68201c.valueAt(r3);
        r0.Z.getClass();
        r2 = r0.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0d53, code lost:
    
        if (r2 == null) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0d55, code lost:
    
        r2.a(r0.Z, r0.f68174k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0d5c, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0d5f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0d61, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0d11, code lost:
    
        r4.f102894a = r6;
        r1.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0cf7, code lost:
    
        r1.D = r3;
        r35.f102894a = r1.C;
        r1.B = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d01, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d19, code lost:
    
        r1 = r33;
        r4 = r35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08b5  */
    /* JADX WARN: Type inference failed for: r0v43, types: [h9.e] */
    /* JADX WARN: Type inference failed for: r0v64, types: [h9.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v6, types: [q8.t] */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r34, q8.c0 r35) {
        /*
            Method dump skipped, instructions count: 3836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.d.d(q8.t, q8.c0):int");
    }

    public final void e(int i13) {
        if (this.f68225x != null) {
            return;
        }
        throw ParserException.a("Element " + i13 + " must be in a TrackEntry", null);
    }

    @Override // q8.s
    public final void f(u uVar) {
        if (this.f68205e) {
            uVar = new m(uVar, this.f68207f);
        }
        this.f68206e0 = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(h9.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.d.g(h9.c, long, int, int, int):void");
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        k kVar = new k(3);
        long length = tVar.getLength();
        long j13 = 1024;
        if (length != -1 && length <= 1024) {
            j13 = length;
        }
        int i13 = (int) j13;
        tVar.s(((d0) kVar.f81236c).f53806a, 0, 4);
        kVar.f81235b = 4;
        for (long A = ((d0) kVar.f81236c).A(); A != 440786851; A = ((A << 8) & (-256)) | (((d0) kVar.f81236c).f53806a[0] & 255)) {
            int i14 = kVar.f81235b + 1;
            kVar.f81235b = i14;
            if (i14 == i13) {
                return false;
            }
            tVar.s(((d0) kVar.f81236c).f53806a, 0, 1);
        }
        long p13 = kVar.p(tVar);
        long j14 = kVar.f81235b;
        if (p13 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j14 + p13 >= length) {
            return false;
        }
        while (true) {
            long j15 = kVar.f81235b;
            long j16 = j14 + p13;
            if (j15 >= j16) {
                return j15 == j16;
            }
            if (kVar.p(tVar) == Long.MIN_VALUE) {
                return false;
            }
            long p14 = kVar.p(tVar);
            if (p14 < 0 || p14 > 2147483647L) {
                return false;
            }
            if (p14 != 0) {
                int i15 = (int) p14;
                tVar.m(i15);
                kVar.f81235b += i15;
            }
        }
    }

    public final void k(t tVar, int i13) {
        d0 d0Var = this.f68210i;
        if (d0Var.f53808c >= i13) {
            return;
        }
        byte[] bArr = d0Var.f53806a;
        if (bArr.length < i13) {
            d0Var.b(Math.max(bArr.length * 2, i13));
        }
        byte[] bArr2 = d0Var.f53806a;
        int i14 = d0Var.f53808c;
        tVar.readFully(bArr2, i14, i13 - i14);
        d0Var.J(i13);
    }

    public final void l() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f68198a0 = false;
        this.f68200b0 = 0;
        this.f68202c0 = (byte) 0;
        this.f68204d0 = false;
        this.f68213l.H(0);
    }

    public final long m(long j13) {
        long j14 = this.f68221t;
        if (j14 == -9223372036854775807L) {
            throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        int i13 = n0.f53866a;
        return n0.g0(j13, j14, 1000L, RoundingMode.DOWN);
    }

    public final int n(t tVar, c cVar, int i13, boolean z13) {
        int e13;
        int e14;
        int i14;
        if ("S_TEXT/UTF8".equals(cVar.f68166c)) {
            o(tVar, f68190f0, i13);
            int i15 = this.W;
            l();
            return i15;
        }
        if ("S_TEXT/ASS".equals(cVar.f68166c)) {
            o(tVar, f68192h0, i13);
            int i16 = this.W;
            l();
            return i16;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f68166c)) {
            o(tVar, f68193i0, i13);
            int i17 = this.W;
            l();
            return i17;
        }
        k0 k0Var = cVar.Z;
        boolean z14 = this.Y;
        d0 d0Var = this.f68213l;
        if (!z14) {
            boolean z15 = cVar.f68172i;
            d0 d0Var2 = this.f68210i;
            if (z15) {
                this.R &= -1073741825;
                boolean z16 = this.Z;
                int i18 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (!z16) {
                    tVar.readFully(d0Var2.f53806a, 0, 1);
                    this.V++;
                    byte b13 = d0Var2.f53806a[0];
                    if ((b13 & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f68202c0 = b13;
                    this.Z = true;
                }
                byte b14 = this.f68202c0;
                if ((b14 & 1) == 1) {
                    boolean z17 = (b14 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f68204d0) {
                        d0 d0Var3 = this.f68215n;
                        tVar.readFully(d0Var3.f53806a, 0, 8);
                        this.V += 8;
                        this.f68204d0 = true;
                        byte[] bArr = d0Var2.f53806a;
                        if (!z17) {
                            i18 = 0;
                        }
                        bArr[0] = (byte) (i18 | 8);
                        d0Var2.K(0);
                        k0Var.d(1, 1, d0Var2);
                        this.W++;
                        d0Var3.K(0);
                        k0Var.d(8, 1, d0Var3);
                        this.W += 8;
                    }
                    if (z17) {
                        if (!this.f68198a0) {
                            tVar.readFully(d0Var2.f53806a, 0, 1);
                            this.V++;
                            d0Var2.K(0);
                            this.f68200b0 = d0Var2.y();
                            this.f68198a0 = true;
                        }
                        int i19 = this.f68200b0 * 4;
                        d0Var2.H(i19);
                        tVar.readFully(d0Var2.f53806a, 0, i19);
                        this.V += i19;
                        short s13 = (short) ((this.f68200b0 / 2) + 1);
                        int i23 = (s13 * 6) + 2;
                        ByteBuffer byteBuffer = this.f68218q;
                        if (byteBuffer == null || byteBuffer.capacity() < i23) {
                            this.f68218q = ByteBuffer.allocate(i23);
                        }
                        this.f68218q.position(0);
                        this.f68218q.putShort(s13);
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i14 = this.f68200b0;
                            if (i24 >= i14) {
                                break;
                            }
                            int C = d0Var2.C();
                            if (i24 % 2 == 0) {
                                this.f68218q.putShort((short) (C - i25));
                            } else {
                                this.f68218q.putInt(C - i25);
                            }
                            i24++;
                            i25 = C;
                        }
                        int i26 = (i13 - this.V) - i25;
                        if (i14 % 2 == 1) {
                            this.f68218q.putInt(i26);
                        } else {
                            this.f68218q.putShort((short) i26);
                            this.f68218q.putInt(0);
                        }
                        byte[] array = this.f68218q.array();
                        d0 d0Var4 = this.f68216o;
                        d0Var4.I(i23, array);
                        k0Var.d(i23, 1, d0Var4);
                        this.W += i23;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f68173j;
                if (bArr2 != null) {
                    d0Var.I(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(cVar.f68166c) ? cVar.f68170g > 0 : z13) {
                this.R |= 268435456;
                this.f68217p.H(0);
                int i27 = (d0Var.f53808c + i13) - this.V;
                d0Var2.H(4);
                byte[] bArr3 = d0Var2.f53806a;
                bArr3[0] = (byte) ((i27 >> 24) & 255);
                bArr3[1] = (byte) ((i27 >> 16) & 255);
                bArr3[2] = (byte) ((i27 >> 8) & 255);
                bArr3[3] = (byte) (i27 & 255);
                k0Var.d(4, 2, d0Var2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i28 = i13 + d0Var.f53808c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f68166c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f68166c)) {
            if (cVar.V != null) {
                bf.b.t(d0Var.f53808c == 0);
                cVar.V.c(tVar);
            }
            while (true) {
                int i29 = this.V;
                if (i29 >= i28) {
                    break;
                }
                int i33 = i28 - i29;
                int a13 = d0Var.a();
                if (a13 > 0) {
                    e14 = Math.min(i33, a13);
                    k0Var.d(e14, 0, d0Var);
                } else {
                    e14 = k0Var.e(tVar, i33, false);
                }
                this.V += e14;
                this.W += e14;
            }
        } else {
            d0 d0Var5 = this.f68209h;
            byte[] bArr4 = d0Var5.f53806a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i34 = cVar.f68164a0;
            int i35 = 4 - i34;
            while (this.V < i28) {
                int i36 = this.X;
                if (i36 == 0) {
                    int min = Math.min(i34, d0Var.a());
                    tVar.readFully(bArr4, i35 + min, i34 - min);
                    if (min > 0) {
                        d0Var.i(bArr4, i35, min);
                    }
                    this.V += i34;
                    d0Var5.K(0);
                    this.X = d0Var5.C();
                    d0 d0Var6 = this.f68208g;
                    d0Var6.K(0);
                    k0Var.d(4, 0, d0Var6);
                    this.W += 4;
                } else {
                    int a14 = d0Var.a();
                    if (a14 > 0) {
                        e13 = Math.min(i36, a14);
                        k0Var.d(e13, 0, d0Var);
                    } else {
                        e13 = k0Var.e(tVar, i36, false);
                    }
                    this.V += e13;
                    this.W += e13;
                    this.X -= e13;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f68166c)) {
            d0 d0Var7 = this.f68211j;
            d0Var7.K(0);
            k0Var.d(4, 0, d0Var7);
            this.W += 4;
        }
        int i37 = this.W;
        l();
        return i37;
    }

    public final void o(t tVar, byte[] bArr, int i13) {
        int length = bArr.length + i13;
        d0 d0Var = this.f68214m;
        byte[] bArr2 = d0Var.f53806a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i13);
            d0Var.getClass();
            d0Var.I(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        tVar.readFully(d0Var.f53806a, bArr.length, i13);
        d0Var.K(0);
        d0Var.J(length);
    }
}
