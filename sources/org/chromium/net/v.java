package org.chromium.net;

import a.cb;
import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final v f97467e = new v("", 0, "", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f97468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97469b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97470c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f97471d;

    public v(String str, int i13, String str2, String[] strArr) {
        this.f97468a = str;
        this.f97469b = i13;
        this.f97470c = str2;
        this.f97471d = strArr;
    }

    public static v a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        if (host == null) {
            host = "";
        }
        return new v(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }

    public final String toString() {
        String str = this.f97468a;
        if (!str.equals("localhost") && !str.isEmpty()) {
            str = "<redacted>";
        }
        Locale locale = Locale.US;
        String str2 = this.f97470c == null ? "null" : "\"<redacted>\"";
        StringBuilder o13 = cb.o("ProxyConfig [mHost=\"", str, "\", mPort=");
        o13.append(this.f97469b);
        o13.append(", mPacUrl=");
        o13.append(str2);
        o13.append("]");
        return o13.toString();
    }
}
