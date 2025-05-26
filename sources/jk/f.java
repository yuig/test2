package jk;

import android.content.Context;

/* loaded from: classes.dex */
public final class f implements kk.o {

    /* renamed from: a, reason: collision with root package name */
    public final h6.q f76334a;

    public f(h6.q qVar) {
        this.f76334a = qVar;
    }

    @Override // kk.o
    public final Object zza() {
        Context context = this.f76334a.f67746a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
