package u52;

import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f120707s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f120707s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f120707s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120706r;
        int i14 = 18;
        l lVar = this.f120707s;
        if (i13 == 0) {
            ue.c.H(obj);
            int i15 = l.f120709l0;
            w41.g0 g0Var = new w41.g0(lVar.d8().f120724h.d(), i14);
            this.f120706r = 1;
            obj = lb.l0.f0(g0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        x xVar = (x) obj;
        BoardPreviewCarousel boardPreviewCarousel = lVar.f120711h0;
        if (boardPreviewCarousel != null) {
            boardPreviewCarousel.post(new v.k(boardPreviewCarousel, xVar.f120745c.f120676b, i14));
        }
        return Unit.f80348a;
    }
}
