package oh1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object obj, int i13) {
        super(1, obj, w.class, "handlePostSuccess", "handlePostSuccess(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)V", 0);
        this.f94578a = i13;
        switch (i13) {
            case 1:
                super(1, obj, w.class, "handlePostSuccess", "handlePostSuccess(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)V", 0);
                break;
            case 2:
                super(1, obj, w.class, "handlePostSuccess", "handlePostSuccess(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)V", 0);
                break;
            case 3:
                super(1, obj, w.class, "handlePostSuccess", "handlePostSuccess(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)V", 0);
                break;
            case 4:
                super(1, obj, w.class, "handlePostSuccess", "handlePostSuccess(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)V", 0);
                break;
            case 5:
                super(1, obj, y.class, "shouldShowComment", "shouldShowComment(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)Z", 0);
                break;
            case 6:
                super(1, obj, y.class, "hasExpandedReplies", "hasExpandedReplies(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;)Z", 0);
                break;
            default:
                break;
        }
    }

    public final Boolean h(rp0.d p03) {
        switch (this.f94578a) {
            case 5:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return Boolean.valueOf(((y) this.receiver).V3(p03));
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                return Boolean.valueOf(((y) this.receiver).F3(p03));
        }
    }

    public final void i(rp0.d dVar) {
        switch (this.f94578a) {
            case 0:
                w.p3((w) this.receiver, dVar);
                break;
            case 1:
                w.p3((w) this.receiver, dVar);
                break;
            case 2:
                w.p3((w) this.receiver, dVar);
                break;
            case 3:
                w.p3((w) this.receiver, dVar);
                break;
            default:
                w.p3((w) this.receiver, dVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f94578a) {
            case 0:
                i((rp0.d) obj);
                break;
            case 1:
                i((rp0.d) obj);
                break;
            case 2:
                i((rp0.d) obj);
                break;
            case 3:
                i((rp0.d) obj);
                break;
            case 4:
                i((rp0.d) obj);
                break;
        }
        return h((rp0.d) obj);
    }
}
