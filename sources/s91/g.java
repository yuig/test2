package s91;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class g extends g1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f112067f;

    /* renamed from: g, reason: collision with root package name */
    public final rq0.a f112068g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f112069h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112070i;

    /* renamed from: j, reason: collision with root package name */
    public final int f112071j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull k1 descriptionProvider, @NotNull rq0.a eligibility) {
        super(Integer.valueOf(c52.e.settings_account_management_convert_to_personal_title), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f112067f = descriptionProvider;
        this.f112068g = eligibility;
        this.f112069h = (ScreenLocation) b4.f50575u.getValue();
        this.f112070i = 2;
        this.f112071j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112067f;
    }

    @Override // va1.h
    public final int c() {
        return this.f112071j;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112070i;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112069h;
    }
}
