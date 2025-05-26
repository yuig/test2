package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

/* loaded from: classes3.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public ProgressListener f28518a;

    /* renamed from: b, reason: collision with root package name */
    public final RequestClientOptions f28519b = new RequestClientOptions();

    /* renamed from: c, reason: collision with root package name */
    public RequestMetricCollector f28520c;

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.getClass();
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e13) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e13);
        }
    }
}
