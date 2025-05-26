package b8;

import a.cb;
import a7.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import java.util.Locale;
import net.quikkly.android.utils.BitmapUtils;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22123a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.k f22124b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f22125c;

    /* renamed from: d, reason: collision with root package name */
    public long f22126d;

    /* renamed from: e, reason: collision with root package name */
    public long f22127e;

    /* renamed from: f, reason: collision with root package name */
    public int f22128f;

    /* renamed from: g, reason: collision with root package name */
    public int f22129g;

    /* renamed from: h, reason: collision with root package name */
    public long f22130h;

    /* renamed from: i, reason: collision with root package name */
    public int f22131i;

    /* renamed from: j, reason: collision with root package name */
    public int f22132j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22133k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22134l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22135m;

    public d(a8.k kVar, int i13) {
        this.f22123a = i13;
        if (i13 != 1) {
            this.f22124b = kVar;
            this.f22126d = -9223372036854775807L;
            this.f22129g = -1;
            return;
        }
        this.f22124b = kVar;
        this.f22126d = -9223372036854775807L;
        this.f22129g = -1;
        this.f22130h = -9223372036854775807L;
        this.f22127e = 0L;
        this.f22128f = -1;
        this.f22131i = -1;
        this.f22132j = -1;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        switch (this.f22123a) {
            case 0:
                this.f22126d = j13;
                this.f22128f = 0;
                this.f22127e = j14;
                break;
            default:
                this.f22126d = j13;
                this.f22129g = -1;
                this.f22127e = j14;
                break;
        }
    }

    @Override // b8.i
    public final void c(long j13) {
        switch (this.f22123a) {
            case 0:
                bf.b.t(this.f22126d == -9223372036854775807L);
                this.f22126d = j13;
                break;
            default:
                bf.b.t(this.f22126d == -9223372036854775807L);
                this.f22126d = j13;
                break;
        }
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        int i14 = this.f22123a;
        a8.k kVar = this.f22124b;
        switch (i14) {
            case 0:
                k0 D = uVar.D(i13, 2);
                this.f22125c = D;
                D.b(kVar.f1381c);
                break;
            default:
                k0 D2 = uVar.D(i13, 2);
                this.f22125c = D2;
                D2.b(kVar.f1381c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        int i14;
        int i15;
        int i16 = this.f22123a;
        a8.k kVar = this.f22124b;
        switch (i16) {
            case 0:
                bf.b.w(this.f22125c);
                int i17 = d0Var.f53807b;
                int E = d0Var.E();
                byte b13 = (E & 1024) > 0;
                if ((E & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 || (E & 504) != 0 || (E & 7) != 0) {
                    d7.u.g("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    if (b13 == true) {
                        if (this.f22135m && this.f22128f > 0) {
                            k0 k0Var = this.f22125c;
                            k0Var.getClass();
                            k0Var.a(this.f22130h, this.f22133k ? 1 : 0, this.f22128f, 0, null);
                            this.f22128f = 0;
                            this.f22130h = -9223372036854775807L;
                            this.f22133k = false;
                            this.f22135m = false;
                        }
                        this.f22135m = true;
                        if ((d0Var.h() & RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN) < 128) {
                            d7.u.g("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = d0Var.f53806a;
                            bArr[i17] = 0;
                            bArr[i17 + 1] = 0;
                            d0Var.K(i17);
                        }
                    } else if (this.f22135m) {
                        int a13 = a8.i.a(this.f22129g);
                        if (i13 < a13) {
                            int i18 = n0.f53866a;
                            Locale locale = Locale.US;
                            d7.u.g("RtpH263Reader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a13, "; received: ", i13, ". Dropping packet."));
                            break;
                        }
                    } else {
                        d7.u.g("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f22128f == 0) {
                        boolean z14 = this.f22134l;
                        int i19 = d0Var.f53807b;
                        if (((d0Var.A() >> 10) & 63) == 32) {
                            int h10 = d0Var.h();
                            int i23 = (h10 >> 1) & 1;
                            if (!z14 && i23 == 0) {
                                int i24 = (h10 >> 2) & 7;
                                if (i24 == 1) {
                                    this.f22131i = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                    this.f22132j = 96;
                                } else {
                                    int i25 = i24 - 2;
                                    this.f22131i = RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN << i25;
                                    this.f22132j = RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM << i25;
                                }
                            }
                            d0Var.K(i19);
                            this.f22133k = i23 == 0;
                        } else {
                            d0Var.K(i19);
                            this.f22133k = false;
                        }
                        if (!this.f22134l && this.f22133k) {
                            int i26 = this.f22131i;
                            androidx.media3.common.b bVar = kVar.f1381c;
                            if (i26 != bVar.f18772v || this.f22132j != bVar.f18773w) {
                                k0 k0Var2 = this.f22125c;
                                q a14 = bVar.a();
                                a14.f1188u = this.f22131i;
                                a14.f1189v = this.f22132j;
                                k0Var2.b(new androidx.media3.common.b(a14));
                            }
                            this.f22134l = true;
                        }
                    }
                    int a15 = d0Var.a();
                    this.f22125c.d(a15, 0, d0Var);
                    this.f22128f += a15;
                    this.f22130h = kh2.j.I2(this.f22127e, j13, this.f22126d, 90000);
                    if (z13) {
                        k0 k0Var3 = this.f22125c;
                        k0Var3.getClass();
                        k0Var3.a(this.f22130h, this.f22133k ? 1 : 0, this.f22128f, 0, null);
                        this.f22128f = 0;
                        this.f22130h = -9223372036854775807L;
                        this.f22133k = false;
                        this.f22135m = false;
                    }
                    this.f22129g = i13;
                    break;
                }
                break;
            default:
                bf.b.w(this.f22125c);
                int y13 = d0Var.y();
                if ((y13 & 8) == 8) {
                    if (this.f22133k && this.f22129g > 0) {
                        k0 k0Var4 = this.f22125c;
                        k0Var4.getClass();
                        k0Var4.a(this.f22130h, this.f22135m ? 1 : 0, this.f22129g, 0, null);
                        this.f22129g = -1;
                        this.f22130h = -9223372036854775807L;
                        this.f22133k = false;
                    }
                    this.f22133k = true;
                } else if (this.f22133k) {
                    int a16 = a8.i.a(this.f22128f);
                    if (i13 < a16) {
                        int i27 = n0.f53866a;
                        Locale locale2 = Locale.US;
                        d7.u.g("RtpVp9Reader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a16, "; received: ", i13, ". Dropping packet."));
                        break;
                    }
                } else {
                    d7.u.g("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 || (d0Var.y() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 || d0Var.a() >= 1) {
                    int i28 = y13 & 16;
                    bf.b.h("VP9 flexible mode is not supported.", i28 == 0);
                    if ((y13 & 32) != 0) {
                        d0Var.L(1);
                        if (d0Var.a() >= 1) {
                            if (i28 == 0) {
                                d0Var.L(1);
                            }
                        }
                    }
                    if ((y13 & 2) != 0) {
                        int y14 = d0Var.y();
                        int i29 = (y14 >> 5) & 7;
                        if ((y14 & 16) != 0) {
                            int i33 = i29 + 1;
                            if (d0Var.a() >= i33 * 4) {
                                for (int i34 = 0; i34 < i33; i34++) {
                                    this.f22131i = d0Var.E();
                                    this.f22132j = d0Var.E();
                                }
                            }
                        }
                        if ((y14 & 8) != 0) {
                            int y15 = d0Var.y();
                            if (d0Var.a() >= y15) {
                                for (int i35 = 0; i35 < y15; i35++) {
                                    int E2 = (d0Var.E() & 12) >> 2;
                                    if (d0Var.a() < E2) {
                                        break;
                                    } else {
                                        d0Var.L(E2);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f22129g == -1 && this.f22133k) {
                        this.f22135m = (d0Var.h() & 4) == 0;
                    }
                    if (!this.f22134l && (i14 = this.f22131i) != -1 && (i15 = this.f22132j) != -1) {
                        androidx.media3.common.b bVar2 = kVar.f1381c;
                        if (i14 != bVar2.f18772v || i15 != bVar2.f18773w) {
                            k0 k0Var5 = this.f22125c;
                            q a17 = bVar2.a();
                            a17.f1188u = this.f22131i;
                            a17.f1189v = this.f22132j;
                            k0Var5.b(new androidx.media3.common.b(a17));
                        }
                        this.f22134l = true;
                    }
                    int a18 = d0Var.a();
                    this.f22125c.d(a18, 0, d0Var);
                    int i36 = this.f22129g;
                    if (i36 == -1) {
                        this.f22129g = a18;
                    } else {
                        this.f22129g = i36 + a18;
                    }
                    this.f22130h = kh2.j.I2(this.f22127e, j13, this.f22126d, 90000);
                    if (z13) {
                        k0 k0Var6 = this.f22125c;
                        k0Var6.getClass();
                        k0Var6.a(this.f22130h, this.f22135m ? 1 : 0, this.f22129g, 0, null);
                        this.f22129g = -1;
                        this.f22130h = -9223372036854775807L;
                        this.f22133k = false;
                    }
                    this.f22128f = i13;
                    break;
                }
                break;
        }
    }
}
