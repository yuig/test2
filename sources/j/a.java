package j;

import android.graphics.drawable.Drawable;
import va.f;

/* loaded from: classes2.dex */
public final class a implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73945a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f73946b;

    public a(f fVar) {
        this.f73946b = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f73945a) {
            case 0:
                break;
            default:
                ((f) this.f73946b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        switch (this.f73945a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f73946b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j13);
                    break;
                }
                break;
            default:
                ((f) this.f73946b).scheduleSelf(runnable, j13);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f73945a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f73946b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                ((f) this.f73946b).unscheduleSelf(runnable);
                break;
        }
    }
}
