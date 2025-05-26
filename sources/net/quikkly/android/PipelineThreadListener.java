package net.quikkly.android;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface PipelineThreadListener extends ScanResultListener {
    void onFreeBuffer(@NonNull byte[] bArr);
}
