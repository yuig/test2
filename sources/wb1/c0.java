package wb1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c0 extends va1.t implements q0 {

    /* renamed from: c, reason: collision with root package name */
    public List f129011c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull List<String> filterList) {
        super(filterList);
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        this.f129011c = filterList;
        this.f129012d = 7;
    }

    @Override // va1.t
    public final List a() {
        return this.f129011c;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129012d;
    }
}
