package ue1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f122081a;

    /* renamed from: b, reason: collision with root package name */
    public final xe1.f f122082b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122083c;

    public z(@NotNull String actionId, @NotNull xe1.f actionItemStyleModel) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionItemStyleModel, "actionItemStyleModel");
        this.f122081a = actionId;
        this.f122082b = actionItemStyleModel;
        this.f122083c = RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f122081a;
    }

    @Override // ue1.a0
    public final String d() {
        xe1.a aVar = this.f122082b.f134707c;
        if (aVar != null) {
            return aVar.f134667c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f122081a, zVar.f122081a) && Intrinsics.d(this.f122082b, zVar.f122082b);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return this.f122082b.hashCode() + (this.f122081a.hashCode() * 31);
    }

    @Override // ue1.a0
    public final p i() {
        return null;
    }

    @Override // ue1.a0
    public final int m() {
        return this.f122083c;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        return xe1.v.f134804s;
    }

    public final String toString() {
        return "StoryEndCellActionModel(actionId=" + this.f122081a + ", actionItemStyleModel=" + this.f122082b + ")";
    }
}
