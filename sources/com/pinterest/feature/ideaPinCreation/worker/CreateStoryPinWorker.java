package com.pinterest.feature.ideaPinCreation.worker;

import ag1.b;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.pinterest.api.model.tp;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.video.worker.base.BaseWorker;
import dl1.t;
import gi1.e;
import h22.f;
import h32.f1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import kb.l;
import kb.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import n22.a;
import org.jetbrains.annotations.NotNull;
import oy.v1;
import qg1.i;
import s92.o;
import tb0.g;
import tb0.h;
import tb0.p;
import vd0.c;
import xk2.k;
import xk2.n;
import xk2.w;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aBc\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/CreateStoryPinWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh22/f;", "storyPinService", "Ln22/a;", "schedulePinService", "Lag1/b;", "ideaPinComposeDataManager", "Lag1/f;", "ideaPinMediaCache", "Lbw0/f;", "ideaPinWorkUtils", "Ldl1/t;", "Lcom/pinterest/api/model/ln0;", "storyPinLocalDataRepository", "Ltb0/h;", "crashReporting", "Llh0/s1;", "experiments", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh22/f;Ln22/a;Lag1/b;Lag1/f;Lbw0/f;Ldl1/t;Ltb0/h;Llh0/s1;)V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateStoryPinWorker extends BaseWorker implements e {
    public final k A;
    public final k B;
    public final k C;
    public final k D;
    public final k E;
    public final k F;
    public final k G;
    public final k H;
    public final k I;

    /* renamed from: J, reason: collision with root package name */
    public final k f46610J;
    public final k K;
    public final k L;
    public final k M;
    public final k N;
    public final k O;
    public final k P;
    public final k Q;
    public final k R;
    public final k S;
    public final k T;
    public String U;
    public String V;
    public String W;
    public final boolean X;
    public c Y;

    /* renamed from: k, reason: collision with root package name */
    public final Context f46611k;

    /* renamed from: l, reason: collision with root package name */
    public final f f46612l;

    /* renamed from: m, reason: collision with root package name */
    public final a f46613m;

    /* renamed from: n, reason: collision with root package name */
    public final b f46614n;

    /* renamed from: o, reason: collision with root package name */
    public final ag1.f f46615o;

    /* renamed from: p, reason: collision with root package name */
    public final bw0.f f46616p;

    /* renamed from: q, reason: collision with root package name */
    public final t f46617q;

    /* renamed from: r, reason: collision with root package name */
    public final h f46618r;

    /* renamed from: s, reason: collision with root package name */
    public final s1 f46619s;

    /* renamed from: t, reason: collision with root package name */
    public final k f46620t;

    /* renamed from: u, reason: collision with root package name */
    public final k f46621u;

    /* renamed from: v, reason: collision with root package name */
    public final k f46622v;

    /* renamed from: w, reason: collision with root package name */
    public final k f46623w;

    /* renamed from: x, reason: collision with root package name */
    public final k f46624x;

    /* renamed from: y, reason: collision with root package name */
    public final k f46625y;

    /* renamed from: z, reason: collision with root package name */
    public final k f46626z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateStoryPinWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull f storyPinService, @NotNull a schedulePinService, @NotNull b ideaPinComposeDataManager, @NotNull ag1.f ideaPinMediaCache, @NotNull bw0.f ideaPinWorkUtils, @NotNull t storyPinLocalDataRepository, @NotNull h crashReporting, @NotNull s1 experiments) {
        super("Create story pin cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(schedulePinService, "schedulePinService");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(ideaPinMediaCache, "ideaPinMediaCache");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtils, "ideaPinWorkUtils");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f46611k = context;
        this.f46612l = storyPinService;
        this.f46613m = schedulePinService;
        this.f46614n = ideaPinComposeDataManager;
        this.f46615o = ideaPinMediaCache;
        this.f46616p = ideaPinWorkUtils;
        this.f46617q = storyPinLocalDataRepository;
        this.f46618r = crashReporting;
        this.f46619s = experiments;
        n nVar = n.NONE;
        this.f46620t = a.c.m(this, 20, nVar);
        this.f46621u = a.c.m(this, 19, nVar);
        this.f46622v = a.c.m(this, 26, nVar);
        this.f46623w = a.c.m(this, 11, nVar);
        this.f46624x = a.c.m(this, 12, nVar);
        this.f46625y = a.c.m(this, 1, nVar);
        this.f46626z = a.c.m(this, 2, nVar);
        this.A = a.c.m(this, 4, nVar);
        this.B = a.c.m(this, 24, nVar);
        this.C = a.c.m(this, 25, nVar);
        this.D = a.c.m(this, 15, nVar);
        this.E = a.c.m(this, 5, nVar);
        this.F = a.c.m(this, 9, nVar);
        this.G = a.c.m(this, 18, nVar);
        this.H = a.c.m(this, 21, nVar);
        this.I = a.c.m(this, 6, nVar);
        this.f46610J = a.c.m(this, 3, nVar);
        this.K = a.c.m(this, 0, nVar);
        this.L = a.c.m(this, 16, nVar);
        k m13 = a.c.m(this, 22, nVar);
        this.M = m13;
        this.N = a.c.m(this, 10, nVar);
        this.O = a.c.m(this, 13, nVar);
        this.P = a.c.m(this, 14, nVar);
        this.Q = a.c.m(this, 7, nVar);
        this.R = a.c.m(this, 8, nVar);
        this.S = a.c.m(this, 17, nVar);
        this.T = a.c.m(this, 23, nVar);
        this.U = "";
        this.V = "";
        this.W = "";
        this.X = ((Integer) m13.getValue()) != null;
        this.Y = new c();
    }

    @Override // kb.a0
    public final void f() {
        i.b(t(), String.valueOf(this.f78963b.f20000d), null, this.Y.f125623a.toString(), this.Y.f125623a.toString().length(), false, "onStopped() got invoked, work is canceled", r32.c.STORY_PIN_UPLOAD_FAILED, Boolean.valueOf(this.f46614n.f15140m), o.ABORTED, 18);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        String str = (String) this.E.getValue();
        String str2 = (String) this.I.getValue();
        b bVar = this.f46614n;
        boolean z13 = this.X;
        bVar.c(str, str2, false, z13);
        i t13 = t();
        WorkerParameters workerParameters = this.f78963b;
        String uniqueIdentifier = String.valueOf(workerParameters.f20000d);
        int i13 = workerParameters.f20000d;
        Integer num = (Integer) this.C.getValue();
        t13.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        new v1(uniqueIdentifier, i13, num, z13).i();
        if (((String[]) this.f46623w.getValue()).length == 0) {
            throw new MissingFormatArgumentException("Image signature data is empty");
        }
        super.j();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        new oy.a().i();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46616p.getClass();
        w e14 = bw0.f.e(e13);
        String str = (String) e14.f135234a;
        String str2 = (String) e14.f135235b;
        String str3 = (String) e14.f135236c;
        int parseInt = str2 != null ? Integer.parseInt(str2) : -1;
        boolean z13 = parseInt == 2420;
        u(str, z13);
        i t13 = t();
        r32.c cVar = r32.c.STORY_PIN_UPLOAD_FAILED;
        Integer num = (Integer) this.C.getValue();
        Boolean bool = (Boolean) this.D.getValue();
        bool.booleanValue();
        i.d(t13, e13, z13, str, cVar, str2, null, null, num, bool, (String) this.F.getValue(), (String) this.G.getValue(), s(), (String) this.I.getValue(), this.f46614n.f15130c, this.X, (String) this.S.getValue(), 96);
        HashSet hashSet = h.f117076w;
        h hVar = g.f117075a;
        gi.c cVar2 = new gi.c(str == null ? "" : str, 3);
        String str4 = (String) this.f46626z.getValue();
        String str5 = (String) this.f46610J.getValue();
        c cVar3 = this.Y;
        StringBuilder w13 = a.a.w("CreateStoryPinWorker failure occurred for board ", str4, ", board section ", str5, ", storyPin: ");
        w13.append(cVar3);
        hVar.q(cVar2, w13.toString(), p.IDEA_PINS_CREATION);
        String string = this.f46611k.getString(pt1.c.pin_creation_error_pin_upload);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (!bw0.c.f23970b.f(parseInt) || str3 == null) {
            str3 = string;
        }
        k().f(e.c(this, str3, 0, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v93, types: [nm.q] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [nm.s, nm.u] */
    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 2639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.CreateStoryPinWorker.p():void");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.U;
        Intrinsics.checkNotNullParameter("PIN_ID", "key");
        linkedHashMap.put("PIN_ID", str);
        String str2 = this.V;
        Intrinsics.checkNotNullParameter("STORY_PIN_DATA_ID", "key");
        linkedHashMap.put("STORY_PIN_DATA_ID", str2);
        String str3 = this.W;
        Intrinsics.checkNotNullParameter("PIN_IMAGE_SIGNATURE", "key");
        linkedHashMap.put("PIN_IMAGE_SIGNATURE", str3);
        l lVar = new l(linkedHashMap);
        bk.f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final boolean r(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f46616p.getClass();
        w e14 = bw0.f.e(e13);
        String str = (String) e14.f135234a;
        String str2 = (String) e14.f135235b;
        boolean z13 = str2 != null && Integer.parseInt(str2) == 2420;
        if (z13) {
            return false;
        }
        u(str, z13);
        return this.f78963b.f20000d < 2;
    }

    public final tp s() {
        return (tp) this.f46620t.getValue();
    }

    public final i t() {
        return (i) this.f46622v.getValue();
    }

    public final void u(String str, boolean z13) {
        i.b(t(), String.valueOf(this.f78963b.f20000d), null, this.Y.f125623a.toString(), this.Y.f125623a.toString().length(), z13, str, null, null, o.ERROR, RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL);
    }

    public final void v(String uid) {
        i t13 = t();
        String valueOf = String.valueOf(this.f78963b.f20000d);
        int length = this.Y.f125623a.toString().length();
        o oVar = o.COMPLETE;
        i.b(t13, valueOf, uid, null, length, false, null, null, null, oVar, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
        i t14 = t();
        Integer num = (Integer) this.C.getValue();
        Boolean bool = (Boolean) this.D.getValue();
        bool.booleanValue();
        String str = (String) this.F.getValue();
        String str2 = (String) this.G.getValue();
        tp s13 = s();
        String creationSessionId = (String) this.I.getValue();
        String str3 = this.f46614n.f15130c;
        String str4 = (String) this.S.getValue();
        t14.getClass();
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        HashMap a13 = i.a(t14, s13, uid, t14.f103843f, null, null, null, null, null, null, null, num, bool, str, str2, creationSessionId, str3, Boolean.valueOf(this.X), str4, 1016);
        f1 f1Var = f1.STORY_PIN_CREATE;
        t14.j(t14.f103839b, s13, f1Var, uid, a13);
        if (!t14.f103842e) {
            t14.e(qg1.f.SUCCESS_WITH_NO_ATTEMPT, f1Var, uid, s13, a13);
        }
        t14.f103842e = false;
        t14.f103843f = null;
        t14.f103844g = false;
        i.h(t14, uid, bool, null, null, null, str, false, oVar, 92);
    }
}
