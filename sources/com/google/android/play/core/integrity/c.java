package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f33490a;

    /* renamed from: b, reason: collision with root package name */
    private byte f33491b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i13) {
        this.f33491b = (byte) (this.f33491b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f33491b == 3) {
            return new e(this.f33490a, 0, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if ((this.f33491b & 1) == 0) {
            sb3.append(" cloudProjectNumber");
        }
        if ((this.f33491b & 2) == 0) {
            sb3.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j13) {
        this.f33490a = j13;
        this.f33491b = (byte) (this.f33491b | 1);
        return this;
    }
}
