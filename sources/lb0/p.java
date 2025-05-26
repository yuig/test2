package lb0;

import android.content.Context;
import m60.f0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public volatile b f82726a;

    /* renamed from: b, reason: collision with root package name */
    public volatile kb0.a f82727b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f82728c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final String f82729d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82730e;

    public p(String str, String str2) {
        this.f82729d = str;
        this.f82730e = str2;
    }

    public final o a() {
        if (this.f82726a == null) {
            synchronized (this.f82728c) {
                try {
                    if (this.f82726a == null) {
                        this.f82726a = new b(this.f82729d);
                        if (ff0.j.f62103a) {
                            Context context = kb0.a.f79058b;
                            this.f82727b = f0.j0();
                            System.out.println("Preferences." + this.f82730e + ", app: " + this.f82727b);
                        }
                    }
                } finally {
                }
            }
        }
        if (ff0.j.f62103a) {
            kb0.a aVar = this.f82727b;
            Context context2 = kb0.a.f79058b;
            if (aVar != f0.j0()) {
                System.out.println("Preferences." + this.f82730e + ", validation failed, current app: " + f0.j0() + ", expected: " + this.f82727b);
            }
        }
        return this.f82726a;
    }
}
