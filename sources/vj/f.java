package vj;

import android.os.Build;
import android.view.View;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f125898a;

    /* renamed from: b, reason: collision with root package name */
    public final b f125899b;

    /* renamed from: c, reason: collision with root package name */
    public final View f125900c;

    public f(b bVar, View view) {
        int i13 = Build.VERSION.SDK_INT;
        this.f125898a = i13 >= 34 ? new e() : i13 >= 33 ? new c() : null;
        this.f125899b = bVar;
        this.f125900c = view;
    }

    public final void a(boolean z13) {
        c cVar = this.f125898a;
        if (cVar != null) {
            cVar.b(this.f125899b, this.f125900c, z13);
        }
    }
}
