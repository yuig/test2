package jh2;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f76238a;

    public a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f76238a = new Handler(mainLooper);
    }
}
