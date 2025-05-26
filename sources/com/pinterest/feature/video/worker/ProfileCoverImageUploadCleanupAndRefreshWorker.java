package com.pinterest.feature.video.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.uu;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.video.model.d;
import com.pinterest.feature.video.worker.base.BaseMediaWorker;
import dl1.u;
import ep.b;
import fi1.a;
import gi1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr.z;
import net.quikkly.android.ui.CameraPreview;
import org.jetbrains.annotations.NotNull;
import so.oa;
import x02.x2;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/video/worker/ProfileCoverImageUploadCleanupAndRefreshWorker;", "Lcom/pinterest/feature/video/worker/base/BaseMediaWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g4/u", "mediaWorkerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileCoverImageUploadCleanupAndRefreshWorker extends BaseMediaWorker implements e {

    /* renamed from: o, reason: collision with root package name */
    public final v f49012o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49013p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCoverImageUploadCleanupAndRefreshWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super("User update has been canceled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f49012o = m.b(a.f62214k);
        this.f49013p = m.b(a.f62213j);
    }

    public static void z(String str) {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) b.g(j92.a.class))).E2().c(new z(str, 6));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseMediaWorker, com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        k().f(e.a(this, null, 7));
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        String uid;
        b01 g13;
        h01 W;
        v vVar = this.f49030n;
        k().f(new d(com.pinterest.feature.video.model.e.PIN_CREATION, u().getPath(), 0, null, 0.0f, 0.0f, 0L, null, null, null, null, 2044));
        try {
            Thread.sleep(Intrinsics.d((String) vVar.getValue(), uu.VIDEO.getValue()) ? 5000L : CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        } catch (InterruptedException unused) {
        }
        wy0 f13 = ((b60.d) ((b60.b) this.f49013p.getValue())).f();
        if (f13 == null || (uid = f13.getUid()) == null) {
            throw new IllegalStateException("No user logged in");
        }
        v vVar2 = this.f49012o;
        wy0 wy0Var = (wy0) ((x2) vVar2.getValue()).g0().Q(uid).f();
        String str = (String) vVar.getValue();
        if (Intrinsics.d(str, uu.IMAGE.getValue())) {
            b90 f43 = wy0Var.f4();
            r8 = f43 != null ? el.a.O(f43) : null;
            if (r8 == null || kotlin.text.z.j(r8)) {
                k().f(e.a(this, u().getPath(), 6));
                return;
            }
            s().delete();
            x2 x2Var = (x2) vVar2.getValue();
            String uid2 = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            x2Var.w(new u(uid2), wy0Var, true);
            k().f(e.b(this, u().getPath()));
            z(r8);
            return;
        }
        if (Intrinsics.d(str, uu.VIDEO.getValue())) {
            b90 f44 = wy0Var.f4();
            if (f44 != null) {
                Intrinsics.checkNotNullParameter(f44, "<this>");
                if (Intrinsics.d(f44.f(), "video") && (g13 = f44.g()) != null && (W = d7.b.W(g13)) != null) {
                    r8 = W.p();
                }
            }
            if (r8 == null) {
                k().f(e.a(this, u().getPath(), 6));
                return;
            }
            x2 x2Var2 = (x2) vVar2.getValue();
            String uid3 = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            x2Var2.w(new u(uid3), wy0Var, true);
            k().f(e.b(this, u().getPath()));
            z(r8);
        }
    }
}
