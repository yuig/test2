package s81;

import android.widget.FrameLayout;
import com.pinterest.feature.search.visual.lens.view.LensBottomControlsContainer;
import i32.y0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.r0;
import m81.q;
import rg0.b0;
import rg0.c0;
import u81.r;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f111907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, int i13) {
        super(1);
        this.f111906i = i13;
        this.f111907j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f111906i;
        p pVar = this.f111907j;
        switch (i13) {
            case 0:
                rg0.n c13 = ((dh0.d) pVar.f111930h).c(y0.ANDROID_CAMERA_DISCOVERY);
                pVar.T = c13;
                Object obj2 = c13 != null ? c13.f108068j : null;
                b0 b0Var = obj2 instanceof b0 ? (b0) obj2 : null;
                if (b0Var != null && pVar.isBound()) {
                    r rVar = (r) ((q) pVar.getView());
                    u81.i iVar = rVar.I1;
                    if (iVar != null) {
                        mr.a aVar = new mr.a((ye2.m) rVar.getContext(), new u81.m(rVar));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (hf0.b.f69002b * 0.7d), -1);
                        aVar.setPaddingRelative(aVar.getResources().getDimensionPixelSize(r0.margin), 0, 0, aVar.getResources().getDimensionPixelSize(uc2.b.lens_edu_bottom_margin));
                        aVar.setLayoutParams(layoutParams);
                        aVar.getLayoutParams();
                        aVar.setGravity(81);
                        rVar.f121061a2 = aVar;
                        iVar.addView(aVar);
                    }
                    ArrayList chatMessages = b0Var.f107964c;
                    Intrinsics.checkNotNullParameter(chatMessages, "chatMessages");
                    mr.a aVar2 = rVar.f121061a2;
                    if (aVar2 != null) {
                        int size = chatMessages.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            aVar2.b(new lr.m(((c0) chatMessages.get(i14)).f107973a));
                        }
                        aVar2.m();
                    }
                    rVar.M9(true);
                    pVar.U = true;
                }
                return Unit.f80348a;
            case 1:
                String path = (String) obj;
                q qVar = (q) pVar.getView();
                Intrinsics.f(path);
                r rVar2 = (r) qVar;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(path, "path");
                LensBottomControlsContainer lensBottomControlsContainer = rVar2.G1;
                if (lensBottomControlsContainer != null) {
                    lensBottomControlsContainer.f(path);
                    return Unit.f80348a;
                }
                Intrinsics.r("bottomContainer");
                throw null;
            case 2:
                wt1.c0 c0Var = (wt1.c0) obj;
                if ((c0Var instanceof wt1.k) || (c0Var instanceof wt1.s)) {
                    ((w81.c) pVar.f111929g).getClass();
                    new uy.k(23, 0).i();
                } else if (c0Var instanceof wt1.p) {
                    ((w81.c) pVar.f111929g).getClass();
                    new uy.j(23, 0).i();
                } else if (c0Var instanceof wt1.i) {
                    ((w81.c) pVar.f111929g).getClass();
                    new uy.s(s92.o.ERROR).i();
                }
                return Unit.f80348a;
            case 3:
                switch (i13) {
                    case 3:
                        ((w81.c) pVar.f111929g).getClass();
                        new uy.s(s92.o.ERROR).i();
                        break;
                    default:
                        p.u3(pVar);
                        break;
                }
                return Unit.f80348a;
            default:
                switch (i13) {
                    case 3:
                        ((w81.c) pVar.f111929g).getClass();
                        new uy.s(s92.o.ERROR).i();
                        break;
                    default:
                        p.u3(pVar);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
