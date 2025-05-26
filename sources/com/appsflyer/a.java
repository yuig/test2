package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f29076b;

    public /* synthetic */ a(int i13, Function1 function1) {
        this.f29075a = i13;
        this.f29076b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29075a;
        AFLogger.getCurrencyIso4217Code(this.f29076b);
    }
}
