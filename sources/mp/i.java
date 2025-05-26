package mp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.f0;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class i extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f87858h = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f87859a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87860b;

    /* renamed from: c, reason: collision with root package name */
    public final ContactSearchListCell f87861c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.b f87862d;

    /* renamed from: e, reason: collision with root package name */
    public final w f87863e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f87864f;

    /* renamed from: g, reason: collision with root package name */
    public final no1.e f87865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f87860b) {
            this.f87860b = true;
            jb jbVar = (jb) ((j) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f87863e = (w) oaVar.f113885r0.get();
            this.f87864f = (f0) oaVar.f113747j2.get();
            this.f87865g = jbVar.f113485c.C5();
        }
        this.f87862d = new xj2.b();
        View inflate = LayoutInflater.from(context).inflate(vc0.c.sharesheet_list_cell_person_lego_inline_send, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.sharesheet.view.ContactSearchListCell");
        ContactSearchListCell contactSearchListCell = (ContactSearchListCell) inflate;
        this.f87861c = contactSearchListCell;
        addView(contactSearchListCell);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f87859a == null) {
            this.f87859a = new ye2.o(this);
        }
        return this.f87859a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f87859a == null) {
            this.f87859a = new ye2.o(this);
        }
        return this.f87859a.generatedComponent();
    }
}
