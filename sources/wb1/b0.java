package wb1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class b0 extends g1 implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f129006f;

    /* renamed from: g, reason: collision with root package name */
    public int f129007g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129008h;

    /* renamed from: i, reason: collision with root package name */
    public final ScreenLocation f129009i;

    /* renamed from: j, reason: collision with root package name */
    public final int f129010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i13, @NotNull k1 descriptionProvider, int i14) {
        super(Integer.valueOf(i13), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129006f = descriptionProvider;
        this.f129007g = i14;
        this.f129008h = 2;
        this.f129009i = (ScreenLocation) b4.f50562h.getValue();
        this.f129010j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129006f;
    }

    @Override // va1.h
    public final int c() {
        return this.f129010j;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129008h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f129009i;
    }
}
