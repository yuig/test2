package nn2;

import dm2.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f91586a;

    public e(ArrayList arrayList) {
        this.f91586a = arrayList;
    }

    @Override // com.bumptech.glide.d
    public final void f(am2.d fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        bn2.o.t(fakeOverride, null);
        this.f91586a.add(fakeOverride);
    }

    @Override // com.bumptech.glide.d
    public final void x(am2.d fromSuper, am2.d fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof z) {
            ((z) fromCurrent).A0(am2.t.f15590a, fromSuper);
        }
    }
}
