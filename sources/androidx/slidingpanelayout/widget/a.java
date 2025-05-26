package androidx.slidingpanelayout.widget;

import android.view.animation.PathInterpolator;
import androidx.transition.ChangeBounds;
import do2.j;
import kotlin.Unit;
import ua.t0;

/* loaded from: classes3.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.h f19784a;

    public a(m.h hVar) {
        this.f19784a = hVar;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        Unit unit;
        eb.f fVar = (eb.f) obj;
        e eVar = (e) this.f19784a.f85200e;
        if (eVar == null) {
            unit = null;
        } else {
            SlidingPaneLayout slidingPaneLayout = eVar.f19794a;
            slidingPaneLayout.f19775o = fVar;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.f19835c = 300L;
            changeBounds.f19836d = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
            t0.a(slidingPaneLayout, changeBounds);
            slidingPaneLayout.requestLayout();
            unit = Unit.f80348a;
        }
        return unit == cl2.a.COROUTINE_SUSPENDED ? unit : Unit.f80348a;
    }
}
