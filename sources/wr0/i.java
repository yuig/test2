package wr0;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.z2;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, int i13) {
        super(0, obj, j.class, "updateFloatingCommentView", "updateFloatingCommentView()V", 0);
        this.f130894a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, r.class, "possiblyExpandReplies", "possiblyExpandReplies()V", 0);
        }
    }

    public final void h() {
        switch (this.f130894a) {
            case 0:
                ((j) this.receiver).m9();
                break;
            default:
                r rVar = (r) this.receiver;
                mh1.d dVar = rVar.P;
                Iterator it = dVar.d().iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                    } else if (!Intrinsics.d(((dl1.s) it.next()).getUid(), rVar.F.f90552t)) {
                        i13++;
                    }
                }
                if (!rVar.T && i13 >= 0) {
                    rVar.T = true;
                    dl1.s sVar = (dl1.s) dVar.d().get(i13);
                    if (!(sVar instanceof z2)) {
                        if (sVar instanceof az0) {
                            rVar.Z3(null, new rp0.c((az0) sVar));
                            break;
                        }
                    } else {
                        rVar.Z3(null, new rp0.b((z2) sVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f130894a) {
            case 0:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
