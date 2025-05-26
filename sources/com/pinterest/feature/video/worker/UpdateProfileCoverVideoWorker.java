package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.worker.base.BaseUploadMediaWorker;
import fi1.a;
import gi1.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/video/worker/UpdateProfileCoverVideoWorker;", "Lcom/pinterest/feature/video/worker/base/BaseUploadMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UpdateProfileCoverVideoWorker extends BaseUploadMediaWorker implements e {

    /* renamed from: o, reason: collision with root package name */
    public final v f49018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateProfileCoverVideoWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49018o = m.b(a.f62216m);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        k().f(e.a(this, null, 7));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        k().f(new d(com.pinterest.feature.video.model.e.PIN_CREATION, u().getPath(), 0, null, 0.0f, 0.0f, 0L, null, null, null, null, 2044));
        if (((tt1.a) ((k22.m) this.f49018o.getValue()).n("video", null, t()).d()).b() != 0) {
            throw new IOException("Failed to update cover source to video.");
        }
    }
}
