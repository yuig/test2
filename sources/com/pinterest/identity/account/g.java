package com.pinterest.identity.account;

import androidx.appcompat.app.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.identity.password.StrongPasswordTextField;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import rl1.q;

/* loaded from: classes2.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f49780j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f49779i = i13;
        this.f49780j = hVar;
    }

    public final q b(q it) {
        int i13 = this.f49779i;
        h hVar = this.f49780j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = hVar.f49787p0;
                String userId = hVar.f49788q0;
                Intrinsics.checkNotNullParameter(userId, "userId");
                return q.e(it, str, null, false, null, null, false, false, null, 0, new rl1.e(userId), null, 1534);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = hVar.f49789r0;
                String userId2 = hVar.f49790s0;
                Intrinsics.checkNotNullParameter(userId2, "userId");
                return q.e(it, str2, null, false, null, null, false, false, null, 0, new rl1.e(userId2), null, 1534);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f49779i) {
            case 0:
                xl1.a it = (xl1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                h hVar = this.f49780j;
                StrongPasswordTextField strongPasswordTextField = hVar.E0;
                if (strongPasswordTextField == null) {
                    Intrinsics.r("strongPasswordTextField");
                    throw null;
                }
                vr1.b i13 = strongPasswordTextField.i();
                d0 s73 = hVar.s7();
                s73.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.UNLINK_ACCOUNT_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                f1 f1Var = f1.SUBMIT_NEW_PASSWORD;
                HashMap hashMap = new HashMap();
                rr1.a aVar = i13.f126459c;
                hashMap.put("score", String.valueOf(aVar.f109934a));
                hashMap.put("score_source", aVar.f109935b);
                hashMap.put("surface", "UNLINK_BUSINESS");
                Unit unit = Unit.f80348a;
                s73.g(f1Var, null, hashMap, false);
                c cVar = hVar.F0;
                if (cVar != null) {
                    n nVar = hVar.f49781j0;
                    if (nVar == null) {
                        Intrinsics.r("hostActivity");
                        throw null;
                    }
                    ((k) cVar).t3(nVar, hVar.f49791t0, hVar.f49792u0, hVar.f49793v0);
                }
                return Unit.f80348a;
            case 1:
                return b((q) obj);
            default:
                return b((q) obj);
        }
    }
}
