package com.pinterest.feature.video.worker.base;

import a.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import dl2.b;
import gi1.d;
import h32.f1;
import il2.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kb.l;
import kh2.n3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import xk2.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/video/worker/base/BaseUploadAWSMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseUploadMediaWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "maxRetryAttempts", "Lokhttp3/OkHttpClient;", "awsOkHttpClient", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;ILokhttp3/OkHttpClient;)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class BaseUploadAWSMediaWorker extends BaseUploadMediaWorker {

    /* renamed from: o, reason: collision with root package name */
    public final OkHttpClient f49035o;

    /* renamed from: p, reason: collision with root package name */
    public Call f49036p;

    /* renamed from: q, reason: collision with root package name */
    public final v f49037q;

    /* renamed from: r, reason: collision with root package name */
    public final v f49038r;

    /* renamed from: s, reason: collision with root package name */
    public final v f49039s;

    public /* synthetic */ BaseUploadAWSMediaWorker(Context context, WorkerParameters workerParameters, int i13, OkHttpClient okHttpClient, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i14 & 4) != 0 ? 0 : i13, okHttpClient);
    }

    public static void z(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.d()) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Failed to upload media with error code ");
        sb3.append(response.f95723d);
        sb3.append(", message: ");
        throw new IOException(a.p(sb3, response.f95722c, "."));
    }

    @Override // kb.a0
    public void f() {
        Call call = this.f49036p;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void p() {
        LinkedHashMap uploadParams = (LinkedHashMap) this.f49039s.getValue();
        String uploadUrl = (String) this.f49037q.getValue();
        Intrinsics.checkNotNullParameter(uploadParams, "uploadParams");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        MultipartBody.Builder builder = new MultipartBody.Builder(0);
        builder.c(MultipartBody.f95659h);
        for (Map.Entry entry : uploadParams.entrySet()) {
            builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        String name = s().getName();
        RequestBody.Companion companion = RequestBody.f95711a;
        MediaType.Companion companion2 = MediaType.f95651d;
        String str = ((String) this.f49030n.getValue()) + "/" + m.g(s());
        companion2.getClass();
        MediaType b13 = MediaType.Companion.b(str);
        File file = s();
        companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "<this>");
        RequestBody$Companion$asRequestBody$1 body = new RequestBody$Companion$asRequestBody$1(file, b13);
        Intrinsics.checkNotNullParameter("file", "name");
        Intrinsics.checkNotNullParameter(body, "body");
        MultipartBody.Part.f95670c.getClass();
        MultipartBody.Part part = MultipartBody.Part.Companion.b("file", name, body);
        Intrinsics.checkNotNullParameter(part, "part");
        builder.f95669c.add(part);
        MultipartBody b14 = builder.b();
        Request.Builder builder2 = new Request.Builder();
        builder2.j(uploadUrl);
        builder2.g(b14);
        Call newCall = this.f49035o.newCall(builder2.b());
        this.f49036p = newCall;
        Response e13 = newCall.e();
        try {
            z(e13);
            Unit unit = Unit.f80348a;
            b.J(e13, null);
        } finally {
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker
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
    public BaseUploadAWSMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, int i13, @NotNull OkHttpClient awsOkHttpClient) {
        super(context, workerParameters, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(awsOkHttpClient, "awsOkHttpClient");
        this.f49035o = awsOkHttpClient;
        this.f49037q = xk2.m.b(new d(this, 2));
        this.f49038r = xk2.m.b(new d(this, 1));
        this.f49039s = xk2.m.b(new d(this, 0));
    }
}
