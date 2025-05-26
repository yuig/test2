package xj;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.a f135071b;

    public /* synthetic */ a(com.google.android.material.progressindicator.a aVar, int i13) {
        this.f135070a = i13;
        this.f135071b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f135070a;
        com.google.android.material.progressindicator.a aVar = this.f135071b;
        switch (i13) {
            case 0:
                if (aVar.f32932e > 0) {
                    SystemClock.uptimeMillis();
                }
                aVar.setVisibility(0);
                break;
            default:
                com.google.android.material.progressindicator.a.a(aVar);
                break;
        }
    }
}
