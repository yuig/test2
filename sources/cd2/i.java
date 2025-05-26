package cd2;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.widget.configuration.WidgetConfigurationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f27559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f27559s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        i iVar = new i(this.f27559s, cVar);
        iVar.f27558r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        boolean z13 = ((b) this.f27558r).f27551a;
        FragmentActivity E4 = this.f27559s.E4();
        WidgetConfigurationActivity widgetConfigurationActivity = E4 instanceof WidgetConfigurationActivity ? (WidgetConfigurationActivity) E4 : null;
        if (widgetConfigurationActivity != null) {
            ((PinterestLoadingLayout) widgetConfigurationActivity.findViewById(xc2.e.loading_layout)).showLoadingSpinner(z13);
        }
        return Unit.f80348a;
    }
}
