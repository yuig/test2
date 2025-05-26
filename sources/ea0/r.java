package ea0;

import android.content.Context;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57997r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f57998s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f57998s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f57998s, cVar);
        rVar.f57997r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((l) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l lVar = (l) this.f57997r;
        int i13 = t.W0;
        t tVar = this.f57998s;
        tVar.getClass();
        tVar.S0 = lVar.f57976e;
        if (lVar.f57973b) {
            GestaltIconButton gestaltIconButton = tVar.M0;
            if (gestaltIconButton == null) {
                Intrinsics.r("cancelButton");
                throw null;
            }
            bs1.c.U1(gestaltIconButton);
            Context requireContext = tVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            CharSequence a13 = lVar.f57972a.a(requireContext);
            GestaltText gestaltText = tVar.N0;
            if (gestaltText == null) {
                Intrinsics.r("title");
                throw null;
            }
            gestaltText.setText(a13);
            GestaltText gestaltText2 = tVar.N0;
            if (gestaltText2 == null) {
                Intrinsics.r("title");
                throw null;
            }
            bs1.c.R1(gestaltText2, !kotlin.text.z.j(a13));
        } else {
            GestaltText gestaltText3 = tVar.N0;
            if (gestaltText3 == null) {
                Intrinsics.r("title");
                throw null;
            }
            bs1.c.X0(gestaltText3);
            GestaltIconButton gestaltIconButton2 = tVar.M0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("cancelButton");
                throw null;
            }
            bs1.c.X0(gestaltIconButton2);
        }
        FullBleedGestaltSpinner fullBleedGestaltSpinner = tVar.O0;
        if (fullBleedGestaltSpinner != null) {
            fullBleedGestaltSpinner.showLoadingSpinner(lVar.f57974c);
            return Unit.f80348a;
        }
        Intrinsics.r("progressOverlay");
        throw null;
    }
}
