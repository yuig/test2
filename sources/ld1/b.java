package ld1;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.api.model.vh;
import com.pinterest.ui.components.users.LegoUserRep;
import e5.n;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import ll.j;
import nx.v;
import so.jb;
import x02.i2;
import ye2.o;

/* loaded from: classes5.dex */
public final class b extends LinearLayout implements c, v, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f82966a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82967b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f82968c;

    /* renamed from: d, reason: collision with root package name */
    public final l f82969d;

    /* renamed from: e, reason: collision with root package name */
    public final i21.c f82970e;

    /* renamed from: f, reason: collision with root package name */
    public j21.f f82971f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f82972g;

    /* renamed from: h, reason: collision with root package name */
    public LegoUserRep f82973h;

    /* renamed from: i, reason: collision with root package name */
    public final int f82974i;

    /* renamed from: j, reason: collision with root package name */
    public final int f82975j;

    /* renamed from: k, reason: collision with root package name */
    public g f82976k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, i2 pinRepository) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        if (!this.f82967b) {
            this.f82967b = true;
            jb jbVar = (jb) ((h) generatedComponent());
            this.f82969d = (l) jbVar.f113485c.f114476s.get();
            this.f82970e = (i21.c) jbVar.f113492j.get();
        }
        this.f82968c = pinRepository;
        this.f82974i = getResources().getDimensionPixelOffset(eo1.c.space_400);
        this.f82975j = getResources().getDimensionPixelOffset(eo1.c.space_200);
        setOrientation(1);
        Resources resources = getResources();
        int i13 = eo1.d.lego_card_rounded_top_and_bottom;
        ThreadLocal threadLocal = n.f57243a;
        setBackground(resources.getDrawable(i13, null));
        setVisibility(8);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        setPaddingRelative(0, 0, 0, getResources().getDimensionPixelSize(eo1.c.space_800));
        setLayoutParams(layoutParams);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f82966a == null) {
            this.f82966a = new o(this);
        }
        return this.f82966a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f82966a == null) {
            this.f82966a = new o(this);
        }
        return this.f82966a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        j21.f fVar = this.f82971f;
        if (fVar != null) {
            return e0.b(fVar);
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        vh vhVar;
        String uid;
        g gVar = this.f82976k;
        if (gVar == null || (vhVar = gVar.f82986b) == null || (uid = vhVar.getUid()) == null) {
            return null;
        }
        vh vhVar2 = gVar.f82986b;
        int size = vhVar2 != null ? vhVar2.f42865w.size() : 0;
        vh vhVar3 = gVar.f82986b;
        return j.x(gVar.f82987c, uid, size, 0, vhVar3 != null ? vhVar3.u() : null, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        g gVar = this.f82976k;
        if (gVar != null) {
            return gVar.f82987c.y(gVar.f82992h);
        }
        return null;
    }
}
