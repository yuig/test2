package np;

import android.content.Context;
import android.hardware.Camera;
import android.view.OrientationEventListener;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class d extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f91682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CameraActivity cameraActivity, Context context) {
        super(context);
        this.f91682a = cameraActivity;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i13) {
        if (i13 != -1) {
            int i14 = CameraActivity.f34890J;
            Camera camera = fa2.c.f61593a;
            int i15 = (i13 <= 45 || i13 > 135) ? (i13 <= 135 || i13 > 225) ? (i13 <= 225 || i13 > 315) ? 0 : 270 : RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP : 90;
            this.f91682a.f34910u = i14 == 1 ? (RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF - i15) % 360 : (i15 + 90) % 360;
        }
    }
}
