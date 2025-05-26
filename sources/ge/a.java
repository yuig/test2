package ge;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import he.n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import nd.h;

/* loaded from: classes3.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    public final int f64834b;

    /* renamed from: c, reason: collision with root package name */
    public final h f64835c;

    public a(int i13, h hVar) {
        this.f64834b = i13;
        this.f64835c = hVar;
    }

    public static a c(Context context) {
        PackageInfo packageInfo;
        ConcurrentHashMap concurrentHashMap = b.f64836a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = b.f64836a;
        h hVar = (h) concurrentHashMap2.get(packageName);
        if (hVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e13) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e13);
                packageInfo = null;
            }
            d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            hVar = (h) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (hVar == null) {
                hVar = dVar;
            }
        }
        return new a(context.getResources().getConfiguration().uiMode & 48, hVar);
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        this.f64835c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f64834b).array());
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f64834b == aVar.f64834b && this.f64835c.equals(aVar.f64835c);
    }

    @Override // nd.h
    public final int hashCode() {
        return n.h(this.f64834b, this.f64835c);
    }
}
