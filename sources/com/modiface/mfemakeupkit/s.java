package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.video.MFEVideoRecordingError;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.RecordVideoOutputCompletionHandler f34605a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34606b;

    public s(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.RecordVideoOutputCompletionHandler recordVideoOutputCompletionHandler) {
        this.f34606b = mFEMakeupEngine;
        this.f34605a = recordVideoOutputCompletionHandler;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.video.e eVar;
        com.modiface.mfemakeupkit.video.e eVar2;
        com.modiface.mfemakeupkit.video.e eVar3;
        com.modiface.mfemakeupkit.video.e eVar4;
        com.modiface.mfemakeupkit.video.e eVar5;
        eVar = this.f34606b.mVideoRecorder;
        if (eVar == null) {
            MFEMakeupEngine.RecordVideoOutputCompletionHandler recordVideoOutputCompletionHandler = this.f34605a;
            if (recordVideoOutputCompletionHandler != null) {
                recordVideoOutputCompletionHandler.onVideoRecorded(null, false, 0L, 0L, new ArrayList());
                return;
            }
            return;
        }
        eVar2 = this.f34606b.mVideoRecorder;
        eVar2.i();
        eVar3 = this.f34606b.mVideoRecorder;
        File file = eVar3.f34702j;
        eVar4 = this.f34606b.mVideoRecorder;
        com.modiface.mfemakeupkit.video.h hVar = eVar4.f34703k;
        boolean z13 = hVar.f34715c;
        long j13 = hVar.f34713a;
        long j14 = hVar.f34714b;
        eVar5 = this.f34606b.mVideoRecorder;
        List<MFEVideoRecordingError> c13 = eVar5.c();
        this.f34606b.mVideoRecorder = null;
        MFEMakeupEngine.RecordVideoOutputCompletionHandler recordVideoOutputCompletionHandler2 = this.f34605a;
        if (recordVideoOutputCompletionHandler2 != null) {
            recordVideoOutputCompletionHandler2.onVideoRecorded(file, z13, j13, j14, c13);
        }
    }
}
