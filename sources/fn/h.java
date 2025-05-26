package fn;

import android.text.TextUtils;
import df.j1;
import java.net.URL;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f62588a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f62589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62590c;

    public h(String str, URL url, String str2) {
        this.f62588a = str;
        this.f62589b = url;
        this.f62590c = str2;
    }

    public static h a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        j1.b(url, "ResourceURL is null");
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new h(str, url, str2);
    }

    public static h b(URL url) {
        j1.b(url, "ResourceURL is null");
        return new h(null, url, null);
    }
}
