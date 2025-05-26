package ll0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ol0.m;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f83793j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i13) {
        super(0);
        this.f83792i = i13;
        this.f83793j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f83792i;
        f fVar = this.f83793j;
        switch (i13) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("board_id", fVar.f83802a);
                break;
            case 1:
                break;
            case 2:
                m179invoke();
                break;
            default:
                m179invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m179invoke() {
        int i13 = this.f83792i;
        f fVar = this.f83793j;
        switch (i13) {
            case 2:
                com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) fVar.getViewIfBound();
                if (aVar != null) {
                    ((ol0.f) aVar).b8(m.f96402f);
                }
                fVar.f83817p = true;
                fVar.q3();
                break;
            default:
                if (fVar.isBound()) {
                    if (fVar.f83817p) {
                        ((ol0.f) ((com.pinterest.feature.board.edit.a) fVar.getView())).c8("com.pinterest.EXTRA_BOARD_HEADER_IMAGE_RESULT_IMAGE_MODIFIED");
                        break;
                    } else {
                        ((ol0.f) ((com.pinterest.feature.board.edit.a) fVar.getView())).D5();
                        break;
                    }
                }
                break;
        }
    }
}
