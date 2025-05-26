package qw0;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.uo;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinDraftsButton;
import h32.f1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm.q;
import nm.u;
import nx.d0;
import pw0.e0;
import sw0.j0;
import sw0.r0;
import tb0.p;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105276i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f105277j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(1);
        this.f105276i = i13;
        this.f105277j = jVar;
    }

    public final void b(Throwable it) {
        int i13 = this.f105276i;
        j jVar = this.f105277j;
        switch (i13) {
            case 2:
                jVar.f105287i.q(it, "Error getting drafts meta data from media gallery presenter", p.IDEA_PINS_CREATION);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (jVar.F3()) {
                    jVar.f105287i.q(it, "MediaGalleryPresenter: exception when fetching data", p.IDEA_PINS_CREATION);
                    break;
                }
                break;
        }
    }

    public final void e(List drafts) {
        int i13 = this.f105276i;
        j jVar = this.f105277j;
        switch (i13) {
            case 1:
                e0 e0Var = (e0) jVar.getView();
                Intrinsics.f(drafts);
                j0 j0Var = (j0) e0Var;
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(drafts, "drafts");
                q qVar = new q();
                q qVar2 = new q();
                int size = drafts.size();
                if (size > 30) {
                    size = 30;
                }
                Iterator it = drafts.subList(0, size).iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        u uVar = new u();
                        uVar.r("created_and_last_edited_times", qVar);
                        uVar.r("draft_pages", qVar2);
                        d0 s73 = j0Var.s7();
                        f1 f1Var = f1.IDEA_PIN_CAMERA_VIEW_APPEAR;
                        HashMap hashMap = new HashMap();
                        hashMap.put("idea_pin_draft_list", uVar.toString());
                        Unit unit = Unit.f80348a;
                        s73.g(f1Var, null, hashMap, false);
                        IdeaPinDraftsButton ideaPinDraftsButton = j0Var.f115479j1;
                        if (ideaPinDraftsButton == null) {
                            Intrinsics.r("draftsButton");
                            throw null;
                        }
                        uo uoVar = (uo) CollectionsKt.firstOrNull(drafts);
                        ideaPinDraftsButton.a(drafts.size(), uoVar != null ? uoVar.f42600c : null);
                        return;
                    }
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    uo uoVar2 = (uo) next;
                    if (i14 < 30) {
                        q qVar3 = new q();
                        long j13 = 1000;
                        qVar3.r(Long.valueOf(uoVar2.f42605h.getTime() / j13));
                        qVar3.r(Long.valueOf(uoVar2.f42603f.getTime() / j13));
                        qVar.t(qVar3);
                    }
                    qVar2.r(Integer.valueOf(uoVar2.f42601d));
                    i14 = i15;
                }
            default:
                Intrinsics.checkNotNullParameter(drafts, "items");
                if (drafts.size() <= jVar.z3().size() || !jVar.f105294p.isEmpty()) {
                    return;
                }
                pu puVar = (pu) drafts.get(jVar.z3().size());
                if (jVar.F3()) {
                    return;
                }
                if (puVar instanceof d30) {
                    jVar.I3(puVar);
                    return;
                } else {
                    if (puVar instanceof k01) {
                        jVar.L3(puVar);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r0 r0Var;
        int i13 = this.f105276i;
        j jVar = this.f105277j;
        switch (i13) {
            case 0:
                Integer it = (Integer) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                de0.d dVar = jVar.f105288j;
                String uid = com.bumptech.glide.d.Q(jVar.f105290l).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                break;
            case 1:
                e((List) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                e((List) obj);
                break;
            case 4:
                int intValue = ((Number) obj).intValue();
                if (jVar.isBound() && (r0Var = ((j0) ((e0) jVar.getView())).D1) != null) {
                    r0Var.c(intValue);
                }
                break;
            case 5:
                b((Throwable) obj);
                break;
            default:
                j0 j0Var = (j0) ((e0) jVar.getView());
                j0Var.f7().d(new yb0.c(yb0.d.EXPLICIT_DIRECTIVE));
                FragmentActivity requireActivity = j0Var.requireActivity();
                requireActivity.setResult(912);
                requireActivity.finish();
                break;
        }
        return Unit.f80348a;
    }
}
