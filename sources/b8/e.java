package b8;

import a.cb;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import e7.q;
import java.util.Locale;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22136a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f22137b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f22138c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.k f22139d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f22140e;

    /* renamed from: f, reason: collision with root package name */
    public int f22141f;

    /* renamed from: g, reason: collision with root package name */
    public long f22142g;

    /* renamed from: h, reason: collision with root package name */
    public int f22143h;

    /* renamed from: i, reason: collision with root package name */
    public int f22144i;

    /* renamed from: j, reason: collision with root package name */
    public long f22145j;

    public e(a8.k kVar, int i13) {
        this.f22136a = i13;
        if (i13 != 1) {
            this.f22138c = new d0(q.f57591a);
            this.f22139d = kVar;
            this.f22137b = new d0();
            this.f22142g = -9223372036854775807L;
            this.f22143h = -1;
            return;
        }
        this.f22137b = new d0();
        this.f22138c = new d0(q.f57591a);
        this.f22139d = kVar;
        this.f22142g = -9223372036854775807L;
        this.f22143h = -1;
    }

    public final int a() {
        d0 d0Var = this.f22138c;
        d0Var.K(0);
        int a13 = d0Var.a();
        k0 k0Var = this.f22140e;
        k0Var.getClass();
        k0Var.d(a13, 0, d0Var);
        return a13;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        switch (this.f22136a) {
            case 0:
                this.f22142g = j13;
                this.f22144i = 0;
                this.f22145j = j14;
                break;
            default:
                this.f22142g = j13;
                this.f22144i = 0;
                this.f22145j = j14;
                break;
        }
    }

    @Override // b8.i
    public final void c(long j13) {
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        int i14 = this.f22136a;
        a8.k kVar = this.f22139d;
        switch (i14) {
            case 0:
                k0 D = uVar.D(i13, 2);
                this.f22140e = D;
                int i15 = n0.f53866a;
                D.b(kVar.f1381c);
                break;
            default:
                k0 D2 = uVar.D(i13, 2);
                this.f22140e = D2;
                D2.b(kVar.f1381c);
                break;
        }
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        int i14;
        int i15 = this.f22136a;
        d0 d0Var2 = this.f22137b;
        int i16 = 1;
        switch (i15) {
            case 0:
                try {
                    int i17 = d0Var.f53806a[0] & 31;
                    bf.b.w(this.f22140e);
                    if (i17 > 0 && i17 < 24) {
                        int a13 = d0Var.a();
                        this.f22144i = a() + this.f22144i;
                        this.f22140e.d(a13, 0, d0Var);
                        this.f22144i += a13;
                        this.f22141f = (d0Var.f53806a[0] & 31) == 5 ? 1 : 0;
                    } else if (i17 == 24) {
                        d0Var.y();
                        while (d0Var.a() > 4) {
                            int E = d0Var.E();
                            this.f22144i = a() + this.f22144i;
                            this.f22140e.d(E, 0, d0Var);
                            this.f22144i += E;
                        }
                        this.f22141f = 0;
                    } else {
                        if (i17 != 28) {
                            throw ParserException.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i17)), null);
                        }
                        byte[] bArr = d0Var.f53806a;
                        byte b13 = bArr[0];
                        byte b14 = bArr[1];
                        int i18 = (b13 & 224) | (b14 & 31);
                        boolean z14 = (b14 & 128) > 0;
                        boolean z15 = (b14 & 64) > 0;
                        if (z14) {
                            this.f22144i = a() + this.f22144i;
                            byte[] bArr2 = d0Var.f53806a;
                            i14 = 1;
                            bArr2[1] = (byte) i18;
                            d0Var2.getClass();
                            d0Var2.I(bArr2.length, bArr2);
                            d0Var2.K(1);
                        } else {
                            i14 = 1;
                            int a14 = a8.i.a(this.f22143h);
                            if (i13 != a14) {
                                int i19 = n0.f53866a;
                                Locale locale = Locale.US;
                                d7.u.g("RtpH264Reader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a14, "; received: ", i13, ". Dropping packet."));
                            } else {
                                byte[] bArr3 = d0Var.f53806a;
                                d0Var2.getClass();
                                d0Var2.I(bArr3.length, bArr3);
                                d0Var2.K(2);
                            }
                        }
                        int a15 = d0Var2.a();
                        this.f22140e.d(a15, 0, d0Var2);
                        this.f22144i += a15;
                        if (z15) {
                            this.f22141f = (i18 & 31) == 5 ? i14 : 0;
                        }
                    }
                    if (z13) {
                        if (this.f22142g == -9223372036854775807L) {
                            this.f22142g = j13;
                        }
                        this.f22140e.a(kh2.j.I2(this.f22145j, j13, this.f22142g, 90000), this.f22141f, this.f22144i, 0, null);
                        this.f22144i = 0;
                    }
                    this.f22143h = i13;
                    return;
                } catch (IndexOutOfBoundsException e13) {
                    throw ParserException.b(null, e13);
                }
            default:
                byte[] bArr4 = d0Var.f53806a;
                if (bArr4.length == 0) {
                    throw ParserException.b("Empty RTP data packet.", null);
                }
                int i23 = (bArr4[0] >> 1) & 63;
                bf.b.w(this.f22140e);
                d0 d0Var3 = this.f22138c;
                if (i23 >= 0 && i23 < 48) {
                    int a16 = d0Var.a();
                    int i24 = this.f22144i;
                    d0Var3.K(0);
                    int a17 = d0Var3.a();
                    k0 k0Var = this.f22140e;
                    k0Var.getClass();
                    k0Var.d(a17, 0, d0Var3);
                    this.f22144i = a17 + i24;
                    this.f22140e.d(a16, 0, d0Var);
                    this.f22144i += a16;
                    int i25 = (d0Var.f53806a[0] >> 1) & 63;
                    if (i25 != 19 && i25 != 20) {
                        i16 = 0;
                    }
                    this.f22141f = i16;
                } else {
                    if (i23 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i23 != 49) {
                        throw ParserException.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i23)), null);
                    }
                    byte[] bArr5 = d0Var.f53806a;
                    if (bArr5.length < 3) {
                        throw ParserException.b("Malformed FU header.", null);
                    }
                    int i26 = bArr5[1] & 7;
                    byte b15 = bArr5[2];
                    int i27 = b15 & 63;
                    boolean z16 = (b15 & 128) > 0;
                    boolean z17 = (b15 & 64) > 0;
                    if (z16) {
                        int i28 = this.f22144i;
                        d0Var3.K(0);
                        int a18 = d0Var3.a();
                        k0 k0Var2 = this.f22140e;
                        k0Var2.getClass();
                        k0Var2.d(a18, 0, d0Var3);
                        this.f22144i = a18 + i28;
                        byte[] bArr6 = d0Var.f53806a;
                        bArr6[1] = (byte) ((i27 << 1) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
                        bArr6[2] = (byte) i26;
                        d0Var2.getClass();
                        d0Var2.I(bArr6.length, bArr6);
                        d0Var2.K(1);
                    } else {
                        int i29 = (this.f22143h + 1) % 65535;
                        if (i13 != i29) {
                            int i33 = n0.f53866a;
                            Locale locale2 = Locale.US;
                            d7.u.g("RtpH265Reader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", i29, "; received: ", i13, ". Dropping packet."));
                        } else {
                            d0Var2.getClass();
                            d0Var2.I(bArr5.length, bArr5);
                            d0Var2.K(3);
                        }
                    }
                    int a19 = d0Var2.a();
                    this.f22140e.d(a19, 0, d0Var2);
                    this.f22144i += a19;
                    if (z17) {
                        this.f22141f = (i27 == 19 || i27 == 20) ? 1 : 0;
                    }
                }
                if (z13) {
                    if (this.f22142g == -9223372036854775807L) {
                        this.f22142g = j13;
                    }
                    this.f22140e.a(kh2.j.I2(this.f22145j, j13, this.f22142g, 90000), this.f22141f, this.f22144i, 0, null);
                    this.f22144i = 0;
                }
                this.f22143h = i13;
                return;
        }
    }
}
