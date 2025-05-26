package td;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117424a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f117425b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f117426c;

    public o(Context context, n nVar) {
        this.f117425b = context.getApplicationContext();
        this.f117426c = nVar;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        switch (this.f117424a) {
            case 0:
                break;
            default:
                Uri uri = (Uri) obj;
                if (!"android.resource".equals(uri.getScheme()) || !this.f117425b.getPackageName().equals(uri.getAuthority())) {
                }
                break;
        }
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        int i15 = this.f117424a;
        Context context = this.f117425b;
        Object obj2 = this.f117426c;
        switch (i15) {
            case 0:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) lVar.c(xd.e.f134594b);
                return new b0(new ge.d(num), new m(theme, theme != null ? theme.getResources() : context.getResources(), (n) obj2, num.intValue()));
            default:
                Uri uri = (Uri) obj;
                List<String> pathSegments = uri.getPathSegments();
                b0 b0Var = null;
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                        if (parseInt != 0) {
                            b0Var = ((c0) obj2).b(Integer.valueOf(parseInt), i13, i14, lVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                        }
                        return b0Var;
                    } catch (NumberFormatException e13) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return b0Var;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e13);
                        return b0Var;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
                    return null;
                }
                List<String> pathSegments2 = uri.getPathSegments();
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return ((c0) obj2).b(Integer.valueOf(identifier), i13, i14, lVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
        }
    }

    public o(Context context, c0 c0Var) {
        this.f117425b = context.getApplicationContext();
        this.f117426c = c0Var;
    }
}
