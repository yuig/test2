package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes3.dex */
public final class m extends BasePendingResult {

    /* renamed from: k, reason: collision with root package name */
    public final k f30915k;

    public m(Status status) {
        super(null);
        this.f30915k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final k z0(Status status) {
        return this.f30915k;
    }
}
