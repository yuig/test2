package rb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes4.dex */
public final class z extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f107233f = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f107234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107235b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f107236c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f107237d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f107238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f107235b) {
            this.f107235b = true;
            this.f107236c = (m60.w) ((jb) ((a0) generatedComponent())).f113483a.f113885r0.get();
        }
        xk2.v b13 = xk2.m.b(new y(this, 0));
        this.f107237d = xk2.m.b(new y(this, 1));
        this.f107238e = xk2.m.b(new y(this, 2));
        LayoutInflater.from(context).inflate(nb2.c.updated_inbox_header_layout, (ViewGroup) this, true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_200);
        setPadding(dimensionPixelSize * 2, 0, dimensionPixelSize, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Object value = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        pk.a0.o((GestaltText) value, nb2.d.requests, new Object[0]);
        Object value2 = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).i(c.E);
    }

    public final GestaltText a() {
        Object value = this.f107237d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f107234a == null) {
            this.f107234a = new ye2.o(this);
        }
        return this.f107234a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f107234a == null) {
            this.f107234a = new ye2.o(this);
        }
        return this.f107234a.generatedComponent();
    }
}
