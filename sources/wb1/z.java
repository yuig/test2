package wb1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class z extends g1 implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f129066f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129067g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f129068h;

    /* renamed from: i, reason: collision with root package name */
    public final int f129069i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i13, @NotNull k1 descriptionProvider) {
        super(Integer.valueOf(i13), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129066f = descriptionProvider;
        this.f129067g = 2;
        this.f129068h = (ScreenLocation) b4.f50556b.getValue();
        this.f129069i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129066f;
    }

    @Override // va1.h
    public final int c() {
        return this.f129069i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129067g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f129068h;
    }
}
