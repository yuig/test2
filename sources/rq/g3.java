package rq;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g3 extends me0.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109212e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f109213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f109214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(String str, up0.l lVar, GestaltTextComposer gestaltTextComposer, Context context) {
        super(context, null, str);
        this.f109213f = lVar;
        this.f109214g = gestaltTextComposer;
        Intrinsics.f(context);
    }

    @Override // te0.a, android.text.style.ClickableSpan
    public final void onClick(View view) {
        me0.a[] aVarArr;
        int i13 = this.f109212e;
        Object obj = this.f109214g;
        Object obj2 = this.f109213f;
        switch (i13) {
            case 0:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                k3 k3Var = (k3) obj2;
                kh2.n3.E(k3Var.getViewPinalytics(), tb0.p.CLOSEUP).F(h32.g0.PIN_CLOSEUP_SOURCE_DESCRIPTION, h32.u0.INSTAGRAM_LINK_BUTTON);
                PinCloseupBaseModule.handleWebsiteClicked$default(k3Var, ((f30) obj).s5(), null, null, 6, null);
                break;
            case 1:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                GestaltTextComposer gestaltTextComposer = (GestaltTextComposer) obj;
                int i14 = up0.l.f122972d;
                ((up0.l) obj2).getClass();
                Editable t03 = gestaltTextComposer.t0();
                int selectionStart = gestaltTextComposer.o0().getSelectionStart();
                aVarArr = t03 != null ? (me0.a[]) t03.getSpans(selectionStart, selectionStart, me0.a.class) : null;
                if (aVarArr != null && aVarArr.length != 0) {
                    gestaltTextComposer.X(new up0.k(t03, aVarArr, 1));
                    break;
                }
                break;
            default:
                kg.n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                GestaltTextField gestaltTextField = (GestaltTextField) obj;
                int i15 = up0.l.f122972d;
                ((up0.l) obj2).getClass();
                Editable z03 = gestaltTextField.z0();
                int selectionStart2 = gestaltTextField.o0().getSelectionStart();
                aVarArr = z03 != null ? (me0.a[]) z03.getSpans(selectionStart2, selectionStart2, me0.a.class) : null;
                if (aVarArr != null && aVarArr.length != 0) {
                    gestaltTextField.post(new ja.y(gestaltTextField, z03, aVarArr, 18));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(String str, up0.l lVar, GestaltTextField gestaltTextField, Context context) {
        super(context, null, str);
        this.f109213f = lVar;
        this.f109214g = gestaltTextField;
        Intrinsics.f(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(k3 k3Var, f30 f30Var, Context context, int i13) {
        super(context, Integer.valueOf(i13), "");
        this.f109213f = k3Var;
        this.f109214g = f30Var;
        Intrinsics.f(context);
    }
}
