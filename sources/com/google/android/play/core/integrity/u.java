package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes3.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f33508a;

    private u() {
    }

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f33508a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        Context context = this.f33508a;
        if (context != null) {
            return new w(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
