package com.google.android.engage.common.datamodel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.engage.common.datamodel.Entity;
import com.google.android.gms.common.annotation.KeepName;
import java.util.List;

@KeepName
/* loaded from: classes3.dex */
public abstract class EngagementEntity extends Entity {

    /* renamed from: f, reason: collision with root package name */
    public final String f30266f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f30267g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30268h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30269i;

    @Keep
    public static abstract class Builder<BuilderT extends Builder> extends Entity.Builder<BuilderT> {

        @NonNull
        protected String actionText;

        @NonNull
        protected Uri actionUri;
        protected String subtitle;
        protected String title;

        @Override // com.google.android.engage.common.datamodel.Entity.Builder
        @NonNull
        public abstract EngagementEntity build();

        @NonNull
        public BuilderT setActionText(@NonNull String str) {
            this.actionText = str;
            return this;
        }

        @NonNull
        public BuilderT setActionUri(@NonNull Uri uri) {
            this.actionUri = uri;
            return this;
        }

        @NonNull
        public BuilderT setSubtitle(@NonNull String str) {
            this.subtitle = str;
            return this;
        }

        @NonNull
        public BuilderT setTitle(@NonNull String str) {
            this.title = str;
            return this;
        }
    }

    public EngagementEntity(int i13, Uri uri, String str, String str2, String str3, List list) {
        super(i13, list);
        bf.b.j("Action Text cannot be empty", !TextUtils.isEmpty(str));
        this.f30266f = str;
        bf.b.j("Action Uri cannot be empty", uri != null);
        this.f30267g = uri;
        this.f30268h = str2;
        this.f30269i = str3;
    }
}
