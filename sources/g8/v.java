package g8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f64440d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Uri f64441a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f64442b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64443c;

    public v(long j13, g7.i iVar, long j14) {
        this(iVar.f63786a, Collections.emptyMap(), 0L);
    }

    public v(Uri uri, Map map, long j13) {
        this.f64441a = uri;
        this.f64442b = map;
        this.f64443c = j13;
    }
}
