package com.amazonaws.http;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class ExecutionContext {

    /* renamed from: a, reason: collision with root package name */
    public final AWSRequestMetrics f28595a;

    /* renamed from: b, reason: collision with root package name */
    public final List f28596b;

    /* renamed from: c, reason: collision with root package name */
    public AWSCredentials f28597c;

    public ExecutionContext(CopyOnWriteArrayList copyOnWriteArrayList, boolean z13) {
        this.f28596b = copyOnWriteArrayList;
        this.f28595a = z13 ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
    }
}
