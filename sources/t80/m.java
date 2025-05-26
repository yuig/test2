package t80;

import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f116704r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f116704r = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f116704r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ll.j jVar = this.f116704r.f116733c;
        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.j0.f51002e.getValue());
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        jVar.f(w13);
        return Unit.f80348a;
    }
}
