package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.internal.cache.DiskLruCache;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DiskLruCache$Editor$newSink$1$1 extends s implements Function1<IOException, Unit> {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f95816i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Editor f95817j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f95816i = diskLruCache;
        this.f95817j = editor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IOException it = (IOException) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        DiskLruCache diskLruCache = this.f95816i;
        DiskLruCache.Editor editor = this.f95817j;
        synchronized (diskLruCache) {
            editor.c();
        }
        return Unit.f80348a;
    }
}
