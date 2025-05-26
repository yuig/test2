package com.pinterest.feature.ideaPinCreation.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import aw0.q;
import aw0.r;
import bw0.f;
import com.pinterest.feature.video.worker.base.BaseWorker;
import h32.f1;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kb.y;
import kb.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m20.b;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;
import xk2.w;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/PinInterestTagsWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lm20/b;", "interestTaggingService", "Lbw0/f;", "ideaPinWorkUtils", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lm20/b;Lbw0/f;)V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinInterestTagsWorker extends BaseWorker {

    /* renamed from: k, reason: collision with root package name */
    public final b f46686k;

    /* renamed from: l, reason: collision with root package name */
    public final f f46687l;

    /* renamed from: m, reason: collision with root package name */
    public final v f46688m;

    /* renamed from: n, reason: collision with root package name */
    public final v f46689n;

    /* renamed from: o, reason: collision with root package name */
    public final v f46690o;

    /* renamed from: p, reason: collision with root package name */
    public final v f46691p;

    /* renamed from: q, reason: collision with root package name */
    public final v f46692q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinInterestTagsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull b interestTaggingService, @NotNull f ideaPinWorkUtils) {
        super("Adding Pin interest tags worker cancelled", context, workerParameters, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(interestTaggingService, "interestTaggingService");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtils, "ideaPinWorkUtils");
        this.f46686k = interestTaggingService;
        this.f46687l = ideaPinWorkUtils;
        this.f46688m = m.b(new r(this, 4));
        this.f46689n = m.b(new r(this, 2));
        this.f46690o = m.b(new r(this, 1));
        this.f46691p = m.b(new r(this, 3));
        this.f46692q = m.b(new r(this, 0));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        if (((String) this.f46688m.getValue()).length() == 0) {
            Intrinsics.checkNotNullParameter("Pin id field is null or empty", "errorMessage");
            throw new q("Pin id field is null or empty");
        }
        if (((String) this.f46689n.getValue()).length() == 0 && ((String) this.f46690o.getValue()).length() == 0) {
            Intrinsics.checkNotNullParameter("Interest ids field is null or empty", "errorMessage");
            throw new q("Interest ids field is null or empty");
        }
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46687l.getClass();
        w e14 = f.e(e13);
        String str = (String) e14.f135234a;
        String str2 = (String) e14.f135235b;
        String str3 = (String) e14.f135236c;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        f1 f1Var = f1.TAG_PIN_INTERESTS_FAILURE;
        String str4 = (String) this.f46688m.getValue();
        HashMap hashMap = new HashMap();
        hashMap.put("idea_pin_creation_session_id", (String) this.f46692q.getValue());
        if (str == null) {
            str = str3 == null ? "" : str3;
        }
        hashMap.put("error_message", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("status_code", str2);
        Unit unit = Unit.f80348a;
        a13.g(f1Var, str4, hashMap, false);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        v vVar = this.f46688m;
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        f1 f1Var = f1.TAG_PIN_INTERESTS_SUCCESS;
        String str = (String) vVar.getValue();
        HashMap hashMap = new HashMap();
        hashMap.put("idea_pin_creation_session_id", (String) this.f46692q.getValue());
        Unit unit = Unit.f80348a;
        a13.g(f1Var, str, hashMap, false);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        y a13 = z.a();
        Intrinsics.checkNotNullExpressionValue(a13, "success(...)");
        return a13;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 instanceof q) {
            return false;
        }
        return super.r(e13);
    }
}
