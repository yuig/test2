package v21;

import ao2.j0;
import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y01.l1;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f123887r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f123887r = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f123887r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl navigation = Navigation.w1(PinOrSpinFeatureLocation.PIN_OR_SPIN_SELECTION);
        o oVar = this.f123887r;
        navigation.m0("com.pinterest.EXTRA_PIN_OR_SPIN", oVar.f123890a.f127647e);
        navigation.Y1("com.pinterest.EXTRA_PIN_OR_SPIN_IS_FIRST_TIME_LOAD", false);
        ll.j jVar = oVar.f123891b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        jVar.g(new l1(3, navigation));
        return Unit.f80348a;
    }
}
