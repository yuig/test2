package u52;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import com.pinterest.share.board.video.templategallery.view.DotsIndicatorView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f120678s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f120678s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f120678s, cVar);
        dVar.f120677r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((x) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x xVar = (x) this.f120677r;
        int i13 = l.f120709l0;
        l lVar = this.f120678s;
        lVar.getClass();
        s f13 = xVar.f();
        if (!(f13 instanceof q) && (f13 instanceof r)) {
            FragmentActivity requireActivity = lVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            Context requireContext = lVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            pp2.a.Q0(requireActivity, requireContext, new c(lVar, 1), new c(lVar, 2), new c(lVar, 3));
        }
        f1 h10 = xVar.h();
        BoardPreviewCarousel boardPreviewCarousel = lVar.f120711h0;
        if (boardPreviewCarousel != null && !(h10 instanceof d1) && (h10 instanceof e1)) {
            e1 e1Var = (e1) h10;
            boardPreviewCarousel.b(e1Var.e(), e1Var.g(), e1Var.f());
        }
        c1 g13 = xVar.g();
        DotsIndicatorView dotsIndicatorView = lVar.f120712i0;
        if (dotsIndicatorView != null) {
            dotsIndicatorView.b(g13.b());
            dotsIndicatorView.a(g13.a());
        }
        return Unit.f80348a;
    }
}
