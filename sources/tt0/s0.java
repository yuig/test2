package tt0;

import android.content.Context;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f119206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationCameraVideoSegmentsView f119207k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Context context, IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView, int i13) {
        super(0);
        this.f119205i = i13;
        this.f119206j = context;
        this.f119207k = ideaPinCreationCameraVideoSegmentsView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119205i;
        Context context = this.f119206j;
        IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this.f119207k;
        switch (i13) {
            case 0:
                return new y0(context, ideaPinCreationCameraVideoSegmentsView.a());
            default:
                return new a1(context, ideaPinCreationCameraVideoSegmentsView.a());
        }
    }
}
