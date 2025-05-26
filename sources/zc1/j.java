package zc1;

import com.pinterest.feature.settings.shared.view.UnsavedChangesModalView;
import hc1.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p91.w;
import q01.o;
import q91.u;
import yq0.b0;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141609i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xc1.a f141610j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ UnsavedChangesModalView f141611k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(xc1.a aVar, UnsavedChangesModalView unsavedChangesModalView, int i13) {
        super(0);
        this.f141609i = i13;
        this.f141610j = aVar;
        this.f141611k = unsavedChangesModalView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f141609i) {
            case 0:
                m300invoke();
                break;
            default:
                m300invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m300invoke() {
        int i13 = this.f141609i;
        UnsavedChangesModalView unsavedChangesModalView = this.f141611k;
        xc1.a aVar = this.f141610j;
        switch (i13) {
            case 0:
                o oVar = (o) aVar;
                int i14 = oVar.f101827a;
                b0 b0Var = oVar.f101828b;
                switch (i14) {
                    case 0:
                        l91.h hVar = ((u) b0Var).F0;
                        if (hVar != null) {
                            ((w) hVar).v3();
                            break;
                        }
                        break;
                    default:
                        jc1.g gVar = ((n) b0Var).I0;
                        if (gVar != null) {
                            gVar.u3();
                            break;
                        }
                        break;
                }
                Object value = unsavedChangesModalView.f48375c.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                a.c.y((m60.w) value);
                break;
            default:
                o oVar2 = (o) aVar;
                int i15 = oVar2.f101827a;
                b0 b0Var2 = oVar2.f101828b;
                switch (i15) {
                    case 0:
                        l91.h hVar2 = ((u) b0Var2).F0;
                        if (hVar2 != null) {
                            w wVar = (w) hVar2;
                            wVar.f99340h.clear();
                            u uVar = (u) ((l91.i) wVar.getView());
                            hf0.b.l(uVar.requireActivity());
                            uVar.D5();
                            break;
                        }
                        break;
                    default:
                        jc1.g gVar2 = ((n) b0Var2).I0;
                        if (gVar2 != null) {
                            gVar2.f75464g.clear();
                            n nVar = (n) ((gc1.b) gVar2.getView());
                            hf0.b.l(nVar.requireActivity());
                            nVar.D5();
                            break;
                        }
                        break;
                }
                Object value2 = unsavedChangesModalView.f48375c.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                a.c.y((m60.w) value2);
                break;
        }
    }
}
