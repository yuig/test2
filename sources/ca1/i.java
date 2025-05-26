package ca1;

import android.content.Context;
import android.widget.FrameLayout;
import c2.m4;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Locale;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f27203s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f27203s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f27203s, cVar);
        iVar.f27202r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f27202r;
        boolean z13 = aVar2.f27188b;
        o oVar = this.f27203s;
        GestaltSpinner gestaltSpinner = oVar.f27218f0;
        if (gestaltSpinner == null) {
            Intrinsics.r("spinner");
            throw null;
        }
        int i13 = 15;
        s0.w(gestaltSpinner, new u81.h(z13, i13));
        FrameLayout frameLayout = oVar.f27217e0;
        if (frameLayout == null) {
            Intrinsics.r("spinnerContainer");
            throw null;
        }
        frameLayout.setVisibility(z13 ? 0 : 8);
        String str2 = aVar2.f27189c;
        if (str2 != null) {
            GestaltText gestaltText = oVar.f27219g0;
            if (gestaltText == null) {
                Intrinsics.r("connectedTo");
                throw null;
            }
            gestaltText.i(new y71.b(9, oVar, str2));
        }
        String str3 = aVar2.f27190d;
        String str4 = aVar2.f27191e;
        if (str4 != null) {
            GestaltListAction gestaltListAction = oVar.f27221i0;
            if (gestaltListAction == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction, new d91.l(str4, 4));
        } else if (str3 == null) {
            Context requireContext = oVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            int i14 = dl2.b.f1(requireContext) == g92.d.VR ? sm1.b.ic_vr_history_gestalt : sm1.b.ic_history_gestalt;
            GestaltListAction gestaltListAction2 = oVar.f27221i0;
            if (gestaltListAction2 == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction2, new m4(oVar, i14, 14));
        } else {
            GestaltListAction gestaltListAction3 = oVar.f27221i0;
            if (gestaltListAction3 == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction3, new q91.h(oVar, i13));
        }
        Locale locale = Locale.ROOT;
        String lowerCase = "QUICK_SAVES".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str5 = aVar2.f27192f;
        if (str5 != null) {
            str = str5.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (lowerCase.equals(str)) {
            str3 = oVar.getString(x0.profile);
        } else if (str3 == null) {
            str3 = oVar.getString(c52.e.social_board);
            Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
        }
        Intrinsics.f(str3);
        GestaltListAction gestaltListAction4 = oVar.f27221i0;
        if (gestaltListAction4 != null) {
            kg.a.h(gestaltListAction4, new d91.l(str3, 5));
            return Unit.f80348a;
        }
        Intrinsics.r("boardListAction");
        throw null;
    }
}
