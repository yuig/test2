package s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final b.e f110285b;

    /* renamed from: c, reason: collision with root package name */
    public final b.b f110286c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f110287d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f110284a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f110288e = null;

    public r(b.e eVar, j jVar, ComponentName componentName) {
        this.f110285b = eVar;
        this.f110286c = jVar;
        this.f110287d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f110288e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.f110284a) {
            try {
                try {
                    ((b.c) this.f110285b).C(this.f110286c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b(Uri uri) {
        Bundle bundle = new Bundle();
        try {
            Bundle bundle2 = new Bundle();
            PendingIntent pendingIntent = this.f110288e;
            if (pendingIntent != null && pendingIntent != null) {
                bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            if (bundle2.isEmpty()) {
                bundle2 = null;
            }
            b.b bVar = this.f110286c;
            b.e eVar = this.f110285b;
            if (bundle2 == null) {
                ((b.c) eVar).D(bVar, uri);
            } else {
                bundle.putAll(bundle2);
                ((b.c) eVar).E(bVar, uri, bundle);
            }
        } catch (RemoteException unused) {
        }
    }
}
