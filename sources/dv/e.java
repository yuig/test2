package dv;

import android.view.View;
import ev.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f56286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f56286i = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h hVar = (h) ((bv.b) this.f56286i.getView());
        hVar.getClass();
        hVar.f60223y0 = new dp.a(12, null, hVar);
        View view = hVar.getView();
        if (view != null) {
            view.postDelayed(hVar.f60223y0, 300L);
        }
        return Unit.f80348a;
    }
}
