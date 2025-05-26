package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.api.model.UploadStatus;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import ee1.d;
import fi1.a;
import fi1.b;
import gi1.e;
import h32.f1;
import ja.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jk2.b2;
import jk2.g2;
import jk2.l1;
import jk2.u0;
import jk2.x;
import kb.l;
import kb.y;
import kh2.n3;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n60.o;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import uj2.a0;
import uj2.q;
import wj2.c;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/video/worker/StatusMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class StatusMediaWorker extends BaseMediaWorker implements e {

    /* renamed from: o, reason: collision with root package name */
    public final v f49014o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49015p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f49016q;

    /* renamed from: r, reason: collision with root package name */
    public List f49017r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super("Transcoding has been cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49014o = m.b(a.f62215l);
        this.f49015p = m.b(new d(this, 23));
        this.f49016q = new ArrayList();
    }

    public long A() {
        return 8000L;
    }

    public String[] B() {
        return (String[]) this.f49015p.getValue();
    }

    public long C() {
        return 30L;
    }

    public boolean D(List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        List list = statuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((UploadStatus) it.next()).k()) {
                return false;
            }
        }
        return true;
    }

    public boolean E(List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        List list = statuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((UploadStatus) it.next()).q()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_CANCELLED, null, 6);
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        k().f(z());
        uv0.a aVar = new uv0.a(9, this, t());
        int i13 = 2;
        ol1.d dVar = new ol1.d(aVar, 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        int i14 = 24;
        int i15 = 1;
        int i16 = 25;
        q t13 = new x(new g2(new u0(dVar, new ic1.a(i14, new b(this, 0)), i13), new d51.a(i14, new b(this, i15)), i15), new d51.a(i16, new b(this, i13)), i13).t(new ic1.a(i16, new b(this, 3)));
        long C = C();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a0 a0Var = tk2.e.f118017c;
        l1 A = t13.L(C, timeUnit, a0Var).H(a0Var).A(c.a());
        ek2.e eVar = new ek2.e(1);
        try {
            A.d(new b2(eVar));
            if (eVar.c() == null) {
                throw new NoSuchElementException();
            }
            x(f1.VIDEO_UPLOAD_PROCESSED, "processing_time", new HashMap());
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public y q() {
        c0 c0Var = new c0(1);
        l lVar = super.q().f79053a;
        for (String str : lVar.f().keySet()) {
            if (str != null) {
                c0Var.d(lVar.f().get(str), str);
            }
        }
        c0Var.j("MEDIA_SIGNATURES", CollectionsKt.Z(this.f49016q, null, null, null, 0, null, null, 63));
        y yVar = new y(c0Var.b());
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker
    public final String t() {
        return (B().length == 0) ^ true ? kotlin.collections.c0.M(B(), null, null, null, 0, null, null, 63) : super.t();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker
    public final void y(Context context, d0 analytics, f1 eventType, String id3, File file, HashMap auxdata) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(auxdata, "auxdata");
        l lVar = this.f78963b.f19998b;
        Intrinsics.checkNotNullExpressionValue(lVar, "getInputData(...)");
        n3.m(auxdata, lVar);
        super.y(context, analytics, eventType, id3, file, auxdata);
    }

    public com.pinterest.feature.video.model.d z() {
        return new com.pinterest.feature.video.model.d(com.pinterest.feature.video.model.e.TRANSCODING, u().getPath(), 0, null, 0.5f, 0.95f, 120000L, null, null, null, null, 1932);
    }
}
