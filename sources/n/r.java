package n;

import android.view.ActionProvider;

/* loaded from: classes2.dex */
public final class r implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public gc.c f88701a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f88702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f88703c;

    public r(v vVar, ActionProvider actionProvider) {
        this.f88703c = vVar;
        this.f88702b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z13) {
        gc.c cVar = this.f88701a;
        if (cVar != null) {
            o oVar = ((q) cVar.f64764b).f88688n;
            oVar.f88655h = true;
            oVar.q(true);
        }
    }
}
