package bq0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.a1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import va1.j1;

/* loaded from: classes5.dex */
public final class e extends j1 implements va1.e, va1.h, i {

    /* renamed from: e, reason: collision with root package name */
    public final int f23686e;

    /* renamed from: f, reason: collision with root package name */
    public final q f23687f;

    /* renamed from: g, reason: collision with root package name */
    public final ScreenLocation f23688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Pair<Integer, String> menuItemNameStringRes) {
        super((Integer) menuItemNameStringRes.f80346a, (String) menuItemNameStringRes.f80347b);
        Intrinsics.checkNotNullParameter(menuItemNameStringRes, "menuItemNameStringRes");
        this.f23686e = 7;
        this.f23687f = q.ARROW_FORWARD;
        this.f23688g = (ScreenLocation) a1.f50503j.getValue();
        ml1.b.MODAL_TRANSITION.getValue();
    }

    @Override // va1.e
    public final q g() {
        return this.f23687f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f23686e;
    }
}
