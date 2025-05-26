package com.pinterest.feature.settings.notifications;

import com.pinterest.api.model.mz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48239a;

    /* renamed from: b, reason: collision with root package name */
    public final mz f48240b;

    public m(String id3, mz subcategory) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(subcategory, "subcategory");
        this.f48239a = id3;
        this.f48240b = subcategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f48239a, mVar.f48239a) && Intrinsics.d(this.f48240b, mVar.f48240b);
    }

    public final int hashCode() {
        return this.f48240b.hashCode() + (this.f48239a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionsLoaded(id=" + this.f48239a + ", subcategory=" + this.f48240b + ")";
    }
}
