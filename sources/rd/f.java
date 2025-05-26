package rd;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final tb.c f107498a;

    public f(Context context) {
        this.f107498a = new tb.c(context, "image_manager_disk_cache");
    }

    @Override // rd.a
    public final c build() {
        tb.c cVar = this.f107498a;
        File cacheDir = ((Context) cVar.f116959a).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) cVar.f116960b) != null) {
            cacheDir = new File(cacheDir, (String) cVar.f116960b);
        }
        if (cacheDir == null) {
            return null;
        }
        if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
            return new mb.d(262144000L, cacheDir);
        }
        return null;
    }
}
