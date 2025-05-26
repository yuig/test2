package com.amazonaws.services.s3.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* renamed from: a, reason: collision with root package name */
    public final List f28793a;

    /* renamed from: b, reason: collision with root package name */
    public final List f28794b;

    public DeleteObjectsResponse() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f28793a = arrayList;
        this.f28794b = arrayList2;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void c(boolean z13) {
    }
}
