package e41;

import android.content.Context;
import com.pinterest.api.model.wy0;
import g41.m;
import kh2.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.StringsKt;
import z40.y;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i13) {
        super(2, obj, c.class, "onUnfollowConfirmationAction", "onUnfollowConfirmationAction(Lcom/pinterest/api/model/User;Lkotlin/jvm/functions/Function0;)V", 0);
        this.f57184a = i13;
        if (i13 != 1) {
        } else {
            super(2, obj, h.class, "onAskUnfollowConfirmation", "onAskUnfollowConfirmation(Lcom/pinterest/apollo/repository/fragment/LegoUserRepFields;Lkotlin/jvm/functions/Function0;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57184a) {
            case 0:
                wy0 p03 = (wy0) obj;
                Function0 onConfirm = (Function0) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(onConfirm, "p1");
                c41.a aVar = (c41.a) ((c) this.receiver).getView();
                String userName = dl2.b.i1(p03);
                g41.e eVar = (g41.e) aVar;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(userName, "userName");
                Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                l3.c.U0(eVar, r.z(requireContext, userName, onConfirm));
                break;
            default:
                y p04 = (y) obj;
                Function0 onConfirm2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(p04, "p0");
                Intrinsics.checkNotNullParameter(onConfirm2, "p1");
                c41.b bVar = (c41.b) ((h) this.receiver).getView();
                String R0 = dl2.b.R0(p04.f());
                if (R0 == null) {
                    R0 = "";
                }
                String userName2 = StringsKt.i0(R0).toString();
                m mVar = (m) bVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(userName2, "userName");
                Intrinsics.checkNotNullParameter(onConfirm2, "onConfirm");
                Context requireContext2 = mVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                l3.c.U0(mVar, r.z(requireContext2, userName2, onConfirm2));
                break;
        }
        return Unit.f80348a;
    }
}
