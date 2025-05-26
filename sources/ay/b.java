package ay;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m60.d;
import m60.f0;
import t3.s1;
import tb0.r;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public String f20655a;

    /* renamed from: b, reason: collision with root package name */
    public String f20656b;

    @Override // ay.a
    public final String a() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // ay.a
    public final String b() {
        String str = this.f20656b;
        if (str != null) {
            return str;
        }
        Context context = kb0.a.f79058b;
        Context context2 = f0.X();
        Intrinsics.checkNotNullParameter(context2, "context");
        Locale locale = context2.getResources().getConfiguration().getLocales().get(0);
        Locale locale2 = Locale.US;
        String displayCountry = locale.getDisplayCountry(locale2);
        Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
        String e13 = s1.e(new Object[0], 0, locale2, displayCountry, "format(...)");
        String upperCase = qb0.b.e(context2).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str2 = e13 + " (" + upperCase + ")";
        this.f20656b = str2;
        Intrinsics.f(str2);
        return str2;
    }

    @Override // ay.a
    public final String c() {
        String str = this.f20655a;
        if (str != null) {
            return str;
        }
        Context context = kb0.a.f79058b;
        Context X = f0.X();
        String valueOf = String.valueOf(Math.abs(Build.VERSION.SDK_INT >= 28 ? X.getPackageManager().getPackageInfo(X.getPackageName(), 0).getLongVersionCode() : r0.versionCode));
        int length = valueOf.length();
        if (valueOf.length() >= 8) {
            int i13 = length - 6;
            String substring = valueOf.substring(0, i13);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = valueOf.substring(i13, length - 4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            valueOf = a.a.D(substring, ".", substring2);
        }
        this.f20655a = valueOf;
        Intrinsics.f(valueOf);
        return valueOf;
    }

    @Override // ay.a
    public final String d() {
        r rVar;
        Context context = kb0.a.f79058b;
        kb0.a j03 = f0.j0();
        if (j03.f79061a != null) {
            d dVar = (d) j03.a();
            dVar.e();
            dVar.f85896f.getClass();
            dVar.h();
            rVar = r.PRODUCTION;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return rVar.getNamespaceFormatted();
        }
        return null;
    }

    @Override // ay.a
    public final String e() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }
}
