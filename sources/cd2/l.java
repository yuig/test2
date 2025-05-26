package cd2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcd2/l;", "Lcom/pinterest/widget/configuration/a;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends a {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f27564f0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f27565d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f27566e0;

    public l() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(24, new c0(this, 9)));
        int i13 = 7;
        this.f27565d0 = a1.s(this, k0.f80436a.b(p.class), new s52.m(a13, 6), new t02.h(a13, i13), new t02.i(this, a13, i13));
        this.f27566e0 = d4.ANDROID_WIDGET;
    }

    @Override // com.pinterest.widget.configuration.a, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.f27566e0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = xc2.f.fragment_widget_content_selection;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ((p) this.f27565d0.getValue()).h(V7());
        final int i13 = 0;
        ((GestaltIconButton) v13.findViewById(xc2.e.configuration_nav_icon)).u(new gm1.a(this) { // from class: cd2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f27557b;

            {
                this.f27557b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                l this$0 = this.f27557b;
                switch (i14) {
                    case 0:
                        int i15 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), e.f27554a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), d.f27553a);
                            break;
                        }
                        break;
                    default:
                        int i17 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), c.f27552a);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltText) v13.findViewById(xc2.e.content_selection_home_feed)).j(new gm1.a(this) { // from class: cd2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f27557b;

            {
                this.f27557b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                l this$0 = this.f27557b;
                switch (i142) {
                    case 0:
                        int i15 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), e.f27554a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), d.f27553a);
                            break;
                        }
                        break;
                    default:
                        int i17 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), c.f27552a);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        ((GestaltText) v13.findViewById(xc2.e.content_selection_board)).j(new gm1.a(this) { // from class: cd2.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f27557b;

            {
                this.f27557b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                l this$0 = this.f27557b;
                switch (i142) {
                    case 0:
                        int i152 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), e.f27554a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), d.f27553a);
                            break;
                        }
                        break;
                    default:
                        int i17 = l.f27564f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2((p) this$0.f27565d0.getValue(), c.f27552a);
                            break;
                        }
                        break;
                }
            }
        });
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }
}
