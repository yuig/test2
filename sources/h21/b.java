package h21;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f66546a;

    /* renamed from: b, reason: collision with root package name */
    public final o21.b f66547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f66548c;

    /* renamed from: d, reason: collision with root package name */
    public final ze1.a f66549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f66551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull f30 pin, @NotNull o21.b dimensions, boolean z13, ze1.a aVar, int i13) {
        super(null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.f66546a = pin;
        this.f66547b = dimensions;
        this.f66548c = z13;
        this.f66549d = aVar;
        this.f66550e = i13;
        this.f66551f = i13;
    }

    @Override // h21.e, dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f66546a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f66546a, bVar.f66546a) && Intrinsics.d(this.f66547b, bVar.f66547b) && this.f66548c == bVar.f66548c && Intrinsics.d(this.f66549d, bVar.f66549d) && this.f66550e == bVar.f66550e;
    }

    @Override // h21.e
    public final int getViewType() {
        return this.f66551f;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f66548c, (this.f66547b.hashCode() + (this.f66546a.hashCode() * 31)) * 31, 31);
        ze1.a aVar = this.f66549d;
        return Integer.hashCode(this.f66550e) + ((e13 + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FixedSizePinModel(pin=");
        sb3.append(this.f66546a);
        sb3.append(", dimensions=");
        sb3.append(this.f66547b);
        sb3.append(", shouldShowPricePill=");
        sb3.append(this.f66548c);
        sb3.append(", productMetadataViewSpec=");
        sb3.append(this.f66549d);
        sb3.append(", recyclerViewType=");
        return a.a.n(sb3, this.f66550e, ")");
    }

    public /* synthetic */ b(f30 f30Var, o21.b bVar, boolean z13, ze1.a aVar, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, bVar, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : i13);
    }
}
