package tq0;

import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.v;
import androidx.recyclerview.widget.RecyclerView;
import ar0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qa2.h0;

/* loaded from: classes.dex */
public final class h extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f119004a;

    /* renamed from: b, reason: collision with root package name */
    public final qc2.d f119005b;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f119007d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f119006c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final v f119008e = new v(this, 16);

    public h(Handler handler, qc2.d dVar) {
        this.f119004a = handler;
        this.f119005b = dVar;
    }

    @Override // ar0.s, ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f119004a.removeCallbacks(this.f119008e);
        if (s()) {
            p(true, false);
        }
        ArrayList arrayList = this.f119006c;
        if (!qb0.b.o(arrayList)) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((zy.m) arrayList.get(i13)).f(recyclerView);
            }
        }
        this.f119007d = null;
        super.a(recyclerView);
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.c(recyclerView, i13, i14);
        if (i13 == 0 && i14 == 0) {
            return;
        }
        w(recyclerView);
    }

    @Override // ar0.s, ar0.u
    public final void e(RecyclerView recyclerView, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.e(recyclerView, z13);
        if (s()) {
            ArrayList arrayList = this.f119006c;
            if (qb0.b.o(arrayList)) {
                return;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((zy.m) arrayList.get(i13)).a(recyclerView, z13);
            }
        }
    }

    @Override // ar0.s, ar0.x
    public final void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f119004a.removeCallbacks(this.f119008e);
        if (s()) {
            p(true, false);
        }
        this.f119006c.clear();
        this.f119007d = null;
        super.f(recyclerView);
    }

    @Override // ar0.s, ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.h(recyclerView);
        this.f119007d = recyclerView;
        v(recyclerView);
        w(recyclerView);
        Handler handler = this.f119004a;
        v vVar = this.f119008e;
        handler.removeCallbacks(vVar);
        handler.postDelayed(vVar, 30000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s
    public final void j(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        super.j(recyclerView, view);
        if ((view instanceof nx.v) && this.f119005b.e(view, recyclerView)) {
            u((nx.v) view);
            w(recyclerView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s
    public final void k(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof nx.v) {
            w(recyclerView);
            t((nx.v) view);
            if (view instanceof h0) {
                h0 h0Var = (h0) view;
                h0Var.setTopVisible(false);
                h0Var.setBottomVisible(false);
            }
        }
        super.k(recyclerView, view);
    }

    public final void n(zy.m... loggers) {
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        if (loggers.length > 0) {
            Collections.addAll(this.f119006c, Arrays.copyOf(loggers, loggers.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ArrayList arrayList, View view, View view2, boolean z13) {
        if (view instanceof nx.v) {
            if (z13 || this.f119005b.e(view, view2)) {
                nx.v vVar = (nx.v) view;
                arrayList.add(vVar);
                List childImpressionViews = vVar.getChildImpressionViews();
                if (childImpressionViews != null) {
                    Iterator it = childImpressionViews.iterator();
                    while (it.hasNext()) {
                        o(arrayList, (View) it.next(), view2, z13);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s, ar0.r
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewAttachedToWindow(view);
        if ((view instanceof nx.v) && (view.getParent() instanceof View)) {
            Object parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            if (this.f119005b.e(view, (View) parent)) {
                u((nx.v) view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s, ar0.r
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof nx.v) {
            t((nx.v) view);
            if (view instanceof h0) {
                h0 h0Var = (h0) view;
                h0Var.setTopVisible(false);
                h0Var.setBottomVisible(false);
            }
        }
        super.onViewDetachedFromWindow(view);
    }

    public final void p(boolean z13, boolean z14) {
        RecyclerView recyclerView;
        if (s() && (recyclerView = this.f119007d) != null) {
            ArrayList arrayList = this.f119006c;
            if (z13 && s()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (z14) {
                    arrayList3.addAll(r(recyclerView));
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = recyclerView.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = recyclerView.getChildAt(i13);
                        Intrinsics.f(childAt);
                        o(arrayList4, childAt, recyclerView, false);
                    }
                    arrayList3.addAll(arrayList4);
                }
                int size = arrayList3.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object markImpressionEnd = ((nx.v) arrayList3.get(i14)).markImpressionEnd();
                    if (markImpressionEnd != null) {
                        arrayList2.add(markImpressionEnd);
                    }
                }
                if (!qb0.b.o(arrayList)) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((zy.m) arrayList.get(i15)).g(arrayList2);
                    }
                }
            }
            if (qb0.b.o(arrayList)) {
                return;
            }
            int size3 = arrayList.size();
            for (int i16 = 0; i16 < size3; i16++) {
                ((zy.m) arrayList.get(i16)).d();
            }
        }
    }

    public final void q() {
        p(true, true);
    }

    public final ArrayList r(RecyclerView recyclerView) {
        ArrayList arrayList = new ArrayList();
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            Intrinsics.f(childAt);
            o(arrayList, childAt, recyclerView, true);
        }
        return arrayList;
    }

    public final boolean s() {
        return this.f119007d != null;
    }

    public final void t(nx.v vVar) {
        Object markImpressionEnd;
        if (s() && (markImpressionEnd = vVar.markImpressionEnd()) != null) {
            x(markImpressionEnd);
        }
    }

    public final void u(nx.v vVar) {
        Object markImpressionStart;
        if (s() && (markImpressionStart = vVar.markImpressionStart()) != null) {
            ArrayList arrayList = this.f119006c;
            if (qb0.b.o(arrayList)) {
                return;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((zy.m) arrayList.get(i13)).e(markImpressionStart);
            }
        }
    }

    public final void v(RecyclerView recyclerView) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            Intrinsics.f(childAt);
            o(arrayList2, childAt, recyclerView, false);
        }
        int size = arrayList2.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object markImpressionStart = ((nx.v) arrayList2.get(i14)).markImpressionStart();
            if (markImpressionStart != null) {
                arrayList.add(markImpressionStart);
            }
        }
        ArrayList arrayList3 = this.f119006c;
        if (qb0.b.o(arrayList3)) {
            return;
        }
        int size2 = arrayList3.size();
        for (int i15 = 0; i15 < size2; i15++) {
            ((zy.m) arrayList3.get(i15)).b(arrayList);
        }
    }

    public final void w(RecyclerView recyclerView) {
        if (s()) {
            ArrayList arrayList = this.f119006c;
            if (qb0.b.o(arrayList)) {
                return;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((zy.m) arrayList.get(i13)).h(recyclerView);
            }
        }
    }

    public final void x(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        ArrayList arrayList = this.f119006c;
        if (qb0.b.o(arrayList)) {
            return;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((zy.m) arrayList.get(i13)).c(impression);
        }
    }
}
