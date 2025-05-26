package zc2;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import r02.c0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzc2/p;", "Lcom/pinterest/widget/configuration/a;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class p extends a {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f141636i0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f141637d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f141638e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f141639f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f141640g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d4 f141641h0;

    public p() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(22, new c0(this, 7)));
        int i13 = 5;
        this.f141637d0 = a1.s(this, k0.f80436a.b(w.class), new s52.m(a13, 4), new t02.h(a13, i13), new t02.i(this, a13, i13));
        this.f141641h0 = d4.ANDROID_WIDGET;
    }

    public final w Z7() {
        return (w) this.f141637d0.getValue();
    }

    @Override // com.pinterest.widget.configuration.a, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f141641h0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = xc2.f.fragment_widget_board_configuration;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Z7().h(V7());
        final int i13 = 0;
        ((GestaltIconButton) v13.findViewById(xc2.e.configuration_nav_icon)).u(new gm1.a(this) { // from class: zc2.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f141627b;

            {
                this.f141627b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar = c.f141619a;
                int i14 = i13;
                p this$0 = this.f141627b;
                switch (i14) {
                    case 0:
                        int i15 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    default:
                        int i17 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), d.f141620a);
                            break;
                        }
                        break;
                }
            }
        });
        ((LinearLayout) v13.findViewById(xc2.e.board_configuration_board)).setOnClickListener(new View.OnClickListener(this) { // from class: zc2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f141629b;

            {
                this.f141629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                p this$0 = this.f141629b;
                switch (i14) {
                    case 0:
                        int i15 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.Z7(), e.f141621a);
                        break;
                    default:
                        int i16 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.Z7(), f.f141622a);
                        break;
                }
            }
        });
        final int i14 = 1;
        ((LinearLayout) v13.findViewById(xc2.e.board_configuration_refresh)).setOnClickListener(new View.OnClickListener(this) { // from class: zc2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f141629b;

            {
                this.f141629b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                p this$0 = this.f141629b;
                switch (i142) {
                    case 0:
                        int i15 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.Z7(), e.f141621a);
                        break;
                    default:
                        int i16 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        kh2.j.x2(this$0.Z7(), f.f141622a);
                        break;
                }
            }
        });
        ((GestaltText) v13.findViewById(xc2.e.cancel_button)).j(new gm1.a(this) { // from class: zc2.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f141627b;

            {
                this.f141627b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar = c.f141619a;
                int i142 = i14;
                p this$0 = this.f141627b;
                switch (i142) {
                    case 0:
                        int i15 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    default:
                        int i17 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), d.f141620a);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById = v13.findViewById(xc2.e.save_button);
        GestaltText gestaltText = (GestaltText) findViewById;
        final int i15 = 2;
        gestaltText.j(new gm1.a(this) { // from class: zc2.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f141627b;

            {
                this.f141627b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                c cVar = c.f141619a;
                int i142 = i15;
                p this$0 = this.f141627b;
                switch (i142) {
                    case 0:
                        int i152 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), cVar);
                            break;
                        }
                        break;
                    default:
                        int i17 = p.f141636i0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.Z7(), d.f141620a);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f141638e0 = gestaltText;
        View findViewById2 = v13.findViewById(xc2.e.board_configuration_board_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f141639f0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(xc2.e.board_configuration_refresh_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f141640g0 = (GestaltText) findViewById3;
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new o(this, null), 3);
    }
}
