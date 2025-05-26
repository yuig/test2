package a8;

import android.os.SystemClock;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class g implements q8.s {

    /* renamed from: a, reason: collision with root package name */
    public final b8.i f1326a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f1327b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f1328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1329d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1330e;

    /* renamed from: f, reason: collision with root package name */
    public final h0.j f1331f;

    /* renamed from: g, reason: collision with root package name */
    public q8.u f1332g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1333h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f1334i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f1335j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1336k;

    /* renamed from: l, reason: collision with root package name */
    public long f1337l;

    /* renamed from: m, reason: collision with root package name */
    public long f1338m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public g(k kVar, int i13) {
        char c13;
        b8.i dVar;
        b8.i iVar;
        this.f1329d = i13;
        String str = kVar.f1381c.f18765o;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c13 = '\b';
                    break;
                }
                c13 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c13 = '\t';
                    break;
                }
                c13 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c13 = '\n';
                    break;
                }
                c13 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c13 = 11;
                    break;
                }
                c13 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c13 = '\f';
                    break;
                }
                c13 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c13 = '\r';
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        switch (c13) {
            case 0:
                dVar = new b8.d(kVar, 0);
                iVar = dVar;
                break;
            case 1:
                dVar = new b8.e(kVar, 1);
                iVar = dVar;
                break;
            case 2:
            case '\b':
                dVar = new b8.c(kVar);
                iVar = dVar;
                break;
            case 3:
                dVar = kVar.f1383e.equals("MP4A-LATM") ? new b8.f(kVar) : new b8.a(kVar);
                iVar = dVar;
                break;
            case 4:
                dVar = new b8.b(kVar);
                iVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new b8.j(kVar);
                iVar = dVar;
                break;
            case 6:
                dVar = new b8.g(kVar);
                iVar = dVar;
                break;
            case 7:
                dVar = new b8.e(kVar, 0);
                iVar = dVar;
                break;
            case '\t':
                dVar = new b8.h(kVar);
                iVar = dVar;
                break;
            case '\n':
                dVar = new b8.k(kVar);
                iVar = dVar;
                break;
            case 11:
                dVar = new b8.d(kVar, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f1326a = iVar;
        this.f1327b = new d7.d0(65507);
        this.f1328c = new d7.d0();
        this.f1330e = new Object();
        this.f1331f = new h0.j();
        this.f1334i = -9223372036854775807L;
        this.f1335j = -1;
        this.f1337l = -9223372036854775807L;
        this.f1338m = -9223372036854775807L;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        synchronized (this.f1330e) {
            try {
                if (!this.f1336k) {
                    this.f1336k = true;
                }
                this.f1337l = j13;
                this.f1338m = j14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        byte[] bArr;
        this.f1332g.getClass();
        int read = tVar.read(this.f1327b.f53806a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f1327b.K(0);
        this.f1327b.J(read);
        d7.d0 d0Var = this.f1327b;
        i iVar = null;
        if (d0Var.a() >= 12) {
            int y13 = d0Var.y();
            byte b13 = (byte) (y13 >> 6);
            byte b14 = (byte) (y13 & 15);
            boolean z13 = ((y13 >> 4) & 1) == 1;
            if (b13 == 2) {
                int y14 = d0Var.y();
                boolean z14 = ((y14 >> 7) & 1) == 1;
                byte b15 = (byte) (y14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
                int E = d0Var.E();
                long A = d0Var.A();
                int k13 = d0Var.k();
                byte[] bArr2 = i.f1355g;
                if (b14 > 0) {
                    bArr = new byte[b14 * 4];
                    for (int i13 = 0; i13 < b14; i13++) {
                        d0Var.i(bArr, i13 * 4, 4);
                    }
                } else {
                    bArr = bArr2;
                }
                if (z13) {
                    d0Var.L(2);
                    short v13 = d0Var.v();
                    if (v13 != 0) {
                        d0Var.L(v13 * 4);
                    }
                }
                byte[] bArr3 = new byte[d0Var.a()];
                d0Var.i(bArr3, 0, d0Var.a());
                h hVar = new h();
                hVar.f1348f = bArr2;
                hVar.f1349g = bArr2;
                hVar.f1343a = z14;
                hVar.f1344b = b15;
                bf.b.i(E >= 0 && E <= 65535);
                hVar.f1345c = 65535 & E;
                hVar.f1346d = A;
                hVar.f1347e = k13;
                hVar.f1348f = bArr;
                hVar.f1349g = bArr3;
                iVar = new i(hVar);
            }
        }
        if (iVar == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = elapsedRealtime - 30;
        h0.j jVar = this.f1331f;
        synchronized (jVar) {
            if (((TreeSet) jVar.f66414d).size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i14 = iVar.f1358c;
            if (!jVar.f66413c) {
                jVar.e();
                jVar.f66412b = kg.a.Y(i14 - 1);
                jVar.f66413c = true;
                jVar.a(new j(iVar, elapsedRealtime));
            } else if (Math.abs(h0.j.b(i14, i.a(jVar.f66411a))) >= 1000) {
                jVar.f66412b = kg.a.Y(i14 - 1);
                ((TreeSet) jVar.f66414d).clear();
                jVar.a(new j(iVar, elapsedRealtime));
            } else if (h0.j.b(i14, jVar.f66412b) > 0) {
                jVar.a(new j(iVar, elapsedRealtime));
            }
        }
        i d2 = this.f1331f.d(j13);
        if (d2 == null) {
            return 0;
        }
        if (!this.f1333h) {
            if (this.f1334i == -9223372036854775807L) {
                this.f1334i = d2.f1359d;
            }
            if (this.f1335j == -1) {
                this.f1335j = d2.f1358c;
            }
            this.f1326a.c(this.f1334i);
            this.f1333h = true;
        }
        synchronized (this.f1330e) {
            try {
                if (!this.f1336k) {
                    do {
                        d7.d0 d0Var2 = this.f1328c;
                        byte[] bArr4 = d2.f1361f;
                        d0Var2.getClass();
                        d0Var2.I(bArr4.length, bArr4);
                        this.f1326a.e(d2.f1358c, d2.f1359d, this.f1328c, d2.f1356a);
                        d2 = this.f1331f.d(j13);
                    } while (d2 != null);
                } else if (this.f1337l != -9223372036854775807L && this.f1338m != -9223372036854775807L) {
                    this.f1331f.e();
                    this.f1326a.b(this.f1337l, this.f1338m);
                    this.f1336k = false;
                    this.f1337l = -9223372036854775807L;
                    this.f1338m = -9223372036854775807L;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return 0;
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        this.f1326a.d(uVar, this.f1329d);
        uVar.A();
        uVar.j(new q8.w(-9223372036854775807L));
        this.f1332g = uVar;
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }
}
