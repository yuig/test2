package go0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import i01.e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wt1.c0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65891i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f65892j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, int i13) {
        super(1);
        this.f65891i = i13;
        this.f65892j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65891i;
        s sVar = this.f65892j;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        f30 f30Var = sVar.N;
                        if (f30Var != null) {
                            e1.a(sVar.f65918w, f30Var, null, sVar.f65904i, 0, false, null, sVar.f65907l, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
                            break;
                        }
                        break;
                    default:
                        sVar.f65914s.o("RepinBoardSectionPickerPresenter: failed to fetch StoryPinLocalData", th3);
                        break;
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                sVar.N = f30Var2;
                Object[] objArr = {f30Var2.getUid()};
                tb0.h hVar = sVar.f65914s;
                hVar.getClass();
                hVar.h(j1.T("Got pin, id=%s", objArr));
                sVar.loadData();
                break;
            case 2:
                if ((((c0) obj) instanceof wt1.i) && sVar.isBound()) {
                    sVar.f65921z.h(f02.g.board_section_picker_loading_error);
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        f30 f30Var3 = sVar.N;
                        if (f30Var3 != null) {
                            e1.a(sVar.f65918w, f30Var3, null, sVar.f65904i, 0, false, null, sVar.f65907l, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
                            break;
                        }
                        break;
                    default:
                        sVar.f65914s.o("RepinBoardSectionPickerPresenter: failed to fetch StoryPinLocalData", th4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
