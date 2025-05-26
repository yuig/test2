package a8;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a */
    public final long f1398a;

    /* renamed from: b */
    public final int f1399b;

    /* renamed from: c */
    public final Uri f1400c;

    public m0(int i13, long j13, Uri uri) {
        this.f1398a = j13;
        this.f1399b = i13;
        this.f1400c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:7:0x002e, B:20:0x0077, B:25:0x007e, B:26:0x0083, B:29:0x0084, B:30:0x0089, B:32:0x004e, B:35:0x005a, B:38:0x0064), top: B:6:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pk.v2 a(android.net.Uri r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.m0.a(android.net.Uri, java.lang.String):pk.v2");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        bf.b.i(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? b7.c.O(uri2, str) : b7.c.O(uri2.concat("/"), str);
    }
}
