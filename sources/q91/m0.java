package q91;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import df.j1;
import java.util.ArrayList;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f103145j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(o0 o0Var, int i13) {
        super(1);
        this.f103144i = i13;
        this.f103145j = o0Var;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f103144i;
        o0 o0Var = this.f103145j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a03 = j1.a0(o0Var.getResources().getString(h52.c.yoti_age_collection_warning, o0Var.getResources().getString(h52.c.url_personal_data_adjust)));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, d7.g.q(o0Var.getResources(), h52.c.age_collection_title, "getString(...)"), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Navigation navigation = o0Var.I;
                String str = (String) (navigation != null ? navigation.i0("com.pinterest.EXTRA_MESSAGE_BLOCKING") : null);
                String str2 = true ^ (str == null || str.length() == 0) ? str : null;
                if (str2 == null) {
                    str2 = o0Var.getResources().getString(h52.c.age_collection_usage_disclaimer);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                }
                CharSequence a04 = j1.a0(str2);
                Intrinsics.checkNotNullExpressionValue(a04, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a04), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentActivity E4;
        int i13 = this.f103144i;
        int i14 = 0;
        o0 o0Var = this.f103145j;
        switch (i13) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], o0Var.f103154e0 ? h52.c.age_collection_add_birthdate : m60.x0.update), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                int i15 = o0.f103151s0;
                o0Var.getClass();
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                v.f1 f1Var = networkResponseError != null ? networkResponseError.f45043a : null;
                o0Var.f8(h32.g0.USER_POST_DELETION_PROMPT);
                FragmentActivity E42 = o0Var.E4();
                if (E42 != null) {
                    hf0.b.l(E42);
                }
                ArrayList l13 = kotlin.collections.f0.l(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN));
                if (f1Var != null && f1Var.f123449b == 409) {
                    qz.d M = k3.M(f1Var);
                    Integer valueOf = M != null ? Integer.valueOf(M.f105387g) : null;
                    if (CollectionsKt.L(l13, valueOf) && (E4 = o0Var.E4()) != null && valueOf != null) {
                        int intValue = valueOf.intValue();
                        if (intValue == 117) {
                            o0Var.c8(h52.c.age_collection_account_deactivated, h52.c.age_collection_account_deactivated_description, m60.x0.close_modal, new px0.g((Object) o0Var, (Object) E4, "user_account_deactivated", 7));
                        } else if (intValue == 119) {
                            o0Var.c8(h52.c.age_verification_start_title, h52.c.age_verification_start_description, m60.x0.got_it_simple, new n0(o0Var, 0));
                        } else if (intValue == 122) {
                            GestaltText gestaltText = o0Var.f103162m0;
                            if (gestaltText == null) {
                                Intrinsics.r("birthdayYotiError");
                                throw null;
                            }
                            gestaltText.i(new m0(o0Var, i14));
                            GestaltButton gestaltButton = o0Var.f103164o0;
                            if (gestaltButton == null) {
                                Intrinsics.r("btnUpdate");
                                throw null;
                            }
                            gestaltButton.setEnabled(false);
                        }
                    }
                }
                return Unit.f80348a;
        }
    }
}
