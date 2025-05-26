package vb0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f125488a;

    /* renamed from: b, reason: collision with root package name */
    public final v f125489b;

    /* renamed from: c, reason: collision with root package name */
    public final v f125490c;

    /* renamed from: d, reason: collision with root package name */
    public final v f125491d;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125488a = context;
        this.f125489b = xk2.m.b(new k(this, 1));
        this.f125490c = xk2.m.b(new k(this, 2));
        this.f125491d = xk2.m.b(new k(this, 0));
    }
}
