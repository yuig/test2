package ae;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15006a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15007b;

    public c(Context context, com.bumptech.glide.n nVar) {
        this.f15006a = context.getApplicationContext();
        this.f15007b = nVar;
    }

    @Override // ae.i
    public final void b() {
        s e13 = s.e(this.f15006a);
        a aVar = this.f15007b;
        synchronized (e13) {
            ((Set) e13.f15034d).remove(aVar);
            e13.h();
        }
    }

    @Override // ae.i
    public final void onDestroy() {
    }

    @Override // ae.i
    public final void x() {
        s e13 = s.e(this.f15006a);
        a aVar = this.f15007b;
        synchronized (e13) {
            ((Set) e13.f15034d).add(aVar);
            e13.g();
        }
    }
}
