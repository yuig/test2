package bb;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f22451d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f22451d = Pattern.compile("\\A\\d+");
    }

    @Override // bb.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // bb.c
    public final boolean b() {
        boolean b13 = super.b();
        if (!b13 || Build.VERSION.SDK_INT >= 29) {
            return b13;
        }
        int i13 = ab.e.f1688a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.f22451d.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
