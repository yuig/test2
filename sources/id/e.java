package id;

import android.app.ActivityManager;
import android.content.Context;
import android.os.storage.StorageManager;
import kh2.s0;

/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: c, reason: collision with root package name */
    public final StorageManager f72122c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityManager f72123d;

    public e(b bVar, hd.c cVar) {
        super(cVar);
        Object obj = bVar.f72118c;
        StorageManager storageManager = null;
        try {
            Object systemService = ((Context) obj).getSystemService("storage");
            storageManager = (StorageManager) (systemService instanceof StorageManager ? systemService : null);
        } catch (RuntimeException unused) {
        }
        this.f72122c = storageManager;
        this.f72123d = s0.D((Context) obj);
    }
}
