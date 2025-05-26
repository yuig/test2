package gg0;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n1;
import com.pinterest.feature.pincarouselads.view.CarouselIndexViewAnimated;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgg0/k0;", "Lmf0/f;", "<init>", "()V", "g4/u", "educationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k0 extends mf0.f {

    /* renamed from: k0, reason: collision with root package name */
    public static boolean f64942k0;

    /* renamed from: c0, reason: collision with root package name */
    public rg0.m f64943c0;

    /* renamed from: d0, reason: collision with root package name */
    public rg0.n f64944d0;

    /* renamed from: e0, reason: collision with root package name */
    public PinterestRecyclerView f64945e0;

    /* renamed from: f0, reason: collision with root package name */
    public CarouselIndexViewAnimated f64946f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltButton f64947g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f64948h0;

    /* renamed from: i0, reason: collision with root package name */
    public final m1 f64949i0;

    /* renamed from: j0, reason: collision with root package name */
    public final i0 f64950j0;

    public k0() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new j0(new j0(this, 0), 1));
        this.f64949i0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(hg0.i.class), new j0(a13, 2), new mq.f0(null, a13, 27), new mq.g0(this, a13, 27));
        this.f64950j0 = new i0(this);
    }

    @Override // mf0.f
    public final void Z6(LayoutInflater inflater) {
        String str;
        GestaltButton gestaltButton;
        String str2;
        GestaltButton gestaltButton2;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        hg0.i p73 = p7();
        rg0.n experienceValue = this.f64944d0;
        if (experienceValue == null) {
            Intrinsics.r("experienceValue");
            throw null;
        }
        rg0.m displayData = this.f64943c0;
        if (displayData == null) {
            Intrinsics.r("displayData");
            throw null;
        }
        p73.getClass();
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        p73.f69079h = experienceValue;
        p73.f69080i = displayData;
        experienceValue.g();
        View inflate = inflater.inflate(jg0.d.dialog_eu_prompt, (ViewGroup) null);
        this.A = inflate;
        this.f64945e0 = inflate != null ? (PinterestRecyclerView) inflate.findViewById(jg0.c.recyclerView) : null;
        View view = this.A;
        this.f64946f0 = view != null ? (CarouselIndexViewAnimated) view.findViewById(jg0.c.carouselIndexTrackerView) : null;
        View view2 = this.A;
        this.f64947g0 = view2 != null ? (GestaltButton) view2.findViewById(jg0.c.actionButton1) : null;
        View view3 = this.A;
        this.f64948h0 = view3 != null ? (GestaltButton) view3.findViewById(jg0.c.actionButton2) : null;
        final int i13 = 0;
        this.f18411g = false;
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        PinterestRecyclerView pinterestRecyclerView = this.f64945e0;
        if (pinterestRecyclerView != null) {
            rg0.m mVar = this.f64943c0;
            if (mVar == null) {
                Intrinsics.r("displayData");
                throw null;
            }
            pinterestRecyclerView.j(new f0(mVar.f108052c, this.f64950j0));
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.C1(0);
            pinterestRecyclerView.l(linearLayoutManager);
            CarouselIndexViewAnimated carouselIndexViewAnimated = this.f64946f0;
            if (carouselIndexViewAnimated != null) {
                carouselIndexViewAnimated.a(pinterestRecyclerView);
            }
            new n1().b(pinterestRecyclerView.f52531a);
            pinterestRecyclerView.b(new androidx.recyclerview.widget.c0(this, 7));
        }
        rg0.m mVar2 = this.f64943c0;
        if (mVar2 == null) {
            Intrinsics.r("displayData");
            throw null;
        }
        rg0.j jVar = (rg0.j) CollectionsKt.firstOrNull(mVar2.f108052c);
        if (jVar != null && (str2 = jVar.f108035e) != null && (gestaltButton2 = this.f64947g0) != null) {
            bs1.c.s(gestaltButton2, new h0(str2, 0));
            gestaltButton2.e(new gm1.a(this) { // from class: gg0.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k0 f64933b;

                {
                    this.f64933b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    PinterestRecyclerView pinterestRecyclerView2;
                    int i14 = i13;
                    int i15 = 1;
                    k0 this$0 = this.f64933b;
                    switch (i14) {
                        case 0:
                            boolean z13 = k0.f64942k0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof xl1.a) && (pinterestRecyclerView2 = this$0.f64945e0) != null) {
                                pinterestRecyclerView2.h(1, true);
                                break;
                            }
                            break;
                        default:
                            boolean z14 = k0.f64942k0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xl1.a) {
                                hg0.i p74 = this$0.p7();
                                xj2.c o13 = p74.f69074c.a(y0.b(new Pair("first_party_ads_personalization_enabled", String.valueOf(p74.f69078g)))).l(wj2.c.a()).r(tk2.e.f118017c).o(new k90.i(26, new hg0.h(p74, 0)), new k90.i(27, new hg0.h(p74, i15)));
                                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                                p74.f69081j.a(o13);
                                this$0.N6(false, false);
                                k0.f64942k0 = false;
                                break;
                            }
                            break;
                    }
                }
            });
        }
        rg0.m mVar3 = this.f64943c0;
        if (mVar3 == null) {
            Intrinsics.r("displayData");
            throw null;
        }
        rg0.j jVar2 = (rg0.j) CollectionsKt.d0(mVar3.f108052c);
        if (jVar2 != null && (str = jVar2.f108035e) != null && (gestaltButton = this.f64948h0) != null) {
            final int i14 = 1;
            bs1.c.s(gestaltButton, new h0(str, 1));
            gestaltButton.e(new gm1.a(this) { // from class: gg0.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k0 f64933b;

                {
                    this.f64933b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    PinterestRecyclerView pinterestRecyclerView2;
                    int i142 = i14;
                    int i15 = 1;
                    k0 this$0 = this.f64933b;
                    switch (i142) {
                        case 0:
                            boolean z13 = k0.f64942k0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof xl1.a) && (pinterestRecyclerView2 = this$0.f64945e0) != null) {
                                pinterestRecyclerView2.h(1, true);
                                break;
                            }
                            break;
                        default:
                            boolean z14 = k0.f64942k0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof xl1.a) {
                                hg0.i p74 = this$0.p7();
                                xj2.c o13 = p74.f69074c.a(y0.b(new Pair("first_party_ads_personalization_enabled", String.valueOf(p74.f69078g)))).l(wj2.c.a()).r(tk2.e.f118017c).o(new k90.i(26, new hg0.h(p74, 0)), new k90.i(27, new hg0.h(p74, i15)));
                                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                                p74.f69081j.a(o13);
                                this$0.N6(false, false);
                                k0.f64942k0 = false;
                                break;
                            }
                            break;
                    }
                }
            });
        }
        p7().h(hg0.c.f69063a);
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (f64942k0) {
            N6(false, false);
        } else {
            f64942k0 = true;
        }
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f18416l;
        Window window = dialog != null ? dialog.getWindow() : null;
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (window == null || attributes == null) {
            return;
        }
        Resources system = Resources.getSystem();
        int i13 = system.getDisplayMetrics().widthPixels;
        if (hf0.b.q()) {
            attributes.width = pk.a0.K(360, system);
        } else {
            attributes.width = i13 - (pk.a0.K(16, system) * 2);
        }
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(eo1.b.sema_color_background_transparent);
    }

    public final hg0.i p7() {
        return (hg0.i) this.f64949i0.getValue();
    }
}
