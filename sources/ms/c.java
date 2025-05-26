package ms;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements i01.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f88096a;

    public c(e eVar) {
        this.f88096a = eVar;
    }

    @Override // i01.e
    public final String e() {
        return null;
    }

    @Override // i01.e
    public final String f() {
        return null;
    }

    @Override // i01.e
    public final ArrayList w() {
        return null;
    }

    @Override // i01.e
    public final int y() {
        return 0;
    }

    @Override // i01.e
    public final String z() {
        String obj = this.f88096a.X0.toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = obj.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
