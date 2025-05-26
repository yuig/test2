package com.google.android.engage.common.datamodel;

import android.net.Uri;
import com.google.android.engage.common.datamodel.Cluster;
import pk.v2;

/* loaded from: classes3.dex */
public final class a extends Cluster.Builder {

    /* renamed from: a, reason: collision with root package name */
    public String f30275a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f30276b;

    @Override // com.google.android.engage.common.datamodel.Cluster.Builder, com.google.android.engage.common.datamodel.BaseCluster.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RecommendationCluster build() {
        v2 i13 = this.entityListBuilder.i();
        return new RecommendationCluster(1, this.f30276b, this.f30275a, null, null, i13);
    }
}
