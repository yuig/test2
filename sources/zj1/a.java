package zj1;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import hk1.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.e0;
import ti1.z;
import ua2.d1;
import ua2.z0;
import ui1.c;
import va2.k;
import wa2.l;

/* loaded from: classes2.dex */
public final class a extends d1 implements ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f142056h;

    /* renamed from: i, reason: collision with root package name */
    public final int f142057i;

    /* renamed from: j, reason: collision with root package name */
    public k f142058j;

    /* renamed from: k, reason: collision with root package name */
    public b f142059k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView, z getConstructorArgs) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(getConstructorArgs, "getConstructorArgs");
        this.f142056h = getConstructorArgs;
        this.f142057i = pinRepView.getContext().getResources().getDimensionPixelSize(e0.f90644c);
    }

    @Override // ui1.a
    public final c d(int i13, int i14) {
        k kVar = this.f142058j;
        if (kVar != null) {
            return kVar.h().contains(i13, i14) ? new ui1.k((n) this.f142056h.invoke()) : ui1.b.f122290a;
        }
        Intrinsics.r("overflowDrawable");
        throw null;
    }

    @Override // ua2.f1
    public final l k() {
        k kVar = this.f142058j;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("overflowDrawable");
        throw null;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        k kVar = this.f142058j;
        if (kVar == null) {
            Intrinsics.r("overflowDrawable");
            throw null;
        }
        int i17 = this.f142057i;
        kVar.setBounds(i13 + i17, this.f121483f, i15 - i17, this.f121484g);
        kVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        k kVar = this.f142058j;
        if (kVar == null) {
            Intrinsics.r("overflowDrawable");
            throw null;
        }
        BitmapDrawable bitmapDrawable = kVar.f125398n;
        kVar.e(Math.max(bitmapDrawable.getIntrinsicHeight(), bitmapDrawable.getIntrinsicWidth()));
        k kVar2 = this.f142058j;
        if (kVar2 != null) {
            return new z0(i13, kVar2.f128842e);
        }
        Intrinsics.r("overflowDrawable");
        throw null;
    }
}
