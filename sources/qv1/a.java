package qv1;

import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import xv1.l;
import yk1.m;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinterestRecyclerView f105241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f105242c;

    public /* synthetic */ a(PinterestRecyclerView pinterestRecyclerView, int i13, int i14) {
        this.f105240a = i14;
        this.f105241b = pinterestRecyclerView;
        this.f105242c = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f105240a;
        int i14 = this.f105242c;
        PinterestRecyclerView this_with = this.f105241b;
        switch (i13) {
            case 0:
                int i15 = OneBarContainer.f49979k;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                m h03 = j1.h0(this_with, i14);
                l lVar = h03 instanceof l ? (l) h03 : null;
                if (lVar != null) {
                    lVar.r3(true);
                    break;
                }
                break;
            default:
                int i16 = OneBarContainer.f49979k;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                this_with.h(i14, false);
                this_with.post(new a(this_with, i14, 0));
                break;
        }
    }
}
