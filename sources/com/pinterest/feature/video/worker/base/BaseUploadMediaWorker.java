package com.pinterest.feature.video.worker.base;

import android.content.Context;
import androidx.work.WorkerParameters;
import h32.f1;
import java.io.File;
import java.util.HashMap;
import kb.l;
import kh2.n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/video/worker/base/BaseUploadMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseMediaWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "maxRetryAttempts", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;I)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseUploadMediaWorker extends BaseMediaWorker {
    public /* synthetic */ BaseUploadMediaWorker(Context context, WorkerParameters workerParameters, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i14 & 4) != 0 ? 0 : i13);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker
    public void y(Context context, d0 analytics, f1 eventType, String id3, File file, HashMap auxdata) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUploadMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, int i13) {
        super("Upload has been cancelled", context, workerParameters, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
    }
}
