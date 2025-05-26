package j51;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.component.board.view.LegoBoardRep;
import i32.y0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import rg0.l0;

/* loaded from: classes5.dex */
public final class w extends ar0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f74782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f74783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f74784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0 f74785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj2.b f74786e;

    public w(l0 l0Var, d0 d0Var, RecyclerView recyclerView, y0 y0Var, xj2.b bVar) {
        this.f74782a = l0Var;
        this.f74783b = d0Var;
        this.f74784c = recyclerView;
        this.f74785d = y0Var;
        this.f74786e = bVar;
    }

    @Override // ar0.s, ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        Object obj;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 != 0) {
            return;
        }
        Iterator it = d7.b.O(recyclerView).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KeyEvent.Callback callback = (View) obj;
            if ((callback instanceof dc0.i) && Intrinsics.d(((LegoBoardRep) ((dc0.i) callback)).f44739w, this.f74782a.f108051c)) {
                break;
            }
        }
        KeyEvent.Callback callback2 = (View) obj;
        if (callback2 == null) {
            return;
        }
        y0 y0Var = this.f74785d;
        xj2.b bVar = this.f74786e;
        d0 d0Var = this.f74783b;
        if (d0.p9(d0Var, this.f74784c, y0Var, bVar, (dc0.i) callback2)) {
            recyclerView.post(new v(d0Var, this, 0));
        }
    }

    @Override // ar0.s, ar0.x
    public final void i(RecyclerView recyclerView) {
        Object obj;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Iterator it = d7.b.O(recyclerView).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KeyEvent.Callback callback = (View) obj;
            if ((callback instanceof dc0.i) && Intrinsics.d(((LegoBoardRep) ((dc0.i) callback)).f44739w, this.f74782a.f108051c)) {
                break;
            }
        }
        KeyEvent.Callback callback2 = (View) obj;
        if (callback2 == null) {
            return;
        }
        y0 y0Var = this.f74785d;
        xj2.b bVar = this.f74786e;
        d0 d0Var = this.f74783b;
        if (d0.p9(d0Var, this.f74784c, y0Var, bVar, (dc0.i) callback2)) {
            recyclerView.post(new v(d0Var, this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s
    public final void j(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        dc0.i iVar = view instanceof dc0.i ? (dc0.i) view : null;
        if (iVar != null && Intrinsics.d(((LegoBoardRep) iVar).f44739w, this.f74782a.f108051c)) {
            y0 y0Var = this.f74785d;
            xj2.b bVar = this.f74786e;
            d0 d0Var = this.f74783b;
            if (d0.p9(d0Var, this.f74784c, y0Var, bVar, iVar)) {
                recyclerView.post(new v(d0Var, this, 1));
            }
        }
    }
}
