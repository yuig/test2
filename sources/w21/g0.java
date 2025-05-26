package w21;

import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f127688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f127689s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, v1 v1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127688r = h0Var;
        this.f127689s = v1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f127688r, this.f127689s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl w13 = Navigation.w1(PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION_CTA_MODAL);
        w13.m0("PIN_OR_SPIN_EDUCATIONAL_CTA_TITLE_KEY", ((f1) this.f127689s).f127686a);
        this.f127688r.f127701c.f(w13);
        return Unit.f80348a;
    }
}
