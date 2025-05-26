package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.api.model.f30;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import ee1.d;
import gi1.e;
import gi2.b;
import h32.f1;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import jk2.b2;
import jk2.l1;
import jk2.u0;
import kb.l;
import kh2.n;
import kh2.n3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import n60.o;
import nx.b0;
import nx.d0;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import t20.a;
import uj2.a0;
import v.u2;
import vd0.c;
import x02.d2;
import xk2.m;
import xk2.v;
import y42.f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0015\u0016BS\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/pinterest/feature/video/worker/VideoPinCreateMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lt20/a;", "pinUploadService", "Ly42/f;", "pinUploadHelper", "Lpb0/a;", "clock", "Lwk2/a;", "Ldl1/t;", "Lcom/pinterest/api/model/v7;", "boardRepositoryProvider", "Lnx/b0;", "pinAuxHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lt20/a;Ly42/f;Lpb0/a;Lwk2/a;Lnx/b0;)V", "g4/u", "gi2/b", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class VideoPinCreateMediaWorker extends BaseMediaWorker implements e {

    /* renamed from: o, reason: collision with root package name */
    public final a f49021o;

    /* renamed from: p, reason: collision with root package name */
    public final f f49022p;

    /* renamed from: q, reason: collision with root package name */
    public final pb0.a f49023q;

    /* renamed from: r, reason: collision with root package name */
    public final wk2.a f49024r;

    /* renamed from: s, reason: collision with root package name */
    public final b0 f49025s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49026t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPinCreateMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull a pinUploadService, @NotNull f pinUploadHelper, @NotNull pb0.a clock, @NotNull wk2.a boardRepositoryProvider, @NotNull b0 pinAuxHelper) {
        super("Pin creation has been cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(pinUploadService, "pinUploadService");
        Intrinsics.checkNotNullParameter(pinUploadHelper, "pinUploadHelper");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(boardRepositoryProvider, "boardRepositoryProvider");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f49021o = pinUploadService;
        this.f49022p = pinUploadHelper;
        this.f49023q = clock;
        this.f49024r = boardRepositoryProvider;
        this.f49025s = pinAuxHelper;
        this.f49026t = m.b(new d(this, 24));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_CANCELLED, null, 6);
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        k().f(e.a(this, null, 7));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        k().f(new com.pinterest.feature.video.model.d(com.pinterest.feature.video.model.e.PIN_CREATION, u().getPath(), x0.sent, null, 0.0f, 0.0f, 0L, null, null, null, null, 2040));
        d2 d2Var = new d2(new c(this.f78963b.f19998b.h("PIN_CREATION_PARAMS")));
        String t13 = t();
        Intrinsics.checkNotNullParameter(t13, "<set-?>");
        d2Var.f131330k = t13;
        d2Var.f131331l = t();
        c a13 = d2Var.a();
        this.f49024r.get();
        x10.c cVar = new x10.c(a13);
        Pair e13 = cVar.e();
        ol1.d dVar = new ol1.d(new u2(this, (Map) e13.f80346a, (MultipartBody.Part) e13.f80347b, cVar), 2);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        u0 u0Var = new u0(dVar, new b(), 3);
        a0 a0Var = tk2.e.f118017c;
        l1 A = u0Var.H(a0Var).A(wj2.c.a());
        ek2.e eVar = new ek2.e(1);
        try {
            A.d(new b2(eVar));
            Object c13 = eVar.c();
            if (c13 == null) {
                throw new NoSuchElementException();
            }
            ol1.d dVar2 = new ol1.d(new uv0.a(10, this, (f30) c13), 2);
            Intrinsics.checkNotNullExpressionValue(dVar2, "create(...)");
            n.g0(dVar2.H(a0Var).A(wj2.c.a()));
            BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_SUCCEEDED, null, 6);
        } catch (NullPointerException e14) {
            throw e14;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker
    public final void y(Context context, d0 analytics, f1 eventType, String id3, File file, HashMap auxdata) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(auxdata, "auxdata");
        if (eventType == f1.VIDEO_UPLOAD_SUCCEEDED) {
            ((g) this.f49023q).getClass();
            auxdata.put("post_pin_create_flow_upload_time", String.valueOf((System.currentTimeMillis() - ((Number) this.f49026t.getValue()).longValue()) / 1000));
        }
        l lVar = this.f78963b.f19998b;
        Intrinsics.checkNotNullExpressionValue(lVar, "getInputData(...)");
        n3.m(auxdata, lVar);
        super.y(context, analytics, eventType, id3, file, auxdata);
    }
}
