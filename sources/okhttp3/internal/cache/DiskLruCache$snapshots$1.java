package okhttp3.internal.cache;

import java.util.Iterator;
import kotlin.Metadata;
import ll2.a;
import okhttp3.internal.cache.DiskLruCache;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, a {

    /* renamed from: a, reason: collision with root package name */
    public DiskLruCache.Snapshot f95837a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final DiskLruCache.Snapshot next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f95837a == null) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        try {
            throw null;
        } catch (Throwable th3) {
            this.f95837a = null;
            throw th3;
        }
    }
}
