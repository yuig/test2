package com.airbnb.lottie;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class a0 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public b0 f28380a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f28380a.e((z) get());
            } catch (InterruptedException | ExecutionException e13) {
                this.f28380a.e(new z(e13));
            }
        } finally {
            this.f28380a = null;
        }
    }
}
