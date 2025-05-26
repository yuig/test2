package l41;

import dl1.s;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z92.e;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f81552a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f81553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81554c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f81555d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81556e;

    public b(@NotNull List<e> actionableIcons, @NotNull Function0<Unit> onSearchTappedCallback, @NotNull String searchHint, @NotNull Function0<Unit> onVoiceSearchTappedCallback) {
        Intrinsics.checkNotNullParameter(actionableIcons, "actionableIcons");
        Intrinsics.checkNotNullParameter(onSearchTappedCallback, "onSearchTappedCallback");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(onVoiceSearchTappedCallback, "onVoiceSearchTappedCallback");
        this.f81552a = actionableIcons;
        this.f81553b = onSearchTappedCallback;
        this.f81554c = searchHint;
        this.f81555d = onVoiceSearchTappedCallback;
        this.f81556e = cp2.a.a(8);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String _uid = this.f81556e;
        Intrinsics.checkNotNullExpressionValue(_uid, "_uid");
        return _uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.profile.lego.navigation.model.LegoSearchCellViewModel");
        b bVar = (b) obj;
        if (Intrinsics.d(this.f81552a, bVar.f81552a)) {
            return Intrinsics.d(this.f81554c, bVar.f81554c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f81554c.hashCode() + (this.f81552a.hashCode() * 31);
    }

    public b(List list, Function0 function0, String str, Function0 function02, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? q0.f80391a : list, function0, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? a.f81551i : function02);
    }
}
