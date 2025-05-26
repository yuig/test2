package jh1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import ca1.m;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import java.io.Serializable;
import kh2.a1;
import kh2.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import xk2.k;
import xk2.n;
import xn1.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljh1/f;", "Lpb1/m;", "<init>", "()V", "g4/u", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f76229p0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f76230l0 = d4.SETTINGS;

    /* renamed from: m0, reason: collision with root package name */
    public final a4 f76231m0 = a4.USER_ACTIVITY;

    /* renamed from: n0, reason: collision with root package name */
    public rr1.h f76232n0;

    /* renamed from: o0, reason: collision with root package name */
    public final m1 f76233o0;

    public f() {
        int i13 = 14;
        k r13 = d7.g.r(18, new t0(this, i13), n.NONE);
        int i14 = 15;
        this.f76233o0 = a1.s(this, k0.f80436a.b(h.class), new u0(r13, i13), new m(r13, i14), new ca1.n(this, r13, i14));
    }

    public final h a8() {
        return (h) this.f76233o0.getValue();
    }

    @Override // pb1.m, nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        super.getF103154e0();
        j.x2(a8(), pb1.b.f99441a);
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.f76231m0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF91831t0() {
        return this.f76230l0;
    }

    @Override // pb1.m, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        com.pinterest.feature.settings.passcode.d dVar = com.pinterest.feature.settings.passcode.d.RESET_PASSWORD;
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.X = dVar;
        Serializable V = com.bumptech.glide.d.V(this, "EXTRA_RESET_PASSWORD_DATA", new rr1.h(z0.d()));
        Intrinsics.g(V, "null cannot be cast to non-null type com.pinterest.identity.core.password.ResetPasswordWithPasscodeData");
        this.f76232n0 = (rr1.h) V;
        a8().h(this.X, this.f76230l0, this.f76231m0);
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
        gestaltText.j(new gm1.a(this) { // from class: jh1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f76222b;

            {
                this.f76222b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                f this$0 = this.f76222b;
                switch (i14) {
                    case 0:
                        int i15 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            j.x2(this$0.a8(), pb1.c.f99444a);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof i) {
                            j.x2(this$0.a8(), new pb1.d(((i) it).f135454c));
                            return;
                        } else {
                            if (it instanceof xn1.f) {
                                if (((xn1.f) it).f135448c) {
                                    hf0.b.s(this$0.V7());
                                    return;
                                } else {
                                    hf0.b.k(this$0.V7());
                                    return;
                                }
                            }
                            return;
                        }
                    default:
                        int i17 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            rr1.h hVar = this$0.f76232n0;
                            if (hVar == null) {
                                Intrinsics.r("resetPasswordData");
                                throw null;
                            }
                            j.x2(this$0.a8(), new pb1.g(z0.j(hVar.f109944a, y0.b(new Pair("passcode", this$0.V7().B0())))));
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 1;
        V7().Z(new gm1.a(this) { // from class: jh1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f76222b;

            {
                this.f76222b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                f this$0 = this.f76222b;
                switch (i142) {
                    case 0:
                        int i15 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            j.x2(this$0.a8(), pb1.c.f99444a);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof i) {
                            j.x2(this$0.a8(), new pb1.d(((i) it).f135454c));
                            return;
                        } else {
                            if (it instanceof xn1.f) {
                                if (((xn1.f) it).f135448c) {
                                    hf0.b.s(this$0.V7());
                                    return;
                                } else {
                                    hf0.b.k(this$0.V7());
                                    return;
                                }
                            }
                            return;
                        }
                    default:
                        int i17 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            rr1.h hVar = this$0.f76232n0;
                            if (hVar == null) {
                                Intrinsics.r("resetPasswordData");
                                throw null;
                            }
                            j.x2(this$0.a8(), new pb1.g(z0.j(hVar.f109944a, y0.b(new Pair("passcode", this$0.V7().B0())))));
                            return;
                        }
                        return;
                }
            }
        });
        GestaltButton gestaltButton = this.f99467a0;
        if (gestaltButton == null) {
            Intrinsics.r("setPasscodeButton");
            throw null;
        }
        final int i15 = 2;
        gestaltButton.e(new gm1.a(this) { // from class: jh1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f76222b;

            {
                this.f76222b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                f this$0 = this.f76222b;
                switch (i142) {
                    case 0:
                        int i152 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            j.x2(this$0.a8(), pb1.c.f99444a);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof i) {
                            j.x2(this$0.a8(), new pb1.d(((i) it).f135454c));
                            return;
                        } else {
                            if (it instanceof xn1.f) {
                                if (((xn1.f) it).f135448c) {
                                    hf0.b.s(this$0.V7());
                                    return;
                                } else {
                                    hf0.b.k(this$0.V7());
                                    return;
                                }
                            }
                            return;
                        }
                    default:
                        int i17 = f.f76229p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof xl1.a) {
                            rr1.h hVar = this$0.f76232n0;
                            if (hVar == null) {
                                Intrinsics.r("resetPasswordData");
                                throw null;
                            }
                            j.x2(this$0.a8(), new pb1.g(z0.j(hVar.f109944a, y0.b(new Pair("passcode", this$0.V7().B0())))));
                            return;
                        }
                        return;
                }
            }
        });
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new e(this, null), 3);
    }
}
