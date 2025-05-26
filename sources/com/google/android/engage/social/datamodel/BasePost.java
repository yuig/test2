package com.google.android.engage.social.datamodel;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ok.v;

@Keep
/* loaded from: classes3.dex */
public abstract class BasePost extends AbstractSafeParcelable {
    protected final Long timestamp;

    @Keep
    public static abstract class Builder<BuilderT extends Builder> {
        protected Long timestamp;

        @NonNull
        public abstract BasePost build();

        @NonNull
        public BuilderT setTimestamp(long j13) {
            this.timestamp = Long.valueOf(j13);
            return this;
        }
    }

    public BasePost(Long l13) {
        this.timestamp = l13;
    }

    @NonNull
    public v getTimestamp() {
        return v.a(this.timestamp);
    }

    public Long getTimestampInternal() {
        return this.timestamp;
    }
}
