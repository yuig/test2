package a8;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import pk.a3;
import pk.h1;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1379a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1380b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f1381c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f1382d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1383e;

    public k(androidx.media3.common.b bVar, int i13, int i14, a3 a3Var, String str) {
        this.f1379a = i13;
        this.f1380b = i14;
        this.f1381c = bVar;
        this.f1382d = h1.c(a3Var);
        this.f1383e = str;
    }

    public static boolean a(c cVar) {
        String r13 = com.bumptech.glide.c.r1(cVar.f1307j.f1285b);
        r13.getClass();
        switch (r13) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f1379a == kVar.f1379a && this.f1380b == kVar.f1380b && this.f1381c.equals(kVar.f1381c)) {
            h1 h1Var = this.f1382d;
            h1Var.getClass();
            if (bf.b.M(kVar.f1382d, h1Var) && this.f1383e.equals(kVar.f1383e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1383e.hashCode() + ((this.f1382d.hashCode() + ((this.f1381c.hashCode() + ((((RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER + this.f1379a) * 31) + this.f1380b) * 31)) * 31)) * 31);
    }
}
