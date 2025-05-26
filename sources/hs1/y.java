package hs1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y implements rd.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f70081a;

    /* renamed from: b, reason: collision with root package name */
    public rd.c f70082b;

    public y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70081a = context;
    }

    @Override // rd.a
    public final rd.c build() {
        rd.c cVar = this.f70082b;
        if (cVar != null) {
            return cVar;
        }
        File cacheDir = this.f70081a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
        if (file == null) {
            return null;
        }
        if (file.isDirectory() || file.mkdirs()) {
            return new mb.d(524288000L, file);
        }
        return null;
    }
}
