package gy0;

import com.pinterest.api.model.wy0;
import ek2.f;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.i0;
import h32.u0;
import hk2.u;
import i92.k;
import jv1.h;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import uj2.q;
import uk1.d;
import x02.x2;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f66326a;

    /* renamed from: b, reason: collision with root package name */
    public final k f66327b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f66328c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d pinalytics, q networkStateStream, x2 userRepository, k toastUtils, b60.b activeUserManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f66326a = userRepository;
        this.f66327b = toastUtils;
        this.f66328c = activeUserManager;
        this.f66329d = lp1.a.NUX.getValue();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        fy0.a view = (fy0.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((hy0.d) view).f70587k0 = this;
    }

    public final void p3(String genderValue, String str) {
        Intrinsics.checkNotNullParameter(genderValue, "genderValue");
        getPinalytics().U(new i0(d4.ORIENTATION, a4.ORIENTATION_GENDER_STEP, null, null, null, u0.GENDER_BUTTON), f1.TAP, null, null, null, false);
        String obj = str != null ? StringsKt.i0(str).toString() : null;
        wy0 f13 = ((b60.d) this.f66328c).f();
        if (f13 != null) {
            boolean d2 = Intrinsics.d(genderValue, "female");
            x2 x2Var = this.f66326a;
            String str2 = this.f66329d;
            if (d2 || Intrinsics.d(genderValue, "male")) {
                u j03 = x2Var.j0(f13, z0.g(new Pair("surface_tag", str2), new Pair(bd1.b.GENDER_FIELD.getValue(), genderValue)));
                final int i13 = 0;
                f i14 = j03.i(new ak2.a(this) { // from class: gy0.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c f66322b;

                    {
                        this.f66322b = this;
                    }

                    @Override // ak2.a
                    public final void run() {
                        int i15 = i13;
                        c this$0 = this.f66322b;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getPinalytics().U(new i0(d4.ORIENTATION, a4.ORIENTATION_GENDER_STEP, null, null, null, null), f1.NUX_STEP_END, null, null, null, false);
                                iy0.a aVar = ((hy0.d) ((fy0.a) this$0.getView())).f70586j0;
                                if (aVar != null) {
                                    iy0.a.c(aVar, null, null, null, 7);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.getPinalytics().U(new i0(d4.ORIENTATION, a4.ORIENTATION_GENDER_STEP, null, null, null, null), f1.NUX_STEP_END, null, null, null, false);
                                iy0.a aVar2 = ((hy0.d) ((fy0.a) this$0.getView())).f70586j0;
                                if (aVar2 != null) {
                                    iy0.a.c(aVar2, null, null, null, 7);
                                    break;
                                }
                                break;
                        }
                    }
                }, new hx0.a(16, b.f66323j));
                Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
                addDisposable(i14);
                return;
            }
            Regex regex = new Regex("^[\\p{L}\\p{M} -]+$");
            if (obj != null) {
                final int i15 = 1;
                if (regex.e(obj)) {
                    f i16 = x2Var.j0(f13, z0.g(new Pair("surface_tag", str2), new Pair(bd1.b.GENDER_FIELD.getValue(), genderValue), new Pair(bd1.b.CUSTOM_GENDER_FIELD.getValue(), obj))).i(new ak2.a(this) { // from class: gy0.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f66322b;

                        {
                            this.f66322b = this;
                        }

                        @Override // ak2.a
                        public final void run() {
                            int i152 = i15;
                            c this$0 = this.f66322b;
                            switch (i152) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.getPinalytics().U(new i0(d4.ORIENTATION, a4.ORIENTATION_GENDER_STEP, null, null, null, null), f1.NUX_STEP_END, null, null, null, false);
                                    iy0.a aVar = ((hy0.d) ((fy0.a) this$0.getView())).f70586j0;
                                    if (aVar != null) {
                                        iy0.a.c(aVar, null, null, null, 7);
                                        break;
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.getPinalytics().U(new i0(d4.ORIENTATION, a4.ORIENTATION_GENDER_STEP, null, null, null, null), f1.NUX_STEP_END, null, null, null, false);
                                    iy0.a aVar2 = ((hy0.d) ((fy0.a) this$0.getView())).f70586j0;
                                    if (aVar2 != null) {
                                        iy0.a.c(aVar2, null, null, null, 7);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, new hx0.a(17, b.f66324k));
                    Intrinsics.checkNotNullExpressionValue(i16, "subscribe(...)");
                    addDisposable(i16);
                    return;
                }
            }
            this.f66327b.h(h.specified_gender_contains_special_character);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        fy0.a view = (fy0.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        ((hy0.d) view).f70587k0 = this;
    }
}
