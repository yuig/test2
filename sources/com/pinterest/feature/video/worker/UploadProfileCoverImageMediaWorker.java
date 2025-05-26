package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import bk.f;
import com.pinterest.api.model.kr;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.worker.base.BaseUploadMediaWorker;
import fi1.a;
import gi1.e;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import kb.l;
import kb.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/video/worker/UploadProfileCoverImageMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseUploadMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UploadProfileCoverImageMediaWorker extends BaseUploadMediaWorker implements e {

    /* renamed from: o, reason: collision with root package name */
    public final v f49019o;

    /* renamed from: p, reason: collision with root package name */
    public String f49020p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProfileCoverImageMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49019o = m.b(a.f62217n);
        this.f49020p = "";
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        k().f(e.a(this, null, 7));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        k().f(new d(com.pinterest.feature.video.model.e.UPLOADING, u().getPath(), 0, null, 0.45f, 0.5f, ((new File(u().getPath()).length() / 1024) / 1024) * 1000, null, null, null, null, 1932));
        RequestBody.Companion companion = RequestBody.f95711a;
        MediaType.f95651d.getClass();
        MediaType b13 = MediaType.Companion.b("image/*");
        File file = s();
        companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1 = new RequestBody$Companion$asRequestBody$1(file, b13);
        MultipartBody.Part.Companion companion2 = MultipartBody.Part.f95670c;
        String name = s().getName();
        companion2.getClass();
        Object d2 = ((k22.m) this.f49019o.getValue()).E(MultipartBody.Part.Companion.b("image", name, requestBody$Companion$asRequestBody$1)).d();
        Intrinsics.checkNotNullExpressionValue(d2, "blockingGet(...)");
        tt1.a aVar = (tt1.a) d2;
        if (aVar.b() != 0) {
            throw new IOException("Failed to upload media.");
        }
        String b14 = ((kr) aVar.c()).b();
        if (b14 == null) {
            b14 = "";
        }
        this.f49020p = b14;
        if (z.j(b14)) {
            throw new IllegalStateException("TrackingID always required");
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long parseLong = Long.parseLong(this.f49020p);
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap.put("MEDIA_ID", Long.valueOf(parseLong));
        l lVar = new l(linkedHashMap);
        f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }
}
