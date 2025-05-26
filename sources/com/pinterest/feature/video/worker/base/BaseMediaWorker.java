package com.pinterest.feature.video.worker.base;

import android.content.Context;
import android.net.Uri;
import androidx.work.WorkerParameters;
import bk.f;
import com.pinterest.api.model.uu;
import h32.f1;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import kb.l;
import kb.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pb0.a;
import pb0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/video/worker/base/BaseMediaWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "", "cancelMessage", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "maxRetryAttempts", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroidx/work/WorkerParameters;I)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseMediaWorker extends BaseWorker {

    /* renamed from: k, reason: collision with root package name */
    public final v f49027k;

    /* renamed from: l, reason: collision with root package name */
    public final v f49028l;

    /* renamed from: m, reason: collision with root package name */
    public final v f49029m;

    /* renamed from: n, reason: collision with root package name */
    public final v f49030n;

    public /* synthetic */ BaseMediaWorker(String str, Context context, WorkerParameters workerParameters, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, workerParameters, (i14 & 8) != 0 ? 0 : i13);
    }

    public static /* synthetic */ void w(BaseMediaWorker baseMediaWorker, f1 f1Var, HashMap hashMap, int i13) {
        String t13 = baseMediaWorker.t();
        if ((i13 & 4) != 0) {
            hashMap = new HashMap();
        }
        baseMediaWorker.v(f1Var, t13, hashMap);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void j() {
        if (Intrinsics.d((String) this.f49030n.getValue(), uu.UNDEFINED.getValue())) {
            throw new MissingFormatArgumentException("MediaType was UNDEFINED; specify a media type for upload");
        }
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long parseLong = Long.parseLong(t());
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap.put("MEDIA_ID", Long.valueOf(parseLong));
        String uri = u().toString();
        Intrinsics.checkNotNullParameter("UPLOAD_URL", "key");
        linkedHashMap.put("UPLOAD_URL", uri);
        l lVar = new l(linkedHashMap);
        f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    public final File s() {
        return (File) this.f49028l.getValue();
    }

    public String t() {
        return (String) this.f49029m.getValue();
    }

    public final Uri u() {
        Object value = this.f49027k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Uri) value;
    }

    public final void v(f1 eventType, String id3, HashMap auxData) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Context context = this.f78962a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        y(context, l(), eventType, id3, s(), auxData);
    }

    public final void x(f1 eventType, String timeKey, HashMap auxData) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(timeKey, "timeKey");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        ((g) ((a) this.f49044i.getValue())).getClass();
        auxData.put(timeKey, String.valueOf((System.currentTimeMillis() - this.f49042g) / 1000.0f));
        Context context = this.f78962a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        y(context, l(), eventType, t(), s(), auxData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r5.hasTransport(3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(android.content.Context r5, nx.d0 r6, h32.f1 r7, java.lang.String r8, java.io.File r9, java.util.HashMap r10) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r1 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "eventType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r3 = "auxdata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r3 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r1 = "auxData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r9.length()
            float r9 = (float) r0
            r0 = 1233125376(0x49800000, float:1048576.0)
            float r9 = r9 / r0
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "%.10f"
            java.lang.String r9 = df.j1.U(r0, r9)
            java.lang.String r0 = "file_size_mb"
            r10.put(r0, r9)
            java.lang.String r9 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r9)
            boolean r9 = r5 instanceof android.net.ConnectivityManager
            if (r9 == 0) goto L62
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            goto L63
        L62:
            r5 = 0
        L63:
            r9 = 0
            if (r5 == 0) goto L8e
            android.net.Network r0 = r5.getActiveNetwork()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L8e
            android.net.NetworkCapabilities r5 = r5.getNetworkCapabilities(r0)     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L8e
            boolean r0 = r5.hasTransport(r9)     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L7b
            java.lang.String r5 = "cellular"
            goto L90
        L7b:
            r0 = 1
            boolean r0 = r5.hasTransport(r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "wifi"
            if (r0 == 0) goto L86
        L84:
            r5 = r1
            goto L90
        L86:
            r0 = 3
            boolean r5 = r5.hasTransport(r0)     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L8e
            goto L84
        L8e:
            java.lang.String r5 = "unknown"
        L90:
            java.lang.String r0 = "network_type"
            r10.put(r0, r5)
            r6.g(r7, r8, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.video.worker.base.BaseMediaWorker.y(android.content.Context, nx.d0, h32.f1, java.lang.String, java.io.File, java.util.HashMap):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMediaWorker(@NotNull String cancelMessage, @NotNull Context context, @NotNull WorkerParameters workerParameters, int i13) {
        super(cancelMessage, context, workerParameters, i13);
        Intrinsics.checkNotNullParameter(cancelMessage, "cancelMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49027k = m.b(new gi1.a(this, 4));
        this.f49028l = m.b(new gi1.a(this, 1));
        m.b(new gi1.a(this, 0));
        this.f49029m = m.b(new gi1.a(this, 2));
        this.f49030n = m.b(new gi1.a(this, 3));
    }
}
