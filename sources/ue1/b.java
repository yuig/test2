package ue1;

import a.cb;
import com.pinterest.api.model.u8;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final u8 f121981a;

    /* renamed from: b, reason: collision with root package name */
    public final e f121982b;

    /* renamed from: c, reason: collision with root package name */
    public final we1.k f121983c;

    /* renamed from: d, reason: collision with root package name */
    public final int f121984d;

    /* renamed from: e, reason: collision with root package name */
    public final String f121985e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121986f;

    /* renamed from: g, reason: collision with root package name */
    public final String f121987g;

    public b(@NotNull u8 boardMoreIdeasFeedUpsell, @NotNull e repStyle, @NotNull we1.k tapListener, int i13, @NotNull String storyType, int i14, @NotNull String storyId) {
        Intrinsics.checkNotNullParameter(boardMoreIdeasFeedUpsell, "boardMoreIdeasFeedUpsell");
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        Intrinsics.checkNotNullParameter(tapListener, "tapListener");
        Intrinsics.checkNotNullParameter(storyType, "storyType");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f121981a = boardMoreIdeasFeedUpsell;
        this.f121982b = repStyle;
        this.f121983c = tapListener;
        this.f121984d = i13;
        this.f121985e = storyType;
        this.f121986f = i14;
        this.f121987g = storyId;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f121981a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    @Override // ue1.a0
    public final String d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f121981a, bVar.f121981a) && this.f121982b == bVar.f121982b && Intrinsics.d(this.f121983c, bVar.f121983c) && this.f121984d == bVar.f121984d && Intrinsics.d(this.f121985e, bVar.f121985e) && this.f121986f == bVar.f121986f && Intrinsics.d(this.f121987g, bVar.f121987g);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return this.f121987g.hashCode() + ep.b.b(this.f121986f, cb.d(this.f121985e, ep.b.b(this.f121984d, (this.f121983c.hashCode() + ((this.f121982b.hashCode() + (this.f121981a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    @Override // ue1.a0
    public final p i() {
        return this.f121982b;
    }

    @Override // ue1.a0
    public final int m() {
        int i13 = a.f121980a[this.f121982b.ordinal()];
        if (i13 == 1) {
            return RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD;
        }
        if (i13 == 2) {
            return RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        int i13 = a.f121980a[this.f121982b.ordinal()];
        if (i13 == 1) {
            return xe1.v.f134804s;
        }
        if (i13 == 2) {
            return eo1.c.lego_corner_radius_small;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardMoreIdeasFeedUpsellViewModel(boardMoreIdeasFeedUpsell=");
        sb3.append(this.f121981a);
        sb3.append(", repStyle=");
        sb3.append(this.f121982b);
        sb3.append(", tapListener=");
        sb3.append(this.f121983c);
        sb3.append(", totalObjectCount=");
        sb3.append(this.f121984d);
        sb3.append(", storyType=");
        sb3.append(this.f121985e);
        sb3.append(", storyGridPosition=");
        sb3.append(this.f121986f);
        sb3.append(", storyId=");
        return a.a.p(sb3, this.f121987g, ")");
    }
}
