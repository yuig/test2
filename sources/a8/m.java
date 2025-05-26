package a8;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspUdpUnsupportedTransportException;
import c0.x0;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class m implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1396a = d7.n0.n(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1397b;

    public m(p pVar) {
        this.f1397b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29, types: [androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException] */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException] */
    /* JADX WARN: Type inference failed for: r9v21, types: [androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r9v43, types: [androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException, java.io.IOException] */
    public static void a(m mVar, List list) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        v2 u13;
        Uri uri;
        q7.w wVar;
        boolean z13;
        bn0.a aVar;
        k0.a aVar2;
        int i13;
        bn0.a aVar3;
        Uri uri2;
        String str;
        o oVar;
        p pVar = mVar.f1397b;
        p.L(pVar, list);
        Pattern pattern = j0.f1371a;
        if (!j0.f1372b.matcher((CharSequence) list.get(0)).matches()) {
            Matcher matcher = j0.f1371a.matcher((CharSequence) list.get(0));
            bf.b.i(matcher.matches());
            String group = matcher.group(1);
            group.getClass();
            j0.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            Uri.parse(group2);
            int indexOf = list.indexOf("");
            bf.b.i(indexOf > 0);
            List subList = list.subList(1, indexOf);
            q qVar = new q();
            qVar.d(subList);
            r e13 = qVar.e();
            z.a.n(j0.f1378h).l(list.subList(indexOf + 1, list.size()));
            String c13 = e13.c("CSeq");
            c13.getClass();
            int parseInt = Integer.parseInt(c13);
            bn0.a aVar4 = pVar.f1432h;
            p pVar2 = (p) aVar4.f23561d;
            v2 i14 = j0.i(new bn0.a(new q(pVar2.f1427c, pVar2.f1436l, parseInt).e()));
            p.L((p) aVar4.f23561d, i14);
            ((p) aVar4.f23561d).f1434j.c(i14);
            aVar4.f23559b = Math.max(aVar4.f23559b, parseInt + 1);
            return;
        }
        bn0.a c14 = j0.c(list);
        String c15 = ((r) c14.f23560c).c("CSeq");
        bf.b.n(c15);
        int parseInt2 = Integer.parseInt(c15);
        sparseArray = pVar.f1431g;
        k0 k0Var = (k0) sparseArray.get(parseInt2);
        if (k0Var == null) {
            return;
        }
        sparseArray2 = pVar.f1431g;
        sparseArray2.remove(parseInt2);
        try {
            try {
                int i15 = c14.f23559b;
                int i16 = k0Var.f1385b;
                if (i15 == 200) {
                    switch (i16) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            mVar.b(new bn0.a((r) c14.f23560c, i15, p0.b((String) c14.f23561d)));
                            return;
                        case 4:
                            mVar.c(new l0.k(i15, j0.b(((r) c14.f23560c).c("Public"))));
                            return;
                        case 5:
                            mVar.d();
                            return;
                        case 6:
                            String c16 = ((r) c14.f23560c).c("Range");
                            l0 a13 = c16 == null ? l0.f1392c : l0.a(c16);
                            try {
                                String c17 = ((r) c14.f23560c).c("RTP-Info");
                                if (c17 == null) {
                                    u13 = c1.u();
                                } else {
                                    uri = pVar.f1433i;
                                    u13 = m0.a(uri, c17);
                                }
                            } catch (ParserException unused) {
                                u13 = c1.u();
                            }
                            mVar.e(new bn0.a(c14.f23559b, a13, u13));
                            return;
                        case 10:
                            String c18 = ((r) c14.f23560c).c("Session");
                            String c19 = ((r) c14.f23560c).c("Transport");
                            if (c18 == null || c19 == null) {
                                throw ParserException.b("Missing mandatory session or transport header", null);
                            }
                            mVar.f(new bn0.a(c14.f23559b, 8, j0.d(c18), c19));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i15 == 401) {
                    wVar = pVar.f1435k;
                    if (wVar != null) {
                        z13 = pVar.f1442r;
                        if (!z13) {
                            c1 d2 = ((r) c14.f23560c).d("WWW-Authenticate");
                            if (d2.isEmpty()) {
                                throw ParserException.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i17 = 0; i17 < d2.size(); i17++) {
                                pVar.f1439o = j0.f((String) d2.get(i17));
                                aVar2 = pVar.f1439o;
                                if (aVar2.f77777a == 2) {
                                    break;
                                }
                            }
                            aVar = pVar.f1432h;
                            aVar.i();
                            pVar.f1442r = true;
                            return;
                        }
                    }
                    p.J(pVar, new IOException(j0.j(i16) + " " + c14.f23559b) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                    });
                    return;
                }
                if (i15 == 461) {
                    String str2 = j0.j(i16) + " " + c14.f23559b;
                    String c23 = k0Var.f1386c.c("Transport");
                    bf.b.n(c23);
                    p.J(pVar, (i16 != 10 || c23.contains("TCP")) ? new IOException(str2) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                    } : new RtspMediaSource$RtspUdpUnsupportedTransportException(str2));
                    return;
                }
                if (i15 != 301 && i15 != 302) {
                    p.J(pVar, new IOException(j0.j(i16) + " " + c14.f23559b) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                    });
                    return;
                }
                i13 = pVar.f1440p;
                if (i13 != -1) {
                    pVar.f1440p = 0;
                }
                String c24 = ((r) c14.f23560c).c("Location");
                if (c24 == null) {
                    oVar = pVar.f1425a;
                    ((u) oVar).f("Redirection without new location.", null);
                    return;
                }
                Uri parse = Uri.parse(c24);
                pVar.f1433i = j0.g(parse);
                pVar.f1435k = j0.e(parse);
                aVar3 = pVar.f1432h;
                uri2 = pVar.f1433i;
                str = pVar.f1436l;
                aVar3.j(uri2, str);
            } catch (ParserException e14) {
                e = e14;
                p.J(pVar, new IOException(e) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                });
            }
        } catch (IllegalArgumentException e15) {
            e = e15;
            p.J(pVar, new IOException(e) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
            });
        }
    }

    public final void b(bn0.a aVar) {
        l0 l0Var = l0.f1392c;
        String str = (String) ((o0) aVar.f23561d).f1413a.get("range");
        p pVar = this.f1397b;
        if (str != null) {
            try {
                l0Var = l0.a(str);
            } catch (ParserException e13) {
                ((u) pVar.f1425a).f("SDP format error.", e13);
                return;
            }
        }
        v2 m13 = p.m(aVar, pVar.f1433i);
        boolean isEmpty = m13.isEmpty();
        o oVar = pVar.f1425a;
        if (isEmpty) {
            ((u) oVar).f("No playable track.", null);
        } else {
            ((u) oVar).g(l0Var, m13);
            pVar.f1441q = true;
        }
    }

    public final void c(l0.k kVar) {
        p pVar = this.f1397b;
        if (pVar.f1438n != null) {
            return;
        }
        c1 c1Var = (c1) kVar.f81236c;
        if (!c1Var.isEmpty() && !c1Var.contains(2)) {
            ((u) pVar.f1425a).f("DESCRIBE not supported.", null);
            return;
        }
        pVar.f1432h.j(pVar.f1433i, pVar.f1436l);
    }

    public final void d() {
        p pVar = this.f1397b;
        bf.b.t(pVar.f1440p == 2);
        pVar.f1440p = 1;
        pVar.f1443s = false;
        long j13 = pVar.f1444t;
        if (j13 != -9223372036854775807L) {
            pVar.S(d7.n0.o0(j13));
        }
    }

    public final void e(bn0.a aVar) {
        p pVar = this.f1397b;
        int i13 = pVar.f1440p;
        bf.b.t(i13 == 1 || i13 == 2);
        pVar.f1440p = 2;
        if (pVar.f1438n == null) {
            long j13 = pVar.f1437m / 2;
            l lVar = new l(pVar, j13);
            pVar.f1438n = lVar;
            if (!lVar.f1390c) {
                lVar.f1390c = true;
                lVar.f1388a.postDelayed(lVar, j13);
            }
        }
        pVar.f1444t = -9223372036854775807L;
        ((u) pVar.f1426b).c(d7.n0.X(((l0) aVar.f23560c).f1394a), (c1) aVar.f23561d);
    }

    public final void f(bn0.a aVar) {
        p pVar = this.f1397b;
        bf.b.t(pVar.f1440p != -1);
        pVar.f1440p = 1;
        x0 x0Var = (x0) aVar.f23560c;
        pVar.f1436l = (String) x0Var.f24392b;
        pVar.f1437m = x0Var.f24391a;
        pVar.M();
    }
}
