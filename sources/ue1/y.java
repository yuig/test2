package ue1;

import a.cb;
import com.pinterest.api.model.fi0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final fi0 f122075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122077c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f122078d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f122079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122080f;

    public y(@NotNull fi0 shuffle, @NotNull String actionId, @NotNull String imageUrl, @NotNull Function2<? super String, ? super Integer, Unit> onDraftTapped, @NotNull Function1<? super String, Unit> onOverflowMenuTapped) {
        Intrinsics.checkNotNullParameter(shuffle, "shuffle");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onDraftTapped, "onDraftTapped");
        Intrinsics.checkNotNullParameter(onOverflowMenuTapped, "onOverflowMenuTapped");
        this.f122075a = shuffle;
        this.f122076b = actionId;
        this.f122077c = imageUrl;
        this.f122078d = onDraftTapped;
        this.f122079e = onOverflowMenuTapped;
        this.f122080f = RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f122076b;
    }

    @Override // ue1.a0
    public final String d() {
        return this.f122077c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f122075a, yVar.f122075a) && Intrinsics.d(this.f122076b, yVar.f122076b) && Intrinsics.d(this.f122077c, yVar.f122077c) && Intrinsics.d(this.f122078d, yVar.f122078d) && Intrinsics.d(this.f122079e, yVar.f122079e);
    }

    @Override // ue1.a0
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return this.f122079e.hashCode() + ((this.f122078d.hashCode() + cb.d(this.f122077c, cb.d(this.f122076b, this.f122075a.hashCode() * 31, 31), 31)) * 31);
    }

    @Override // ue1.a0
    public final p i() {
        return t.IDEA_PIN_REP;
    }

    @Override // ue1.a0
    public final int m() {
        return this.f122080f;
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
        return "ShuffleRepItemViewModel(shuffle=" + this.f122075a + ", actionId=" + this.f122076b + ", imageUrl=" + this.f122077c + ", onDraftTapped=" + this.f122078d + ", onOverflowMenuTapped=" + this.f122079e + ")";
    }

    public /* synthetic */ y(fi0 fi0Var, String str, String str2, Function2 function2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fi0Var, str, str2, function2, (i13 & 16) != 0 ? x.f122074i : function1);
    }
}
