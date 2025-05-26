package mp;

import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.d4;
import h32.i0;
import m60.w;

/* loaded from: classes3.dex */
public final class b extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f87833e = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f87834a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87835b;

    /* renamed from: c, reason: collision with root package name */
    public w f87836c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f87837d;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f87834a == null) {
            this.f87834a = new ye2.o(this);
        }
        return this.f87834a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f87834a == null) {
            this.f87834a = new ye2.o(this);
        }
        return this.f87834a.generatedComponent();
    }
}
