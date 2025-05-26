package yq1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.password.StrongPasswordTextField;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f140012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i13) {
        super(1);
        this.f140011i = i13;
        this.f140012j = uVar;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f140011i;
        u uVar = this.f140012j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = yn1.f.ERROR;
                String string = uVar.getString(vq1.d.please_enter_new_password);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return ao1.b.e(it, null, null, bs1.c.h2(string), null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar2 = yn1.f.ERROR;
                String string2 = uVar.getString(vq1.d.signup_password_invalid_error);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                u50.f0 h23 = bs1.c.h2(string2);
                GestaltTextField gestaltTextField = uVar.f140027v0;
                if (gestaltTextField != null) {
                    return ao1.b.e(it, null, null, h23, null, fVar2, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(gestaltTextField.B0().length()), null, null, null, null, 0, 4161499);
                }
                Intrinsics.r("passwordEt");
                throw null;
        }
    }

    public final void e(xl1.a it) {
        int i13 = this.f140011i;
        u uVar = this.f140012j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                StrongPasswordTextField strongPasswordTextField = uVar.f140029x0;
                if (strongPasswordTextField == null) {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
                vr1.b i14 = strongPasswordTextField.i();
                nx.d0 s73 = uVar.s7();
                h32.f1 f1Var = h32.f1.SUBMIT_NEW_PASSWORD;
                HashMap hashMap = new HashMap();
                rr1.a aVar = i14.f126459c;
                hashMap.put("score", String.valueOf(aVar.f109934a));
                hashMap.put("score_source", aVar.f109935b);
                hashMap.put("surface", "RESET_PASSWORD");
                Unit unit = Unit.f80348a;
                s73.g(f1Var, null, hashMap, false);
                Map map = uVar.f140031z0;
                if (map == null) {
                    Intrinsics.r("passwordParams");
                    throw null;
                }
                LinkedHashMap destination = new LinkedHashMap();
                String str = i14.f126457a;
                destination.put("new", str);
                destination.put("new_confirm", str);
                Intrinsics.checkNotNullParameter(map, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                destination.putAll(map);
                Map B = Util.B(destination);
                zq1.p pVar = uVar.A0;
                if (pVar != null) {
                    ((zq1.o) pVar).s3(B);
                }
                StrongPasswordTextField strongPasswordTextField2 = uVar.f140029x0;
                if (strongPasswordTextField2 != null) {
                    hf0.b.k(strongPasswordTextField2);
                    return;
                } else {
                    Intrinsics.r("strongPasswordField");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = u.F0;
                uVar.c8();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f140011i) {
            case 0:
                e((xl1.a) obj);
                break;
            case 1:
                e((xl1.a) obj);
                break;
        }
        return b((ao1.b) obj);
    }
}
