package wb1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class m0 extends m1 implements q0 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f129038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@NotNull k1 descriptionProvider, boolean z13) {
        super(Integer.valueOf(c52.e.settings_social_permissions_pinner_manual_filter_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129038h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129038h;
    }
}
