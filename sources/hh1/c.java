package hh1;

import android.view.View;

/* loaded from: classes5.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f69152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp0.d f69153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f69154c;

    public c(View view, sp0.d dVar, d dVar2) {
        this.f69152a = view;
        this.f69153b = dVar;
        this.f69154c = dVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        float f13;
        int c13;
        view.removeOnLayoutChangeListener(this);
        int i24 = eo1.c.space_200;
        View view2 = this.f69152a;
        int W = bs1.c.W(view2, i24);
        int W2 = bs1.c.W(view2, eo1.c.space_800);
        sp0.d dVar = this.f69153b;
        float width = dVar.f114883a - (view2.getWidth() / 2);
        float f14 = W;
        if (f14 > width) {
            f13 = width - f14;
            width = f14;
        } else {
            f13 = 0.0f;
        }
        float width2 = view2.getWidth() + width;
        d dVar2 = this.f69154c;
        float f15 = dVar2.f69158h - f14;
        if (width2 > f15) {
            f13 = ((f15 - width) - view2.getWidth()) * (-1);
            width = (dVar2.f69158h - view2.getWidth()) - f14;
        }
        view2.setX(width);
        float height = view2.getHeight();
        float f16 = dVar.f114884b;
        float f17 = W2;
        float f18 = (f16 - height) - f17;
        float W3 = bs1.c.W(view2, p92.a.idea_pin_navigation_background_height);
        ve0.q qVar = dVar2.f69159i;
        if (f18 < W3) {
            f18 = f16 + f17;
            qVar.c(ve0.b.TOP_CENTER);
        }
        if (f13 != 0.0f && qVar.f125742k != (c13 = ml2.c.c(f13))) {
            qVar.f125742k = c13;
            qVar.f(qVar.f125690d);
        }
        view2.setY(f18);
    }
}
