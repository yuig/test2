package j51;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.component.board.view.LegoBoardRep;
import i32.y0;
import ja.i0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oi.o6;
import rg0.l0;

/* loaded from: classes5.dex */
public final class u implements xa.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js1.a f74772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f74773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f74774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f74775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj2.b f74776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f74777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0 f74778g;

    public u(js1.a aVar, RecyclerView recyclerView, d0 d0Var, w wVar, xj2.b bVar, l0 l0Var, y0 y0Var) {
        this.f74772a = aVar;
        this.f74773b = recyclerView;
        this.f74774c = d0Var;
        this.f74775d = wVar;
        this.f74776e = bVar;
        this.f74777f = l0Var;
        this.f74778g = y0Var;
    }

    @Override // xa.i
    public final void A5(int i13) {
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
    }

    @Override // xa.i
    public final void i5(int i13) {
        Object obj;
        if (i13 != 0) {
            return;
        }
        js1.a aVar = this.f74772a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        aVar.f77571a.remove(this);
        aVar.b();
        RecyclerView recyclerView = this.f74773b;
        Iterator it = d7.b.O(recyclerView).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KeyEvent.Callback callback = (View) obj;
            if ((callback instanceof dc0.i) && Intrinsics.d(((LegoBoardRep) ((dc0.i) callback)).f44739w, this.f74777f.f108051c)) {
                break;
            }
        }
        KeyEvent.Callback callback2 = (View) obj;
        xj2.b bVar = this.f74776e;
        w wVar = this.f74775d;
        d0 d0Var = this.f74774c;
        if (callback2 != null) {
            if (d0.p9(d0Var, recyclerView, this.f74778g, bVar, (dc0.i) callback2)) {
                recyclerView.post(new o6(d0Var, wVar, 13));
                return;
            }
        }
        d0Var.addRecyclerViewEventListener(wVar);
        bVar.a(new xj2.a(new i0(d0Var, wVar)));
    }
}
