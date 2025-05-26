package ke1;

import android.view.View;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import ey.b0;
import ey.x4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import t3.s1;
import uj2.q;
import vb0.j;
import vq0.h;
import y0.r;
import yk1.m;
import yk1.n;
import yk1.v;

/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f79289a;

    /* renamed from: b, reason: collision with root package name */
    public final q f79290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79291c;

    /* renamed from: d, reason: collision with root package name */
    public final w f79292d;

    /* renamed from: e, reason: collision with root package name */
    public final v f79293e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f79294f;

    /* renamed from: g, reason: collision with root package name */
    public final b f79295g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79296h;

    /* renamed from: i, reason: collision with root package name */
    public he1.a f79297i;

    /* renamed from: j, reason: collision with root package name */
    public vh f79298j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f79299k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79300l;

    /* renamed from: m, reason: collision with root package name */
    public final d f79301m;

    public e(uk1.d pinalytics, q networkStateStream, boolean z13, w eventManager, v viewResources, k61.c cVar, b bVar, String str, int i13) {
        Function0 searchQueryProvider = cVar;
        searchQueryProvider = (i13 & 32) != 0 ? a.f79286i : searchQueryProvider;
        bVar = (i13 & 64) != 0 ? null : bVar;
        str = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(searchQueryProvider, "searchQueryProvider");
        this.f79289a = pinalytics;
        this.f79290b = networkStateStream;
        this.f79291c = z13;
        this.f79292d = eventManager;
        this.f79293e = viewResources;
        this.f79294f = searchQueryProvider;
        this.f79295g = bVar;
        this.f79296h = str;
        this.f79301m = new d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r13v21, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [he1.a, java.lang.Object] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        ?? view = (he1.a) nVar;
        s model = (s) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof vh)) {
            j.f125466a.G("Model must be of type DynamicStory to be bound with aShoppingGridCollageView", new Object[0]);
            return;
        }
        if (this.f79300l) {
            View view2 = view instanceof View ? (View) view : null;
            if (view2 != null) {
                ?? j13 = s1.j(view2);
                r14 = j13 instanceof ie1.a ? j13 : null;
            }
            if (r14 != null) {
                r14.q3((vh) model, Integer.valueOf(i13));
                return;
            }
            return;
        }
        b bVar = this.f79295g;
        int i14 = bVar == null ? -1 : c.f79287a[bVar.ordinal()];
        if (i14 == 1) {
            this.f79297i = view;
            this.f79298j = (vh) model;
            this.f79299k = Integer.valueOf(i13);
            this.f79292d.h(this.f79301m);
            return;
        }
        if (i14 == 2) {
            this.f79297i = view;
            this.f79298j = (vh) model;
            this.f79299k = Integer.valueOf(i13);
            new x4(48, 0L, b0.TAG_SHOPPING_GRID_COLLAGE_STORY, (Runnable) new r(this, (Object) view, model, i13, 5), true, true).c();
            return;
        }
        View view3 = view instanceof View ? (View) view : null;
        if (view3 != null) {
            ?? j14 = s1.j(view3);
            r14 = j14 instanceof ie1.a ? j14 : null;
        }
        if (r14 != null) {
            r14.q3((vh) model, Integer.valueOf(i13));
        }
    }

    @Override // vq0.h
    public final m f() {
        String str = (String) this.f79294f.invoke();
        return new ie1.a(this.f79289a, this.f79290b, this.f79293e, this.f79291c, str, this.f79296h);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        s model = (s) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
