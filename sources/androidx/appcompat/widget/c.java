package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16518a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16520c;

    public c(ActionBarContextView actionBarContextView, m.c cVar) {
        this.f16520c = actionBarContextView;
        this.f16519b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f16518a;
        Object obj = this.f16519b;
        switch (i13) {
            case 0:
                kg.n.a(view);
                ((m.c) obj).a();
                break;
            default:
                kg.n.a(view);
                h3 h3Var = (h3) this.f16520c;
                Window.Callback callback = h3Var.f16591k;
                if (callback != null && h3Var.f16592l) {
                    callback.onMenuItemSelected(0, (n.a) obj);
                    break;
                }
                break;
        }
    }

    public c(h3 h3Var) {
        this.f16520c = h3Var;
        this.f16519b = new n.a(h3Var.f16581a.getContext(), h3Var.f16588h);
    }
}
