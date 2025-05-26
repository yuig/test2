package dv;

import com.pinterest.ads.feature.waista.view.GenAiDisclosureSkeletonLoadingView;
import com.pinterest.api.model.f30;
import ev.h;
import kk2.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f56281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, int i13) {
        super(1);
        this.f56280i = i13;
        this.f56281j = fVar;
    }

    public final void b(f30 f30Var) {
        int i13 = this.f56280i;
        f presenter = this.f56281j;
        switch (i13) {
            case 0:
                Intrinsics.f(f30Var);
                presenter.f56294h = f30Var;
                h hVar = (h) ((bv.b) presenter.getView());
                hVar.getClass();
                Intrinsics.checkNotNullParameter(presenter, "presenter");
                hVar.f60211m0 = presenter;
                break;
            default:
                Intrinsics.f(f30Var);
                presenter.f56294h = f30Var;
                h hVar2 = (h) ((bv.b) presenter.getView());
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(presenter, "presenter");
                hVar2.f60211m0 = presenter;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56280i;
        f fVar = this.f56281j;
        switch (i13) {
            case 0:
                b((f30) obj);
                return Unit.f80348a;
            case 1:
                GenAiDisclosureSkeletonLoadingView genAiDisclosureSkeletonLoadingView = ((h) ((bv.b) fVar.getView())).f60217s0;
                if (genAiDisclosureSkeletonLoadingView != null) {
                    genAiDisclosureSkeletonLoadingView.c();
                }
                return Unit.f80348a;
            case 2:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new g(fVar.f56291e.getPin(fVar.f56287a, n00.b.a(n00.c.WAISTA_GEN_AI), null).r(tk2.e.f118017c), new a(2, new b(fVar, 1)), 2).t();
            default:
                b((f30) obj);
                return Unit.f80348a;
        }
    }
}
