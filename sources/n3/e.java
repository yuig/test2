package n3;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g1.p f89044a;

    /* renamed from: b, reason: collision with root package name */
    public final s f89045b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f89046c;

    public e(g1.p pVar, s sVar) {
        this.f89044a = pVar;
        this.f89045b = sVar;
    }

    public final boolean a(long j13) {
        Object obj;
        List list = this.f89045b.f89123a;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (p.a(((t) obj).f89125a, j13)) {
                break;
            }
            i13++;
        }
        t tVar = (t) obj;
        if (tVar != null) {
            return tVar.f89132h;
        }
        return false;
    }

    public final g1.p b() {
        return this.f89044a;
    }

    public final MotionEvent c() {
        return this.f89045b.f89124b;
    }

    public final boolean d() {
        return this.f89046c;
    }

    public final void e(boolean z13) {
        this.f89046c = z13;
    }
}
