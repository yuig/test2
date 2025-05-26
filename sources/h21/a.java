package h21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final m21.a f66542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66543b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66544c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull m21.a carouselViewModel, String str, boolean z13) {
        super(null);
        Intrinsics.checkNotNullParameter(carouselViewModel, "carouselViewModel");
        this.f66542a = carouselViewModel;
        this.f66543b = str;
        this.f66544c = z13;
        this.f66545d = RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE;
    }

    @Override // h21.e, dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f66542a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f66542a, aVar.f66542a) && Intrinsics.d(this.f66543b, aVar.f66543b) && this.f66544c == aVar.f66544c;
    }

    @Override // h21.e
    public final int getViewType() {
        return this.f66545d;
    }

    public final int hashCode() {
        int hashCode = this.f66542a.hashCode() * 31;
        String str = this.f66543b;
        return Boolean.hashCode(this.f66544c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "FixedSizePinImageModel(carouselViewModel=" + this.f66542a + ", dominantColor=" + this.f66543b + ", isSelected=" + this.f66544c + ")";
    }

    public /* synthetic */ a(m21.a aVar, String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? false : z13);
    }
}
