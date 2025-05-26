package com.pinterest.api.model;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hz implements Serializable {

    /* renamed from: a */
    public final String f38570a;

    /* renamed from: b */
    public final String f38571b;

    /* renamed from: c */
    public final String f38572c;

    public hz(@NotNull String utmSource, @NotNull String messageType, @NotNull String trackingId) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.f38570a = utmSource;
        this.f38571b = messageType;
        this.f38572c = trackingId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz)) {
            return false;
        }
        hz hzVar = (hz) obj;
        return Intrinsics.d(this.f38570a, hzVar.f38570a) && Intrinsics.d(this.f38571b, hzVar.f38571b) && Intrinsics.d(this.f38572c, hzVar.f38572c);
    }

    public final int hashCode() {
        return this.f38572c.hashCode() + a.cb.d(this.f38571b, this.f38570a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotifLandingContext(utmSource=");
        sb3.append(this.f38570a);
        sb3.append(", messageType=");
        sb3.append(this.f38571b);
        sb3.append(", trackingId=");
        return a.a.p(sb3, this.f38572c, ")");
    }
}
