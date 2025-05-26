package va1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c1 extends u implements e1 {

    /* renamed from: g, reason: collision with root package name */
    public final int f125160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(@NotNull String linkUrl) {
        super(c52.e.settings_menu_teen_safety_resources, n91.z.c(linkUrl));
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        this.f125160g = 13;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f125160g;
    }
}
