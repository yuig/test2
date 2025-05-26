package l0;

import c0.x0;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import l7.s0;
import pk.v2;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81257d;

    public /* synthetic */ p(Object obj, int i13, int i14, int i15) {
        this.f81254a = i15;
        this.f81257d = obj;
        this.f81255b = i13;
        this.f81256c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f81254a;
        boolean z13 = true;
        int i14 = this.f81256c;
        int i15 = this.f81255b;
        Object obj = this.f81257d;
        switch (i13) {
            case 0:
                s sVar = (s) obj;
                if (sVar.f81275i != i15) {
                    sVar.f81275i = i15;
                } else {
                    z13 = false;
                }
                if (sVar.f81274h != i14) {
                    sVar.f81274h = i14;
                } else if (!z13) {
                }
                sVar.f();
                break;
            case 1:
                n8.s sVar2 = (n8.s) ((s0) ((x0) obj).f24392b).f81859d;
                a7.q a13 = sVar2.f89882k.a();
                a13.f1188u = i15;
                a13.f1189v = i14;
                androidx.media3.common.b bVar = new androidx.media3.common.b(a13);
                sVar2.f89882k = bVar;
                sVar2.f89878g.c(bVar, v2.f100502e);
                break;
            default:
                PinterestRecyclerView this_with = (PinterestRecyclerView) obj;
                int i16 = SearchGridMultiSectionFragment.O2;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                this_with.h(i15 + i14, true);
                break;
        }
    }
}
