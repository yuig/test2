package li1;

import android.content.Context;
import bi1.a0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import we1.a2;
import xk2.v;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f83541r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f83542s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f83542s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f83542s, cVar);
        eVar.f83541r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a displayState = (a) this.f83541r;
        j jVar = this.f83542s.f83550e;
        if (jVar == null) {
            Intrinsics.r("weightLossOptOutModalView");
            throw null;
        }
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Context context = jVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object value = jVar.f83558b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String string = jVar.getResources().getString(displayState.f83536a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jVar.getResources().getString(displayState.f83537b);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        f0.h.n(context, (GestaltText) value, string, string2);
        Object value2 = jVar.f83559c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).i(new a0(displayState, 3));
        boolean z13 = displayState.f83539d;
        v vVar = jVar.f83560d;
        if (z13) {
            Object value3 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((GestaltButton) value3).g(new a2(jVar, 20));
        } else {
            Object value4 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((GestaltButton) value4).d(i.f83553j);
        }
        return Unit.f80348a;
    }
}
