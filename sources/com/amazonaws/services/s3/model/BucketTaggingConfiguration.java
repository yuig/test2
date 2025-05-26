package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BucketTaggingConfiguration implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28858a;

    public BucketTaggingConfiguration() {
        this.f28858a = null;
        this.f28858a = new ArrayList(1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("TagSets: " + this.f28858a);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
