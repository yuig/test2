package l3;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import u2.p;

/* loaded from: classes.dex */
public final class e extends p implements d {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f81495n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f81496o;

    @Override // l3.d
    public final boolean V(KeyEvent keyEvent) {
        Function1 function1 = this.f81496o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // l3.d
    public final boolean b0(KeyEvent keyEvent) {
        Function1 function1 = this.f81495n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
