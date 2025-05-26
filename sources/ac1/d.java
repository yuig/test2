package ac1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class d extends h1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public String f1918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1919g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f1920h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1921i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String displayableValue) {
        super(c52.e.settings_personal_information_country_region);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f1918f = displayableValue;
        this.f1919g = 2;
        this.f1920h = (ScreenLocation) h4.f50916e.getValue();
        this.f1921i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f1921i;
    }

    @Override // va1.c
    public final String e() {
        return this.f1918f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f1919g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f1920h;
    }
}
