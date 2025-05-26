package al0;

import com.pinterest.api.model.ke;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.invite.view.lego.LegoBoardDetailInviteView;
import dl1.l;
import jp.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kp.k;
import kp.m;
import m60.x0;
import xo.c;
import yk1.v;
import zk0.e;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoBoardDetailInviteView f15475j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LegoBoardDetailInviteView legoBoardDetailInviteView, int i13) {
        super(0);
        this.f15474i = i13;
        this.f15475j = legoBoardDetailInviteView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f15474i) {
            case 0:
                m4invoke();
                break;
            default:
                m4invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4invoke() {
        ke E1;
        int i13 = this.f15474i;
        String str = null;
        str = null;
        LegoBoardDetailInviteView legoBoardDetailInviteView = this.f15475j;
        switch (i13) {
            case 0:
                yk0.a aVar = legoBoardDetailInviteView.f45229c;
                if (aVar != null) {
                    e eVar = (e) aVar;
                    v7 v7Var = eVar.f142098k;
                    if ((v7Var != null ? v7Var.E1() : null) != null) {
                        v7 v7Var2 = eVar.f142098k;
                        String uid = v7Var2 != null ? v7Var2.getUid() : null;
                        v7 v7Var3 = eVar.f142098k;
                        if (v7Var3 != null && (E1 = v7Var3.E1()) != null) {
                            str = E1.d();
                        }
                        if (uid != null && str != null) {
                            m mVar = eVar.f142094g;
                            mVar.f80557l = mVar.f80555j.a(str).i(new c(mVar, (v7) ((l) mVar.f80548c).O(uid), new pg0.a(uid, false), 2), new d(4, new k(mVar, 0)));
                            break;
                        }
                    } else {
                        String str2 = eVar.f142099l;
                        if (str2 != null) {
                            eVar.f142095h.b(str2);
                            break;
                        }
                    }
                }
                break;
            default:
                yk0.a aVar2 = legoBoardDetailInviteView.f45229c;
                if (aVar2 != null) {
                    e eVar2 = (e) aVar2;
                    v7 v7Var4 = eVar2.f142098k;
                    ke E12 = v7Var4 != null ? v7Var4.E1() : null;
                    v vVar = eVar2.f142092e;
                    if (E12 != null) {
                        String uid2 = v7Var4.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        String string = ((yk1.a) vVar).f139224a.getString(uid2.length() > 0 ? x0.board_invite_declined_msg : yc0.e.contact_request_message_declined);
                        String d2 = E12.d();
                        Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
                        eVar2.f142094g.a(string, d2, -1, v7Var4.getUid(), null, null);
                        break;
                    } else {
                        String str3 = eVar2.f142099l;
                        if (str3 != null) {
                            eVar2.f142095h.C(((yk1.a) vVar).f139224a.getString(x0.board_invite_declined_msg), str3);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
