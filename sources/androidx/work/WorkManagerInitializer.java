package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kb.b0;
import kb.d;
import kb.u0;
import kb.w0;
import ra.b;

/* loaded from: classes3.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19996a = b0.h("WrkMgrInitializer");

    @Override // ra.b
    public final Object a(Context context) {
        b0.e().a(f19996a, "Initializing WorkManager with default configuration.");
        d dVar = new d(new kb.b());
        u0 u0Var = w0.f79048a;
        u0Var.b(context, dVar);
        return u0Var.a(context);
    }

    @Override // ra.b
    public final List b() {
        return Collections.emptyList();
    }
}
