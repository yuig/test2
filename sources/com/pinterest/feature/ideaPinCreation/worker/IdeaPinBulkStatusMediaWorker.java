package com.pinterest.feature.ideaPinCreation.worker;

import ag1.b;
import android.content.Context;
import androidx.work.WorkerParameters;
import aw0.c;
import bw0.f;
import com.pinterest.api.model.UploadStatus;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.model.e;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import org.jetbrains.annotations.NotNull;
import oy.g1;
import qg1.i;
import s92.o;
import tb0.h;
import vt1.a;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/IdeaPinBulkStatusMediaWorker;", "Lcom/pinterest/feature/video/worker/StatusMediaWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lag1/b;", "ideaPinDataManager", "Lbw0/f;", "storyPinWorkUtils", "Ltb0/h;", "crashReporting", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lag1/b;Lbw0/f;Ltb0/h;)V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinBulkStatusMediaWorker extends StatusMediaWorker {
    public final k A;
    public final k B;

    /* renamed from: s, reason: collision with root package name */
    public final b f46627s;

    /* renamed from: t, reason: collision with root package name */
    public final f f46628t;

    /* renamed from: u, reason: collision with root package name */
    public final h f46629u;

    /* renamed from: v, reason: collision with root package name */
    public final k f46630v;

    /* renamed from: w, reason: collision with root package name */
    public final k f46631w;

    /* renamed from: x, reason: collision with root package name */
    public final k f46632x;

    /* renamed from: y, reason: collision with root package name */
    public final k f46633y;

    /* renamed from: z, reason: collision with root package name */
    public final k f46634z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinBulkStatusMediaWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull b ideaPinDataManager, @NotNull f storyPinWorkUtils, @NotNull h crashReporting) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(ideaPinDataManager, "ideaPinDataManager");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f46627s = ideaPinDataManager;
        this.f46628t = storyPinWorkUtils;
        this.f46629u = crashReporting;
        n nVar = n.NONE;
        this.f46630v = m.a(nVar, new aw0.b(this, 2));
        this.f46631w = m.a(nVar, new aw0.b(this, 5));
        this.f46632x = m.a(nVar, new aw0.b(this, 3));
        this.f46633y = m.a(nVar, new aw0.b(this, 4));
        this.f46634z = m.a(nVar, new aw0.b(this, 6));
        this.A = m.a(nVar, new aw0.b(this, 1));
        this.B = m.a(nVar, new aw0.b(this, 0));
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final long A() {
        return 1000L;
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final String[] B() {
        return (String[]) this.f46633y.getValue();
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final long C() {
        return 5L;
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final boolean D(List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        List<UploadStatus> list = statuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (UploadStatus uploadStatus : list) {
            if (!uploadStatus.k() && (!a.t(uploadStatus) || !uploadStatus.l())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final boolean E(List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        List<UploadStatus> list = statuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (UploadStatus uploadStatus : list) {
            if (!uploadStatus.q() && (!a.t(uploadStatus) || !uploadStatus.n())) {
                return false;
            }
        }
        return true;
    }

    public final String F() {
        List list = this.f49017r;
        String Z = list != null ? CollectionsKt.Z(list, null, null, null, 0, null, c.f20545j, 31) : null;
        return Z == null ? "" : Z;
    }

    @Override // kb.a0
    public final void f() {
        i.c((i) this.f46634z.getValue(), F(), null, "onStopped() got invoked, work is canceled", r32.c.MEDIA_STATUS_FAILED, Boolean.valueOf(this.f46627s.f15140m), o.ABORTED, 2);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        i iVar = (i) this.f46634z.getValue();
        String mediaIds = t();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(mediaIds, "mediaIds");
        new g1(mediaIds).i();
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        new oy.a().i();
        super.m(e13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r2 != null) goto L22;
     */
    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.Exception r28) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.IdeaPinBulkStatusMediaWorker.n(java.lang.Exception):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r0 != null) goto L28;
     */
    @Override // com.pinterest.feature.video.worker.StatusMediaWorker, com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kb.y q() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.IdeaPinBulkStatusMediaWorker.q():kb.y");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 instanceof RuntimeException) {
            return false;
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f49042g);
        WorkerParameters workerParameters = this.f78963b;
        return ((minutes > 1L ? 1 : (minutes == 1L ? 0 : -1)) < 0 && workerParameters.f20000d <= 5) || ((minutes > (5 / ((long) 2)) ? 1 : (minutes == (5 / ((long) 2)) ? 0 : -1)) < 0 && workerParameters.f20000d <= 2) || super.r(e13);
    }

    @Override // com.pinterest.feature.video.worker.StatusMediaWorker
    public final d z() {
        Float valueOf = Float.valueOf(0.9f);
        Float valueOf2 = Float.valueOf(0.95f);
        Long valueOf3 = Long.valueOf(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        return new d(e.IDEA_PIN_UPLOADING, u().getPath(), aq1.h.notification_create_story_pin, null, valueOf.floatValue(), valueOf2.floatValue(), valueOf3.longValue(), "STORY_PIN_UPLOAD_WORK", null, null, (String) this.A.getValue(), 776);
    }
}
