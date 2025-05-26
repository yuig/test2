package rf1;

import android.app.Activity;
import com.pinterest.api.model.al0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.go0;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.f1;
import h32.w0;
import i32.y0;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import sf1.e1;
import sf1.k1;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f107928j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(p0 p0Var, int i13) {
        super(1);
        this.f107927i = i13;
        this.f107928j = p0Var;
    }

    public final void b(f30 f30Var) {
        int i13 = this.f107927i;
        p0 p0Var = this.f107928j;
        switch (i13) {
            case 1:
                Intrinsics.f(f30Var);
                if (p0Var.isBound() && f30Var.O6() == null) {
                    p0Var.f107865t.m(((yk1.a) p0Var.f107827a).f139224a.getString(x0.try_on_product_unavailable));
                    break;
                }
                break;
            case 5:
                e1 e1Var = (e1) ((k1) p0Var.getView());
                e1Var.getClass();
                Activity l03 = bs1.c.l0(e1Var);
                if (l03 != null) {
                    l03.onBackPressed();
                    break;
                }
                break;
            case 10:
                Intrinsics.f(f30Var);
                p0Var.getClass();
                HashMap f13 = z0.f(new Pair(rg0.o.CONTEXT_PIN_ID.getValue(), f30Var.getUid()), new Pair(rg0.o.IS_PROMOTED.getValue(), String.valueOf(f30Var.d5().booleanValue())));
                ((vr0.c) p0Var.f107847k).c(y0.ANDROID_STORY_PIN_CLOSEUP, f13);
                break;
            default:
                Intrinsics.f(f30Var);
                p0Var.e4(f30Var);
                break;
        }
    }

    public final void e(wy0 wy0Var) {
        int i13 = this.f107927i;
        p0 p0Var = this.f107928j;
        switch (i13) {
            case 0:
                wy0 wy0Var2 = p0Var.f107832c0;
                if (wy0Var2 != null) {
                    c0.d.d2(wy0Var2);
                }
                Boolean R2 = wy0Var.R2();
                Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
                R2.getClass();
                break;
            case 4:
                Intrinsics.f(wy0Var);
                p0Var.M3(wy0Var, false);
                break;
            default:
                Intrinsics.f(wy0Var);
                p0Var.M3(wy0Var, true);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dl0 v63;
        boolean d2;
        jo0 jo0Var;
        w0 h03;
        wy0 n13;
        int i13 = this.f107927i;
        Boolean bool = null;
        r2 = null;
        String str = null;
        h32.v0 v0Var = null;
        jo0 jo0Var2 = null;
        bool = null;
        p0 p0Var = this.f107928j;
        switch (i13) {
            case 0:
                e((wy0) obj);
                return Unit.f80348a;
            case 1:
                b((f30) obj);
                return Unit.f80348a;
            case 2:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 2:
                        p0Var.f107849l.q(th3, "Error loading Pin Makeup Data", tb0.p.IDEA_PINS_DISPLAY);
                        break;
                    default:
                        p0Var.getClass();
                        th3.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 3:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 2:
                        p0Var.f107849l.q(th4, "Error loading Pin Makeup Data", tb0.p.IDEA_PINS_DISPLAY);
                        break;
                    default:
                        p0Var.getClass();
                        th4.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 4:
                e((wy0) obj);
                return Unit.f80348a;
            case 5:
                b((f30) obj);
                return Unit.f80348a;
            case 6:
                Intrinsics.f((nk1.h) obj);
                p0Var.u3(p0Var.Z);
                nk1.h hVar = nk1.h.FOLLOWING;
                return Unit.f80348a;
            case 7:
                dl1.v0 v0Var2 = (dl1.v0) obj;
                Intrinsics.f(v0Var2);
                p0Var.getClass();
                f30 f30Var = (f30) v0Var2.f55289a;
                f30 f30Var2 = (f30) v0Var2.f55290b;
                if (!Intrinsics.d(f30Var != null ? f30Var.u6() : null, f30Var2.u6())) {
                    p0Var.e4(f30Var2);
                }
                f30 f30Var3 = p0Var.Z;
                if (f30Var3 == null || (v63 = f30Var3.v6()) == null) {
                    v63 = f30Var != null ? f30Var.v6() : null;
                }
                dl0 v64 = f30Var2.v6();
                f30 f30Var4 = p0Var.Z;
                if (f30Var4 != null) {
                    if (f30Var4 == f30Var2) {
                        f30Var2 = f30Var4;
                    } else {
                        e30 R6 = f30Var4.R6();
                        R6.b(f30Var2);
                        f30Var2 = R6.a();
                    }
                }
                Set set = qf1.p.f103760a;
                List s13 = v64 != null ? v64.s() : null;
                if (((s13 == null || s13.isEmpty()) ^ true) != false && !Intrinsics.d(v63, v64)) {
                    if (v63 != null && v64 != null) {
                        jo0 q13 = v63.q();
                        Boolean o13 = q13 != null ? q13.o() : null;
                        jo0 q14 = v64.q();
                        if (Intrinsics.d(o13, q14 != null ? q14.o() : null)) {
                            d2 = Intrinsics.d(v63, v64);
                        } else {
                            jo0 q15 = v63.q();
                            if (q15 != null) {
                                go0 t13 = q15.t();
                                t13.f38102e = Boolean.TRUE;
                                boolean[] zArr = t13.f38108k;
                                if (zArr.length > 4) {
                                    zArr[4] = true;
                                }
                                jo0Var = t13.a();
                            } else {
                                jo0Var = null;
                            }
                            jo0 q16 = v64.q();
                            if (q16 != null) {
                                go0 t14 = q16.t();
                                t14.f38102e = Boolean.TRUE;
                                boolean[] zArr2 = t14.f38108k;
                                if (zArr2.length > 4) {
                                    zArr2[4] = true;
                                }
                                jo0Var2 = t14.a();
                            }
                            al0 w13 = v63.w();
                            w13.f(jo0Var);
                            dl0 a13 = w13.a();
                            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                            al0 w14 = v64.w();
                            w14.f(jo0Var2);
                            dl0 a14 = w14.a();
                            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                            d2 = Intrinsics.d(a13, a14);
                        }
                        bool = Boolean.valueOf(d2);
                    }
                    if (bool == null || !bool.booleanValue()) {
                        p0Var.U3(f30Var2, f30Var2.getUid(), false);
                    }
                }
                p0Var.Z = f30Var2;
                return Unit.f80348a;
            case 8:
                Navigation gotoCloseupOrShowBottomSheet = (Navigation) obj;
                Intrinsics.checkNotNullParameter(gotoCloseupOrShowBottomSheet, "$this$gotoCloseupOrShowBottomSheet");
                gotoCloseupOrShowBottomSheet.z(p0Var.f107842h0, "com.pinterest.EXTRA_STORY_PIN_PAGE_INDEX");
                gotoCloseupOrShowBottomSheet.Y1("com.pinterest.EXTRA_STORY_PIN_PAGE_IS_AD", c0.d.Z1(p0Var.Z, p0Var.B));
                h32.i0 p13 = p0Var.getPinalytics().p();
                if ((p13 != null ? p13.f67084d : null) == h32.g0.PIN_IDEA_STREAM) {
                    gotoCloseupOrShowBottomSheet.m0("IDEA_STREAM_EXTRAS_KEY_COMPONENT_TYPE", "MODULE_IDEA_STREAM");
                    a4 a4Var = p13.f67082b;
                    gotoCloseupOrShowBottomSheet.m0("IDEA_STREAM_EXTRAS_KEY_VIEW_PARAMETER_TYPE", a4Var != null ? a4Var.name() : null);
                    gotoCloseupOrShowBottomSheet.m0("IDEA_STREAM_EXTRAS_KEY_VIEW_TYPE", "MODAL_MORE_DETAILS");
                    bz.g gVar = p0Var.f107839g.f24184b;
                    gotoCloseupOrShowBottomSheet.m0("IDEA_STREAM_EXTRAS_KEY_PARENT_PAIR_ID", gVar != null ? gVar.f24166a : null);
                }
                return Unit.f80348a;
            case 9:
                h32.u0 elementType = (h32.u0) obj;
                Intrinsics.checkNotNullParameter(elementType, "elementType");
                nx.d0 pinalytics = p0Var.getPinalytics();
                h32.g0 B3 = p0Var.B3();
                HashMap H4 = p0Var.H4();
                String F3 = p0Var.F3(p0Var.Z);
                if (F3 != null) {
                    v0Var = new h32.v0();
                    v0Var.G = F3;
                }
                h03 = pinalytics.h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : B3, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : H4, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return h03;
            case 10:
                b((f30) obj);
                return Unit.f80348a;
            case 11:
                b((f30) obj);
                return Unit.f80348a;
            case 12:
                wy0 creator = (wy0) obj;
                Intrinsics.checkNotNullParameter(creator, "creator");
                String uid = creator.getUid();
                f30 f30Var5 = p0Var.Z;
                if (f30Var5 != null && (n13 = b40.n(f30Var5)) != null) {
                    str = n13.getUid();
                }
                return Boolean.valueOf(Intrinsics.d(uid, str));
            default:
                e((wy0) obj);
                return Unit.f80348a;
        }
    }
}
