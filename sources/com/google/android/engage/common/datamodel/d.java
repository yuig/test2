package com.google.android.engage.common.datamodel;

import com.google.android.engage.common.datamodel.Cluster;

/* loaded from: classes3.dex */
public final class d extends Cluster.Builder {
    public final void a(SignInCardEntity signInCardEntity) {
        super.addEntity(signInCardEntity);
    }

    @Override // com.google.android.engage.common.datamodel.Cluster.Builder, com.google.android.engage.common.datamodel.BaseCluster.Builder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final EngagementCluster build() {
        return new EngagementCluster(8, this.entityListBuilder.i());
    }
}
