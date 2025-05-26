package go0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import df.j1;
import e0.t;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.b0;
import x02.c2;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65896i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f65897j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ba f65898k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, ba baVar, int i13) {
        super(1);
        this.f65896i = i13;
        this.f65897j = sVar;
        this.f65898k = baVar;
    }

    public final void b(Long l13) {
        f30 f30Var;
        List F0;
        String str;
        int i13 = this.f65896i;
        ba baVar = this.f65898k;
        s sVar = this.f65897j;
        switch (i13) {
            case 0:
                Date date = sVar.f65906k;
                i92.k kVar = sVar.f65921z;
                w wVar = sVar.f65919x;
                if (date == null) {
                    String uid = baVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    String boardName = baVar.A();
                    Intrinsics.checkNotNullExpressionValue(boardName, "getTitle(...)");
                    v7 u13 = baVar.u();
                    String b13 = u13 != null ? u13.b1() : null;
                    tb0.h hVar = sVar.f65914s;
                    hVar.getClass();
                    hVar.h(j1.T("Repin to boardSectionUid=%s, boardSectionName=%s", uid, boardName));
                    String str2 = sVar.C;
                    if (str2 != null && str2.length() != 0 && sVar.N == null) {
                        kVar.m(((yk1.a) sVar.A).f139224a.getString(x0.generic_error));
                        hVar.h("Is repin and pin model has not loaded in time");
                    }
                    boolean z13 = sVar.L;
                    String boardId = sVar.f65904i;
                    if (z13) {
                        ho0.m mVar = (ho0.m) ((fo0.c) sVar.getView());
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(boardId, "boardId");
                        Intrinsics.checkNotNullParameter(boardName, "boardName");
                        mVar.P6("com.pinterest.EXTRA_SIMPLE_BOARD_SECTION_PICKER_RESULT_CODE", t.j(new Pair("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_ID", boardId), new Pair("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_NAME", boardName), new Pair("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_SECTION_ID", uid), new Pair("com.pinterest.EXTRA_SIMPLE_BOARD_PICKER_RESULT_KEY_BOARD_IMAGE_URL", b13)));
                        mVar.D5();
                    } else {
                        f30 pin = sVar.N;
                        ArrayList arrayList = ((ho0.m) ((fo0.c) sVar.getView())).f69736t1;
                        int i14 = 0;
                        boolean z14 = pin != null;
                        boolean z15 = arrayList != null && arrayList.size() > 1;
                        if (z14) {
                            if (pin != null) {
                                boolean z16 = !z15;
                                b0 b0Var = sVar.B;
                                b0Var.getClass();
                                Intrinsics.checkNotNullParameter(pin, "pin");
                                HashMap p13 = b0.p(b0Var, pin, sVar.G, null);
                                if (p13 != null && (str = sVar.f65907l) != null) {
                                    p13.put("save_session_id", str);
                                }
                                sVar.getPinalytics().f0(u0.PIN_REPIN_BUTTON, g0.MODAL_ADD_PIN, pin.getUid(), p13, false);
                                String uid2 = pin.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                c2 c2Var = new c2(uid2);
                                c2Var.f131300e = boardId;
                                c2Var.f131301f = uid;
                                c2Var.f131302g = b40.q(pin);
                                wy0 f13 = sVar.f65910o.f();
                                c2Var.f131303h = com.bumptech.glide.d.o0(f13 != null ? Boolean.valueOf(dl2.b.B1(f13)) : null);
                                c2Var.f131304i = false;
                                c2Var.f131305j = pin.z4();
                                c2Var.f131306k = sVar.f65915t.b(pin);
                                String str3 = sVar.D;
                                c2Var.f131310o = str3;
                                ba u33 = sVar.u3(uid);
                                boolean a13 = sVar.M.a(pin, str3);
                                if (a13) {
                                    f30 f30Var2 = sVar.N;
                                    h hVar2 = sVar.f65822f;
                                    Object obj = (hVar2 == null || (F0 = CollectionsKt.F0(hVar2.f135191h)) == null) ? null : (dl1.s) CollectionsKt.U(0, F0);
                                    v7 v7Var = obj instanceof v7 ? (v7) obj : null;
                                    if (f30Var2 != null) {
                                        int intValue = f30Var2.e6().intValue() + 1;
                                        e30 R6 = f30Var2.R6();
                                        R6.C1(v7Var);
                                        R6.Z1(u33);
                                        R6.U1(Integer.valueOf(intValue));
                                        f30 a14 = R6.a();
                                        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                                        pe.i.r1(sVar.f65911p, a14);
                                        sVar.N = a14;
                                    }
                                }
                                if (sVar.f65908m) {
                                    wVar.d(new com.pinterest.feature.pin.t(pin, sVar.f65909n, false));
                                }
                                if (!a13 && u33 != null && (f30Var = sVar.N) != null) {
                                    xj2.c o13 = sVar.f65916u.a(f30Var).o(new j(11, new r((Object) sVar, (Object) uid, (Object) boardName, 0)), new j(12, g.f65861o));
                                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                                    sVar.addDisposable(o13);
                                }
                                if (z16) {
                                    ((ho0.m) ((fo0.c) sVar.getView())).m9();
                                }
                                sVar.f65917v.a(pin, c2Var, new j(9, new n(1, sVar, s.class, "logRepin", "logRepin(Lcom/pinterest/api/model/Pin;)V", 0)), new j(10, new o(sVar, i14)));
                            }
                            if (z15) {
                                ho0.m mVar2 = (ho0.m) ((fo0.c) sVar.getView());
                                if (mVar2.f69736t1.size() > 0) {
                                    mVar2.f69736t1.remove(0);
                                }
                                sVar.v3(uid, boardName);
                            }
                        } else {
                            sVar.v3(uid, boardName);
                        }
                    }
                    wVar.f(new v11.d(baVar));
                    break;
                } else {
                    v7 u14 = baVar.u();
                    if (u14 != null) {
                        ((ho0.d) ((fo0.c) sVar.getView())).dismiss();
                        String uid3 = u14.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        String j13 = u14.j1();
                        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                        wVar.f(new i11.n(sVar.G, uid3, j13, b40.q(sVar.N), baVar.getUid()));
                        r2 = Unit.f80348a;
                    }
                    if (r2 == null) {
                        kVar.k(x0.generic_error);
                        break;
                    }
                }
                break;
            default:
                sVar.f65919x.f(baVar != null ? new v11.d(baVar) : null);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f65896i) {
            case 0:
                b((Long) obj);
                break;
            default:
                b((Long) obj);
                break;
        }
        return Unit.f80348a;
    }
}
