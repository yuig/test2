package com.pinterest.feature.ideaPinCreation.worker;

import ag1.b;
import android.content.Context;
import androidx.work.WorkerParameters;
import aq1.h;
import bw0.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.pinterest.api.model.kv;
import com.pinterest.api.model.uj0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.model.e;
import com.pinterest.feature.video.worker.UploadAWSMediaWorker;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import ex0.g;
import h32.f1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kb.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import oy.a;
import oy.a2;
import oy.b2;
import qg1.i;
import r32.c;
import s92.o;
import sv0.l;
import uj2.e0;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/IdeaPinS3MediaUploadWorker;", "Lcom/pinterest/feature/video/worker/UploadAWSMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lsv0/l;", "s3UploadHelper", "Lag1/b;", "ideaPinComposeDataManager", "Lbw0/f;", "storyPinWorkUtils", "Lfe0/b;", "networkSpeedDataProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsv0/l;Lag1/b;Lbw0/f;Lfe0/b;)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinS3MediaUploadWorker extends UploadAWSMediaWorker {
    public final k A;
    public final k B;
    public final k C;
    public final k D;
    public final k E;
    public final k F;

    /* renamed from: t, reason: collision with root package name */
    public final l f46646t;

    /* renamed from: u, reason: collision with root package name */
    public final b f46647u;

    /* renamed from: v, reason: collision with root package name */
    public final f f46648v;

    /* renamed from: w, reason: collision with root package name */
    public final fe0.b f46649w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f46650x;

    /* renamed from: y, reason: collision with root package name */
    public final k f46651y;

    /* renamed from: z, reason: collision with root package name */
    public final k f46652z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinS3MediaUploadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull l s3UploadHelper, @NotNull b ideaPinComposeDataManager, @NotNull f storyPinWorkUtils, @NotNull fe0.b networkSpeedDataProvider) {
        super(context, workerParameters, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(s3UploadHelper, "s3UploadHelper");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        this.f46646t = s3UploadHelper;
        this.f46647u = ideaPinComposeDataManager;
        this.f46648v = storyPinWorkUtils;
        this.f46649w = networkSpeedDataProvider;
        n nVar = n.NONE;
        this.f46651y = m.a(nVar, new aw0.f(this, 7));
        this.f46652z = m.a(nVar, new aw0.f(this, 2));
        this.A = m.a(nVar, new aw0.f(this, 5));
        this.B = m.a(nVar, new aw0.f(this, 3));
        this.C = m.a(nVar, new aw0.f(this, 1));
        this.D = m.a(nVar, new aw0.f(this, 0));
        this.E = m.a(nVar, new aw0.f(this, 6));
        this.F = m.a(nVar, new aw0.f(this, 4));
    }

    public static void D(IdeaPinS3MediaUploadWorker ideaPinS3MediaUploadWorker, o pwtResult, String str, c cVar, Boolean bool, Long l13, Long l14, String str2, int i13) {
        String str3 = (i13 & 4) != 0 ? null : str;
        c cVar2 = (i13 & 8) != 0 ? null : cVar;
        Boolean bool2 = (i13 & 16) != 0 ? null : bool;
        Long l15 = (i13 & 32) != 0 ? null : l13;
        Long l16 = (i13 & 64) != 0 ? null : l14;
        i iVar = ideaPinS3MediaUploadWorker.f46647u.f15134g;
        String uniqueIdentifier = ideaPinS3MediaUploadWorker.C();
        int i14 = ideaPinS3MediaUploadWorker.f78963b.f20000d;
        String t13 = ideaPinS3MediaUploadWorker.t();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new oy.l(new a2(uniqueIdentifier, i14, t13, l15, l16, str3, bool2, str2, pwtResult)).i();
        iVar.g(bool2, cVar2);
    }

    @Override // com.pinterest.feature.video.worker.UploadAWSMediaWorker
    public final d A() {
        Boolean bool = (Boolean) this.F.getValue();
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        float intValue = 0.9f / ((Number) this.B.getValue()).intValue();
        float intValue2 = (((Number) this.A.getValue()).intValue() * intValue) + 0.0f;
        return new d(this.f46648v.h() ? e.IDEA_PIN_PRE_UPLOAD_UPLOADING : e.IDEA_PIN_UPLOADING, u().getPath(), h.notification_upload_media_sce, null, Float.valueOf(((booleanValue ? 0.0f : 0.6f) * intValue) + intValue2).floatValue(), Float.valueOf((intValue * 1.0f) + intValue2).floatValue(), 15000L, "STORY_PIN_UPLOAD_WORK", null, null, null, 1800);
    }

    public final HashMap B() {
        HashMap hashMap = new HashMap();
        String pageId = C();
        l lVar = this.f46646t;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        ex0.e eVar = (ex0.e) lVar.f115365n.get(pageId);
        if (eVar == null) {
            eVar = ex0.e.UNKNOWN;
        }
        hashMap.put("speed_bucket", eVar.getKey());
        return hashMap;
    }

    public final String C() {
        return (String) this.E.getValue();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker, kb.a0
    public final void f() {
        this.f46649w.b(C(), g.FAIL);
        l lVar = this.f46646t;
        String pageId = C();
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        lVar.f(pageId).f(lVar.e(pageId), "pause_transfer");
        l lVar2 = this.f46646t;
        String pageId2 = C();
        int e13 = lVar2.e(pageId2);
        Intrinsics.checkNotNullParameter(pageId2, "pageId");
        TransferObserver d2 = lVar2.f(pageId2).d(e13);
        if (d2 != null) {
            d2.a();
        }
        D(this, o.ABORTED, "onStopped() got invoked, work is canceled", c.VIDEO_UPLOAD_FAILED, Boolean.valueOf(this.f46647u.f15140m), null, null, "PAUSED", 96);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        String str = (String) this.D.getValue();
        String str2 = (String) this.C.getValue();
        f fVar = this.f46648v;
        boolean h10 = fVar.h();
        boolean i13 = fVar.i();
        b bVar = this.f46647u;
        bVar.c(str, str2, h10, i13);
        int minutes = (int) (TimeUnit.SECONDS.toMinutes(Long.parseLong(String.valueOf(this.f46646t.d(C()).f115338h))) - TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()));
        String uniqueIdentifier = C();
        int i14 = this.f78963b.f20000d;
        String pageId = C();
        String fileUri = u().toString();
        Intrinsics.checkNotNullExpressionValue(fileUri, "toString(...)");
        long length = s().length();
        Boolean bool = (Boolean) this.F.getValue();
        bVar.f15134g.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        new oy.o(new b2(uniqueIdentifier, i14, pageId, fileUri, length, minutes, bool)).i();
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46649w.b(C(), g.FAIL);
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_CANCELLED, B(), 2);
        super.m(e13);
        new a().i();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46649w.b(C(), g.FAIL);
        Intrinsics.checkNotNullParameter(e13, "e");
        f();
        f fVar = this.f46648v;
        if (!fVar.h()) {
            d uploadEvent = gi1.e.c(this, null, this.f46650x ? h.story_pin_creation_error_media_not_on_device : h.story_pin_creation_error_video_upload, 7);
            Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
            k().f(uploadEvent);
        }
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_FAILED, B(), 2);
        D(this, o.ERROR, e13.getMessage(), null, null, null, null, "FAILED", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
        if (fVar.h()) {
            return;
        }
        b bVar = this.f46647u;
        i.d(bVar.f15134g, e13, this.f46650x, e13.getMessage(), c.VIDEO_UPLOAD_FAILED, null, null, null, null, null, null, null, bVar.f15133f, (String) this.C.getValue(), bVar.f15130c, fVar.i(), null, 34800);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void o(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_FAILED, B(), 2);
        D(this, o.ERROR, e13.getMessage(), null, null, null, null, "FAILED", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
    }

    @Override // com.pinterest.feature.video.worker.UploadAWSMediaWorker, com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        TransferObserver d2;
        sv0.o oVar;
        BaseMediaWorker.w(this, f1.VIDEO_UPLOAD_ATTEMPTED, null, 6);
        d uploadEvent = A();
        Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
        k().f(uploadEvent);
        File s13 = s();
        if (Intrinsics.d((Boolean) this.F.getValue(), Boolean.TRUE) && !s13.exists()) {
            this.f46650x = true;
            throw new Exception(a.a.j("IdeaPinS3MediaUploadWorker: Video is missing: ", s13.getPath()));
        }
        String C = C();
        final l lVar = this.f46646t;
        if (lVar.e(C) == -1) {
            d2 = lVar.i(s(), C());
        } else {
            String pageId = C();
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            TransferUtility f13 = lVar.f(pageId);
            int e13 = lVar.e(pageId);
            f13.f(e13, "resume_transfer");
            d2 = f13.d(e13);
        }
        if (d2 != null) {
            d2.b();
        }
        final String pageId2 = C();
        final String creationSessionId = (String) this.C.getValue();
        final int i13 = this.f78963b.f20000d;
        Intrinsics.checkNotNullParameter(pageId2, "pageId");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        TransferState transferState = d2 != null ? d2.f28662g : null;
        int i14 = transferState == null ? -1 : sv0.k.f115349c[transferState.ordinal()];
        if (i14 == -1) {
            Intrinsics.checkNotNullParameter(pageId2, "pageId");
            sv0.e d13 = lVar.d(pageId2);
            o20.a aVar = lVar.f115353b;
            String str = d13.f115339i;
            kv kvVar = (kv) ((Map) aVar.a(str).d()).get(str);
            oVar = (kvVar != null && (Intrinsics.d(kvVar.i(), uj0.SUCCEEDED.getValue()) || Intrinsics.d(kvVar.i(), uj0.PROCESSING.getValue()))) ? sv0.o.VERIFIED_UPLOAD : sv0.o.VERIFIED_UPLOAD_FAIL;
        } else if (i14 != 1) {
            final TransferObserver transferObserver = d2;
            Object d14 = new kk2.b(new e0() { // from class: sv0.h
                @Override // uj2.e0
                public final void g(kk2.a emitter) {
                    String pageId3 = pageId2;
                    Intrinsics.checkNotNullParameter(pageId3, "$pageId");
                    l this$0 = lVar;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    String creationSessionId2 = creationSessionId;
                    Intrinsics.checkNotNullParameter(creationSessionId2, "$creationSessionId");
                    Intrinsics.checkNotNullParameter(emitter, "emitter");
                    TransferObserver.this.c(new n(emitter, pageId3, this$0.f115356e, this$0.f115357f, creationSessionId2, this$0.f115359h, i13, this$0));
                }
            }, 0).d();
            Intrinsics.checkNotNullExpressionValue(d14, "blockingGet(...)");
            oVar = (sv0.o) d14;
        } else {
            oVar = sv0.o.PRE_UPLOADED;
        }
        int i15 = aw0.e.f20550a[oVar.ordinal()];
        if (i15 != 1 && i15 != 2 && i15 != 3) {
            throw new gi.c(a.a.j("Video upload using AWS SDK failed, uploadStatus = ", oVar.name()), 4);
        }
        tk2.e.f118017c.b(new vs0.b(this, 10));
        x(f1.VIDEO_UPLOAD_UPLOADED, "upload_time", B());
        D(this, o.COMPLETE, null, null, null, d2 != null ? Long.valueOf(d2.f28661f) : null, d2 != null ? Long.valueOf(d2.f28660e) : null, oVar.name(), 28);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        this.f46649w.b(C(), g.SUCCESS);
        String C = C();
        l lVar = this.f46646t;
        long parseLong = Long.parseLong(lVar.d(C).f115339i);
        String pageId = C();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        lVar.f(pageId).c(lVar.e(pageId));
        lVar.f115360i.remove(pageId);
        lVar.f115363l.remove(pageId);
        lVar.f115361j.remove(pageId);
        lVar.f115362k.remove(pageId);
        lVar.f115365n.remove(pageId);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap.put("MEDIA_ID", Long.valueOf(parseLong));
        String[] strArr = (String[]) this.f46652z.getValue();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        String[] value = (String[]) arrayList.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", value);
        String[] strArr2 = (String[]) this.f46651y.getValue();
        ArrayList arrayList2 = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            arrayList2.add(str2);
        }
        String[] value2 = (String[]) arrayList2.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_PAGE_ID_AND_TRACKING_ID", "key");
        Intrinsics.checkNotNullParameter(value2, "value");
        linkedHashMap.put("STORY_PIN_PAGE_ID_AND_TRACKING_ID", value2);
        kb.l lVar2 = new kb.l(linkedHashMap);
        bk.f.e0(lVar2);
        y yVar = new y(lVar2);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return !this.f46650x && this.f78963b.f20000d < 4;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseUploadAWSMediaWorker, com.pinterest.feature.video.worker.base.BaseUploadMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker
    public final void y(Context context, d0 analytics, f1 eventType, String id3, File file, HashMap auxdata) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(auxdata, "auxdata");
        auxdata.put("media_upload_id", t());
        auxdata.put("idea_pin_creation_session_id", (String) this.C.getValue());
        Boolean bool = (Boolean) this.F.getValue();
        if (bool != null) {
            auxdata.put("media_export_skipped", String.valueOf(bool.booleanValue()));
        }
        super.y(context, analytics, eventType, id3, file, auxdata);
    }
}
