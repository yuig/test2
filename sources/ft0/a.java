package ft0;

import ao2.j0;
import at0.b;
import bl2.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a2;
import dl2.j;
import dt0.r;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f62931r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f62932s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, r rVar, c cVar) {
        super(2, cVar);
        this.f62931r = bVar;
        this.f62932s = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f62931r, this.f62932s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = this.f62931r;
        ll.j jVar = bVar.f20436b;
        NavigationImpl L = Navigation.L((ScreenLocation) a2.f50512f.getValue(), "", ml1.b.DEFAULT_TRANSITION.getValue());
        Intrinsics.checkNotNullExpressionValue(L, "create(...)");
        jVar.f(L);
        bVar.f20437c.p(new zy.a(this.f62932s.f56253a, f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
        return Unit.f80348a;
    }
}
