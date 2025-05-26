package zc2;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.widget.configuration.WidgetConfigurationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.i0;
import u50.k0;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f141630r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f141631s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f141631s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f141631s, cVar);
        mVar.f141630r = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f141630r;
        i0 i0Var = bVar.f141615a;
        p pVar = this.f141631s;
        if (i0Var != null) {
            GestaltText gestaltText = pVar.f141639f0;
            if (gestaltText == null) {
                Intrinsics.r("boardSubText");
                throw null;
            }
            a0.q(gestaltText, i0Var);
        }
        k0 k0Var = bVar.f141616b;
        if (k0Var != null) {
            GestaltText gestaltText2 = pVar.f141640g0;
            if (gestaltText2 == null) {
                Intrinsics.r("refreshSubText");
                throw null;
            }
            a0.q(gestaltText2, k0Var);
        }
        GestaltText gestaltText3 = pVar.f141638e0;
        if (gestaltText3 == null) {
            Intrinsics.r("saveText");
            throw null;
        }
        gestaltText3.i(new ha2.j(bVar, 24));
        FragmentActivity E4 = pVar.E4();
        WidgetConfigurationActivity widgetConfigurationActivity = E4 instanceof WidgetConfigurationActivity ? (WidgetConfigurationActivity) E4 : null;
        if (widgetConfigurationActivity != null) {
            ((PinterestLoadingLayout) widgetConfigurationActivity.findViewById(xc2.e.loading_layout)).showLoadingSpinner(bVar.f141618d);
        }
        return Unit.f80348a;
    }
}
