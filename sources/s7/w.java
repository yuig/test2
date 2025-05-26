package s7;

import android.os.Build;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class w implements k7.a {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f111336c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f111337a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f111338b;

    static {
        boolean z13;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z13 = true;
                f111336c = z13;
            }
        }
        z13 = false;
        f111336c = z13;
    }

    public w(UUID uuid, byte[] bArr) {
        this.f111337a = uuid;
        this.f111338b = bArr;
    }
}
