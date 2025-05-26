package dm;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f55329b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f55330c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static l f55331d;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.d f55332a;

    public l(com.google.android.gms.common.api.d dVar) {
        this.f55332a = dVar;
    }

    public static l a() {
        if (com.google.android.gms.common.api.d.f30756b == null) {
            com.google.android.gms.common.api.d.f30756b = new com.google.android.gms.common.api.d(13);
        }
        com.google.android.gms.common.api.d dVar = com.google.android.gms.common.api.d.f30756b;
        if (f55331d == null) {
            f55331d = new l(dVar);
        }
        return f55331d;
    }

    public final boolean b(em.a aVar) {
        if (TextUtils.isEmpty(aVar.f59573c)) {
            return true;
        }
        long j13 = aVar.f59576f + aVar.f59575e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f55332a.getClass();
        return j13 < timeUnit.toSeconds(System.currentTimeMillis()) + f55329b;
    }
}
