package hn;

import com.facebook.login.z;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f69587f;

    /* renamed from: a, reason: collision with root package name */
    public z f69588a;

    /* renamed from: b, reason: collision with root package name */
    public Date f69589b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f69590c;

    /* renamed from: d, reason: collision with root package name */
    public e f69591d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f69592e;

    static {
        e eVar = new e();
        a aVar = new a();
        aVar.f69588a = new z(18);
        aVar.f69591d = eVar;
        f69587f = aVar;
    }

    @Override // hn.d
    public final void a(boolean z13) {
        if (!this.f69592e && z13) {
            c();
        }
        this.f69592e = z13;
    }

    public final Date b() {
        Date date = this.f69589b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c() {
        this.f69588a.getClass();
        Date date = new Date();
        Date date2 = this.f69589b;
        if (date2 == null || date.after(date2)) {
            this.f69589b = date;
            if (this.f69590c) {
                Iterator it = Collections.unmodifiableCollection(c.f69594c.f69596b).iterator();
                while (it.hasNext()) {
                    ((fn.i) it.next()).d().e(b());
                }
            }
        }
    }
}
