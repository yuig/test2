package j6;

import android.text.Editable;
import h6.f0;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f74796a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f74797b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f74798c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f74798c;
        return cls != null ? new f0(cls, charSequence) : super.newEditable(charSequence);
    }
}
