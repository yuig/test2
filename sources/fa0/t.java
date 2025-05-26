package fa0;

import a.sc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.x3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.a1;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfa0/t;", "Lo82/v2;", "<init>", "()V", "remix_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends d {
    public static final /* synthetic */ int V0 = 0;
    public k11.p L0;
    public e02.a M0;
    public il1.a N0;
    public GestaltButton O0;
    public FullBleedGestaltSpinner P0;
    public final m1 Q0;
    public final xk2.v R0;
    public final LinkedHashMap S0;
    public zy.a0 T0;
    public final d4 U0;

    public t() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(2, new q1(this, 25)));
        int i13 = 24;
        this.Q0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(k0.class), new mq.e0(a13, i13), new mq.f0(null, a13, i13), new mq.g0(this, a13, i13));
        this.R0 = xk2.m.b(new o(this, 0));
        this.S0 = new LinkedHashMap();
        this.T0 = new zy.a0();
        this.U0 = d4.COLLAGE_PREVIEW;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 15);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(k9().c(), 3);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 1000, new o(this, 3), y0.f61544a, new ns.i(4), new sc(28), k9(), 32);
    }

    @Override // o82.v2
    public final int a9() {
        return 0;
    }

    @Override // o82.v2
    public final int d9() {
        return 0;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.T0.e();
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 2;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.T0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF98644f0() {
        return this.U0;
    }

    public final k0 k9() {
        return (k0) this.Q0.getValue();
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(k9().c(), 4);
    }

    public final String l9(String str, String str2) {
        String Z = com.bumptech.glide.d.Z(this, str, "");
        if (!kotlin.text.z.j(Z)) {
            return Z;
        }
        throw new IllegalArgumentException(str2.toString());
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(ea0.j.fragment_remix_closeup, ea0.i.remix_closeup_content);
        eVar.f979c = ea0.i.remix_closeup_empty_state_container;
        return eVar;
    }

    public final void m9(m mVar) {
        kh2.j.x2(k9(), mVar);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9().h(new ra0.c(l9("SOURCE_PIN_ID", "Source Pin ID is required"), l9("SOURCE_SHUFFLE_ID", "Source Shuffle ID is required"), l9("SOURCE_USER_ID", "Source user ID is required")), com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_TEMPLATES", false), (h32.i0) this.R0.getValue(), this.T0.f());
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ea0.i.remix_closeup_back_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        Intrinsics.f(gestaltIconButton);
        g3.y(gestaltIconButton, q.f61524j);
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: fa0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f61515b;

            {
                this.f61515b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                t this$0 = this.f61515b;
                switch (i14) {
                    case 0:
                        int i15 = t.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.m9(a.f61474a);
                            break;
                        }
                        break;
                    default:
                        int i16 = t.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            this$0.m9(k.f61498a);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(ea0.i.remix_closeup_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        Intrinsics.f(gestaltButton);
        bs1.c.s(gestaltButton, new p90.n0(this, 17));
        final int i14 = 1;
        gestaltButton.e(new gm1.a(this) { // from class: fa0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f61515b;

            {
                this.f61515b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                t this$0 = this.f61515b;
                switch (i142) {
                    case 0:
                        int i15 = t.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.m9(a.f61474a);
                            break;
                        }
                        break;
                    default:
                        int i16 = t.V0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            this$0.m9(k.f61498a);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.O0 = gestaltButton;
        View findViewById3 = onCreateView.findViewById(ea0.i.remix_closeup_progress_overlay);
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById3;
        fullBleedGestaltSpinner.showLoadingSpinner(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.P0 = fullBleedGestaltSpinner;
        return onCreateView;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        RecyclerView g83;
        e5.d c13;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(bs1.c.X(this, eo1.c.bottom_nav_height));
        List b13 = kotlin.collections.e0.b(1000);
        RecyclerView g84 = g8();
        if (g84 != null && (c13 = g84.f19220c.c()) != null) {
            Iterator it = b13.iterator();
            while (it.hasNext()) {
                c13.h(((Number) it.next()).intValue());
            }
        }
        if (!b13.isEmpty() && (g83 = g8()) != null) {
            g83.f19220c.f19609h = new p90.r(1, this, b13);
        }
        kh2.b0.D1(this, new s(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        String l93 = l9("SOURCE_PIN_ID", "Source Pin ID is required");
        if (!kotlin.text.z.j(l93)) {
            return l93;
        }
        x3 x3Var = this.T0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
