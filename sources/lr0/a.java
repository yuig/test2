package lr0;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.Feed;
import sq0.c0;
import yk1.i;

/* loaded from: classes5.dex */
public final class a extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final b f84573b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84574c;

    public a(b bVar, boolean z13) {
        this.f84573b = bVar;
        this.f84574c = z13;
    }

    @Override // uj2.v
    public final void a() {
        b bVar = this.f84573b;
        bVar.s3(true);
        ((c0) bVar.getView()).setLoadState(i.LOADED);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        Feed feed = (Feed) obj;
        boolean z13 = this.f84574c;
        b bVar = this.f84573b;
        if (!z13) {
            bVar.f84576c = feed;
            ((c0) bVar.getView()).setLoadState(i.LOADED);
            ((b2) bVar.getAdapter()).h();
        } else {
            if (bVar.f84576c == null) {
                bVar.f84576c = feed;
                ((c0) bVar.getView()).setLoadState(i.LOADED);
                ((b2) bVar.getAdapter()).h();
                return;
            }
            int a13 = bVar.a();
            bVar.f84576c.j(feed);
            ((c0) bVar.getView()).setLoadState(i.LOADED);
            int n13 = bVar.f84576c.n() - a13;
            if (n13 > 0) {
                ((b2) bVar.getAdapter()).n(a13, n13);
            }
        }
    }

    @Override // rk2.b
    public final void d() {
        ((c0) this.f84573b.getView()).setLoadState(i.LOADING);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        b bVar = this.f84573b;
        bVar.s3(false);
        ((c0) bVar.getView()).displayError(th3);
    }
}
