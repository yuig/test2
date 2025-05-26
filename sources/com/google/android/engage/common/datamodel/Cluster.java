package com.google.android.engage.common.datamodel;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.engage.common.datamodel.BaseCluster;
import java.util.List;
import pk.c1;
import pk.x0;

@Keep
/* loaded from: classes3.dex */
public abstract class Cluster extends BaseCluster {

    @NonNull
    protected final List<Entity> entities;

    @Keep
    public static abstract class Builder<BuilderT extends Builder> extends BaseCluster.Builder {

        @NonNull
        protected final x0 entityListBuilder = c1.n();

        @NonNull
        public BuilderT addEntity(@NonNull Entity entity) {
            this.entityListBuilder.e(entity);
            return this;
        }

        @Override // com.google.android.engage.common.datamodel.BaseCluster.Builder
        @NonNull
        public abstract Cluster build();
    }

    public Cluster(int i13, @NonNull List<Entity> list) {
        super(i13);
        this.entities = list;
    }

    @NonNull
    public List<Entity> getEntities() {
        return this.entities;
    }
}
