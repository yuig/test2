package yq1;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140056i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f140057j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i13) {
        super(1);
        this.f140056i = i13;
        this.f140057j = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140056i;
        z zVar = this.f140057j;
        switch (i13) {
            case 0:
                qr1.c cVar = (qr1.c) obj;
                com.pinterest.identity.authentication.a aVar = zVar.f140090f0;
                if (aVar == null) {
                    Intrinsics.r("authNavigationHelper");
                    throw null;
                }
                Intrinsics.f(cVar);
                aVar.b(cVar, null);
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        z.Y7(zVar, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        z.Y7(zVar, th3);
                        break;
                }
                return Unit.f80348a;
            case 2:
                String domain = (String) obj;
                Intrinsics.checkNotNullParameter(domain, "domain");
                GestaltTextField gestaltTextField = zVar.f140093i0;
                if (gestaltTextField == null) {
                    Intrinsics.r("emailEditText");
                    throw null;
                }
                String B0 = gestaltTextField.B0();
                if (StringsKt.E(B0, "@", false)) {
                    String replace = new Regex("@(.*)").replace(B0, domain);
                    GestaltTextField gestaltTextField2 = zVar.f140093i0;
                    if (gestaltTextField2 == null) {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                    gestaltTextField2.X(new dl1.i0(replace, 12));
                } else {
                    GestaltTextField gestaltTextField3 = zVar.f140093i0;
                    if (gestaltTextField3 == null) {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                    String C = a.a.C(gestaltTextField3.B0(), domain);
                    GestaltTextField gestaltTextField4 = zVar.f140093i0;
                    if (gestaltTextField4 == null) {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                    gestaltTextField4.X(new dl1.i0(C, 13));
                }
                return Unit.f80348a;
            case 3:
                am1.g it = (am1.g) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                lb2.q a83 = zVar.a8();
                lr1.h hVar = lr1.h.GoogleUnifiedAuthMethod;
                FragmentActivity requireActivity = zVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                zVar.Z7(a83.b(hVar, bs1.c.m(requireActivity), null));
                return Unit.f80348a;
            case 4:
                rn1.f it2 = (rn1.f) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                lb2.q a84 = zVar.a8();
                lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                FragmentActivity requireActivity2 = zVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                zVar.Z7(a84.b(hVar2, bs1.c.m(requireActivity2), null));
                return Unit.f80348a;
            case 5:
                ao1.b it3 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                String str = zVar.f140100p0;
                if (str == null) {
                    Intrinsics.r("emailTypoSuggestion");
                    throw null;
                }
                u50.f0 h23 = bs1.c.h2(str);
                String str2 = zVar.f140100p0;
                if (str2 != null) {
                    return ao1.b.e(it3, h23, null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(str2.length()), null, null, null, null, 0, 4161534);
                }
                Intrinsics.r("emailTypoSuggestion");
                throw null;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th4);
                        z.Y7(zVar, th4);
                        break;
                    default:
                        Intrinsics.f(th4);
                        z.Y7(zVar, th4);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
