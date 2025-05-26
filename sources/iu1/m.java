package iu1;

import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navdemo.two.NavDemoTwoFragment;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f73710r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavDemoTwoFragment f73711s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(NavDemoTwoFragment navDemoTwoFragment, bl2.c cVar) {
        super(2, cVar);
        this.f73711s = navDemoTwoFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f73711s, cVar);
        mVar.f73710r = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f fVar = (f) this.f73710r;
        NavDemoTwoFragment navDemoTwoFragment = this.f73711s;
        GestaltText gestaltText = navDemoTwoFragment.f49931k0;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        String string = navDemoTwoFragment.getString(fVar.f73698a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, string);
        GestaltText gestaltText2 = navDemoTwoFragment.f49932l0;
        if (gestaltText2 == null) {
            Intrinsics.r("description");
            throw null;
        }
        String string2 = navDemoTwoFragment.getString(fVar.f73699b);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        a0.p(gestaltText2, string2);
        GestaltButton gestaltButton = navDemoTwoFragment.f49933m0;
        if (gestaltButton == null) {
            Intrinsics.r("navButton");
            throw null;
        }
        gestaltButton.d(new k(fVar, 0));
        e eVar = fVar.f73701d;
        if (eVar instanceof d) {
            ViewGroup viewGroup = navDemoTwoFragment.f49935o0;
            if (viewGroup == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup.setVisibility(8);
            GestaltSpinner gestaltSpinner = navDemoTwoFragment.f49934n0;
            if (gestaltSpinner == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner, new k(fVar, 1));
        } else if (eVar instanceof c) {
            GestaltSpinner gestaltSpinner2 = navDemoTwoFragment.f49934n0;
            if (gestaltSpinner2 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner2, l.f73707j);
            ViewGroup viewGroup2 = navDemoTwoFragment.f49935o0;
            if (viewGroup2 == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup2.setVisibility(0);
            GestaltText gestaltText3 = navDemoTwoFragment.f49936p0;
            if (gestaltText3 == null) {
                Intrinsics.r("username");
                throw null;
            }
            c cVar = (c) eVar;
            a0.p(gestaltText3, cVar.f73695a);
            GestaltText gestaltText4 = navDemoTwoFragment.f49937q0;
            if (gestaltText4 == null) {
                Intrinsics.r("fullName");
                throw null;
            }
            a0.p(gestaltText4, cVar.f73696b);
        } else if (eVar instanceof b) {
            ViewGroup viewGroup3 = navDemoTwoFragment.f49935o0;
            if (viewGroup3 == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup3.setVisibility(8);
            GestaltSpinner gestaltSpinner3 = navDemoTwoFragment.f49934n0;
            if (gestaltSpinner3 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner3, l.f73708k);
        }
        return Unit.f80348a;
    }
}
