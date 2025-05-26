package sw0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import com.pinterest.api.model.bh;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final xk2.v f115589f = xk2.m.b(k.f115499l);

    /* renamed from: g, reason: collision with root package name */
    public static final xk2.v f115590g = xk2.m.b(k.f115500m);

    /* renamed from: h, reason: collision with root package name */
    public static final xk2.v f115591h = xk2.m.b(k.f115501n);

    /* renamed from: a, reason: collision with root package name */
    public boolean f115592a;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f115594c = xk2.m.b(k.f115505r);

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f115595d = xk2.m.b(k.f115506s);

    /* renamed from: e, reason: collision with root package name */
    public final String f115596e = a.a.C(Environment.DIRECTORY_PICTURES, "/Pinterest");

    /* renamed from: b, reason: collision with root package name */
    public final h6.y f115593b = new h6.y(this, new Handler(), 2);

    public final ol1.d a(final nx.d0 pinalytics, final Context context, final boolean z13, yk1.v resources) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resources, "resources");
        final String string = ((yk1.a) resources).f139224a.getString(dt1.d.pinterest_camera);
        final kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f(context);
        ol1.d dVar = new ol1.d(new uj2.s() { // from class: sw0.p
            @Override // uj2.s
            public final void o(fk2.f emitter) {
                String str;
                y this$0 = y.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                nx.d0 pinalytics2 = pinalytics;
                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                kotlin.jvm.internal.f0 pinterestDirFound = f0Var;
                Intrinsics.checkNotNullParameter(pinterestDirFound, "$pinterestDirFound");
                String pinterestDirDisplayName = string;
                Intrinsics.checkNotNullParameter(pinterestDirDisplayName, "$pinterestDirDisplayName");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.c().g(context2, pinalytics2, z13);
                ReentrantReadWriteLock.ReadLock readLock = this$0.c().e().readLock();
                readLock.lock();
                try {
                    List c13 = this$0.c().c();
                    emitter.c(new bh(null, c13.isEmpty() ? "" : ((t) c13.get(0)).f115574a, null, c13.size(), 5, null));
                    w c14 = this$0.c();
                    c14.b();
                    Collection values = c14.d().values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    for (s sVar : CollectionsKt.x0(values, new u(0))) {
                        if (kotlin.text.z.h(sVar.f115569a, this$0.f115596e, false)) {
                            pinterestDirFound.f80424a = true;
                            str = pinterestDirDisplayName;
                        } else {
                            str = sVar.f115570b;
                        }
                        emitter.c(new bh(sVar.f115569a, sVar.f115571c, str, sVar.f115573e.size()));
                    }
                    if (!pinterestDirFound.f80424a) {
                        emitter.c(new bh(this$0.f115596e, null, pinterestDirDisplayName, 0, 10, null));
                    }
                    emitter.b();
                    Unit unit = Unit.f80348a;
                    readLock.unlock();
                } catch (Throwable th3) {
                    readLock.unlock();
                    throw th3;
                }
            }
        }, 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        return dVar;
    }

    public final String b(yk1.v resources, String directoryPath) {
        String str;
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (kotlin.text.z.h(directoryPath, this.f115596e, false)) {
            str = ((yk1.a) resources).f139224a.getString(dt1.d.pinterest_camera);
        } else {
            ReentrantReadWriteLock.ReadLock readLock = c().e().readLock();
            readLock.lock();
            try {
                w c13 = c();
                c13.getClass();
                Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
                c13.b();
                s sVar = (s) c13.d().get(directoryPath);
                String str2 = sVar != null ? sVar.f115570b : null;
                String name = str2 == null ? new File(directoryPath).getName() : str2;
                readLock.unlock();
                str = name;
            } catch (Throwable th3) {
                readLock.unlock();
                throw th3;
            }
        }
        Intrinsics.f(str);
        return str;
    }

    public final w c() {
        return (w) this.f115595d.getValue();
    }

    public final ol1.d d(final Context context, final String directory, final boolean z13, final boolean z14, final boolean z15, final nx.d0 pinalytics, final int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        boolean z16 = true;
        final int addAndGet = ((AtomicInteger) this.f115594c.getValue()).addAndGet(1);
        f(context);
        if (z14 && !z15) {
            z16 = false;
        }
        vb0.j.f125466a.R(z16, "addVideosToMediaCache must be true when includeVideos is true", tb0.p.MEDIA_GALLERY, new Object[0]);
        ol1.d dVar = new ol1.d(new uj2.s() { // from class: sw0.q
            @Override // uj2.s
            public final void o(fk2.f emitter) {
                y this$0 = y.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                nx.d0 pinalytics2 = pinalytics;
                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                String directory2 = directory;
                Intrinsics.checkNotNullParameter(directory2, "$directory");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.c().g(context2, pinalytics2, z15);
                ReentrantReadWriteLock.ReadLock readLock = this$0.c().e().readLock();
                readLock.lock();
                try {
                    List c13 = directory2.length() == 0 ? this$0.c().c() : this$0.c().f(directory2);
                    int size = c13.size();
                    int i14 = i13;
                    if (i14 <= 0) {
                        i14 = size;
                    }
                    for (t tVar : c13.subList(0, Math.min(size, i14))) {
                        if (((AtomicInteger) this$0.f115594c.getValue()).get() == addAndGet) {
                            pu puVar = null;
                            if (z13 && Intrinsics.d("image", tVar.f115575b)) {
                                puVar = new d30(tVar.f115574a, null, 2, null);
                            } else if (z14 && Intrinsics.d("video", tVar.f115575b)) {
                                puVar = new k01(tVar.f115574a);
                            }
                            if (puVar != null && puVar.g()) {
                                emitter.c(puVar);
                            }
                        }
                    }
                    emitter.b();
                    Unit unit = Unit.f80348a;
                    readLock.unlock();
                } catch (Throwable th3) {
                    readLock.unlock();
                    throw th3;
                }
            }
        }, 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        return dVar;
    }

    public final void e() {
        ((AtomicBoolean) c().f115586d.getValue()).set(true);
    }

    public final void f(Context context) {
        if (this.f115592a) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Object value = f115590g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        contentResolver.registerContentObserver((Uri) value, true, this.f115593b);
        this.f115592a = true;
    }
}
