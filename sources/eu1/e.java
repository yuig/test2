package eu1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navdemo.one.NavDemoOneFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import yq1.u1;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f60183r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavDemoOneFragment f60184s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NavDemoOneFragment navDemoOneFragment, bl2.c cVar) {
        super(2, cVar);
        this.f60184s = navDemoOneFragment;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f60184s, cVar);
        eVar.f60183r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f60183r;
        NavDemoOneFragment navDemoOneFragment = this.f60184s;
        GestaltText gestaltText = navDemoOneFragment.f49915k0;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        String string = navDemoOneFragment.getString(bVar.f60179a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText, string);
        GestaltText gestaltText2 = navDemoOneFragment.f49916l0;
        if (gestaltText2 == null) {
            Intrinsics.r("description");
            throw null;
        }
        String string2 = navDemoOneFragment.getString(bVar.f60180b);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        a0.p(gestaltText2, string2);
        GestaltButton gestaltButton = navDemoOneFragment.f49917m0;
        if (gestaltButton != null) {
            gestaltButton.d(new u1(bVar, 12));
            return Unit.f80348a;
        }
        Intrinsics.r("navButton");
        throw null;
    }
}
