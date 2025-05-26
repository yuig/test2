package td;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes3.dex */
public final class k0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117412a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f117413b;

    public /* synthetic */ k0(c0 c0Var, int i13) {
        this.f117412a = i13;
        this.f117413b = c0Var;
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f117412a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        Uri fromFile;
        int i15 = this.f117412a;
        c0 c0Var = this.f117413b;
        switch (i15) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null || !c0Var.a(fromFile)) {
                    return null;
                }
                return c0Var.b(fromFile, i13, i14, lVar);
            default:
                return c0Var.b(new t((URL) obj), i13, i14, lVar);
        }
    }
}
