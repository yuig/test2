package s91;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class k extends g1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f112086f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f112087g;

    /* renamed from: h, reason: collision with root package name */
    public ScreenLocation f112088h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112089i;

    /* renamed from: j, reason: collision with root package name */
    public final int f112090j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull k1 descriptionProvider, @NotNull k1 disclaimerProvider, @NotNull ScreenLocation targetLocation) {
        super(Integer.valueOf(c52.e.settings_account_management_parental_passcode_title), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        this.f112086f = descriptionProvider;
        this.f112087g = disclaimerProvider;
        this.f112088h = targetLocation;
        this.f112089i = 2;
        this.f112090j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112086f;
    }

    @Override // va1.h
    public final int c() {
        return this.f112090j;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112089i;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112088h;
    }
}
