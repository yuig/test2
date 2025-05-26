package xd;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f134593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Drawable drawable, int i13) {
        super(drawable);
        this.f134593b = i13;
    }

    public static d e(Drawable drawable) {
        if (drawable != null) {
            return new d(drawable, 0);
        }
        return null;
    }

    @Override // pd.g0
    public final int a() {
        int i13 = this.f134593b;
        Drawable drawable = this.f134592a;
        switch (i13) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                return ((yd.c) drawable).f138714a.f138713a.h();
        }
    }

    @Override // pd.c0
    public final void b() {
        int i13 = this.f134593b;
        Drawable drawable = this.f134592a;
        switch (i13) {
            case 1:
                ((yd.c) drawable).f138714a.f138713a.e().prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof yd.c) {
                        ((yd.c) drawable).f138714a.f138713a.e().prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // pd.g0
    public final void c() {
        switch (this.f134593b) {
            case 0:
                break;
            default:
                yd.c cVar = (yd.c) this.f134592a;
                cVar.stop();
                cVar.f138717d = true;
                cVar.f138714a.f138713a.a();
                break;
        }
    }

    @Override // pd.g0
    public final Class d() {
        switch (this.f134593b) {
            case 0:
                return this.f134592a.getClass();
            default:
                return yd.c.class;
        }
    }
}
