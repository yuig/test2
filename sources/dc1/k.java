package dc1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class k extends m1 implements o {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f54380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull k1 descriptionProvider, boolean z13) {
        super(Integer.valueOf(i52.c.settings_privacy_data_profiling_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f54380h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f54380h;
    }
}
