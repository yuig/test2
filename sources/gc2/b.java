package gc2;

import ac2.n;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public n f64775a;

    /* renamed from: b, reason: collision with root package name */
    public String f64776b;

    /* renamed from: c, reason: collision with root package name */
    public String f64777c;

    /* renamed from: d, reason: collision with root package name */
    public String f64778d;

    /* renamed from: e, reason: collision with root package name */
    public String f64779e;

    /* renamed from: f, reason: collision with root package name */
    public String f64780f;

    /* renamed from: g, reason: collision with root package name */
    public long f64781g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f64782h = new HashMap();

    public final String toString() {
        n nVar = this.f64775a;
        String str = this.f64776b;
        String str2 = this.f64777c;
        String str3 = this.f64778d;
        String str4 = this.f64779e;
        String str5 = this.f64780f;
        long j13 = this.f64781g;
        StringBuilder sb3 = new StringBuilder("TransferData(\n\tnetworkClientType=");
        sb3.append(nVar);
        sb3.append(",\n\tnegotiatedProtocol=");
        sb3.append(str);
        sb3.append(",\n\tquicVersion=");
        a.a.B(sb3, str2, ",\n\taltSvc=", str3, ",\n\tcdnName=");
        a.a.B(sb3, str4, ",\n\tcdnCacheStatus=", str5, ",\n\tdownloadedDataBytes=");
        return a.a.o(sb3, j13, ",\n)");
    }
}
