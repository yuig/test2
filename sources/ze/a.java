package ze;

import android.content.Context;
import fl.q;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f141796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f141797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f141798c;

    public a(Context context, String str, q qVar) {
        this.f141796a = context;
        this.f141797b = str;
        this.f141798c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            c.a(this.f141796a, this.f141797b, this.f141798c);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
