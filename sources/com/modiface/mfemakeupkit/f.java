package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.CaptureOutputCompletionHandler f34442a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34443b;

    public f(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.CaptureOutputCompletionHandler captureOutputCompletionHandler) {
        this.f34443b = mFEMakeupEngine;
        this.f34442a = captureOutputCompletionHandler;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.rendering.a aVar;
        WeakReference weakReference;
        ArrayList<Throwable> arrayList = new ArrayList<>();
        aVar = this.f34443b.mMakeupRenderingEngine;
        com.modiface.mfecommon.utils.c a13 = aVar.a(arrayList);
        if (a13 != null) {
            this.f34442a.onCapturedOutput(a13.f34285a, a13.f34286b);
        } else {
            this.f34442a.onCapturedOutput(null, null);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        weakReference = this.f34443b.mErrorCallbackRef;
        MFEMakeupEngine.MFEMakeupEngineErrorCallback mFEMakeupEngineErrorCallback = (MFEMakeupEngine.MFEMakeupEngineErrorCallback) weakReference.get();
        if (mFEMakeupEngineErrorCallback != null) {
            mFEMakeupEngineErrorCallback.onMakeupEngineError(MFEMakeupEngine.ErrorSeverity.Recoverable, MFEMakeupEngine.ErrorType.CaptureOutput, arrayList);
        }
    }
}
