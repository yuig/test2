package m60;

import android.content.Context;
import df.j1;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public b f85891a = b.BACKGROUND;

    /* renamed from: b, reason: collision with root package name */
    public Timer f85892b;

    /* renamed from: c, reason: collision with root package name */
    public String f85893c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicBoolean f85894d;

    /* renamed from: e, reason: collision with root package name */
    public final ob0.a f85895e;

    /* renamed from: f, reason: collision with root package name */
    public final bk.f f85896f;

    public d(tb0.h hVar, bk.f fVar) {
        this.f85896f = fVar;
        this.f85895e = hVar;
    }

    public static e a() {
        Context context = kb0.a.f79058b;
        return f0.j0().a();
    }

    public final void b() {
        this.f85896f.getClass();
    }

    public final String c(Boolean bool) {
        this.f85896f.getClass();
        return bool.booleanValue() ? "13.19.0 / API: ".concat(d()) : "13.19.0";
    }

    public final String d() {
        String str;
        if (this.f85893c == null) {
            b();
            String valueOf = String.valueOf(13198010);
            int length = valueOf.length();
            if (length >= 7) {
                this.f85896f.getClass();
                if (length > 8) {
                    ((tb0.h) this.f85895e).o("The version code 13198010 does not follow the xx.x.xx.xxx pattern", new IllegalArgumentException("The version code 13198010 does not follow the xx.x.xx.xxx pattern"));
                    valueOf = valueOf.substring(length - 8);
                    length = valueOf.length();
                }
                String substring = valueOf.substring(0, length - 1);
                int length2 = substring.length();
                int i13 = length2 - 5;
                str = j1.W("%d.%d.%d", Integer.valueOf(Integer.parseInt(substring.substring(0, i13))), Integer.valueOf(Integer.parseInt(substring.substring(i13, length2 - 3))), Integer.valueOf(Integer.parseInt(substring.substring(length2 - 2))));
            } else {
                str = null;
            }
            this.f85893c = str;
        }
        String str2 = this.f85893c;
        return str2 == null ? "" : str2;
    }

    public final void e() {
        this.f85896f.getClass();
    }

    public final boolean f() {
        if (this.f85894d == null) {
            boolean z13 = false;
            try {
                Class.forName("androidx.test.espresso.Espresso");
                z13 = true;
            } catch (ClassNotFoundException | Error unused) {
            }
            this.f85894d = new AtomicBoolean(z13);
        }
        return this.f85894d.get();
    }

    public final void g() {
        this.f85896f.getClass();
    }

    public final void h() {
        this.f85896f.getClass();
    }
}
