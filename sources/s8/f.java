package s8;

import a.cb;
import a7.o0;
import a7.q;
import d7.d0;
import d7.n0;
import d7.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import pk.a0;
import pk.c1;
import pk.u0;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f111455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f111456b;

    public f(int i13, v2 v2Var) {
        this.f111456b = i13;
        this.f111455a = v2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i13, d0 d0Var) {
        String str;
        a cVar;
        int i14 = 4;
        a0.C(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i15 = d0Var.f53808c;
        int i16 = -2;
        int i17 = 0;
        while (d0Var.a() > 8) {
            int m13 = d0Var.m();
            int m14 = d0Var.f53807b + d0Var.m();
            d0Var.J(m14);
            if (m13 != 1414744396) {
                g gVar = null;
                switch (m13) {
                    case 1718776947:
                        if (i16 == 2) {
                            d0Var.L(i14);
                            int m15 = d0Var.m();
                            int m16 = d0Var.m();
                            d0Var.L(i14);
                            int m17 = d0Var.m();
                            switch (m17) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                cb.t("Ignoring track with unsupported compression ", m17, "StreamFormatChunk");
                            } else {
                                q qVar = new q();
                                qVar.f1188u = m15;
                                qVar.f1189v = m16;
                                qVar.h(str);
                                gVar = new g(new androidx.media3.common.b(qVar));
                            }
                        } else if (i16 == 1) {
                            int r13 = d0Var.r();
                            String str2 = r13 != 1 ? r13 != 85 ? r13 != 255 ? r13 != 8192 ? r13 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                cb.t("Ignoring track with unsupported format tag ", r13, "StreamFormatChunk");
                            } else {
                                int r14 = d0Var.r();
                                int m18 = d0Var.m();
                                d0Var.L(6);
                                int F = n0.F(d0Var.r());
                                int r15 = d0Var.a() > 0 ? d0Var.r() : 0;
                                q qVar2 = new q();
                                qVar2.f1181n = o0.r(str2);
                                qVar2.D = r14;
                                qVar2.E = m18;
                                if (str2.equals("audio/raw") && F != 0) {
                                    qVar2.F = F;
                                }
                                if (str2.equals("audio/mp4a-latm") && r15 > 0) {
                                    byte[] bArr = new byte[r15];
                                    d0Var.i(bArr, 0, r15);
                                    qVar2.f1184q = c1.v(bArr);
                                }
                                gVar = new g(new androidx.media3.common.b(qVar2));
                            }
                        } else {
                            u.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n0.L(i16));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int m19 = d0Var.m();
                        d0Var.L(8);
                        int m23 = d0Var.m();
                        int m24 = d0Var.m();
                        d0Var.L(i14);
                        d0Var.m();
                        d0Var.L(12);
                        cVar = new c(m19, m23, m24);
                        break;
                    case 1752331379:
                        int m25 = d0Var.m();
                        d0Var.L(12);
                        d0Var.m();
                        int m26 = d0Var.m();
                        int m27 = d0Var.m();
                        d0Var.L(i14);
                        int m28 = d0Var.m();
                        int m29 = d0Var.m();
                        d0Var.L(i14);
                        cVar = new d(m25, m26, m27, m28, m29, d0Var.m());
                        break;
                    case 1852994675:
                        cVar = new h(d0Var.w(d0Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(d0Var.m(), d0Var);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    i16 = ((d) cVar).a();
                }
                int i18 = i17 + 1;
                int d2 = u0.d(objArr.length, i18);
                if (d2 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i17] = cVar;
                i17 = i18;
            }
            d0Var.K(m14);
            d0Var.J(i15);
            i14 = 4;
        }
        return new f(i13, c1.l(i17, objArr));
    }

    public final a a(Class cls) {
        y0 listIterator = this.f111455a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // s8.a
    public final int getType() {
        return this.f111456b;
    }
}
