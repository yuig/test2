package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;

/* loaded from: classes7.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.CaptureOutputCompletionHandler f34498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34499b;

    public g(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.CaptureOutputCompletionHandler captureOutputCompletionHandler) {
        this.f34499b = mFEMakeupEngine;
        this.f34498a = captureOutputCompletionHandler;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34498a.onCapturedOutput(null, null);
    }
}
