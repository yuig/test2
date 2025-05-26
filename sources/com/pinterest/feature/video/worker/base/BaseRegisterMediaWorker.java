package com.pinterest.feature.video.worker.base;

import android.content.Context;
import androidx.work.WorkerParameters;
import bk.f;
import com.pinterest.api.model.pc0;
import com.pinterest.api.model.tu;
import com.pinterest.feature.video.model.b;
import gi1.c;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import kb.l;
import kb.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o20.a;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/video/worker/base/BaseRegisterMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class BaseRegisterMediaWorker extends BaseWorker {

    /* renamed from: k, reason: collision with root package name */
    public final v f49031k;

    /* renamed from: l, reason: collision with root package name */
    public final v f49032l;

    /* renamed from: m, reason: collision with root package name */
    public final v f49033m;

    /* renamed from: n, reason: collision with root package name */
    public b f49034n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRegisterMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super("Media registration cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49031k = m.b(gi1.b.f65153j);
        this.f49032l = m.b(new c(this, 1));
        this.f49033m = m.b(new c(this, 0));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void j() {
        if (Intrinsics.d((String) this.f49032l.getValue(), pc0.REGISTER_TYPE_UNDEFINED.getValue())) {
            throw new MissingFormatArgumentException("RegisterMediaType was UNDEFINED; specify a media type for upload");
        }
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void p() {
        Object d2 = ((a) this.f49031k.getValue()).b((String) this.f49032l.getValue(), ((Number) this.f49033m.getValue()).intValue()).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        b bVar = new b((tu) d2);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f49034n = bVar;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b bVar = this.f49034n;
        if (bVar == null) {
            Intrinsics.r("registeredUpload");
            throw null;
        }
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap.put("MEDIA_ID", Long.valueOf(bVar.f48994a));
        b bVar2 = this.f49034n;
        if (bVar2 == null) {
            Intrinsics.r("registeredUpload");
            throw null;
        }
        Intrinsics.checkNotNullParameter("UPLOAD_URL", "key");
        linkedHashMap.put("UPLOAD_URL", bVar2.f48995b);
        b bVar3 = this.f49034n;
        if (bVar3 == null) {
            Intrinsics.r("registeredUpload");
            throw null;
        }
        String sVar = bVar3.f48996c.f125623a.toString();
        Intrinsics.checkNotNullParameter("UPLOAD_PARAMS_OBJ", "key");
        linkedHashMap.put("UPLOAD_PARAMS_OBJ", sVar);
        l lVar = new l(linkedHashMap);
        f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }
}
