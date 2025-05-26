package u52;

import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120693r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f120694s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f120694s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g gVar = new g(this.f120694s, cVar);
        gVar.f120693r = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((x) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        w wVar = ((x) this.f120693r).f120744b;
        BoardPreviewCarousel boardPreviewCarousel = this.f120694s.f120711h0;
        if (boardPreviewCarousel != null && !(wVar instanceof u) && (wVar instanceof v)) {
            boardPreviewCarousel.a(((v) wVar).e());
        }
        return Unit.f80348a;
    }
}
