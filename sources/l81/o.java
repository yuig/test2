package l81;

import android.view.View;
import ja.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends ca2.e {

    /* renamed from: s, reason: collision with root package name */
    public boolean f82199s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f82200t;

    /* renamed from: u, reason: collision with root package name */
    public kj.f f82201u;

    @Override // ca2.e
    public final kj.f e() {
        return this.f82201u;
    }

    @Override // ca2.e
    public final void h(String actionSource, float f13, ca2.c cVar) {
        Intrinsics.checkNotNullParameter(actionSource, "actionSource");
        View view = this.f27254m;
        if (view != null) {
            view.post(new y(this, actionSource, cVar, 24));
        }
    }
}
