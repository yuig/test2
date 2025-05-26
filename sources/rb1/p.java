package rb1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n91.z;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class p extends m1 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f107091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z13, @NotNull k1 descriptionProvider) {
        super(Integer.valueOf(f52.c.settings_parental_passcode_settings_item_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f107091h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f107091h;
    }

    public /* synthetic */ p(boolean z13, k1 k1Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, (i13 & 2) != 0 ? z.d() : k1Var);
    }
}
