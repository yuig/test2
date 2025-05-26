package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34419a;

    public c0(MFEMakeupEngine mFEMakeupEngine) {
        this.f34419a = mFEMakeupEngine;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        WeakReference weakReference;
        MFEMakeupEngine.FoundationMatchStatusUpdateListener foundationMatchStatusUpdateListener;
        Object obj2;
        MFEFoundationMatchStatus mFEFoundationMatchStatus;
        obj = this.f34419a.mFMStatusUpdateListenerLock;
        synchronized (obj) {
            weakReference = this.f34419a.mFMStatusUpdateListener;
            foundationMatchStatusUpdateListener = (MFEMakeupEngine.FoundationMatchStatusUpdateListener) weakReference.get();
        }
        if (foundationMatchStatusUpdateListener != null) {
            obj2 = this.f34419a.mFMStatusLock;
            synchronized (obj2) {
                mFEFoundationMatchStatus = this.f34419a.mFMStatus;
            }
            foundationMatchStatusUpdateListener.onUpdateFoundationMatchStatus(mFEFoundationMatchStatus);
        }
    }
}
