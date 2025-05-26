package t3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Object obj, int i13) {
        super(1, obj, c0.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        this.f116191a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, c0.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116191a) {
            case 0:
                Function0 function0 = (Function0) obj;
                k2.e eVar = ((c0) this.receiver).f115900p0;
                if (!eVar.i(function0)) {
                    eVar.b(function0);
                }
                return Unit.f80348a;
            default:
                int i13 = ((z2.c) obj).f140608a;
                c0 c0Var = (c0) this.receiver;
                c0Var.getClass();
                boolean z13 = false;
                if (!z2.c.b(i13, 7) && !z2.c.b(i13, 8)) {
                    Integer u13 = nl.b.u(i13);
                    if (u13 == null) {
                        throw new IllegalStateException("Invalid focus direction".toString());
                    }
                    int intValue = u13.intValue();
                    a3.d y13 = c0Var.y();
                    Rect L0 = y13 != null ? kh2.n3.L0(y13) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = L0 == null ? focusFinder.findNextFocus(c0Var, c0Var.findFocus(), intValue) : focusFinder.findNextFocusFromRect(c0Var, L0, intValue);
                    if (findNextFocus != null) {
                        z13 = nl.b.h(findNextFocus, Integer.valueOf(intValue), L0);
                    }
                }
                return Boolean.valueOf(z13);
        }
    }
}
