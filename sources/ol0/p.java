package ol0;

import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ml0.t0;

/* loaded from: classes5.dex */
public final class p extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96415a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.i f96416b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f96417c;

    public p(wa2.i pinFeatureConfig, Function1 clickListener, int i13) {
        this.f96415a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            this.f96416b = pinFeatureConfig;
            this.f96417c = clickListener;
            return;
        }
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f96416b = pinFeatureConfig;
        this.f96417c = clickListener;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        switch (this.f96415a) {
            case 0:
                final i view = (i) nVar;
                final t0 model = (t0) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                nr0.b pinActionHandler = new nr0.b();
                final int i14 = 0;
                pinActionHandler.f91865a = new nr0.d() { // from class: ol0.n
                    @Override // nr0.d
                    public final void onPinClicked(f30 it) {
                        int i15 = i14;
                        Object obj2 = model;
                        p this$0 = (p) this;
                        switch (i15) {
                            case 0:
                                t0 model2 = (t0) obj2;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model2, "$model");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.f96417c.invoke(model2);
                                break;
                            default:
                                r52.a model3 = (r52.a) obj2;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model3, "$model");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.f96417c.invoke(model3);
                                break;
                        }
                    }
                };
                boolean z13 = model.f87504b;
                view.getClass();
                if (z13) {
                    view.T(bs1.c.B(view, eo1.b.color_background_inverse_base));
                } else {
                    view.T(bs1.c.B(view, eo1.b.color_background_default));
                }
                o listener = new o(this, model, 0);
                Intrinsics.checkNotNullParameter(listener, "listener");
                nr0.b bVar = new nr0.b();
                bVar.f91865a = new nr0.d() { // from class: ol0.h
                    @Override // nr0.d
                    public final void onPinClicked(f30 it) {
                        i this$0 = i.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        f30 c03 = this$0.f96389q.getC0();
                        if (c03 == null) {
                            return;
                        }
                        this$0.z0(c03);
                        throw null;
                    }
                };
                SbaPinRep sbaPinRep = view.f96389q;
                sbaPinRep.setPinActionHandler(bVar);
                view.f96391s = bVar;
                Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
                view.f96391s = pinActionHandler;
                sbaPinRep.setPinActionHandler(pinActionHandler);
                com.bumptech.glide.c.n(wa2.i.a(this.f96416b, false, false, false, false, false, false, false, null, null, pinActionHandler, null, -1, -16777217, 1023), view, model.f87503a, i13);
                break;
            default:
                v42.k view2 = (v42.k) nVar;
                final r52.a model2 = (r52.a) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                nr0.b pinActionHandler2 = new nr0.b();
                final int i15 = 1;
                pinActionHandler2.f91865a = new nr0.d() { // from class: ol0.n
                    @Override // nr0.d
                    public final void onPinClicked(f30 it) {
                        int i152 = i15;
                        Object obj2 = model2;
                        p this$0 = (p) this;
                        switch (i152) {
                            case 0:
                                t0 model22 = (t0) obj2;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model22, "$model");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.f96417c.invoke(model22);
                                break;
                            default:
                                r52.a model3 = (r52.a) obj2;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model3, "$model");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.f96417c.invoke(model3);
                                break;
                        }
                    }
                };
                view2.a0(model2.f106257b);
                view2.d0(new o(this, model2, 2));
                Intrinsics.checkNotNullParameter(pinActionHandler2, "pinActionHandler");
                view2.f124150J = pinActionHandler2;
                view2.O.setPinActionHandler(pinActionHandler2);
                com.bumptech.glide.c.n(wa2.i.a(this.f96416b, false, false, false, false, false, false, false, null, null, pinActionHandler2, null, -1, -16777217, 1023), view2, model2.f106256a, i13);
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f96415a) {
            case 0:
                t0 model = (t0) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                r52.a model2 = (r52.a) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
