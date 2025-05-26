package v21;

import ao2.j0;
import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f123888r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f123889s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f123888r = oVar;
        this.f123889s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f123888r, this.f123889s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        o oVar = this.f123888r;
        ll.j jVar = oVar.f123891b;
        NavigationImpl w13 = Navigation.w1(PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD);
        w21.b0 b0Var = oVar.f123890a;
        w13.m0("com.pinterest.EXTRA_PIN_OR_SPIN", b0Var.f127647e);
        w13.m0("com.pinterest.EXTRA_PIN_OR_SPIN_TITLE", b0Var.f127648f);
        x xVar = (x) this.f123889s;
        w13.d("com.pinterest.EXTRA_PIN_OR_SPIN_IMAGE_URL_LIST", new ArrayList(xVar.f123905a));
        w13.d("com.pinterest.EXTRA_PIN_OR_SPIN_ID_LIST", new ArrayList(xVar.f123906b));
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        jVar.f(w13);
        return Unit.f80348a;
    }
}
