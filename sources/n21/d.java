package n21;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.pincarouselads.view.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tq.q;
import yk1.m;
import yk1.n;

/* loaded from: classes.dex */
public final class d extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final l21.g f88979a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f88980b;

    /* renamed from: c, reason: collision with root package name */
    public final l21.h f88981c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f88982d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f88983e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88984f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f88985g;

    public d(l21.g pinChipCellInteractionListener, Function0 shouldScaleImagesToFitAndCenter, l21.h hVar, Function0 shouldUseDominantColorAsBackground, Function0 shouldScaleCanvasForCloseupRedesign, boolean z13, Function0 shouldConstrainImage) {
        Intrinsics.checkNotNullParameter(pinChipCellInteractionListener, "pinChipCellInteractionListener");
        Intrinsics.checkNotNullParameter(shouldScaleImagesToFitAndCenter, "shouldScaleImagesToFitAndCenter");
        Intrinsics.checkNotNullParameter(shouldUseDominantColorAsBackground, "shouldUseDominantColorAsBackground");
        Intrinsics.checkNotNullParameter(shouldScaleCanvasForCloseupRedesign, "shouldScaleCanvasForCloseupRedesign");
        Intrinsics.checkNotNullParameter(shouldConstrainImage, "shouldConstrainImage");
        this.f88979a = pinChipCellInteractionListener;
        this.f88980b = shouldScaleImagesToFitAndCenter;
        this.f88981c = hVar;
        this.f88982d = shouldUseDominantColorAsBackground;
        this.f88983e = shouldScaleCanvasForCloseupRedesign;
        this.f88984f = z13;
        this.f88985g = shouldConstrainImage;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        a aVar;
        l view = (l) nVar;
        m21.a model = (m21.a) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        l lVar = view instanceof View ? view : null;
        if (lVar != null) {
            yk1.j.a().getClass();
            m b13 = yk1.j.b(lVar);
            if (!(b13 instanceof a)) {
                b13 = null;
            }
            aVar = (a) b13;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            if (aVar.f88964a) {
                String url = model.a();
                String g13 = model.g();
                Intrinsics.checkNotNullParameter(url, "url");
                aVar.f88966c = url;
                aVar.f88967d = g13;
            } else {
                a.p3(aVar, model.a());
            }
            String c13 = model.c();
            String pinId = model.getPinId();
            Long f13 = model.f();
            Long r13 = model.r();
            Long s13 = model.s();
            aVar.f88972i = r13;
            aVar.f88969f = f13;
            aVar.f88968e = i13;
            aVar.f88970g = c13;
            aVar.f88971h = pinId;
            aVar.f88973j = s13;
            view.getClass();
            l21.g listener = this.f88979a;
            Intrinsics.checkNotNullParameter(listener, "listener");
            view.f47394h = listener;
            view.f47395i = this.f88981c;
            boolean booleanValue = ((Boolean) this.f88985g.invoke()).booleanValue();
            view.f47407u = booleanValue;
            if (booleanValue) {
                view.getLayoutParams().width = (int) ((hf0.b.p() ? com.bumptech.glide.c.G() : hf0.b.f69002b) * 0.8f);
            } else {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            view.requestLayout();
            view.f47405s = ((Boolean) this.f88980b.invoke()).booleanValue();
            view.f47406t = ((Boolean) this.f88983e.invoke()).booleanValue();
            String b14 = model.b();
            if (b14 != null) {
                String str = ((Boolean) this.f88982d.invoke()).booleanValue() ? b14 : null;
                if (str != null) {
                    view.setBackgroundColor(Color.parseColor(str));
                }
            }
        }
    }

    @Override // vq0.h
    public final m f() {
        return new a(this.f88984f);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        m21.a model = (m21.a) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public /* synthetic */ d(l21.g gVar, Function0 function0, l21.h hVar, g gVar2, q qVar, boolean z13, q qVar2, int i13) {
        this(gVar, function0, (i13 & 4) != 0 ? null : hVar, (i13 & 8) != 0 ? b.f88974j : gVar2, (i13 & 16) != 0 ? c.f88976j : qVar, z13, (i13 & 64) != 0 ? c.f88977k : qVar2);
    }
}
