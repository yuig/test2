package ob1;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.passcode.f;
import com.pinterest.feature.settings.shared.view.SettingsToggleItemView;
import com.pinterest.gestalt.text.GestaltText;
import i1.h;
import i92.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import n91.z;
import rq.c2;
import rq.y;
import s91.l;
import tb1.j;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93981i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f93982j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i13) {
        super(1);
        this.f93981i = i13;
        this.f93982j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93981i;
        f fVar = this.f93982j;
        switch (i13) {
            case 0:
                ((j) fVar).b8(true);
                return Unit.f80348a;
            case 1:
                wy0 user = (wy0) obj;
                Intrinsics.f(user);
                Boolean F3 = user.F3();
                Intrinsics.checkNotNullExpressionValue(F3, "getIsParentalControlPass…eVerificationPending(...)");
                boolean booleanValue = F3.booleanValue();
                j jVar = (j) fVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                SettingsToggleItemView settingsToggleItemView = jVar.f117162o0;
                if (settingsToggleItemView == null) {
                    Intrinsics.r("toggleItemView");
                    throw null;
                }
                settingsToggleItemView.f48365a = new h(jVar, 23);
                settingsToggleItemView.a(new l(f52.c.settings_parental_passcode_header_title, z.b(f52.c.settings_account_management_passcode_description), !booleanValue, true));
                GestaltText gestaltText = jVar.f117163p0;
                if (gestaltText == null) {
                    Intrinsics.r("instructionsView");
                    throw null;
                }
                gestaltText.i(new c2(gestaltText, 14));
                gestaltText.j(new ca1.h(jVar, 6));
                GestaltText gestaltText2 = jVar.f117164q0;
                if (gestaltText2 == null) {
                    Intrinsics.r("emailView");
                    throw null;
                }
                gestaltText2.i(new y(12, user));
                jVar.b8(false);
                return Unit.f80348a;
            default:
                j jVar2 = (j) fVar;
                k kVar = jVar2.f117158k0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                String string = jVar2.getString(x0.generic_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                kVar.i(string);
                jVar2.b8(false);
                return Unit.f80348a;
        }
    }
}
