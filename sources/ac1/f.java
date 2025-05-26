package ac1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class f extends h1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public String f1926f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1927g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f1928h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1929i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull String displayableValue) {
        super(c52.e.settings_personal_information_language);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f1926f = displayableValue;
        this.f1927g = 2;
        this.f1928h = (ScreenLocation) h4.f50918g.getValue();
        this.f1929i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f1929i;
    }

    @Override // va1.c
    public final String e() {
        return this.f1926f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f1927g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f1928h;
    }
}
