package tt0;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119201i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationCameraVideoSegmentsView f119202j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView, int i13) {
        super(1);
        this.f119201i = i13;
        this.f119202j = ideaPinCreationCameraVideoSegmentsView;
    }

    public final void b(rt0.b model) {
        int i13 = this.f119201i;
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.f119202j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                ideaPinCreationCameraVideoSegmentsView.invalidate();
                if (!model.f109952d) {
                    ideaPinCreationCameraVideoSegmentsView.setProgress((int) model.i());
                    ideaPinCreationCameraVideoSegmentsView.setEnabled(true);
                    break;
                } else {
                    ideaPinCreationCameraVideoSegmentsView.setEnabled(false);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                float f13 = IdeaPinCreationCameraVideoSegmentsView.f45925g;
                ideaPinCreationCameraVideoSegmentsView.e();
                ideaPinCreationCameraVideoSegmentsView.setProgress((int) model.i());
                ideaPinCreationCameraVideoSegmentsView.invalidate();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f119201i) {
            case 0:
                b((rt0.b) obj);
                break;
            default:
                b((rt0.b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
