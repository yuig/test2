package s91;

import com.pinterest.framework.screens.NoneLocation;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class r extends g1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f112104f;

    /* renamed from: g, reason: collision with root package name */
    public final NoneLocation f112105g;

    /* renamed from: h, reason: collision with root package name */
    public final int f112106h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112107i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull k1 descriptionProvider) {
        super(Integer.valueOf(c52.e.settings_account_management_unlink_account_title), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112104f = descriptionProvider;
        this.f112105g = NoneLocation.NONE;
        this.f112106h = 2;
        this.f112107i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112104f;
    }

    @Override // va1.h
    public final int c() {
        return this.f112107i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112106h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112105g;
    }
}
