package bk;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23021a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23022b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23023c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23024d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23025e;

    public b0(String str, String str2, String str3, boolean z13, boolean z14) {
        this.f23023c = str;
        this.f23024d = str2;
        this.f23025e = str3;
        this.f23021a = z13;
        this.f23022b = z14;
    }

    public abstract void a(View view);

    public abstract boolean b();

    public final void c() {
        Object obj = this.f23024d;
        RectF rectF = (RectF) obj;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom) {
            return;
        }
        Object obj2 = this.f23023c;
        if (((o) obj2) != null) {
            p.f23103a.a((o) obj2, 1.0f, (RectF) obj, null, (Path) this.f23025e);
        }
    }

    public b0() {
        this.f23021a = false;
        this.f23022b = false;
        this.f23024d = new RectF();
        this.f23025e = new Path();
    }
}
