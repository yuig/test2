package ud;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import f0.h;
import nd.l;
import td.b0;
import td.c0;

/* loaded from: classes3.dex */
public final class e implements c0 {

    /* renamed from: a */
    public final Context f121920a;

    /* renamed from: b */
    public final c0 f121921b;

    /* renamed from: c */
    public final c0 f121922c;

    /* renamed from: d */
    public final Class f121923d;

    public e(Context context, c0 c0Var, c0 c0Var2, Class cls) {
        this.f121920a = context.getApplicationContext();
        this.f121921b = c0Var;
        this.f121922c = c0Var2;
        this.f121923d = cls;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && h.c0((Uri) obj);
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, l lVar) {
        Uri uri = (Uri) obj;
        return new b0(new ge.d(uri), new d(this.f121920a, this.f121921b, this.f121922c, uri, i13, i14, lVar, this.f121923d));
    }
}
