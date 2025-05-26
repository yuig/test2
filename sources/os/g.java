package os;

import android.graphics.drawable.Drawable;
import dl1.s;
import rm1.q;

/* loaded from: classes3.dex */
public class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f97484a;

    /* renamed from: b, reason: collision with root package name */
    public String f97485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97486c;

    /* renamed from: d, reason: collision with root package name */
    public final q f97487d;

    /* renamed from: e, reason: collision with root package name */
    public final om1.f f97488e;

    public g(Drawable drawable, String str, String str2) {
        this(drawable, str, str2, null, om1.f.DEFAULT_LIGHT_GRAY);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f97486c;
    }

    public g(Drawable drawable, String str, String str2, q qVar, om1.f fVar) {
        this.f97484a = drawable;
        this.f97485b = str;
        this.f97486c = str2;
        this.f97487d = qVar;
        this.f97488e = fVar;
    }
}
