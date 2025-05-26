package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/pinterest/api/model/to;", "", "", "a", "I", "c", "()I", "mediaIndex", "", "b", "J", "d", "()J", "mediaOffsetMs", "e", "mediaPercentage", "<init>", "(IJI)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class to {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("mediaIndex")
    private final int mediaIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("mediaOffsetMs")
    private final long mediaOffsetMs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("mediaPercentage")
    private final int mediaPercentage;

    public to(int i13, long j13, int i14) {
        this.mediaIndex = i13;
        this.mediaOffsetMs = j13;
        this.mediaPercentage = i14;
    }

    /* renamed from: a, reason: from getter */
    public final int getMediaIndex() {
        return this.mediaIndex;
    }

    /* renamed from: b, reason: from getter */
    public final long getMediaOffsetMs() {
        return this.mediaOffsetMs;
    }

    public final int c() {
        return this.mediaIndex;
    }

    public final long d() {
        return this.mediaOffsetMs;
    }

    /* renamed from: e, reason: from getter */
    public final int getMediaPercentage() {
        return this.mediaPercentage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        return this.mediaIndex == toVar.mediaIndex && this.mediaOffsetMs == toVar.mediaOffsetMs && this.mediaPercentage == toVar.mediaPercentage;
    }

    public final int hashCode() {
        return Integer.hashCode(this.mediaPercentage) + a.a.c(this.mediaOffsetMs, Integer.hashCode(this.mediaIndex) * 31, 31);
    }

    public final String toString() {
        return "IdeaPinCoverImageData(mediaIndex=" + this.mediaIndex + ", mediaOffsetMs=" + this.mediaOffsetMs + ", mediaPercentage=" + this.mediaPercentage + ")";
    }
}
