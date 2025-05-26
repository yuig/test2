package xf2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class i0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f134865a = new d0("error_code", false, 14);

    /* renamed from: b, reason: collision with root package name */
    public final String f134866b;

    public i0(ErrorCode errorCode) {
        String name = errorCode.name();
        Locale locale = Locale.ENGLISH;
        this.f134866b = ep.b.l(locale, "ENGLISH", name, locale, "toLowerCase(...)");
    }

    @Override // xf2.j0
    public final d0 getKey() {
        return this.f134865a;
    }

    @Override // xf2.j0
    public final String getValue() {
        return this.f134866b;
    }
}
