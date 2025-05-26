package com.google.common.util.concurrent;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class q extends i {

    /* renamed from: k, reason: collision with root package name */
    public p f33584k;

    @Override // com.google.common.util.concurrent.i
    public final void F(int i13, Object obj) {
    }

    @Override // com.google.common.util.concurrent.i
    public final void H() {
        p pVar = this.f33584k;
        if (pVar != null) {
            try {
                pVar.f33580c.execute(pVar);
            } catch (RejectedExecutionException e13) {
                pVar.f33581d.w(e13);
            }
        }
    }

    @Override // com.google.common.util.concurrent.i
    public final void L(h hVar) {
        hVar.getClass();
        this.f33566g = null;
        if (hVar == h.OUTPUT_FUTURE_DONE) {
            this.f33584k = null;
        }
    }

    @Override // com.google.common.util.concurrent.b
    public final void s() {
        p pVar = this.f33584k;
        if (pVar != null) {
            pVar.c();
        }
    }
}
