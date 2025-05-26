package kv0;

import com.pinterest.api.model.wz;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f81011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81012b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81013c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81014d;

    /* renamed from: e, reason: collision with root package name */
    public final wz f81015e;

    /* renamed from: f, reason: collision with root package name */
    public final t f81016f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81017g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f81018h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81019i;

    public u(@NotNull String pinId, String str, String str2, String str3, wz wzVar, @NotNull t rating, String str4, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(rating, "rating");
        this.f81011a = pinId;
        this.f81012b = str;
        this.f81013c = str2;
        this.f81014d = str3;
        this.f81015e = wzVar;
        this.f81016f = rating;
        this.f81017g = str4;
        this.f81018h = z13;
        this.f81019i = z14;
    }

    public static u a(u uVar, boolean z13) {
        String pinId = uVar.f81011a;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        t rating = uVar.f81016f;
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new u(pinId, uVar.f81012b, uVar.f81013c, uVar.f81014d, uVar.f81015e, rating, uVar.f81017g, z13, uVar.f81019i);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String simpleName = u.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f81011a, uVar.f81011a) && Intrinsics.d(this.f81012b, uVar.f81012b) && Intrinsics.d(this.f81013c, uVar.f81013c) && Intrinsics.d(this.f81014d, uVar.f81014d) && Intrinsics.d(this.f81015e, uVar.f81015e) && Intrinsics.d(this.f81016f, uVar.f81016f) && Intrinsics.d(this.f81017g, uVar.f81017g) && this.f81018h == uVar.f81018h && this.f81019i == uVar.f81019i;
    }

    public final int hashCode() {
        int hashCode = this.f81011a.hashCode() * 31;
        String str = this.f81012b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81013c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81014d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        wz wzVar = this.f81015e;
        int hashCode5 = (this.f81016f.hashCode() + ((hashCode4 + (wzVar == null ? 0 : wzVar.hashCode())) * 31)) * 31;
        String str4 = this.f81017g;
        return Boolean.hashCode(this.f81019i) + ep.b.e(this.f81018h, (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinProductTagsItemModel(pinId=");
        sb3.append(this.f81011a);
        sb3.append(", imageUrl=");
        sb3.append(this.f81012b);
        sb3.append(", title=");
        sb3.append(this.f81013c);
        sb3.append(", creator=");
        sb3.append(this.f81014d);
        sb3.append(", offer=");
        sb3.append(this.f81015e);
        sb3.append(", rating=");
        sb3.append(this.f81016f);
        sb3.append(", shipping=");
        sb3.append(this.f81017g);
        sb3.append(", isInvisibleTag=");
        sb3.append(this.f81018h);
        sb3.append(", isOutOfStock=");
        return a.a.r(sb3, this.f81019i, ")");
    }

    public /* synthetic */ u(String str, String str2, String str3, String str4, wz wzVar, t tVar, String str5, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, wzVar, tVar, str5, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? true : z13, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z14);
    }
}
