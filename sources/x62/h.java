package x62;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f133972i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EditMaskImageView f133973j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(EditMaskImageView editMaskImageView, int i13) {
        super(1);
        this.f133972i = i13;
        this.f133973j = editMaskImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EditMaskImageView editMaskImageView = this.f133973j;
        int i13 = this.f133972i;
        switch (i13) {
            case 0:
                MaskModel maskModel = (MaskModel) obj;
                i1 a13 = maskModel != null ? maskModel.a() : null;
                ql2.g gVar = EditMaskImageView.f51946q;
                editMaskImageView.r2(a13);
                break;
            case 1:
                g it = (g) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        editMaskImageView.invalidate();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        editMaskImageView.f51951e = it.f133970b;
                        editMaskImageView.invalidate();
                        break;
                }
                break;
            default:
                g it2 = (g) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        editMaskImageView.invalidate();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        editMaskImageView.f51951e = it2.f133970b;
                        editMaskImageView.invalidate();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
