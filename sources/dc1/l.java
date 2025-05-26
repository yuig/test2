package dc1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class l extends m1 implements o {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f54381h;

    /* renamed from: i, reason: collision with root package name */
    public final String f54382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Integer num, String str, @NotNull k1 descriptionProvider, boolean z13, @NotNull String apiField) {
        super(num, z13, str, false, 8, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        Intrinsics.checkNotNullParameter(apiField, "apiField");
        this.f54381h = descriptionProvider;
        this.f54382i = apiField;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f54381h;
    }

    public /* synthetic */ l(Integer num, String str, k1 k1Var, boolean z13, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, k1Var, z13, str2);
    }
}
