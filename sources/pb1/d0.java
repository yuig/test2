package pb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpb1/d0;", "Lpb1/m;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d0 extends y {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f99448o0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f99449l0 = d4.SETTINGS;

    /* renamed from: m0, reason: collision with root package name */
    public final a4 f99450m0 = a4.PARENTAL_PASSCODE_SETTINGS;

    /* renamed from: n0, reason: collision with root package name */
    public final m1 f99451n0;

    public d0() {
        int i13 = 6;
        xk2.k r13 = d7.g.r(10, new t0(this, i13), xk2.n.NONE);
        int i14 = 7;
        this.f99451n0 = a1.s(this, k0.f80436a.b(f0.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
    }

    public final f0 a8() {
        return (f0) this.f99451n0.getValue();
    }

    @Override // pb1.m, nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        super.getF103154e0();
        kh2.j.x2(a8(), b.f99441a);
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.f99450m0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f99449l0;
    }

    @Override // pb1.m, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_PASSCODE_MODE") : null;
        com.pinterest.feature.settings.passcode.d dVar = i03 instanceof com.pinterest.feature.settings.passcode.d ? (com.pinterest.feature.settings.passcode.d) i03 : null;
        if (dVar == null) {
            dVar = com.pinterest.feature.settings.passcode.d.VERIFY;
        }
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.X = dVar;
        a8().h(this.X, this.f99449l0, this.f99450m0);
        return onCreateView;
    }

    @Override // pb1.m, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltText gestaltText = this.Z;
        if (gestaltText == null) {
            Intrinsics.r("passcodeSubtitle");
            throw null;
        }
        final int i13 = 0;
        gestaltText.j(new gm1.a(this) { // from class: pb1.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f99498b;

            {
                this.f99498b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                d0 this$0 = this.f99498b;
                switch (i14) {
                    case 0:
                        int i15 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.a8(), c.f99444a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            kh2.j.x2(this$0.a8(), new d(((xn1.i) it).f135454c));
                            break;
                        }
                        break;
                    default:
                        int i17 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            View view = this$0.getView();
                            if (view != null) {
                                hf0.b.k(view);
                            }
                            kh2.j.x2(this$0.a8(), new f(this$0.V7().B0()));
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        V7().Z(new gm1.a(this) { // from class: pb1.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f99498b;

            {
                this.f99498b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                d0 this$0 = this.f99498b;
                switch (i142) {
                    case 0:
                        int i15 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.a8(), c.f99444a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            kh2.j.x2(this$0.a8(), new d(((xn1.i) it).f135454c));
                            break;
                        }
                        break;
                    default:
                        int i17 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            View view = this$0.getView();
                            if (view != null) {
                                hf0.b.k(view);
                            }
                            kh2.j.x2(this$0.a8(), new f(this$0.V7().B0()));
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton = this.f99467a0;
        if (gestaltButton == null) {
            Intrinsics.r("setPasscodeButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: pb1.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f99498b;

            {
                this.f99498b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                d0 this$0 = this.f99498b;
                switch (i142) {
                    case 0:
                        int i152 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            kh2.j.x2(this$0.a8(), c.f99444a);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xn1.i) {
                            kh2.j.x2(this$0.a8(), new d(((xn1.i) it).f135454c));
                            break;
                        }
                        break;
                    default:
                        int i17 = d0.f99448o0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            View view = this$0.getView();
                            if (view != null) {
                                hf0.b.k(view);
                            }
                            kh2.j.x2(this$0.a8(), new f(this$0.V7().B0()));
                            break;
                        }
                        break;
                }
            }
        });
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new c0(this, null), 3);
    }
}
