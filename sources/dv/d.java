package dv;

import android.view.View;
import com.pinterest.api.model.f30;
import ev.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f56285i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f56285i = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 f30Var = (f30) obj;
        Intrinsics.f(f30Var);
        f fVar = this.f56285i;
        fVar.f56294h = f30Var;
        bv.b bVar = (bv.b) fVar.getView();
        f30.a f43 = f30Var.f4();
        h hVar = (h) bVar;
        hVar.getClass();
        hVar.f60223y0 = new dp.a(12, f43, hVar);
        View view = hVar.getView();
        if (view != null) {
            view.postDelayed(hVar.f60223y0, 300L);
        }
        return Unit.f80348a;
    }
}
