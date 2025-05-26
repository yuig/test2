package td;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117453a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f117454b;

    public z(Context context, int i13) {
        this.f117453a = i13;
        if (i13 == 1) {
            this.f117454b = context.getApplicationContext();
        } else if (i13 != 2) {
            this.f117454b = context;
        } else {
            this.f117454b = context.getApplicationContext();
        }
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f117453a) {
        }
        return d((Uri) obj);
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ b0 b(Object obj, int i13, int i14, nd.l lVar) {
        switch (this.f117453a) {
        }
        return c((Uri) obj, i13, i14, lVar);
    }

    public final b0 c(Uri uri, int i13, int i14, nd.l lVar) {
        Long l13;
        int i15 = this.f117453a;
        Context context = this.f117454b;
        switch (i15) {
            case 0:
                return new b0(new ge.d(uri), new y(context, uri));
            case 1:
                if (i13 == Integer.MIN_VALUE || i14 == Integer.MIN_VALUE || i13 > 512 || i14 > 384) {
                    return null;
                }
                return new b0(new ge.d(uri), od.c.d(context, uri, new od.a(context.getContentResolver())));
            default:
                if (i13 == Integer.MIN_VALUE || i14 == Integer.MIN_VALUE || i13 > 512 || i14 > 384 || (l13 = (Long) lVar.c(wd.j0.f129175d)) == null || l13.longValue() != -1) {
                    return null;
                }
                return new b0(new ge.d(uri), od.c.d(context, uri, new od.b(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f117453a) {
            case 0:
                break;
            case 1:
                if (f0.h.c0(uri) && !uri.getPathSegments().contains("video")) {
                    break;
                }
                break;
            default:
                if (f0.h.c0(uri) && uri.getPathSegments().contains("video")) {
                    break;
                }
                break;
        }
        return true;
    }
}
