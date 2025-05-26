package uc1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class e extends m1 implements g {

    /* renamed from: h, reason: collision with root package name */
    public final h f121899h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f121900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull h mfaEligibility, @NotNull k1 descriptionProvider, boolean z13) {
        super(Integer.valueOf(l52.c.settings_security_multi_factor_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(mfaEligibility, "mfaEligibility");
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f121899h = mfaEligibility;
        this.f121900i = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f121900i;
    }
}
