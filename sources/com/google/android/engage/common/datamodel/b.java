package com.google.android.engage.common.datamodel;

import com.google.android.engage.common.datamodel.EngagementEntity;
import pk.v2;

/* loaded from: classes3.dex */
public final class b extends EngagementEntity.Builder {
    @Override // com.google.android.engage.common.datamodel.EngagementEntity.Builder, com.google.android.engage.common.datamodel.Entity.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SignInCardEntity build() {
        v2 i13 = this.posterImageBuilder.i();
        return new SignInCardEntity(23, this.actionUri, this.actionText, this.title, this.subtitle, i13);
    }
}
