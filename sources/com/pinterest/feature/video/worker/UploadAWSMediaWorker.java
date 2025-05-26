package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker;
import gi1.e;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/video/worker/UploadAWSMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseUploadAWSMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "maxRetryAttempts", "Lokhttp3/OkHttpClient;", "defaultAwsOkHttpClient", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;ILokhttp3/OkHttpClient;)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class UploadAWSMediaWorker extends BaseUploadAWSMediaWorker implements e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UploadAWSMediaWorker(android.content.Context r1, androidx.work.WorkerParameters r2, int r3, okhttp3.OkHttpClient r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto L1d
            android.content.Context r4 = kb0.a.f79058b
            java.lang.Class<so1.b> r4 = so1.b.class
            java.lang.Object r4 = ep.b.g(r4)
            so1.b r4 = (so1.b) r4
            so.oa r4 = (so.oa) r4
            bf2.a r4 = r4.f113974w0
            java.lang.Object r4 = r4.get()
            okhttp3.OkHttpClient r4 = (okhttp3.OkHttpClient) r4
        L1d:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.video.worker.UploadAWSMediaWorker.<init>(android.content.Context, androidx.work.WorkerParameters, int, okhttp3.OkHttpClient, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public d A() {
        return new d(com.pinterest.feature.video.model.e.UPLOADING, u().getPath(), 0, null, 0.1f, 0.45f, ((new File(u().getPath()).length() / 1024) / 1024) * 1000, null, null, null, null, 1932);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public void p() {
        d uploadEvent = A();
        Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
        k().f(uploadEvent);
        super.p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAWSMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, int i13, @NotNull OkHttpClient defaultAwsOkHttpClient) {
        super(context, workerParameters, i13, defaultAwsOkHttpClient);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(defaultAwsOkHttpClient, "defaultAwsOkHttpClient");
    }
}
