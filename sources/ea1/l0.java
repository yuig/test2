package ea1;

import a.cb;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vs;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rq.t4;

/* loaded from: classes5.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f58077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v0 f58078s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(v0 v0Var, bl2.c cVar) {
        super(2, cVar);
        this.f58078s = v0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        l0 l0Var = new l0(this.f58078s, cVar);
        l0Var.f58077r = obj;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String b13;
        vs p33;
        String g13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f58077r;
        boolean z13 = aVar2.f58011a;
        final v0 v0Var = this.f58078s;
        GestaltSpinner gestaltSpinner = v0Var.f58148h0;
        if (gestaltSpinner == null) {
            Intrinsics.r("spinner");
            throw null;
        }
        kh2.s0.w(gestaltSpinner, new u81.h(z13, 16));
        boolean z14 = aVar2.f58031u;
        Integer num = aVar2.f58030t;
        if (num != null) {
            GestaltText gestaltText = v0Var.f58166z0;
            if (gestaltText == null) {
                Intrinsics.r("instagramApiBannerErrorText");
                throw null;
            }
            gestaltText.i(new q91.h(aVar2, 17));
            if (z14) {
                GestaltIcon gestaltIcon = v0Var.f58165y0;
                if (gestaltIcon == null) {
                    Intrinsics.r("instagramApiBannerIcon");
                    throw null;
                }
                dl2.b.z(gestaltIcon, o0.f58092k);
                ConstraintLayout constraintLayout = v0Var.f58164x0;
                if (constraintLayout == null) {
                    Intrinsics.r("instagramApiBannerContainer");
                    throw null;
                }
                constraintLayout.setBackgroundResource(c52.b.claimed_account_warning);
            }
        }
        ConstraintLayout constraintLayout2 = v0Var.f58149i0;
        if (constraintLayout2 == null) {
            Intrinsics.r("unclaimedView");
            throw null;
        }
        final int i13 = 0;
        wy0 wy0Var = aVar2.f58012b;
        constraintLayout2.setVisibility((wy0Var == null || !Intrinsics.d(wy0Var.C2(), Boolean.FALSE)) ? 8 : 0);
        ScrollView scrollView = v0Var.f58151k0;
        if (scrollView == null) {
            Intrinsics.r("claimedView");
            throw null;
        }
        scrollView.setVisibility((wy0Var == null || !Intrinsics.d(wy0Var.C2(), Boolean.TRUE)) ? 8 : 0);
        ba baVar = aVar2.f58017g;
        boolean z15 = aVar2.f58020j;
        v7 v7Var = aVar2.f58016f;
        String Z7 = v0.Z7(v0Var, z15, baVar, v7Var);
        ConstraintLayout constraintLayout3 = v0Var.f58155o0;
        if (constraintLayout3 == null) {
            Intrinsics.r("boardContainer");
            throw null;
        }
        boolean z16 = aVar2.f58019i;
        constraintLayout3.setVisibility(z16 ? 0 : 8);
        boolean z17 = aVar2.f58023m;
        if (aVar2.f58024n) {
            ViewGroup viewGroup = v0Var.f58156p0;
            if (viewGroup == null) {
                Intrinsics.r("pauseContainer");
                throw null;
            }
            bs1.c.X0(viewGroup);
            ViewGroup viewGroup2 = v0Var.f58158r0;
            if (viewGroup2 == null) {
                Intrinsics.r("autoControlsContainer");
                throw null;
            }
            bs1.c.U1(viewGroup2);
            GestaltListAction gestaltListAction = v0Var.f58159s0;
            if (gestaltListAction == null) {
                Intrinsics.r("autoPublishToggle");
                throw null;
            }
            kg.a.h(gestaltListAction, new t4(Z7, z17, 29));
            GestaltListAction gestaltListAction2 = v0Var.f58160t0;
            if (gestaltListAction2 == null) {
                Intrinsics.r("autoOrgToggle");
                throw null;
            }
            kg.a.h(gestaltListAction2, new k0(Z7, aVar2.f58025o, aVar2.f58026p));
        } else {
            ViewGroup viewGroup3 = v0Var.f58156p0;
            if (viewGroup3 == null) {
                Intrinsics.r("pauseContainer");
                throw null;
            }
            bs1.c.U1(viewGroup3);
            ViewGroup viewGroup4 = v0Var.f58158r0;
            if (viewGroup4 == null) {
                Intrinsics.r("autoControlsContainer");
                throw null;
            }
            bs1.c.X0(viewGroup4);
            GestaltListAction gestaltListAction3 = v0Var.f58157q0;
            if (gestaltListAction3 == null) {
                Intrinsics.r("pauseToggle");
                throw null;
            }
            kg.a.h(gestaltListAction3, new b2.e(z16, v0Var, z17));
        }
        int i14 = 3;
        if (wy0Var != null && (p33 = wy0Var.p3()) != null && (g13 = p33.g()) != null) {
            GestaltListAction gestaltListAction4 = v0Var.f58150j0;
            if (gestaltListAction4 == null) {
                Intrinsics.r("unclaimListAction");
                throw null;
            }
            kg.a.h(gestaltListAction4, new y71.b(11, g13, v0Var));
            gestaltListAction4.Z(new e0(v0Var, i14));
        }
        final int i15 = 1;
        int i16 = 2;
        if (aVar2.f58014d) {
            Context requireContext = v0Var.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            final yb0.n nVar = new yb0.n(requireContext);
            if (i0.f58063a[v0Var.a8().ordinal()] == 1) {
                String string = nVar.getResources().getString(c52.e.disconnect_instagram_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                nVar.w(string);
                nVar.u(nVar.getResources().getString(c52.e.disconnect_instagram_message));
                String string2 = nVar.getContext().getString(c52.e.disconnect_positive);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                nVar.q(string2);
                nVar.f138513j = new View.OnClickListener() { // from class: ea1.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i13;
                        yb0.n alert = nVar;
                        v0 this$0 = v0Var;
                        switch (i17) {
                            case 0:
                                int i18 = v0.F0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(alert, "$alert");
                                kh2.j.x2(this$0.b8(), b0.f58035a);
                                alert.g(yb0.d.CONFIRM_BUTTON_CLICK);
                                break;
                            default:
                                int i19 = v0.F0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(alert, "$alert");
                                kh2.j.x2(this$0.b8(), a0.f58032a);
                                alert.g(yb0.d.CANCEL_BUTTON_CLICK);
                                break;
                        }
                    }
                };
                String string3 = nVar.getContext().getString(m60.x0.cancel);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                nVar.m(string3);
                nVar.f138514k = new View.OnClickListener() { // from class: ea1.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17 = i15;
                        yb0.n alert = nVar;
                        v0 this$0 = v0Var;
                        switch (i17) {
                            case 0:
                                int i18 = v0.F0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(alert, "$alert");
                                kh2.j.x2(this$0.b8(), b0.f58035a);
                                alert.g(yb0.d.CONFIRM_BUTTON_CLICK);
                                break;
                            default:
                                int i19 = v0.F0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(alert, "$alert");
                                kh2.j.x2(this$0.b8(), a0.f58032a);
                                alert.g(yb0.d.CANCEL_BUTTON_CLICK);
                                break;
                        }
                    }
                };
                nVar.f138516m = new p0(v0Var, i16);
                cb.x(nVar, v0Var.f7());
            }
        }
        boolean z18 = aVar2.f58018h;
        if (z18) {
            GestaltListAction gestaltListAction5 = v0Var.B0;
            if (gestaltListAction5 == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction5, o0.f58093l);
            GestaltListAction gestaltListAction6 = v0Var.B0;
            if (gestaltListAction6 == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction6, new r0(aVar2, v0Var, i15));
            String str = aVar2.f58028r;
            if (str != null) {
                GestaltListAction gestaltListAction7 = v0Var.B0;
                if (gestaltListAction7 == null) {
                    Intrinsics.r("boardListAction");
                    throw null;
                }
                kg.a.h(gestaltListAction7, new d91.l(str, 7));
            }
            GestaltText gestaltText2 = v0Var.f58153m0;
            if (gestaltText2 == null) {
                Intrinsics.r("errorMessage");
                throw null;
            }
            gestaltText2.i(new r0(aVar2, v0Var, i16));
            GestaltButton gestaltButton = v0Var.f58154n0;
            if (gestaltButton == null) {
                Intrinsics.r("reconnectButton");
                throw null;
            }
            gestaltButton.d(o0.f58094m);
        } else {
            if (z15) {
                Context requireContext2 = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                int i17 = dl2.b.f1(requireContext2) == g92.d.VR ? sm1.b.ic_vr_history_gestalt : sm1.b.ic_history_gestalt;
                GestaltListAction gestaltListAction8 = v0Var.B0;
                if (gestaltListAction8 == null) {
                    Intrinsics.r("boardListAction");
                    throw null;
                }
                kg.a.h(gestaltListAction8, new q0(v0Var, i17, i13));
            }
            boolean z19 = aVar2.f58021k;
            if (z19) {
                Context requireContext3 = v0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                int i18 = dl2.b.f1(requireContext3) == g92.d.VR ? sm1.b.ic_vr_compact_lock_gestalt : sm1.b.ic_lock_gestalt;
                GestaltListAction gestaltListAction9 = v0Var.B0;
                if (gestaltListAction9 == null) {
                    Intrinsics.r("boardListAction");
                    throw null;
                }
                kg.a.h(gestaltListAction9, new q0(v0Var, i18, 1));
            } else if (v7Var == null || (b13 = v7Var.b1()) == null) {
                GestaltListAction gestaltListAction10 = v0Var.B0;
                if (gestaltListAction10 == null) {
                    Intrinsics.r("boardListAction");
                    throw null;
                }
                kg.a.h(gestaltListAction10, new p0(v0Var, 1));
            } else {
                GestaltListAction gestaltListAction11 = v0Var.B0;
                if (gestaltListAction11 == null) {
                    Intrinsics.r("boardListAction");
                    throw null;
                }
                kg.a.h(gestaltListAction11, new d91.l(b13, 6));
            }
            GestaltListAction gestaltListAction12 = v0Var.B0;
            if (gestaltListAction12 == null) {
                Intrinsics.r("boardListAction");
                throw null;
            }
            kg.a.h(gestaltListAction12, new r0(v0Var, aVar2, i13));
            if (z19 && aVar2.f58022l) {
                LinearLayout linearLayout = v0Var.f58162v0;
                if (linearLayout == null) {
                    Intrinsics.r("privateBoardMessageContainer");
                    throw null;
                }
                linearLayout.setVisibility(0);
            } else {
                LinearLayout linearLayout2 = v0Var.f58162v0;
                if (linearLayout2 == null) {
                    Intrinsics.r("privateBoardMessageContainer");
                    throw null;
                }
                linearLayout2.setVisibility(8);
            }
        }
        Integer num2 = aVar2.f58015e;
        if (num2 != null) {
            GestaltText gestaltText3 = v0Var.f58153m0;
            if (gestaltText3 == null) {
                Intrinsics.r("errorMessage");
                throw null;
            }
            gestaltText3.i(new r0(v0Var, aVar2, 3));
            GestaltButton gestaltButton2 = v0Var.f58154n0;
            if (gestaltButton2 == null) {
                Intrinsics.r("reconnectButton");
                throw null;
            }
            gestaltButton2.d(o0.f58095n);
        }
        if (num == null) {
            ConstraintLayout constraintLayout4 = v0Var.f58152l0;
            if (constraintLayout4 == null) {
                Intrinsics.r("errorContainer");
                throw null;
            }
            if (num2 == null && !z18) {
                i13 = 8;
            }
            constraintLayout4.setVisibility(i13);
            ConstraintLayout constraintLayout5 = v0Var.f58164x0;
            if (constraintLayout5 == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout5.setVisibility(8);
        } else if (!z14) {
            ConstraintLayout constraintLayout6 = v0Var.f58164x0;
            if (constraintLayout6 == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout6.setVisibility(0);
            ConstraintLayout constraintLayout7 = v0Var.f58152l0;
            if (constraintLayout7 == null) {
                Intrinsics.r("errorContainer");
                throw null;
            }
            constraintLayout7.setVisibility(8);
        } else if (num2 != null) {
            ConstraintLayout constraintLayout8 = v0Var.f58152l0;
            if (constraintLayout8 == null) {
                Intrinsics.r("errorContainer");
                throw null;
            }
            constraintLayout8.setVisibility(0);
            ConstraintLayout constraintLayout9 = v0Var.f58164x0;
            if (constraintLayout9 == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout9.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout10 = v0Var.f58152l0;
            if (constraintLayout10 == null) {
                Intrinsics.r("errorContainer");
                throw null;
            }
            constraintLayout10.setVisibility(8);
            ConstraintLayout constraintLayout11 = v0Var.f58164x0;
            if (constraintLayout11 == null) {
                Intrinsics.r("instagramApiBannerContainer");
                throw null;
            }
            constraintLayout11.setVisibility(0);
        }
        return Unit.f80348a;
    }
}
