package dc1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import va1.j1;

/* loaded from: classes5.dex */
public final class j extends j1 implements o {

    /* renamed from: e, reason: collision with root package name */
    public final int f54379e;

    public /* synthetic */ j(Integer num, String str, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, i13);
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f54379e;
    }

    public j(Integer num, String str, int i13) {
        super(num, str);
        this.f54379e = i13;
    }
}
