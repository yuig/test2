package ut1;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;

/* loaded from: classes7.dex */
public final /* synthetic */ class e implements MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback {
    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback
    public final void onMFEMakeupFinishedProcessingImage(MFETrackingData mFETrackingData) {
        mFETrackingData.hasFacePoints();
    }
}
