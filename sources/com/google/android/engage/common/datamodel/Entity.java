package com.google.android.engage.common.datamodel;

import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import pk.c1;
import pk.x0;
import tf.f;

@Keep
/* loaded from: classes3.dex */
public abstract class Entity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Entity> CREATOR = new f(17);
    protected final int entityType;

    @NonNull
    protected final List<Image> posterImages;

    @Keep
    public static abstract class Builder<T extends Builder> {

        @NonNull
        protected final x0 posterImageBuilder = c1.n();

        @NonNull
        public T addPosterImage(@NonNull Image image) {
            this.posterImageBuilder.e(image);
            return this;
        }

        @NonNull
        public T addPosterImages(@NonNull List<Image> list) {
            this.posterImageBuilder.b(list);
            return this;
        }

        @NonNull
        public abstract Entity build();
    }

    public Entity(int i13, @NonNull List<Image> list) {
        this.entityType = i13;
        this.posterImages = list;
        validatePosterImages(list);
    }

    public int getEntityType() {
        return this.entityType;
    }

    @NonNull
    public List<Image> getPosterImages() {
        return this.posterImages;
    }

    public void validatePosterImages(@NonNull List<Image> list) {
        bf.b.j("Poster images cannot be empty", !list.isEmpty());
    }
}
