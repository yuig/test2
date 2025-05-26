package a8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import pk.a3;
import pk.c1;
import pk.d1;
import pk.e1;
import pk.h2;
import pk.t2;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a */
    public final e1 f1454a;

    static {
        new q().e();
    }

    public r(q qVar) {
        e1 e1Var;
        v2 l13;
        d1 d1Var = (d1) qVar.f1449a;
        Map map = (Map) d1Var.f102947b;
        if (map == null) {
            e1Var = pk.l0.f100446f;
        } else {
            Collection<Map.Entry> entrySet = map.entrySet();
            Comparator comparator = (Comparator) d1Var.f102948c;
            entrySet = comparator != null ? c1.A(entrySet, new pk.z(h2.KEY, comparator instanceof t2 ? (t2) comparator : new pk.g0(comparator))) : entrySet;
            Comparator comparator2 = (Comparator) d1Var.f102949d;
            if (entrySet.isEmpty()) {
                e1Var = pk.l0.f100446f;
            } else {
                d7.b0 b0Var = new d7.b0(entrySet.size());
                int i13 = 0;
                for (Map.Entry entry : entrySet) {
                    Object key = entry.getKey();
                    x0 x0Var = (x0) entry.getValue();
                    if (comparator2 == null) {
                        l13 = x0Var.i();
                    } else {
                        x0Var.f100483c = true;
                        Arrays.sort(x0Var.f100481a, 0, x0Var.f100482b, comparator2);
                        l13 = c1.l(x0Var.f100482b, x0Var.f100481a);
                    }
                    b0Var.e(key, l13);
                    i13 += l13.f100504d;
                }
                e1Var = new e1((a3) b0Var.a(), i13);
            }
        }
        this.f1454a = e1Var;
    }

    public static String b(String str) {
        return com.bumptech.glide.c.z(str, "Accept") ? "Accept" : com.bumptech.glide.c.z(str, "Allow") ? "Allow" : com.bumptech.glide.c.z(str, "Authorization") ? "Authorization" : com.bumptech.glide.c.z(str, "Bandwidth") ? "Bandwidth" : com.bumptech.glide.c.z(str, "Blocksize") ? "Blocksize" : com.bumptech.glide.c.z(str, "Cache-Control") ? "Cache-Control" : com.bumptech.glide.c.z(str, "Connection") ? "Connection" : com.bumptech.glide.c.z(str, "Content-Base") ? "Content-Base" : com.bumptech.glide.c.z(str, "Content-Encoding") ? "Content-Encoding" : com.bumptech.glide.c.z(str, "Content-Language") ? "Content-Language" : com.bumptech.glide.c.z(str, "Content-Length") ? "Content-Length" : com.bumptech.glide.c.z(str, "Content-Location") ? "Content-Location" : com.bumptech.glide.c.z(str, "Content-Type") ? "Content-Type" : com.bumptech.glide.c.z(str, "CSeq") ? "CSeq" : com.bumptech.glide.c.z(str, "Date") ? "Date" : com.bumptech.glide.c.z(str, "Expires") ? "Expires" : com.bumptech.glide.c.z(str, "Location") ? "Location" : com.bumptech.glide.c.z(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : com.bumptech.glide.c.z(str, "Proxy-Require") ? "Proxy-Require" : com.bumptech.glide.c.z(str, "Public") ? "Public" : com.bumptech.glide.c.z(str, "Range") ? "Range" : com.bumptech.glide.c.z(str, "RTP-Info") ? "RTP-Info" : com.bumptech.glide.c.z(str, "RTCP-Interval") ? "RTCP-Interval" : com.bumptech.glide.c.z(str, "Scale") ? "Scale" : com.bumptech.glide.c.z(str, "Session") ? "Session" : com.bumptech.glide.c.z(str, "Speed") ? "Speed" : com.bumptech.glide.c.z(str, "Supported") ? "Supported" : com.bumptech.glide.c.z(str, "Timestamp") ? "Timestamp" : com.bumptech.glide.c.z(str, "Transport") ? "Transport" : com.bumptech.glide.c.z(str, "User-Agent") ? "User-Agent" : com.bumptech.glide.c.z(str, "Via") ? "Via" : com.bumptech.glide.c.z(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final e1 a() {
        return this.f1454a;
    }

    public final String c(String str) {
        c1 c1Var = this.f1454a.get(b(str));
        if (c1Var.isEmpty()) {
            return null;
        }
        return (String) com.bumptech.glide.c.P(c1Var);
    }

    public final c1 d(String str) {
        return this.f1454a.get(b(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f1454a.equals(((r) obj).f1454a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1454a.hashCode();
    }
}
