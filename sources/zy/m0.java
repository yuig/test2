package zy;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final u50.r f143088a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f143089b;

    public m0(u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f143088a = eventIntake;
        this.f143089b = new ArrayList();
    }

    @Override // zy.m
    public final void c(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof h32.r) {
            this.f143089b.add(impression);
        }
    }

    @Override // zy.m
    public final void d() {
        ArrayList arrayList = this.f143089b;
        if (!arrayList.isEmpty()) {
            this.f143088a.a(new c(new ArrayList(arrayList)));
            arrayList.clear();
        }
    }
}
