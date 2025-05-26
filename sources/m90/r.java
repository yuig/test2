package m90;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f86692s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f86692s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f86692s, cVar);
        rVar.f86691r = obj;
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
        b bVar = (b) this.f86691r;
        int i13 = w.X0;
        w wVar = this.f86692s;
        wVar.getClass();
        wVar.U0 = bVar.f86630g;
        Context requireContext = wVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        CharSequence a13 = bVar.f86624a.a(requireContext);
        GestaltText gestaltText = wVar.P0;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        gestaltText.setText(a13);
        GestaltText gestaltText2 = wVar.P0;
        if (gestaltText2 == null) {
            Intrinsics.r("title");
            throw null;
        }
        bs1.c.R1(gestaltText2, !kotlin.text.z.j(a13));
        e1 e1Var = bVar.f86625b;
        if (e1Var instanceof d1) {
            u50.i0 i0Var = ((d1) e1Var).f86645a;
            Context requireContext2 = wVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            CharSequence a14 = i0Var.a(requireContext2);
            GestaltStaticSearchBar gestaltStaticSearchBar = wVar.N0;
            if (gestaltStaticSearchBar == null) {
                Intrinsics.r("searchField");
                throw null;
            }
            if (kotlin.text.z.j(a14)) {
                oe.f.n(gestaltStaticSearchBar, t.f86699l);
            } else {
                oe.f.n(gestaltStaticSearchBar, new ip.d(8, a14));
            }
        } else if (e1Var instanceof c1) {
            GestaltStaticSearchBar gestaltStaticSearchBar2 = wVar.N0;
            if (gestaltStaticSearchBar2 == null) {
                Intrinsics.r("searchField");
                throw null;
            }
            kh2.j.X(gestaltStaticSearchBar2);
        }
        GestaltIconButton gestaltIconButton = wVar.O0;
        if (gestaltIconButton == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        bs1.c.R1(gestaltIconButton, bVar.f86627d);
        ComposeView composeView = wVar.Q0;
        if (composeView == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        bs1.c.R1(composeView, bVar.f86628e);
        wVar.V0.setValue(Boolean.valueOf(bVar.f86629f));
        return Unit.f80348a;
    }
}
