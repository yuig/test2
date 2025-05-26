package wr0;

import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj, int i13) {
        super(2, obj, r.class, "showReplies", "showReplies(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/api/model/AggregatedComment;)V", 0);
        this.f130906a = i13;
        if (i13 != 1) {
        } else {
            super(2, obj, r.class, "onClickAction", "onClickAction(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/feature/unifiedcomments/view/CommentRep$ActionType;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f130906a) {
            case 0:
                rp0.d p03 = (rp0.d) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((r) this.receiver).Z3((z2) obj2, p03);
                break;
            default:
                rp0.d p04 = (rp0.d) obj;
                rh1.x p13 = (rh1.x) obj2;
                Intrinsics.checkNotNullParameter(p04, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                ((r) this.receiver).K(p04, p13);
                break;
        }
        return Unit.f80348a;
    }
}
