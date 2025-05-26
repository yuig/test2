package ac1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class c extends h1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public String f1914f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1915g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f1916h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String displayableValue) {
        super(h52.c.settings_personal_information_contact_name);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f1914f = displayableValue;
        this.f1915g = 2;
        this.f1916h = (ScreenLocation) h4.f50915d.getValue();
        this.f1917i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f1917i;
    }

    @Override // va1.c
    public final String e() {
        return this.f1914f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f1915g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f1916h;
    }
}
