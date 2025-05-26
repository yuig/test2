package p4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import t3.c0;

/* loaded from: classes.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ int f98836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Object obj, int i13) {
        super(1, obj, q.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        this.f98836a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, q.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }
    }

    public final z2.s h(int i13) {
        switch (this.f98836a) {
            case 0:
                q qVar = (q) this.receiver;
                qVar.getClass();
                View c13 = k.c(qVar);
                if (c13.isFocused() || c13.hasFocus()) {
                    return z2.s.f140648b;
                }
                return nl.b.h(c13, nl.b.u(i13), k.b(((c0) com.bumptech.glide.c.V0(qVar)).f115877e, (View) com.bumptech.glide.c.V0(qVar), c13)) ? z2.s.f140648b : z2.s.f140649c;
            default:
                q qVar2 = (q) this.receiver;
                qVar2.getClass();
                View c14 = k.c(qVar2);
                if (!c14.hasFocus()) {
                    return z2.s.f140648b;
                }
                c0 c0Var = (c0) com.bumptech.glide.c.V0(qVar2);
                View view = (View) com.bumptech.glide.c.V0(qVar2);
                if (!(c14 instanceof ViewGroup)) {
                    if (view.requestFocus()) {
                        return z2.s.f140648b;
                    }
                    throw new IllegalStateException("host view did not take focus".toString());
                }
                Rect b13 = k.b(c0Var.f115877e, view, c14);
                Integer u13 = nl.b.u(i13);
                int intValue = u13 != null ? u13.intValue() : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View view2 = qVar2.f98837n;
                View findNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, b13, intValue);
                if (findNextFocus != null && k.a(c14, findNextFocus)) {
                    findNextFocus.requestFocus(intValue, b13);
                    return z2.s.f140649c;
                }
                if (view.requestFocus()) {
                    return z2.s.f140648b;
                }
                throw new IllegalStateException("host view did not take focus".toString());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f98836a) {
        }
        return h(((z2.c) obj).f140608a);
    }
}
