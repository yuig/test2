package t80;

import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s80.l7;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f116703r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f116703r = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f116703r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.j0.f51003f.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
        L.b("RetrievalExtras.COLLAGE_RETRIEVAL_TYPE", xa0.l.DRAFTS);
        L.z(l7.draft_collage_selection_screen_title, "RetrievalExtras.COLLAGE_RETRIEVAL_TITLE_RES_ID");
        L.b("RetrievalExtras.COLLAGE_RETRIEVAL_DRAFT_SELECTION_RESULT", xa0.q.ReturnToSource);
        this.f116703r.f116733c.f(L);
        return Unit.f80348a;
    }
}
