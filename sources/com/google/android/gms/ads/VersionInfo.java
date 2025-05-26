package com.google.android.gms.ads;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/google/android/gms/ads/VersionInfo;", "", "", "a", "I", "getMajorVersion", "()I", "majorVersion", "b", "getMinorVersion", "minorVersion", "c", "getMicroVersion", "microVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class VersionInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int majorVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minorVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int microVersion;

    public final String toString() {
        return this.majorVersion + "." + this.minorVersion + "." + this.microVersion;
    }
}
