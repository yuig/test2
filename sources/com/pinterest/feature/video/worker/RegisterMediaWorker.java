package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker;
import gi1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/video/worker/RegisterMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseRegisterMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class RegisterMediaWorker extends BaseRegisterMediaWorker implements e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        t(e.a(this, null, 7));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public void p() {
        t(s());
        super.p();
    }

    public d s() {
        return new d(com.pinterest.feature.video.model.e.BEGIN, null, 0, null, 0.0f, 0.1f, 0L, null, null, null, null, 2014);
    }

    public void t(d uploadEvent) {
        Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
        k().f(uploadEvent);
    }
}
