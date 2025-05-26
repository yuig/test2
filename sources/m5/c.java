package m5;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85840c;

    /* renamed from: d, reason: collision with root package name */
    public final List f85841d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85842e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85843f;

    public c(String str, String str2, String str3, List list) {
        str.getClass();
        this.f85838a = str;
        str2.getClass();
        this.f85839b = str2;
        this.f85840c = str3;
        list.getClass();
        this.f85841d = list;
        this.f85842e = 0;
        this.f85843f = str + "-" + str2 + "-" + str3;
    }

    public final int a() {
        return this.f85842e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("FontRequest {mProviderAuthority: " + this.f85838a + ", mProviderPackage: " + this.f85839b + ", mQuery: " + this.f85840c + ", mCertificates:");
        int i13 = 0;
        while (true) {
            List list = this.f85841d;
            if (i13 >= list.size()) {
                sb3.append("}");
                sb3.append("mCertificatesArray: " + this.f85842e);
                return sb3.toString();
            }
            sb3.append(" [");
            List list2 = (List) list.get(i13);
            for (int i14 = 0; i14 < list2.size(); i14++) {
                sb3.append(" \"");
                sb3.append(Base64.encodeToString((byte[]) list2.get(i14), 0));
                sb3.append("\"");
            }
            sb3.append(" ]");
            i13++;
        }
    }

    public c(String str, int i13) {
        this.f85838a = "com.google.android.gms.fonts";
        this.f85839b = "com.google.android.gms";
        this.f85840c = str;
        this.f85841d = null;
        com.bumptech.glide.d.h(i13 != 0);
        this.f85842e = i13;
        this.f85843f = "com.google.android.gms.fonts-com.google.android.gms-".concat(str);
    }
}
