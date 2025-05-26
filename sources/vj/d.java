package vj;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes3.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f125896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f125897b;

    public d(e eVar, b bVar) {
        this.f125897b = eVar;
        this.f125896a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f125897b.f125895a != null) {
            this.f125896a.b();
        }
    }

    public final void onBackInvoked() {
        this.f125896a.e();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f125897b.f125895a != null) {
            this.f125896a.d(new androidx.activity.b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f125897b.f125895a != null) {
            this.f125896a.c(new androidx.activity.b(backEvent));
        }
    }
}
