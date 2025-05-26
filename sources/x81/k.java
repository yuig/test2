package x81;

import android.graphics.Bitmap;
import android.view.ViewParent;

/* loaded from: classes5.dex */
public interface k extends yk1.u {
    void clearEyeLayer();

    void clearLipLayer();

    l getTryOnListener();

    ViewParent getViewParent();

    void loadMakeupEngineResourceWithPhoto(Bitmap bitmap);

    void loadMakeupEngineResourcesAndStartCamera();

    void pauseCamera();

    void playHapticFeedback();

    void resumeCamera();

    void setTryOnViewListener(l lVar);

    void takePhoto();

    void updateEyeshadow(g gVar);

    void updateLipstick(g gVar);
}
