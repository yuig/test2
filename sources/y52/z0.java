package y52;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f137890a;

    public z0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f137890a = context;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        d0 request = (d0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof d0) {
            try {
                xk2.q qVar = xk2.s.f135225b;
                this.f137890a.getContentResolver().delete(Uri.parse(request.f137791a), null, null);
            } catch (Throwable th3) {
                xk2.q qVar2 = xk2.s.f135225b;
                ue.c.m(th3);
            }
        }
    }
}
