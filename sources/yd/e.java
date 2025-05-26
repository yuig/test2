package yd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class e extends ee.c {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f138725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f138726e;

    /* renamed from: f, reason: collision with root package name */
    public final long f138727f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f138728g;

    public e(Handler handler, int i13, long j13) {
        this.f138725d = handler;
        this.f138726e = i13;
        this.f138727f = j13;
    }

    @Override // ee.i
    public final void m(Drawable drawable) {
        this.f138728g = null;
    }

    @Override // ee.i
    public final void z(Object obj, fe.d dVar) {
        this.f138728g = (Bitmap) obj;
        Handler handler = this.f138725d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f138727f);
    }
}
