package z80;

import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import j1.p0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s80.n5;
import s80.o5;
import s80.p5;
import s80.q5;
import s80.r5;
import s80.s5;
import s80.t5;
import sa0.d0;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t5 f141085r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f141086s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t5 t5Var, s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f141085r = t5Var;
        this.f141086s = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f141085r, this.f141086s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        t5 t5Var = this.f141085r;
        boolean z13 = t5Var instanceof n5;
        s sVar = this.f141086s;
        if (z13) {
            if (((n5) t5Var).f111708a) {
                sVar.f141087a.E("com.pinterest.EXTRA_COLLAGE_COMPOSER_RESULT_CODE", e0.t.j(new Pair("com.pinterest.EXTRA_COLLAGE_COMPOSER_RESULT_KEY_SAVED", Boolean.TRUE)));
            } else {
                sVar.f141087a.B();
            }
        } else if (t5Var instanceof q5) {
            q5 q5Var = (q5) t5Var;
            sVar.f141087a.f(el.a.y(q5Var.f111775b, q5Var.f111776c, null, q5Var.f111774a, null, 0, null, 492));
        } else if (t5Var instanceof p5) {
            ab0.e eVar = sVar.f141088b;
            p5 p5Var = (p5) t5Var;
            String imageUrl = p5Var.f111755a;
            d0 imageSource = p5Var.f111756b;
            p5Var.getClass();
            Integer num = new Integer(1);
            ml1.b transition = ml1.b.UNSPECIFIED_TRANSITION;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(imageSource, "imageSource");
            Intrinsics.checkNotNullParameter("", "navigationId");
            Intrinsics.checkNotNullParameter(transition, "transition");
            eVar.a("", transition, new p0(imageUrl, imageSource, num, null, 14));
        } else if (t5Var instanceof r5) {
            NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.j0.f51000c.getValue(), "", ml1.b.CROSS_FADE_TRANSITION.getValue());
            r5 r5Var = (r5) t5Var;
            L.m0("EffectsExtras.EFFECTS_ITEM_ID", r5Var.f111784a);
            L.Y1("EffectsExtras.EFFECTS_FROM_TEXT_ITEM_CLICKED", r5Var.f111785b);
            sVar.f141087a.f(L);
        } else if (t5Var instanceof s5) {
            ll.j jVar = sVar.f141087a;
            NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.j0.f51001d.getValue());
            w13.m0("com.pinterest.EXTRA_BOARD_ID", ((s5) t5Var).f111795a);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar.f(w13);
        } else if (t5Var instanceof o5) {
            ll.j jVar2 = sVar.f141087a;
            NavigationImpl w14 = Navigation.w1((ScreenLocation) com.pinterest.screens.j0.f51004g.getValue());
            w14.m0("com.pinterest.EXTRA_STORY_PIN_MEDIA_GALLERY_ENTRY_TYPE", "CollageCutoutAddPhoto");
            Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
            jVar2.f(w14);
        }
        return Unit.f80348a;
    }
}
