package v81;

import android.view.View;
import com.pinterest.api.model.d30;
import kotlin.jvm.internal.Intrinsics;
import m81.l;
import s81.c;
import t3.s1;
import uj2.q;
import uk1.d;
import vq0.h;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final d f124481a;

    /* renamed from: b, reason: collision with root package name */
    public final q f124482b;

    /* renamed from: c, reason: collision with root package name */
    public final c f124483c;

    public a(d presenterPinalytics, q networkStateStream, c listener) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f124481a = presenterPinalytics;
        this.f124482b = networkStateStream;
        this.f124483c = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        Object view = (l) nVar;
        d30 model = (d30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            ?? j13 = s1.j(view2);
            r0 = j13 instanceof s81.d ? j13 : null;
        }
        if (r0 == null) {
            return;
        }
        r0.f111897b = model;
    }

    @Override // vq0.h
    public final m f() {
        return new s81.d(this.f124481a, this.f124482b, this.f124483c);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        d30 model = (d30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return model.f36647c;
    }
}
