package t80;

import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f116705r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f116706s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f116705r = sVar;
        this.f116706s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f116705r, this.f116706s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.j0.f50999b.getValue());
        w13.Y1("CollageDraftPickerExtras.EXTRA_OPEN_ON_TEMPLATES_TAB", ((x) this.f116706s).f116746a);
        this.f116705r.f116733c.f(w13);
        return Unit.f80348a;
    }
}
