package m91;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wt1.e0;

/* loaded from: classes5.dex */
public final class e extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final List f86729h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86730i;

    public e(ArrayList countries, boolean z13) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f86730i = z13;
        if (z13) {
            o(0, new sz0.a(23));
        }
        o(1, new h90.m(this, 20));
        ArrayList arrayList = new ArrayList();
        if (z13) {
            arrayList.add(c.f86726c);
        }
        arrayList.addAll(countries);
        k(arrayList);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((d) d().get(i13)).f86727a;
    }
}
