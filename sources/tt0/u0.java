package tt0;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationCameraView f119222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(IdeaPinCreationCameraView ideaPinCreationCameraView, int i13) {
        super(0);
        this.f119221i = i13;
        this.f119222j = ideaPinCreationCameraView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        IdeaPinCreationCameraView ideaPinCreationCameraView = this.f119222j;
        int i13 = this.f119221i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        ideaPinCreationCameraView.setOnTouchListener(ideaPinCreationCameraView.f45939h);
                        break;
                    default:
                        int i14 = IdeaPinCreationCameraView.f45935i;
                        ideaPinCreationCameraView.setOnTouchListener(null);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        ideaPinCreationCameraView.setOnTouchListener(ideaPinCreationCameraView.f45939h);
                        break;
                    default:
                        int i15 = IdeaPinCreationCameraView.f45935i;
                        ideaPinCreationCameraView.setOnTouchListener(null);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
