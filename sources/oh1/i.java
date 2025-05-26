package oh1;

import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94508a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, int i13) {
        super(2, obj, m.class, "loadTranslation", "loadTranslation(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", 0);
        this.f94508a = i13;
        if (i13 != 1) {
        } else {
            super(2, obj, y.class, "showReplies", "showReplies(Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;Lcom/pinterest/api/model/AggregatedComment;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f94508a) {
            case 0:
                String p03 = (String) obj;
                kl2.l p13 = (kl2.l) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                m mVar = (m) this.receiver;
                mVar.getClass();
                mVar.addDisposable(mVar.f94540v.a(p03, p13, new g(mVar, 0)));
                break;
            default:
                rp0.d p04 = (rp0.d) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                ((y) this.receiver).Z3((z2) obj2, p04);
                break;
        }
        return Unit.f80348a;
    }
}
