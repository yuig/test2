package nj1;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import ua2.f1;
import ua2.z0;
import va2.g;
import wa2.l;

/* loaded from: classes5.dex */
public final class b extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public g f90976f;

    public final void A(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Context context = this.f121492a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f90976f = new g(context, displayState.f90975a);
    }

    public final void B(boolean z13) {
        g gVar = this.f90976f;
        if (gVar != null) {
            a0.x(this.f121492a, gVar, z13, null);
        }
    }

    @Override // ua2.f1
    public final l k() {
        return this.f90976f;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        g gVar = this.f90976f;
        if (gVar != null) {
            gVar.draw(canvas);
        }
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        g gVar = this.f90976f;
        if (gVar != null) {
            gVar.f(i13);
        }
        g gVar2 = this.f90976f;
        if (gVar2 != null) {
            gVar2.e(i14);
        }
        g gVar3 = this.f90976f;
        if (gVar3 != null) {
            gVar3.h();
        }
        return new z0(i13, i14);
    }
}
