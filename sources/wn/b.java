package wn;

import android.content.Context;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130431a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f130432b;

    public /* synthetic */ b(Context context, int i13) {
        this.f130431a = i13;
        this.f130432b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f130431a;
        Context context = this.f130432b;
        switch (i13) {
            case 0:
                c.f130433a.d(context);
                break;
            default:
                w6.b bVar = new w6.b(context, p000do.a.f55639a);
                ((Future) bVar.f128110d).cancel(true);
                bVar.f128107a.clear();
                bVar.b(null);
                break;
        }
    }
}
