package h60;

import android.content.res.Resources;
import android.view.View;
import dc0.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.p;
import m60.w0;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements o82.b, m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f67807a = new i();

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new p(3, g60.f.class, "bindDisplayState", "bindDisplayState(Lcom/pinterest/autoOrganizeLibrary/pincluster/PinClusterDisplayState;Lcom/pinterest/architecture/primitives/EventIntake;)V", 0);
    }

    @Override // o82.b
    public final void d(View view, o oVar, r eventIntake) {
        g60.f p03 = (g60.f) view;
        g60.a displayState = (g60.a) oVar;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(displayState, "p1");
        Intrinsics.checkNotNullParameter(eventIntake, "p2");
        p03.getClass();
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        q qVar = q.Default;
        dc0.g gVar = new dc0.g(displayState.f63693c, displayState.f63694d, displayState.f63695e);
        int i13 = eo1.b.color_themed_transparent;
        Resources resources = p03.getResources();
        int i14 = w0.plural_pins_string;
        int i15 = displayState.f63692b;
        String quantityString = resources.getQuantityString(i14, i15, Integer.valueOf(i15));
        Integer valueOf = Integer.valueOf(i13);
        Intrinsics.f(quantityString);
        p03.f63708a.d0(new dc0.o(qVar, gVar, null, null, valueOf, null, displayState.f63691a, quantityString, null, null, "", false, null, false, 0, null, null, false, false, false, null, null, false, true, 8387104));
        p03.f63709b = eventIntake;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o82.b) && (obj instanceof m)) {
            return Intrinsics.d(c(), ((m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
