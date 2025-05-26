package w3;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ViewStructure f127894a;

    public j(ViewStructure viewStructure) {
        this.f127894a = viewStructure;
    }

    public static j i(ViewStructure viewStructure) {
        return new j(viewStructure);
    }

    public final Bundle a() {
        return i.a(this.f127894a);
    }

    public final void b(String str) {
        i.b(this.f127894a, str);
    }

    public final void c(String str) {
        i.c(this.f127894a, str);
    }

    public final void d(int i13, int i14, int i15, int i16) {
        i.d(this.f127894a, i13, i14, 0, 0, i15, i16);
    }

    public final void e(int i13, String str) {
        this.f127894a.setId(i13, null, null, str);
    }

    public final void f(CharSequence charSequence) {
        i.e(this.f127894a, charSequence);
    }

    public final void g(float f13) {
        i.f(this.f127894a, f13, 0, 0, 0);
    }

    public final ViewStructure h() {
        return this.f127894a;
    }
}
