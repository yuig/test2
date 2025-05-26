package gu1;

import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navdemo.three.NavDemoThreeFragment;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f66143r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavDemoThreeFragment f66144s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NavDemoThreeFragment navDemoThreeFragment, bl2.c cVar) {
        super(2, cVar);
        this.f66144s = navDemoThreeFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f66144s, cVar);
        hVar.f66143r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f66143r;
        NavDemoThreeFragment navDemoThreeFragment = this.f66144s;
        GestaltText gestaltText = navDemoThreeFragment.f49921k0;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        String string = navDemoThreeFragment.getString(bVar.f66132a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, string);
        GestaltText gestaltText2 = navDemoThreeFragment.f49922l0;
        if (gestaltText2 == null) {
            Intrinsics.r("description");
            throw null;
        }
        String string2 = navDemoThreeFragment.getString(bVar.f66133b);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        a0.p(gestaltText2, string2);
        GestaltButton gestaltButton = navDemoThreeFragment.f49923m0;
        if (gestaltButton == null) {
            Intrinsics.r("navButton");
            throw null;
        }
        gestaltButton.d(new f(bVar, 0));
        hu1.d dVar = bVar.f66135d;
        if (dVar instanceof hu1.c) {
            ViewGroup viewGroup = navDemoThreeFragment.f49925o0;
            if (viewGroup == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup.setVisibility(8);
            GestaltSpinner gestaltSpinner = navDemoThreeFragment.f49924n0;
            if (gestaltSpinner == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner, new f(bVar, 1));
        } else if (dVar instanceof hu1.b) {
            GestaltSpinner gestaltSpinner2 = navDemoThreeFragment.f49924n0;
            if (gestaltSpinner2 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner2, g.f66140j);
            ViewGroup viewGroup2 = navDemoThreeFragment.f49925o0;
            if (viewGroup2 == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup2.setVisibility(0);
            GestaltText gestaltText3 = navDemoThreeFragment.f49926p0;
            if (gestaltText3 == null) {
                Intrinsics.r("username");
                throw null;
            }
            hu1.b bVar2 = (hu1.b) dVar;
            a0.p(gestaltText3, bVar2.f70415a);
            GestaltText gestaltText4 = navDemoThreeFragment.f49927q0;
            if (gestaltText4 == null) {
                Intrinsics.r("fullName");
                throw null;
            }
            a0.p(gestaltText4, bVar2.f70416b);
        } else if (dVar instanceof hu1.a) {
            ViewGroup viewGroup3 = navDemoThreeFragment.f49925o0;
            if (viewGroup3 == null) {
                Intrinsics.r("modelFieldsContainer");
                throw null;
            }
            viewGroup3.setVisibility(8);
            GestaltSpinner gestaltSpinner3 = navDemoThreeFragment.f49924n0;
            if (gestaltSpinner3 == null) {
                Intrinsics.r("loadingSpinner");
                throw null;
            }
            s0.w(gestaltSpinner3, g.f66141k);
        }
        return Unit.f80348a;
    }
}
