package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: classes3.dex */
public final class k4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31488a = 1;

    public k4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z13) {
        switch (this.f31488a) {
            case 0:
                i4.f31430e.set(true);
                break;
            default:
                v4.f31666j.incrementAndGet();
                break;
        }
    }

    public k4(int i13) {
        super(null);
    }
}
