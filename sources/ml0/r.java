package ml0;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.pinterest.api.model.f30;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.feature.board.headerimage.WashedWebImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f87493r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f87494s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f87494s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f87494s, cVar);
        rVar.f87493r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f87493r;
        int i13 = w.f87509e1;
        w wVar = this.f87494s;
        wVar.getClass();
        f30 f30Var = bVar.f87440b.f87435a;
        if (f30Var != null) {
            float z03 = bs1.c.z0(f30Var) / bs1.c.x0(f30Var);
            FrameLayout frameLayout = wVar.U0;
            if (frameLayout == null) {
                Intrinsics.r("scrollViewShowing");
                throw null;
            }
            bs1.c.X0(frameLayout);
            if (z03 <= 1.5f) {
                ScrollView scrollView = wVar.R0;
                if (scrollView == null) {
                    Intrinsics.r("scrollView");
                    throw null;
                }
                wVar.U0 = scrollView;
                BoardHeaderImageView boardHeaderImageView = wVar.Q0;
                if (boardHeaderImageView == null) {
                    Intrinsics.r("selectedImage");
                    throw null;
                }
                wVar.V0 = boardHeaderImageView;
            } else {
                HorizontalScrollView horizontalScrollView = wVar.T0;
                if (horizontalScrollView == null) {
                    Intrinsics.r("horizontalScrollView");
                    throw null;
                }
                wVar.U0 = horizontalScrollView;
                BoardHeaderImageView boardHeaderImageView2 = wVar.S0;
                if (boardHeaderImageView2 == null) {
                    Intrinsics.r("horizontalSelectedImage");
                    throw null;
                }
                wVar.V0 = boardHeaderImageView2;
            }
            BoardHeaderImageView boardHeaderImageView3 = wVar.V0;
            if (boardHeaderImageView3 == null) {
                Intrinsics.r("imageShown");
                throw null;
            }
            boardHeaderImageView3.a0(new b10.z(27, bVar, wVar));
            BoardHeaderImageView.L(boardHeaderImageView3, bs1.c.y0(f30Var), null, null, false, 54);
            if (pe.i.Z0()) {
                WashedWebImageView washedWebImageView = wVar.Y0;
                if (washedWebImageView == null) {
                    Intrinsics.r("blurredImage");
                    throw null;
                }
                washedWebImageView.loadUrl(bs1.c.y0(f30Var));
            }
        } else {
            FrameLayout frameLayout2 = wVar.U0;
            if (frameLayout2 == null) {
                Intrinsics.r("scrollViewShowing");
                throw null;
            }
            bs1.c.X0(frameLayout2);
            GestaltButton gestaltButton = wVar.P0;
            if (gestaltButton == null) {
                Intrinsics.r("doneButton");
                throw null;
            }
            gestaltButton.d(n.f87482m);
        }
        return Unit.f80348a;
    }
}
