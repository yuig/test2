package zv0;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f142873b;

    public /* synthetic */ g(j jVar, int i13) {
        this.f142872a = i13;
        this.f142873b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f142872a;
        j this$0 = this.f142873b;
        switch (i13) {
            case 0:
                int i14 = j.f142878k1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                view.setSelected(!view.isSelected());
                IdeaPinCreationCameraSpeedControlView ideaPinCreationCameraSpeedControlView = this$0.I0;
                if (ideaPinCreationCameraSpeedControlView != null) {
                    ideaPinCreationCameraSpeedControlView.L(view.isSelected());
                    return;
                } else {
                    Intrinsics.r("speedControls");
                    throw null;
                }
            default:
                int i15 = j.f142878k1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                vv0.e eVar = this$0.f142884f1;
                if (eVar != null) {
                    ((yv0.c) eVar).B3();
                    return;
                }
                return;
        }
    }
}
