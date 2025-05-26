package vj0;

import android.os.Bundle;
import android.view.View;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvj0/b;", "Lmm1/l;", "<init>", "()V", "default_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f125917i0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f125918g0 = d4.ACTION_SHEET;

    /* renamed from: h0, reason: collision with root package name */
    public final k f125919h0 = m.a(n.NONE, new a(this, 0));

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(t60.c.fragment_board_about_recommendations_modal, false, 0, 0, false, false, new a(this, 1), 764);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getY0() {
        return this.f125918g0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        lj0.a aVar = new lj0.a(this, 3);
        mm1.k kVar = this.f87627c0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.b(aVar);
        a8(new hh0.a(this, 19));
    }
}
