package jh;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public Object f76199a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f76201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76202d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f76203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f76204f;

    public w(f fVar, int i13, Bundle bundle) {
        this.f76204f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f76201c = fVar;
        this.f76199a = bool;
        this.f76200b = false;
        this.f76202d = i13;
        this.f76203e = bundle;
    }

    public final /* bridge */ void a() {
        f fVar = this.f76204f;
        int i13 = this.f76202d;
        if (i13 != 0) {
            fVar.d(1, null);
            Bundle bundle = this.f76203e;
            b(new ConnectionResult(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            fVar.d(1, null);
            b(new ConnectionResult(8, null));
        }
    }

    public abstract void b(ConnectionResult connectionResult);

    public abstract boolean c();

    public final void d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this) {
            this.f76199a = null;
        }
        arrayList = this.f76201c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f76201c.zzt;
            arrayList2.remove(this);
        }
    }
}
