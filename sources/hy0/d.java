package hy0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import dv0.n;
import h32.a4;
import h32.d4;
import jv1.f;
import jv1.h;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.x0;
import pk.a0;
import so.q0;
import xn1.i;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhy0/d;", "Lyk1/k;", "Lfy0/a;", "<init>", "()V", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends a implements fy0.a {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f70585s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public iy0.a f70586j0;

    /* renamed from: k0, reason: collision with root package name */
    public fy0.b f70587k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltButton f70588l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltTextField f70589m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltButton f70590n0;

    /* renamed from: o0, reason: collision with root package name */
    public q0 f70591o0;

    /* renamed from: p0, reason: collision with root package name */
    public uk1.e f70592p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f70593q0 = d4.ORIENTATION;

    /* renamed from: r0, reason: collision with root package name */
    public final a4 f70594r0 = a4.ORIENTATION_GENDER_STEP;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(h.whats_your_gender);
        gestaltToolbarImpl.C();
        gestaltToolbarImpl.I();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.E();
    }

    @Override // yk1.k
    public final m V7() {
        q0 q0Var = this.f70591o0;
        if (q0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f70592p0;
        if (eVar != null) {
            return q0Var.a(((uk1.a) eVar).f(s7(), ""), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getI0() {
        return this.f70594r0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f70593q0;
    }

    @Override // hy0.a, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 k03 = bs1.c.k0(context);
        if (k03 instanceof iy0.a) {
            this.f70586j0 = (iy0.a) k03;
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = f.fragment_modern_nux_gender;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(jv1.d.gender_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        if (gestaltText != null) {
            a0.o(gestaltText, x0.signup_nux_signal_value_prop, new Object[0]);
            return onCreateView;
        }
        Intrinsics.r("subtitleTextView");
        throw null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(jv1.d.specify_gender_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f70589m0 = (GestaltTextField) findViewById;
        View findViewById2 = v13.findViewById(jv1.d.done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f70590n0 = (GestaltButton) findViewById2;
        final int i13 = 0;
        a0.v1(((GestaltButton) v13.findViewById(jv1.d.gender_female_button)).e(new gm1.a(this) { // from class: hy0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f70580b;

            {
                this.f70580b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                d this$0 = this.f70580b;
                switch (i14) {
                    case 0:
                        int i15 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar = this$0.f70587k0;
                        if (bVar != null) {
                            ((gy0.c) bVar).p3("female", null);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar2 = this$0.f70587k0;
                        if (bVar2 != null) {
                            ((gy0.c) bVar2).p3("male", null);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        GestaltButton gestaltButton = this$0.f70588l0;
                        if (gestaltButton == null) {
                            Intrinsics.r("customGenderButton");
                            throw null;
                        }
                        gestaltButton.d(c.f70582k);
                        GestaltTextField gestaltTextField = this$0.f70589m0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        gestaltTextField.X(c.f70583l);
                        GestaltTextField gestaltTextField2 = this$0.f70589m0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        Editable z03 = gestaltTextField2.z0();
                        Intrinsics.f(z03);
                        boolean j13 = z.j(z03);
                        GestaltButton gestaltButton2 = this$0.f70590n0;
                        if (gestaltButton2 == null) {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                        gestaltButton2.d(new n(j13, 11));
                        GestaltButton gestaltButton3 = this$0.f70590n0;
                        if (gestaltButton3 != null) {
                            a0.v1(gestaltButton3);
                            return;
                        } else {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                    case 3:
                        int i18 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar3 = this$0.f70587k0;
                        if (bVar3 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f70589m0;
                            if (gestaltTextField3 == null) {
                                Intrinsics.r("specifyGenderTextField");
                                throw null;
                            }
                            ((gy0.c) bVar3).p3("unspecified", String.valueOf(gestaltTextField3.z0()));
                            return;
                        }
                        return;
                    default:
                        int i19 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof i) {
                            boolean j14 = z.j(((i) it).f135454c);
                            GestaltButton gestaltButton4 = this$0.f70590n0;
                            if (gestaltButton4 != null) {
                                gestaltButton4.d(new n(j14, 11));
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }));
        final int i14 = 1;
        a0.v1(((GestaltButton) v13.findViewById(jv1.d.gender_male_button)).e(new gm1.a(this) { // from class: hy0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f70580b;

            {
                this.f70580b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                d this$0 = this.f70580b;
                switch (i142) {
                    case 0:
                        int i15 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar = this$0.f70587k0;
                        if (bVar != null) {
                            ((gy0.c) bVar).p3("female", null);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar2 = this$0.f70587k0;
                        if (bVar2 != null) {
                            ((gy0.c) bVar2).p3("male", null);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        GestaltButton gestaltButton = this$0.f70588l0;
                        if (gestaltButton == null) {
                            Intrinsics.r("customGenderButton");
                            throw null;
                        }
                        gestaltButton.d(c.f70582k);
                        GestaltTextField gestaltTextField = this$0.f70589m0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        gestaltTextField.X(c.f70583l);
                        GestaltTextField gestaltTextField2 = this$0.f70589m0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        Editable z03 = gestaltTextField2.z0();
                        Intrinsics.f(z03);
                        boolean j13 = z.j(z03);
                        GestaltButton gestaltButton2 = this$0.f70590n0;
                        if (gestaltButton2 == null) {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                        gestaltButton2.d(new n(j13, 11));
                        GestaltButton gestaltButton3 = this$0.f70590n0;
                        if (gestaltButton3 != null) {
                            a0.v1(gestaltButton3);
                            return;
                        } else {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                    case 3:
                        int i18 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar3 = this$0.f70587k0;
                        if (bVar3 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f70589m0;
                            if (gestaltTextField3 == null) {
                                Intrinsics.r("specifyGenderTextField");
                                throw null;
                            }
                            ((gy0.c) bVar3).p3("unspecified", String.valueOf(gestaltTextField3.z0()));
                            return;
                        }
                        return;
                    default:
                        int i19 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof i) {
                            boolean j14 = z.j(((i) it).f135454c);
                            GestaltButton gestaltButton4 = this$0.f70590n0;
                            if (gestaltButton4 != null) {
                                gestaltButton4.d(new n(j14, 11));
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }));
        final int i15 = 2;
        this.f70588l0 = a0.v1(((GestaltButton) v13.findViewById(jv1.d.gender_custom_button)).e(new gm1.a(this) { // from class: hy0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f70580b;

            {
                this.f70580b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                d this$0 = this.f70580b;
                switch (i142) {
                    case 0:
                        int i152 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar = this$0.f70587k0;
                        if (bVar != null) {
                            ((gy0.c) bVar).p3("female", null);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar2 = this$0.f70587k0;
                        if (bVar2 != null) {
                            ((gy0.c) bVar2).p3("male", null);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        GestaltButton gestaltButton = this$0.f70588l0;
                        if (gestaltButton == null) {
                            Intrinsics.r("customGenderButton");
                            throw null;
                        }
                        gestaltButton.d(c.f70582k);
                        GestaltTextField gestaltTextField = this$0.f70589m0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        gestaltTextField.X(c.f70583l);
                        GestaltTextField gestaltTextField2 = this$0.f70589m0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        Editable z03 = gestaltTextField2.z0();
                        Intrinsics.f(z03);
                        boolean j13 = z.j(z03);
                        GestaltButton gestaltButton2 = this$0.f70590n0;
                        if (gestaltButton2 == null) {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                        gestaltButton2.d(new n(j13, 11));
                        GestaltButton gestaltButton3 = this$0.f70590n0;
                        if (gestaltButton3 != null) {
                            a0.v1(gestaltButton3);
                            return;
                        } else {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                    case 3:
                        int i18 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar3 = this$0.f70587k0;
                        if (bVar3 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f70589m0;
                            if (gestaltTextField3 == null) {
                                Intrinsics.r("specifyGenderTextField");
                                throw null;
                            }
                            ((gy0.c) bVar3).p3("unspecified", String.valueOf(gestaltTextField3.z0()));
                            return;
                        }
                        return;
                    default:
                        int i19 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof i) {
                            boolean j14 = z.j(((i) it).f135454c);
                            GestaltButton gestaltButton4 = this$0.f70590n0;
                            if (gestaltButton4 != null) {
                                gestaltButton4.d(new n(j14, 11));
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }));
        GestaltButton gestaltButton = this.f70590n0;
        if (gestaltButton == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        final int i16 = 3;
        gestaltButton.d(c.f70581j).e(new gm1.a(this) { // from class: hy0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f70580b;

            {
                this.f70580b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i16;
                d this$0 = this.f70580b;
                switch (i142) {
                    case 0:
                        int i152 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar = this$0.f70587k0;
                        if (bVar != null) {
                            ((gy0.c) bVar).p3("female", null);
                            return;
                        }
                        return;
                    case 1:
                        int i162 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar2 = this$0.f70587k0;
                        if (bVar2 != null) {
                            ((gy0.c) bVar2).p3("male", null);
                            return;
                        }
                        return;
                    case 2:
                        int i17 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        GestaltButton gestaltButton2 = this$0.f70588l0;
                        if (gestaltButton2 == null) {
                            Intrinsics.r("customGenderButton");
                            throw null;
                        }
                        gestaltButton2.d(c.f70582k);
                        GestaltTextField gestaltTextField = this$0.f70589m0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        gestaltTextField.X(c.f70583l);
                        GestaltTextField gestaltTextField2 = this$0.f70589m0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        Editable z03 = gestaltTextField2.z0();
                        Intrinsics.f(z03);
                        boolean j13 = z.j(z03);
                        GestaltButton gestaltButton22 = this$0.f70590n0;
                        if (gestaltButton22 == null) {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                        gestaltButton22.d(new n(j13, 11));
                        GestaltButton gestaltButton3 = this$0.f70590n0;
                        if (gestaltButton3 != null) {
                            a0.v1(gestaltButton3);
                            return;
                        } else {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                    case 3:
                        int i18 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar3 = this$0.f70587k0;
                        if (bVar3 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f70589m0;
                            if (gestaltTextField3 == null) {
                                Intrinsics.r("specifyGenderTextField");
                                throw null;
                            }
                            ((gy0.c) bVar3).p3("unspecified", String.valueOf(gestaltTextField3.z0()));
                            return;
                        }
                        return;
                    default:
                        int i19 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof i) {
                            boolean j14 = z.j(((i) it).f135454c);
                            GestaltButton gestaltButton4 = this$0.f70590n0;
                            if (gestaltButton4 != null) {
                                gestaltButton4.d(new n(j14, 11));
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField = this.f70589m0;
        if (gestaltTextField == null) {
            Intrinsics.r("specifyGenderTextField");
            throw null;
        }
        final int i17 = 4;
        gestaltTextField.Z(new gm1.a(this) { // from class: hy0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f70580b;

            {
                this.f70580b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i17;
                d this$0 = this.f70580b;
                switch (i142) {
                    case 0:
                        int i152 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar = this$0.f70587k0;
                        if (bVar != null) {
                            ((gy0.c) bVar).p3("female", null);
                            return;
                        }
                        return;
                    case 1:
                        int i162 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar2 = this$0.f70587k0;
                        if (bVar2 != null) {
                            ((gy0.c) bVar2).p3("male", null);
                            return;
                        }
                        return;
                    case 2:
                        int i172 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        GestaltButton gestaltButton2 = this$0.f70588l0;
                        if (gestaltButton2 == null) {
                            Intrinsics.r("customGenderButton");
                            throw null;
                        }
                        gestaltButton2.d(c.f70582k);
                        GestaltTextField gestaltTextField2 = this$0.f70589m0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        gestaltTextField2.X(c.f70583l);
                        GestaltTextField gestaltTextField22 = this$0.f70589m0;
                        if (gestaltTextField22 == null) {
                            Intrinsics.r("specifyGenderTextField");
                            throw null;
                        }
                        Editable z03 = gestaltTextField22.z0();
                        Intrinsics.f(z03);
                        boolean j13 = z.j(z03);
                        GestaltButton gestaltButton22 = this$0.f70590n0;
                        if (gestaltButton22 == null) {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                        gestaltButton22.d(new n(j13, 11));
                        GestaltButton gestaltButton3 = this$0.f70590n0;
                        if (gestaltButton3 != null) {
                            a0.v1(gestaltButton3);
                            return;
                        } else {
                            Intrinsics.r("doneButton");
                            throw null;
                        }
                    case 3:
                        int i18 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b0.G1(this$0.getView());
                        fy0.b bVar3 = this$0.f70587k0;
                        if (bVar3 != null) {
                            GestaltTextField gestaltTextField3 = this$0.f70589m0;
                            if (gestaltTextField3 == null) {
                                Intrinsics.r("specifyGenderTextField");
                                throw null;
                            }
                            ((gy0.c) bVar3).p3("unspecified", String.valueOf(gestaltTextField3.z0()));
                            return;
                        }
                        return;
                    default:
                        int i19 = d.f70585s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof i) {
                            boolean j14 = z.j(((i) it).f135454c);
                            GestaltButton gestaltButton4 = this$0.f70590n0;
                            if (gestaltButton4 != null) {
                                gestaltButton4.d(new n(j14, 11));
                                return;
                            } else {
                                Intrinsics.r("doneButton");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }
}
