package ju0;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.uo;
import gd0.g;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mu0.e;
import mu0.f;
import mu0.h;
import mu0.i;
import mu0.j;
import nx.d0;
import uv0.k;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77610i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f77611j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uo f77612k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HashMap f77613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, uo uoVar, HashMap hashMap) {
        super(1);
        this.f77611j = gVar;
        this.f77612k = uoVar;
        this.f77613l = hashMap;
    }

    public final void b(int i13) {
        HashMap hashMap = this.f77613l;
        int i14 = this.f77610i;
        uo uoVar = this.f77612k;
        g gVar = this.f77611j;
        switch (i14) {
            case 0:
                ((d0) gVar.f64818m).Z(u0.STORY_PIN_MULTI_DRAFTS_DELETE_BUTTON, hashMap);
                j jVar = (j) gVar.f64817l;
                String draftId = uoVar.f42598a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(draftId, "draftId");
                iu0.a aVar = (iu0.a) jVar.getView();
                i onConfirmCallback = new i(jVar, draftId, i13, 0);
                h onCancelCallback = new h(jVar, 2);
                nu0.i iVar = (nu0.i) aVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
                Intrinsics.checkNotNullParameter(onCancelCallback, "onCancelCallback");
                FragmentActivity requireActivity = iVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                Context requireContext = iVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                a1.t0(requireActivity, requireContext, onConfirmCallback, onCancelCallback);
                break;
            default:
                ((d0) gVar.f64818m).g(f1.STORY_PIN_MULTI_DRAFTS_MISSING_COVER, uoVar.f42598a, hashMap, false);
                if (uoVar.f42601d > 0 && !uoVar.f42599b) {
                    j jVar2 = (j) gVar.f64817l;
                    jVar2.getClass();
                    String draftId2 = uoVar.f42598a;
                    Intrinsics.checkNotNullParameter(draftId2, "draftId");
                    iu0.a aVar2 = (iu0.a) jVar2.getView();
                    f onSuccess = new f(jVar2, i13, 0);
                    e onFailure = e.f88289j;
                    nu0.i iVar2 = (nu0.i) aVar2;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(draftId2, "draftId");
                    Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
                    Intrinsics.checkNotNullParameter(onFailure, "onFailure");
                    Context context = iVar2.getContext();
                    if (context != null) {
                        k.a(iVar2.s7(), context, draftId2, onSuccess, onFailure);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f77610i) {
            case 0:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, HashMap hashMap, uo uoVar) {
        super(1);
        this.f77611j = gVar;
        this.f77613l = hashMap;
        this.f77612k = uoVar;
    }
}
