package h01;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import so.jb;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class k extends ConstraintLayout implements n, af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66439f = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f66440a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66441b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f66442c;

    /* renamed from: d, reason: collision with root package name */
    public final w f66443d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltListAction f66444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f66441b) {
            this.f66441b = true;
            this.f66443d = (w) ((jb) ((l) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f66442c = pinalytics;
        View.inflate(context, ky1.c.view_style_insight_entry_module, this);
        View findViewById = findViewById(ky1.b.style_insight_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f66444e = (GestaltListAction) findViewById;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f66440a == null) {
            this.f66440a = new o(this);
        }
        return this.f66440a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f66440a == null) {
            this.f66440a = new o(this);
        }
        return this.f66440a.generatedComponent();
    }
}
