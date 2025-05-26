package j6;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends h6.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f74811a;

    public j(EditText editText) {
        this.f74811a = new WeakReference(editText);
    }

    @Override // h6.j
    public final void b() {
        k.a((EditText) this.f74811a.get(), 1);
    }
}
