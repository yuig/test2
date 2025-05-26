package wr0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, int i13) {
        super(1, obj, r.class, "shouldShowComment", "shouldShowComment(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)Z", 0);
        this.f130907a = i13;
        if (i13 == 1) {
            super(1, obj, r.class, "hasExpandedReplies", "hasExpandedReplies(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)Z", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, r.class, "updateSelectedCommentPosition", "updateSelectedCommentPosition(I)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, obj, r.class, "onClickUser", "onClickUser(Ljava/lang/String;)V", 0);
        }
    }

    public final Boolean h(rp0.d p03) {
        switch (this.f130907a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return Boolean.valueOf(((r) this.receiver).V3(p03));
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return Boolean.valueOf(((r) this.receiver).F3(p03));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130907a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                r rVar = (r) this.receiver;
                rVar.R = intValue;
                yk1.n view = rVar.getView();
                g gVar = view instanceof g ? (g) view : null;
                if (gVar != null) {
                    ((j) gVar).m9();
                }
                break;
            default:
                String p03 = (String) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((r) this.receiver).M3(p03);
                break;
        }
        return Unit.f80348a;
    }
}
