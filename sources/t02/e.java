package t02;

import com.pinterest.ui.view.NoticeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f115718s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f115718s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f115718s, cVar);
        eVar.f115717r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f115717r;
        j jVar = this.f115718s;
        NoticeView noticeView = jVar.f115730d0;
        if (noticeView != null) {
            noticeView.i(bVar.f115714a, jVar.s7(), bVar.f115715b);
            return Unit.f80348a;
        }
        Intrinsics.r("noticeView");
        throw null;
    }
}
