package n90;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes5.dex */
public final class n extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final r f90022a;

    /* renamed from: b, reason: collision with root package name */
    public int f90023b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f90024c;

    public n(l82.c eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f90022a = eventIntake;
        this.f90024c = true;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i15 = this.f90023b + i14;
        this.f90023b = i15;
        if (i15 <= 500 || !this.f90024c) {
            return;
        }
        this.f90024c = false;
        this.f90022a.a(new m90.l());
    }
}
