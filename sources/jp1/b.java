package jp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m60.w;
import qb0.c;
import qb0.e;

/* loaded from: classes2.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final w f77286a;

    /* renamed from: b, reason: collision with root package name */
    public final e f77287b;

    public b(w wVar, e eVar) {
        this.f77286a = wVar;
        this.f77287b = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f77286a.d(new sb0.a(null));
        e eVar = this.f77287b;
        eVar.getClass();
        new c(eVar).b();
        eVar.f103400d = null;
        eVar.f103399c = "unknown";
    }
}
