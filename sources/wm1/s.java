package wm1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f130332a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f130333b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130334c;

    public s(u50.i0 i0Var, u50.i0 i0Var2, boolean z13) {
        this.f130332a = i0Var;
        this.f130333b = i0Var2;
        this.f130334c = z13;
    }

    public final t a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this instanceof q ? ((q) this).f130325e.a(context).length() == 0 ? t.HEADER_ONLY : t.HEADER_SUBHEADER : t.NOTIFICATION;
    }
}
