package yp0;

import a.cb;
import gk2.r2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import uk2.f;
import xn1.i;

/* loaded from: classes5.dex */
public final class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f139609a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139610b;

    /* renamed from: c, reason: collision with root package name */
    public final sk2.c f139611c;

    /* renamed from: d, reason: collision with root package name */
    public final f f139612d;

    public b(String str, String str2) {
        this.f139609a = str == null ? "@" : str;
        this.f139610b = str2 == null ? "(^@\\w*)|(\\s@\\w*)" : str2;
        sk2.c cVar = new sk2.c();
        Intrinsics.checkNotNullExpressionValue(cVar, "create(...)");
        this.f139611c = cVar;
        this.f139612d = cb.r("create(...)");
    }

    public final x a() {
        x H = this.f139612d.A(wj2.c.a()).H(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    public final r2 b() {
        r2 n13 = this.f139611c.i(wj2.c.a()).n(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(n13, "subscribeOn(...)");
        return n13;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            i iVar = (i) event;
            int i13 = iVar.f135457f;
            int i14 = iVar.f135455d;
            if (i13 > 0) {
                i14 += i13;
            }
            Pattern compile = Pattern.compile(this.f139610b);
            String str = iVar.f135454c;
            Matcher matcher = compile.matcher(str);
            String str2 = null;
            boolean z13 = false;
            while (matcher.find()) {
                if (matcher.start() < i14 && i14 <= matcher.end()) {
                    str2 = str.substring(matcher.start(), matcher.end());
                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                    z13 = true;
                }
            }
            this.f139612d.c(Boolean.valueOf(z13));
            if (str2 != null) {
                String str3 = this.f139609a;
                String substring = str2.substring(str3.length() + StringsKt.L(str2, str3, 0, false, 6));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                this.f139611c.c(substring);
            }
        }
    }
}
