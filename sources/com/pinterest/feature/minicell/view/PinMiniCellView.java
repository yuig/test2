package com.pinterest.feature.minicell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import az1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ik0;
import com.pinterest.api.model.vh;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d3;
import com.pinterest.ui.brio.view.RoundedCornersImageView;
import h32.f1;
import h32.g0;
import h32.h2;
import h32.u0;
import h32.z1;
import java.util.HashMap;
import java.util.Map;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls1.q;
import nx.d1;
import nx.v;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import pk.a0;
import rn1.f;
import rq.t4;
import ww0.a;
import ww0.b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/minicell/view/PinMiniCellView;", "Lcom/pinterest/design/brio/widget/LegacyLinearLayout;", "Luw0/a;", "Lnx/v;", "Lh32/z1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinMiniCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinMiniCellView extends a implements uw0.a, v {

    /* renamed from: e, reason: collision with root package name */
    public final RoundedCornersImageView f46759e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f46760f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f46761g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f46762h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f46763i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f46764j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f46765k;

    /* renamed from: l, reason: collision with root package name */
    public final String f46766l;

    /* renamed from: m, reason: collision with root package name */
    public final String f46767m;

    /* renamed from: n, reason: collision with root package name */
    public vw0.a f46768n;

    /* renamed from: o, reason: collision with root package name */
    public final b f46769o;

    /* renamed from: p, reason: collision with root package name */
    public b60.b f46770p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [ww0.b] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View$OnClickListener, ww0.c] */
    public PinMiniCellView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44833b = false;
        a(false);
        b();
        final int i13 = 2;
        this.f46769o = new View.OnLongClickListener(this) { // from class: ww0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131188b;

            {
                this.f131188b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i13;
                PinMiniCellView.j(this.f131188b, view);
                return true;
            }
        };
        View.inflate(getContext(), az1.b.view_pin_mini_cell, this);
        setOrientation(1);
        final ?? r53 = new View.OnClickListener(this) { // from class: ww0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131190b;

            {
                this.f131190b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                PinMiniCellView.g(this.f131190b);
            }
        };
        View findViewById = findViewById(az1.a.image);
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) findViewById;
        roundedCornersImageView.setOnClickListener(r53);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46759e = roundedCornersImageView;
        final int i14 = 6;
        this.f46760f = ((GestaltText) findViewById(az1.a.price_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i15 = i14;
                View.OnClickListener onClickListener = r53;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i15) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        final int i15 = 7;
        this.f46761g = ((GestaltText) findViewById(az1.a.availability_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i15;
                View.OnClickListener onClickListener = r53;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        final int i16 = 8;
        this.f46762h = ((GestaltText) findViewById(az1.a.title_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i16;
                View.OnClickListener onClickListener = r53;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        View findViewById2 = findViewById(az1.a.badge_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46763i = (GestaltText) findViewById2;
        View findViewById3 = findViewById(az1.a.type_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46764j = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(az1.a.identifier_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46765k = (GestaltText) findViewById4;
        setLayoutParams(new RecyclerView.LayoutParams(roundedCornersImageView.L, -2));
        String string = getResources().getString(c.product_in_stock);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f46766l = string;
        String string2 = getResources().getString(c.product_out_of_stock);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f46767m = string2;
    }

    public static void e(PinMiniCellView this$0, View.OnClickListener onClickListener, gm1.c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof f) {
            this$0.setOnClickListener(onClickListener);
        }
    }

    public static void g(PinMiniCellView this$0) {
        Map map;
        ik0 ik0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vw0.a aVar = this$0.f46768n;
        if (aVar != null) {
            vh vhVar = aVar.f126795b;
            HashMap E = vhVar != null ? d.E(vhVar) : null;
            if (E == null) {
                E = new HashMap();
            }
            HashMap hashMap = E;
            if (vhVar != null && (map = vhVar.f42863u) != null && (ik0Var = (ik0) map.get(aVar.f126794a.b())) != null) {
                hashMap.put("badge_text", ik0Var.b());
            }
            aVar.f126797d.f122379a.h0(f1.TAP, u0.DIGEST_PIN, g0.BUYABLE_PINS_CAROUSEL, aVar.f126794a.b(), hashMap, null, null, false);
            aVar.f126798e.d(Navigation.r0((ScreenLocation) d3.f50666a.getValue(), aVar.f126794a));
        }
    }

    public static void i(PinMiniCellView this$0, View.OnClickListener onClickListener, gm1.c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof f) {
            this$0.setOnClickListener(onClickListener);
        }
    }

    public static void j(PinMiniCellView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vw0.a aVar = this$0.f46768n;
        if (aVar != null) {
            Intrinsics.f(view);
            aVar.f126798e.d(new q(view, aVar.f126794a));
        }
    }

    public static void k(PinMiniCellView this$0, View.OnClickListener onClickListener, gm1.c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onClickListener, "$onClickListener");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof f) {
            this$0.setOnClickListener(onClickListener);
        }
    }

    public final void l(String str) {
        boolean z13 = str == null || str.length() == 0;
        setClipChildren(z13);
        this.f46763i.i(new t4(!z13, str, 16));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        vh vhVar;
        vw0.a aVar = this.f46768n;
        if (aVar == null || aVar.f126796c == null || a0.x0(aVar.f126794a.b()) || (vhVar = aVar.f126795b) == null || vhVar.f42843a == null) {
            return null;
        }
        z1 source = aVar.f126796c;
        Intrinsics.checkNotNullParameter(source, "source");
        Long l13 = source.f67478a;
        ((g) aVar.f126800g).getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000000);
        String b13 = aVar.f126794a.b();
        f30 f30Var = aVar.f126794a;
        aVar.f126801h.getClass();
        z1 z1Var = new z1(l13, source.f67480b, b13, source.f67484d, valueOf, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, vhVar.f42843a, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, d1.a(f30Var), source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
        aVar.f126796c = null;
        aVar.f126799f.getClass();
        return z1Var;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        vw0.a aVar = this.f46768n;
        if (aVar == null) {
            return null;
        }
        z1 z1Var = aVar.f126796c;
        if (z1Var != null) {
            return z1Var;
        }
        ((g) aVar.f126800g).getClass();
        aVar.f126796c = new z1(null, Long.valueOf(System.currentTimeMillis() * 1000000), null, null, null, null, null, null, null, h2.STORY_CAROUSEL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        aVar.f126799f.getClass();
        return aVar.f126796c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ww0.b] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View$OnClickListener, ww0.c] */
    public PinMiniCellView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i13 = 1;
        this.f46769o = new View.OnLongClickListener(this) { // from class: ww0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131188b;

            {
                this.f131188b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i13;
                PinMiniCellView.j(this.f131188b, view);
                return true;
            }
        };
        View.inflate(getContext(), az1.b.view_pin_mini_cell, this);
        setOrientation(1);
        final ?? r43 = new View.OnClickListener(this) { // from class: ww0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131190b;

            {
                this.f131190b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                PinMiniCellView.g(this.f131190b);
            }
        };
        View findViewById = findViewById(az1.a.image);
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) findViewById;
        roundedCornersImageView.setOnClickListener(r43);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46759e = roundedCornersImageView;
        final int i14 = 3;
        this.f46760f = ((GestaltText) findViewById(az1.a.price_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i14;
                View.OnClickListener onClickListener = r43;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        final int i15 = 4;
        this.f46761g = ((GestaltText) findViewById(az1.a.availability_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i15;
                View.OnClickListener onClickListener = r43;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        final int i16 = 5;
        this.f46762h = ((GestaltText) findViewById(az1.a.title_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i16;
                View.OnClickListener onClickListener = r43;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        View findViewById2 = findViewById(az1.a.badge_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46763i = (GestaltText) findViewById2;
        View findViewById3 = findViewById(az1.a.type_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46764j = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(az1.a.identifier_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46765k = (GestaltText) findViewById4;
        setLayoutParams(new RecyclerView.LayoutParams(roundedCornersImageView.L, -2));
        String string = getResources().getString(c.product_in_stock);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f46766l = string;
        String string2 = getResources().getString(c.product_out_of_stock);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f46767m = string2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ww0.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View$OnClickListener, ww0.c] */
    public PinMiniCellView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        final int i14 = 0;
        this.f46769o = new View.OnLongClickListener(this) { // from class: ww0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131188b;

            {
                this.f131188b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i142 = i14;
                PinMiniCellView.j(this.f131188b, view);
                return true;
            }
        };
        View.inflate(getContext(), az1.b.view_pin_mini_cell, this);
        final int i15 = 1;
        setOrientation(1);
        final ?? r63 = new View.OnClickListener(this) { // from class: ww0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131190b;

            {
                this.f131190b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                PinMiniCellView.g(this.f131190b);
            }
        };
        View findViewById = findViewById(az1.a.image);
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) findViewById;
        roundedCornersImageView.setOnClickListener(r63);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f46759e = roundedCornersImageView;
        this.f46760f = ((GestaltText) findViewById(az1.a.price_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i14;
                View.OnClickListener onClickListener = r63;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        this.f46761g = ((GestaltText) findViewById(az1.a.availability_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i15;
                View.OnClickListener onClickListener = r63;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f46762h = ((GestaltText) findViewById(az1.a.title_tv)).j(new gm1.a(this) { // from class: ww0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinMiniCellView f131192b;

            {
                this.f131192b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i152 = i16;
                View.OnClickListener onClickListener = r63;
                PinMiniCellView pinMiniCellView = this.f131192b;
                switch (i152) {
                    case 0:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 1:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 2:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 3:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 4:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 5:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 6:
                        PinMiniCellView.k(pinMiniCellView, onClickListener, cVar);
                        break;
                    case 7:
                        PinMiniCellView.i(pinMiniCellView, onClickListener, cVar);
                        break;
                    default:
                        PinMiniCellView.e(pinMiniCellView, onClickListener, cVar);
                        break;
                }
            }
        });
        View findViewById2 = findViewById(az1.a.badge_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46763i = (GestaltText) findViewById2;
        View findViewById3 = findViewById(az1.a.type_identifier);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46764j = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(az1.a.identifier_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f46765k = (GestaltText) findViewById4;
        setLayoutParams(new RecyclerView.LayoutParams(roundedCornersImageView.L, -2));
        String string = getResources().getString(c.product_in_stock);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f46766l = string;
        String string2 = getResources().getString(c.product_out_of_stock);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f46767m = string2;
    }
}
