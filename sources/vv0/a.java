package vv0;

import android.view.View;
import androidx.media3.ui.k;
import b2.g;
import com.pinterest.api.model.pu;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126754a;

    /* renamed from: b, reason: collision with root package name */
    public final d f126755b;

    public a(d listener, int i13) {
        this.f126754a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f126755b = listener;
        } else {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f126755b = listener;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        int i14 = this.f126754a;
        d listener = this.f126755b;
        switch (i14) {
            case 0:
                zv0.b view = (zv0.b) nVar;
                xv0.a model = (xv0.a) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                int i15 = model.f136021b;
                view.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                bs1.c.R1(view, ((yv0.c) listener).f140215p == i15);
                view.setOnClickListener(new com.pinterest.feature.home.view.c(listener, 8));
                break;
            default:
                zv0.d view2 = (zv0.d) nVar;
                xv0.b model2 = (xv0.b) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                pu puVar = model2.f136017c;
                if (puVar == null || !puVar.g()) {
                    bs1.c.X0(view2.f142857a);
                    a0.p(view2.f142859c, "");
                    view2.f142860d.g2(zv0.c.f142850j);
                } else {
                    pu puVar2 = model2.f136017c;
                    if (puVar2 != null) {
                        int i16 = view2.f142861e;
                        WebImageView webImageView = view2.f142857a;
                        c0.d.h2(webImageView, puVar2, i16);
                        bs1.c.U1(webImageView);
                        a0.w1(view2.f142859c);
                    }
                    view2.f142860d.g2(zv0.c.f142851k);
                    view2.f142859c.i(new g(model2.f136019e, view2, model2.f136018d));
                }
                view2.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                int i17 = ((yv0.c) listener).f140215p;
                int i18 = model2.f136021b;
                boolean z13 = i17 == i18;
                view2.setSelected(z13);
                GestaltText gestaltText = view2.f142859c;
                View view3 = view2.f142858b;
                if (z13) {
                    bs1.c.X0(view3);
                    a0.k0(gestaltText);
                    view2.b();
                } else {
                    bs1.c.U1(view3);
                    a0.w1(gestaltText);
                    view2.a();
                }
                view2.setOnClickListener(new k(listener, i18, 2));
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f126754a) {
            case 0:
                xv0.a model = (xv0.a) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                xv0.b model2 = (xv0.b) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
