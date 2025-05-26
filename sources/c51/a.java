package c51;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.component.board.view.LegoBoardRep;
import dc0.h;
import dc0.i;
import ey.u3;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.u;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f26498a;

    public a(b bVar) {
        this.f26498a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h imageLoadedEvent) {
        Intrinsics.checkNotNullParameter(imageLoadedEvent, "imageLoadedEvent");
        boolean z13 = imageLoadedEvent.f54324a;
        b bVar = this.f26498a;
        RecyclerView recyclerView = bVar.f26499a;
        l2 l2Var = recyclerView.f19242n;
        int E = l2Var != null ? l2Var.E() : -1;
        qc2.d dVar = new qc2.d();
        int[] iArr = new int[2];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < E; i15++) {
            l2 l2Var2 = recyclerView.f19242n;
            View D = l2Var2 != null ? l2Var2.D(i15) : 0;
            if (D instanceof i) {
                D.getLocationOnScreen(iArr);
                D.isLaidOut();
                if (bs1.c.o1(D) && dVar.e(D, recyclerView)) {
                    i14++;
                }
                if (((LegoBoardRep) ((i) D)).f44740x) {
                    i13++;
                }
            }
        }
        if (i13 != i14 || i13 < bVar.f26503e / 2) {
            return;
        }
        String userUid = bVar.f26500b;
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        u3 u3Var = new u3(bVar.f26501c, 2);
        u3Var.f60585e = userUid;
        u3Var.f60586f = "SQUARE_VIEW";
        u3Var.f60587g = z13;
        u3Var.i();
        u.f85943a.j(bVar.f26502d);
        bVar.f26499a.w2(bVar);
    }
}
