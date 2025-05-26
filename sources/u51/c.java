package u51;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.cd0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f120599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f120598i = i13;
        this.f120599j = eVar;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f120598i;
        e eVar = this.f120599j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                eVar.Z7().i(throwable.getMessage());
                break;
            case 3:
                eVar.Z7().i(throwable.getMessage());
                break;
            default:
                eVar.Z7().i(throwable.getMessage());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 w13;
        rp0.d dVar;
        String v13;
        String str;
        kk2.t a13;
        rp0.d cVar;
        int i13 = this.f120598i;
        e eVar = this.f120599j;
        switch (i13) {
            case 0:
                b((Throwable) obj);
                return Unit.f80348a;
            case 1:
                on1.i it = (on1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z13 = !(it instanceof on1.g);
                rp0.d dVar2 = eVar.f120613p0;
                if (dVar2 != null && (w13 = dVar2.w()) != null && (dVar = eVar.f120613p0) != null && (v13 = dVar.v()) != null) {
                    String i14 = dl2.b.i1(w13);
                    String z43 = w13.z4();
                    str = z43 != null ? z43 : "";
                    if (i14.length() <= 0) {
                        i14 = str;
                    }
                    s60.d dVar3 = new s60.d(new s60.c(sh.f.a(), new i0(null, null, null, g0.MODAL_DIALOG, null, u0.USER_BLOCK_BUTTON), v13, 56), eVar.A7());
                    if (z13) {
                        String uid = w13.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        a13 = dVar3.d(uid);
                    } else {
                        String uid2 = w13.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        a13 = dVar3.a(uid2, "comment_report", v13);
                    }
                    xj2.c o13 = a13.o(new b(1, new s1.w(eVar, z13, i14, 17)), new b(2, new c(eVar, 0)));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    eVar.R6(o13);
                }
                return Unit.f80348a;
            case 2:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                cd0 cd0Var = eVar.f120602e0;
                if (cd0Var != null) {
                    String B = cd0Var.B();
                    return rn1.a.y(it2, bs1.c.p2(B != null ? B : ""), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
                }
                Intrinsics.r("reportReason");
                throw null;
            case 3:
                b((Throwable) obj);
                return Unit.f80348a;
            case 4:
                dl1.s model = (dl1.s) obj;
                if (eVar.f120620w0 == null) {
                    Intrinsics.r("commentUtils");
                    throw null;
                }
                Intrinsics.f(model);
                Intrinsics.checkNotNullParameter(model, "model");
                if (model instanceof z2) {
                    cVar = new rp0.b((z2) model);
                } else {
                    if (!(model instanceof az0)) {
                        throw new IllegalStateException("Invalid model type");
                    }
                    cVar = new rp0.c((az0) model);
                }
                wy0 w14 = cVar.w();
                if (w14 != null) {
                    String i15 = dl2.b.i1(w14);
                    String z44 = w14.z4();
                    str = z44 != null ? z44 : "";
                    if (i15.length() <= 0) {
                        i15 = str;
                    }
                    String string = eVar.getString(x0.comment_block_user_confirm_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String Y = j1.Y(string, new Object[]{i15}, null, 6);
                    GestaltText gestaltText = eVar.f120610m0;
                    if (gestaltText == null) {
                        Intrinsics.r("blockUserTitle");
                        throw null;
                    }
                    pk.a0.p(gestaltText, Y);
                    String string2 = eVar.getString(p60.d.block_user_message_alt);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    GestaltText gestaltText2 = eVar.f120611n0;
                    if (gestaltText2 == null) {
                        Intrinsics.r("blockUserDescription");
                        throw null;
                    }
                    pk.a0.q(gestaltText2, bs1.c.p2(string2));
                } else {
                    String str2 = eVar.f120612o0;
                    if (str2 != null) {
                        GestaltText gestaltText3 = eVar.f120610m0;
                        if (gestaltText3 == null) {
                            Intrinsics.r("blockUserTitle");
                            throw null;
                        }
                        String string3 = eVar.getString(x0.comment_block_user_confirm_title);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        pk.a0.p(gestaltText3, j1.Y(string3, new Object[]{str2}, null, 6));
                        GestaltText gestaltText4 = eVar.f120611n0;
                        if (gestaltText4 == null) {
                            Intrinsics.r("blockUserDescription");
                            throw null;
                        }
                        String string4 = eVar.getString(x0.comment_block_user_confirm_description_one_name);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        Spanned fromHtml = Html.fromHtml(j1.Y(string4, new Object[]{str2}, null, 6));
                        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                        pk.a0.q(gestaltText4, bs1.c.p2(fromHtml));
                    }
                }
                if (eVar.f120614q0) {
                    eVar.a8(cVar);
                }
                eVar.f120613p0 = cVar;
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
