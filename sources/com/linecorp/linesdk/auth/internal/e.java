package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineLoginResult;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f34101a;

    public e(f fVar) {
        this.f34101a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f34101a;
        if (fVar.f34110h.f34090e == h.INTENT_RECEIVED || fVar.f34103a.isFinishing()) {
            return;
        }
        Intent intent = f.f34102i;
        if (intent == null) {
            fVar.f34103a.a(LineLoginResult.a(rn.c.CANCEL, LineApiError.f34025d));
        } else {
            fVar.a(intent);
            f.f34102i = null;
        }
    }
}
