package com.pinterest.feature.ideaPinCreation.worker;

import ag1.b;
import android.content.Context;
import android.net.Uri;
import androidx.work.WorkerParameters;
import aq1.h;
import aw0.d;
import bw0.f;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.pinterest.api.model.tp;
import com.pinterest.feature.video.worker.RegisterMediaWorker;
import gi1.e;
import ja.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kb.y;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oy.a;
import oy.g;
import oy.n1;
import oy.q1;
import qg1.i;
import r32.c;
import s92.o;
import sv0.l;
import tb0.p;
import ub.r;
import ub.s;
import vb0.j;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/IdeaPinS3CredentialsWorker;", "Lcom/pinterest/feature/video/worker/RegisterMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lsv0/l;", "s3UploadHelper", "Lag1/b;", "ideaPinDataManager", "Lbw0/f;", "storyPinWorkUtils", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsv0/l;Lag1/b;Lbw0/f;)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinS3CredentialsWorker extends RegisterMediaWorker {

    /* renamed from: o, reason: collision with root package name */
    public final l f46635o;

    /* renamed from: p, reason: collision with root package name */
    public final b f46636p;

    /* renamed from: q, reason: collision with root package name */
    public final f f46637q;

    /* renamed from: r, reason: collision with root package name */
    public kb.l f46638r;

    /* renamed from: s, reason: collision with root package name */
    public final k f46639s;

    /* renamed from: t, reason: collision with root package name */
    public final k f46640t;

    /* renamed from: u, reason: collision with root package name */
    public final k f46641u;

    /* renamed from: v, reason: collision with root package name */
    public final k f46642v;

    /* renamed from: w, reason: collision with root package name */
    public final k f46643w;

    /* renamed from: x, reason: collision with root package name */
    public final k f46644x;

    /* renamed from: y, reason: collision with root package name */
    public final k f46645y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinS3CredentialsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull l s3UploadHelper, @NotNull b ideaPinDataManager, @NotNull f storyPinWorkUtils) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(s3UploadHelper, "s3UploadHelper");
        Intrinsics.checkNotNullParameter(ideaPinDataManager, "ideaPinDataManager");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        this.f46635o = s3UploadHelper;
        this.f46636p = ideaPinDataManager;
        this.f46637q = storyPinWorkUtils;
        n nVar = n.NONE;
        this.f46639s = m.a(nVar, new d(this, 6));
        this.f46640t = m.a(nVar, new d(this, 2));
        this.f46641u = m.a(nVar, new d(this, 5));
        this.f46642v = m.a(nVar, new d(this, 4));
        this.f46643w = m.a(nVar, new d(this, 3));
        this.f46644x = m.a(nVar, new d(this, 1));
        this.f46645y = m.a(nVar, new d(this, 0));
    }

    public static void v(IdeaPinS3CredentialsWorker ideaPinS3CredentialsWorker, o pwtResult, Long l13, String str, String str2, Boolean bool, int i13) {
        Long l14 = (i13 & 2) != 0 ? null : l13;
        String str3 = (i13 & 4) != 0 ? null : str;
        String str4 = (i13 & 8) != 0 ? null : str2;
        Boolean bool2 = (i13 & 16) != 0 ? null : bool;
        i iVar = ideaPinS3CredentialsWorker.f46636p.f15134g;
        String uniqueIdentifier = ideaPinS3CredentialsWorker.u();
        int i14 = ideaPinS3CredentialsWorker.f78963b.f20000d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new oy.f(new n1(uniqueIdentifier, i14, l14, str3, str4, bool2, pwtResult)).i();
        iVar.g(bool2, null);
    }

    @Override // kb.a0
    public final void f() {
        v(this, o.ABORTED, null, null, "onStopped() got invoked, work is canceled", Boolean.valueOf(this.f46636p.f15140m), 6);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        String str = (String) this.f46645y.getValue();
        String str2 = (String) this.f46644x.getValue();
        f fVar = this.f46637q;
        boolean h10 = fVar.h();
        boolean i13 = fVar.i();
        b bVar = this.f46636p;
        bVar.c(str, str2, h10, i13);
        String uniqueIdentifier = u();
        int i14 = this.f78963b.f20000d;
        String pageId = u();
        bVar.f15134g.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        new g(new q1(uniqueIdentifier, i14, pageId)).i();
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        new a().i();
        v(this, o.ABORTED, null, null, null, null, 30);
    }

    @Override // com.pinterest.feature.video.worker.RegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        t(e.c(this, null, h.story_pin_creation_error_video_registration, 7));
        v(this, o.ERROR, null, null, e13.getMessage(), null, 22);
        f fVar = this.f46637q;
        if (fVar.h()) {
            return;
        }
        b bVar = this.f46636p;
        i.d(bVar.f15134g, e13, false, e13.getMessage(), c.VIDEO_UPLOAD_REGISTRATION_FAILED, null, null, null, null, null, null, null, bVar.f15133f, (String) this.f46644x.getValue(), bVar.f15130c, fVar.i(), null, 34802);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void o(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        v(this, o.ERROR, null, null, e13.getMessage(), null, 22);
    }

    @Override // com.pinterest.feature.video.worker.RegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        tp tpVar = this.f46636p.f15133f;
        String pageId = u();
        String registerMediaType = (String) this.f49032l.getValue();
        int intValue = ((Number) this.f49033m.getValue()).intValue();
        l lVar = this.f46635o;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(registerMediaType, "registerMediaType");
        kb.l lVar2 = (kb.l) lVar.f115363l.get(pageId);
        if (lVar2 == null) {
            lVar2 = lVar.c(registerMediaType, intValue, tpVar);
        }
        WorkerParameters workerParameters = this.f78963b;
        s sVar = (s) workerParameters.f20004h;
        tb.f.I(sVar.f121696b.f125444a, "updateProgress", new r(sVar, workerParameters.f19997a, lVar2, 0));
        sv0.e h10 = lVar.h(lVar2, u());
        TransferObserver i13 = lVar.i((File) this.f46643w.getValue(), u());
        c0 c0Var = new c0(1);
        String[] strArr = (String[]) this.f46640t.getValue();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        c0Var.k("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", (String[]) arrayList.toArray(new String[0]));
        String[] strArr2 = (String[]) this.f46639s.getValue();
        String u13 = u();
        String str2 = h10.f115339i;
        String[] u14 = g3.u(u13, str2, strArr2);
        ArrayList arrayList2 = new ArrayList(u14.length);
        for (String str3 : u14) {
            arrayList2.add(str3);
        }
        c0Var.k("STORY_PIN_PAGE_ID_AND_TRACKING_ID", (String[]) arrayList2.toArray(new String[0]));
        c0Var.f(lVar2);
        c0Var.h(i13.f28656a, "transfer_record_id");
        this.f46638r = c0Var.b();
        v(this, o.COMPLETE, Long.valueOf(Long.parseLong(str2)), new Uri.Builder().scheme("https").authority(h10.f115331a).appendPath(h10.f115332b).build().toString(), null, null, 24);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseRegisterMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        kb.l lVar = this.f46638r;
        if (lVar == null) {
            throw new IllegalArgumentException("Invalid worker data, must be a non-null value");
        }
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return this.f78963b.f20000d < 2;
    }

    @Override // com.pinterest.feature.video.worker.RegisterMediaWorker
    public final com.pinterest.feature.video.model.d s() {
        j.f125466a.F("Do Not Call", p.IDEA_PINS_CREATION, new Object[0]);
        return new com.pinterest.feature.video.model.d(com.pinterest.feature.video.model.e.IDEA_PIN_UPLOADING, null, 0, null, 0.0f, 0.0f, 0L, null, null, null, null, 2046);
    }

    @Override // com.pinterest.feature.video.worker.RegisterMediaWorker
    public final void t(com.pinterest.feature.video.model.d uploadEvent) {
        Intrinsics.checkNotNullParameter(uploadEvent, "uploadEvent");
        if (this.f46637q.h()) {
            return;
        }
        super.t(uploadEvent);
    }

    public final String u() {
        return (String) this.f46641u.getValue();
    }
}
