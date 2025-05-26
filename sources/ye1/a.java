package ye1;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import x02.i2;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements d, c, nx.v, ky.h, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f138840a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138841b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f138842c;

    /* renamed from: d, reason: collision with root package name */
    public final i21.c f138843d;

    /* renamed from: e, reason: collision with root package name */
    public j21.f f138844e;

    /* renamed from: f, reason: collision with root package name */
    public h f138845f;

    /* renamed from: g, reason: collision with root package name */
    public e f138846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f138847h;

    /* renamed from: i, reason: collision with root package name */
    public j f138848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, i2 pinRepository) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        if (!this.f138841b) {
            this.f138841b = true;
            jb jbVar = (jb) ((b) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f138843d = (i21.c) jbVar.f113492j.get();
        }
        this.f138842c = pinRepository;
        this.f138847h = getResources().getDimensionPixelOffset(eo1.c.space_200);
        setOrientation(1);
        Resources resources = getResources();
        int i13 = eo1.d.lego_card_rounded_top_and_bottom;
        ThreadLocal threadLocal = e5.n.f57243a;
        setBackground(resources.getDrawable(i13, null));
        setVisibility(8);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f138840a == null) {
            this.f138840a = new ye2.o(this);
        }
        return this.f138840a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138840a == null) {
            this.f138840a = new ye2.o(this);
        }
        return this.f138840a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        j21.f fVar = this.f138844e;
        if (fVar != null) {
            return e0.b(fVar);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        vh vhVar;
        String uid;
        j jVar = this.f138848i;
        if (jVar == null || (vhVar = jVar.f138863b) == null || (uid = vhVar.getUid()) == null) {
            return null;
        }
        vh vhVar2 = jVar.f138863b;
        int size = vhVar2 != null ? vhVar2.f42865w.size() : 0;
        vh vhVar3 = jVar.f138863b;
        return ll.j.x(jVar.f138864c, uid, size, 0, vhVar3 != null ? vhVar3.u() : null, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        j jVar = this.f138848i;
        if (jVar != null) {
            return jVar.f138864c.y(jVar.f138867f);
        }
        return null;
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
