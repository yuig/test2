package wb1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l0 extends va1.t implements q0 {

    /* renamed from: c, reason: collision with root package name */
    public List f129035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull List<String> filterList) {
        super(filterList);
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        this.f129035c = filterList;
        this.f129036d = 7;
    }

    @Override // va1.t
    public final List a() {
        return this.f129035c;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129036d;
    }
}
