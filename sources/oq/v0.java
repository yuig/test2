package oq;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import rq.e3;
import rq.r1;

/* loaded from: classes3.dex */
public final class v0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f97145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f97147d;

    public /* synthetic */ v0(View view, View view2, Object obj, int i13) {
        this.f97144a = i13;
        this.f97145b = view;
        this.f97147d = view2;
        this.f97146c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f30 f30Var;
        r1 t03;
        ArrayList arrayList;
        int i13 = this.f97144a;
        Object obj = this.f97146c;
        View view2 = this.f97147d;
        View view3 = this.f97145b;
        switch (i13) {
            case 0:
                view3.removeOnAttachStateChangeListener(this);
                x0 x0Var = (x0) view2;
                e3 e3Var = x0Var.T;
                if (e3Var != null) {
                    e3Var.l((vh) obj);
                    return;
                }
                nx.d0 d0Var = x0Var.f97174l0;
                if (d0Var == null || (f30Var = x0Var.F) == null || (t03 = x0Var.t0()) == null || (arrayList = x0Var.I) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(t03);
                Context context = x0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                e3 e3Var2 = new e3(context, d0Var, bf.b.S(x0Var.f97157d), x0Var.f97159e);
                if (indexOf != -1) {
                    ArrayList arrayList2 = x0Var.I;
                    if (arrayList2 != null) {
                        arrayList2.add(indexOf + 1, e3Var2);
                    }
                    e3Var2.updatePin(f30Var);
                    x0Var.addView(e3Var2, indexOf + 1);
                    e3Var2.l((vh) obj);
                }
                x0Var.T = e3Var2;
                return;
            case 1:
                view3.removeOnAttachStateChangeListener(this);
                tq.y yVar = (tq.y) view2;
                e3 e3Var3 = yVar.N;
                if (e3Var3 != null) {
                    e3Var3.l((vh) obj);
                    return;
                }
                Context context2 = yVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                nx.d0 d0Var2 = yVar.f118982v;
                if (d0Var2 == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                e3 e3Var4 = new e3(context2, d0Var2, bf.b.S(yVar.f118948c), yVar.f118950d);
                int indexOf2 = yVar.f118980t.indexOf(yVar.k());
                if (indexOf2 != -1) {
                    int i14 = indexOf2 + 1;
                    yVar.f118980t.add(i14, e3Var4);
                    e3Var4.updatePin(yVar.getPin());
                    yVar.addView(e3Var4, i14);
                    e3Var4.l((vh) obj);
                }
                yVar.N = e3Var4;
                return;
            default:
                view3.removeOnAttachStateChangeListener(this);
                PinReactionIconButton.g2((PinReactionIconButton) view2, (String) obj);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
