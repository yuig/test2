package me;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import le.o0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final wc.b f87019b = new wc.b(24, 0);

    /* renamed from: a, reason: collision with root package name */
    public final m f87020a;

    public r(m loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f87020a = loggerImpl;
    }

    public final void a(String str, double d2, Bundle bundle) {
        le.v vVar = le.v.f83104a;
        if (o0.b()) {
            m mVar = this.f87020a;
            mVar.getClass();
            if (p001if.a.b(mVar)) {
                return;
            }
            try {
                mVar.e(str, Double.valueOf(d2), bundle, false, ue.b.b());
            } catch (Throwable th3) {
                p001if.a.a(mVar, th3);
            }
        }
    }

    public final void b(String str, Bundle bundle) {
        le.v vVar = le.v.f83104a;
        if (o0.b()) {
            this.f87020a.d(str, bundle);
        }
    }

    public final void c(String str, Bundle bundle) {
        le.v vVar = le.v.f83104a;
        if (o0.b()) {
            this.f87020a.f(str, bundle);
        }
    }

    public r(Context context) {
        this(new m(context, (String) null));
    }

    public r(Context context, String str) {
        this(new m(context, str));
    }
}
