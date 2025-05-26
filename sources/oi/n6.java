package oi;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n6 extends y6 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f94972d;

    /* renamed from: e, reason: collision with root package name */
    public final h4 f94973e;

    /* renamed from: f, reason: collision with root package name */
    public final h4 f94974f;

    /* renamed from: g, reason: collision with root package name */
    public final h4 f94975g;

    /* renamed from: h, reason: collision with root package name */
    public final h4 f94976h;

    /* renamed from: i, reason: collision with root package name */
    public final h4 f94977i;

    public n6(a7 a7Var) {
        super(a7Var);
        this.f94972d = new HashMap();
        this.f94973e = new h4(n(), "last_delete_stale", 0L);
        this.f94974f = new h4(n(), "backoff", 0L);
        this.f94975g = new h4(n(), "last_upload", 0L);
        this.f94976h = new h4(n(), "last_upload_attempt", 0L);
        this.f94977i = new h4(n(), "midnight_offset", 0L);
    }

    @Override // oi.y6
    public final boolean v() {
        return false;
    }

    public final String w(String str, boolean z13) {
        p();
        String str2 = z13 ? (String) x(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest A0 = f7.A0();
        if (A0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, A0.digest(str2.getBytes())));
    }

    public final Pair x(String str) {
        m6 m6Var;
        AdvertisingIdClient.Info info2;
        p();
        ((oh.b) zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f94972d;
        m6 m6Var2 = (m6) hashMap.get(str);
        if (m6Var2 != null && elapsedRealtime < m6Var2.f94955c) {
            return new Pair(m6Var2.f94953a, Boolean.valueOf(m6Var2.f94954b));
        }
        e l13 = l();
        l13.getClass();
        long v13 = l13.v(str, s.f95089b) + elapsedRealtime;
        try {
            long v14 = l().v(str, s.f95091c);
            if (v14 > 0) {
                try {
                    info2 = AdvertisingIdClient.getAdvertisingIdInfo(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (m6Var2 != null && elapsedRealtime < m6Var2.f94955c + v14) {
                        return new Pair(m6Var2.f94953a, Boolean.valueOf(m6Var2.f94954b));
                    }
                    info2 = null;
                }
            } else {
                info2 = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            }
        } catch (Exception e13) {
            zzj().f95275m.b(e13, "Unable to get advertising id");
            m6Var = new m6(v13, "", false);
        }
        if (info2 == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id3 = info2.getId();
        m6Var = id3 != null ? new m6(v13, id3, info2.isLimitAdTrackingEnabled()) : new m6(v13, "", info2.isLimitAdTrackingEnabled());
        hashMap.put(str, m6Var);
        return new Pair(m6Var.f94953a, Boolean.valueOf(m6Var.f94954b));
    }
}
