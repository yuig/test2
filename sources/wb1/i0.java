package wb1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class i0 extends g1 implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f129021f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129022g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f129023h;

    /* renamed from: i, reason: collision with root package name */
    public final int f129024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i13, @NotNull k1 descriptionProvider) {
        super(Integer.valueOf(i13), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129021f = descriptionProvider;
        this.f129022g = 2;
        this.f129023h = (ScreenLocation) b4.f50564j.getValue();
        this.f129024i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129021f;
    }

    @Override // va1.h
    public final int c() {
        return this.f129024i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129022g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f129023h;
    }
}
