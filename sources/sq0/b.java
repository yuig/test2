package sq0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends eb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final nr0.j f114980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f114981f;

    /* renamed from: g, reason: collision with root package name */
    public final int f114982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f114983h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i13, int i14, int i15, int i16, int i17, int i18, nr0.j dataSource) {
        super(i13, i14, i15, i16);
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f114983h = eVar;
        this.f114980e = dataSource;
        this.f114981f = i17;
        this.f114982g = i18;
    }

    @Override // eb2.a
    public final int a(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((!this.f114983h.A4(i13)) && this.f114980e.e(i13)) {
            return super.a(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int b(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        nr0.j jVar = this.f114980e;
        if (jVar.c3(i13)) {
            return -this.f114981f;
        }
        if (jVar.k2(i13)) {
            return super.b(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int c(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        nr0.j jVar = this.f114980e;
        if (jVar.c3(i13)) {
            return -this.f114982g;
        }
        if (jVar.f3(i13)) {
            return super.c(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int d(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        tq0.b[] bVarArr = e.I0;
        e eVar = this.f114983h;
        int p83 = eVar.p8();
        if (i13 < p83) {
            return 0;
        }
        nr0.j jVar = this.f114980e;
        if (i13 != p83) {
            int i14 = 0;
            while (jVar.n0(i14)) {
                i14++;
            }
            int i15 = p83 + i14;
            int z03 = eVar.getZ0() + i15;
            if (i13 < i15 || i13 >= z03) {
                return 0;
            }
        }
        if (jVar.h(i13)) {
            return super.d(view, i13);
        }
        return 0;
    }
}
