package ol0;

import com.pinterest.feature.board.edit.view.BoardHeaderImagePreview;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96393i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BoardHeaderImagePreview f96394j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f96395k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BoardHeaderImagePreview boardHeaderImagePreview, m mVar, int i13) {
        super(1);
        this.f96393i = i13;
        this.f96394j = boardHeaderImagePreview;
        this.f96395k = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f96393i;
        int i14 = 1;
        m mVar = this.f96395k;
        BoardHeaderImagePreview boardHeaderImagePreview = this.f96394j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Integer num = mVar.f96405b;
                int i15 = BoardHeaderImagePreview.f45248g;
                boardHeaderImagePreview.getClass();
                break;
            case 1:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                rm1.q qVar = mVar.f96406c;
                int i16 = BoardHeaderImagePreview.f45248g;
                boardHeaderImagePreview.getClass();
                if (qVar == null) {
                    qVar = rm1.q.FILL_TRANSPARENT;
                }
                standard.a(qVar);
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new j(boardHeaderImagePreview, mVar, i14));
                bind.c(d7.b.Z(mVar.f96406c != null));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, BoardHeaderImagePreview boardHeaderImagePreview) {
        super(1);
        this.f96393i = 2;
        this.f96395k = mVar;
        this.f96394j = boardHeaderImagePreview;
    }
}
