package xv;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import nx.c0;
import nx.v;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public abstract class i extends j implements k, y92.g, v {

    /* renamed from: c, reason: collision with root package name */
    public ni1.d f136008c;

    /* renamed from: d, reason: collision with root package name */
    public pb0.a f136009d;

    /* renamed from: e, reason: collision with root package name */
    public es.h f136010e;

    /* renamed from: f, reason: collision with root package name */
    public float f136011f;

    /* renamed from: g, reason: collision with root package name */
    public e f136012g;

    /* renamed from: h, reason: collision with root package name */
    public ViewGroup f136013h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136014i;

    @Override // xv.j
    public final void b() {
        if (this.f136014i) {
            return;
        }
        this.f136014i = true;
        f fVar = (f) this;
        jb jbVar = (jb) ((h) generatedComponent());
        fVar.f136008c = (ni1.d) jbVar.f113485c.f114551x.get();
        oa oaVar = jbVar.f113483a;
        fVar.f136009d = (pb0.a) oaVar.f113834o1.get();
        jbVar.a();
        fVar.f136010e = (es.h) oaVar.f113735i7.get();
    }

    public final int e() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        int i13 = (rect.right + rect.left) / 2;
        float f13 = hf0.b.f69002b;
        int i14 = hf0.b.f69004d;
        int i15 = (int) (f13 / i14);
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 < i15) {
                return i16;
            }
            i15 += i15;
        }
        return -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int i15 = (int) (size * this.f136011f);
        ViewGroup viewGroup = this.f136013h;
        if (viewGroup == null) {
            Intrinsics.r("adContainerView");
            throw null;
        }
        viewGroup.getLayoutParams().height = i15;
        int p13 = kh2.d.p(30) + i15;
        super.onMeasure(i13, i14);
        setMeasuredDimension(size, p13);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        e eVar = this.f136012g;
        if (eVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        c0 c0Var = eVar.f136002h;
        c0 c13 = c0Var != null ? eVar.f135996b.c(c0Var) : null;
        eVar.f136002h = null;
        return c13;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        e eVar = this.f136012g;
        if (eVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        f30 f30Var = eVar.f135998d;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        c0 d2 = eVar.f135996b.d(f30Var, measuredWidth, measuredHeight, eVar.f135999e, ((i) ((k) eVar.getView())).e());
        eVar.f136002h = d2;
        return d2;
    }
}
