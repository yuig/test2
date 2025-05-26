package jk0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ha2.x;
import hk0.m;
import java.util.HashSet;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;
import rl2.g0;
import so.jb;
import ye2.o;

/* loaded from: classes5.dex */
public final class d extends LinearLayout implements a, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f76376a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f76377b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f76378c;

    /* renamed from: d, reason: collision with root package name */
    public final w f76379d;

    /* renamed from: e, reason: collision with root package name */
    public final o5.c f76380e;

    /* renamed from: f, reason: collision with root package name */
    public ik0.a f76381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, d0 pinalytics, m sourceModelType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sourceModelType, "sourceModelType");
        if (!this.f76377b) {
            this.f76377b = true;
            jb jbVar = (jb) ((e) generatedComponent());
            this.f76379d = (w) jbVar.f113483a.f113885r0.get();
            this.f76380e = a02.e.I1();
        }
        this.f76378c = pinalytics;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        HashSet c13 = h1.c(k41.b.Pin, k41.b.Collage);
        hh0.a aVar = new hh0.a(this, 24);
        o5.c cVar = this.f76380e;
        if (cVar == null) {
            Intrinsics.r("bidiFormatter");
            throw null;
        }
        ha2.e eVar = new ha2.e(context, cVar);
        eVar.a(g0.r(c13, aVar, null, false, 12));
        addView(eVar);
        HashSet hashSet = new HashSet();
        if (sourceModelType == m.BOARD) {
            hashSet.add(k41.b.Section);
            hashSet.add(k41.b.Collaborator);
        }
        if (!hashSet.isEmpty()) {
            o5.c cVar2 = this.f76380e;
            if (cVar2 == null) {
                Intrinsics.r("bidiFormatter");
                throw null;
            }
            ha2.e eVar2 = new ha2.e(context, cVar2);
            eVar2.a(g0.r(hashSet, aVar, new x(x0.add, null, null, null, null, 30), false, 8));
            addView(eVar2);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f76376a == null) {
            this.f76376a = new o(this);
        }
        return this.f76376a;
    }

    public final void dismiss() {
        w wVar = this.f76379d;
        if (wVar != null) {
            a.c.y(wVar);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f76376a == null) {
            this.f76376a = new o(this);
        }
        return this.f76376a.generatedComponent();
    }
}
