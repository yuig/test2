package com.amazonaws.services.s3.model;

import java.util.HashMap;

/* loaded from: classes3.dex */
public class TagSet {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f28916a;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("Tags: " + this.f28916a);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
