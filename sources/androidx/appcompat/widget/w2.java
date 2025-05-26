package androidx.appcompat.widget;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class w2 extends h6.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16707a;

    public w2(SwitchCompat switchCompat) {
        this.f16707a = new WeakReference(switchCompat);
    }

    @Override // h6.j
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f16707a.get();
        if (switchCompat != null) {
            switchCompat.h(switchCompat.f16456o);
            switchCompat.g(switchCompat.f16458q);
            switchCompat.requestLayout();
        }
    }

    @Override // h6.j
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f16707a.get();
        if (switchCompat != null) {
            switchCompat.h(switchCompat.f16456o);
            switchCompat.g(switchCompat.f16458q);
            switchCompat.requestLayout();
        }
    }
}
