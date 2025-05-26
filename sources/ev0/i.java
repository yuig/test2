package ev0;

import com.pinterest.api.model.jq;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import h32.u0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f60259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, int i13) {
        super(0);
        this.f60258i = i13;
        this.f60259j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f60258i;
        l lVar = this.f60259j;
        switch (i13) {
            case 0:
                break;
            case 1:
                Intrinsics.checkNotNullExpressionValue(lVar.getResources(), "getResources(...)");
                break;
            case 2:
                m140invoke();
                break;
            case 3:
                m140invoke();
                break;
            case 4:
                m140invoke();
                break;
            case 5:
                m140invoke();
                break;
            default:
                m140invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m140invoke() {
        dv0.k kVar;
        ln0 ln0Var;
        tp pageData;
        int i13 = this.f60258i;
        l lVar = this.f60259j;
        switch (i13) {
            case 2:
                av0.c cVar = lVar.P0;
                if (cVar == null || (ln0Var = (kVar = (dv0.k) cVar).f56361t) == null || (pageData = ln0Var.getPageData()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (qq qqVar : pageData.getOverlayBlocks()) {
                    if (qqVar instanceof jq) {
                        if (!kVar.f56362u.contains(((jq) qqVar).getBoardId())) {
                            arrayList.add(qqVar);
                        }
                    } else {
                        arrayList.add(qqVar);
                    }
                }
                dv0.k.H3(kVar, new r0(11, pageData, arrayList), new dv0.i(kVar, 5), null, false, 12);
                return;
            case 3:
                dv0.k kVar2 = lVar.M0;
                if (kVar2 == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                kVar2.w3(new av0.o(u0.STORY_PIN_STORE_BUTTON));
                return;
            case 4:
                av0.i iVar = lVar.O0;
                if (iVar != null) {
                    dv0.k kVar3 = (dv0.k) iVar;
                    kVar3.B3(Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(kVar3.f56363v.getTime().getTime())));
                    return;
                } else {
                    Intrinsics.r("scheduleDateUpdateListener");
                    throw null;
                }
            case 5:
                dv0.k kVar4 = lVar.M0;
                if (kVar4 == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                kVar4.w3(new av0.o(u0.STORY_PIN_STORE_BUTTON));
                return;
            default:
                dv0.k kVar5 = lVar.M0;
                if (kVar5 == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                kVar5.w3(av0.m.f20513f);
                return;
        }
    }
}
