package w21;

import com.pinterest.api.model.i50;
import com.pinterest.feature.pinorspin.PinOrSpinFeatureLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f127684r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f127685s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, v1 v1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127684r = h0Var;
        this.f127685s = v1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f127684r, this.f127685s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl navigation = Navigation.w1(PinOrSpinFeatureLocation.PIN_OR_SPIN_REWARD_PREVIEW);
        h0 h0Var = this.f127684r;
        navigation.m0("com.pinterest.EXTRA_PIN_OR_SPIN", h0Var.f127700b.f127647e);
        k1 k1Var = (k1) this.f127685s;
        navigation.m0("com.pinterest.EXTRA_PIN_OR_SPIN_TITLE", k1Var.f127731a);
        navigation.m0("com.pinterest.EXTRA_PIN_OR_SPIN_REWARD_PREVIEW_TITLE", k1Var.f127732b);
        navigation.m0("com.pinterest.EXTRA_PIN_OR_SPIN_REWARD_PREVIEW_SUBTITLE", k1Var.f127733c);
        List list = k1Var.f127734d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((i50) it.next()).e());
        }
        navigation.d("com.pinterest.EXTRA_PIN_OR_SPIN_IMAGE_URL_LIST", new ArrayList(arrayList));
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((i50) it2.next()).f());
        }
        navigation.d("com.pinterest.EXTRA_PIN_OR_SPIN_ID_LIST", new ArrayList(arrayList2));
        ll.j jVar = h0Var.f127701c;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        jVar.g(new y01.l1(3, navigation));
        return Unit.f80348a;
    }
}
