package l3;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f81494a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.f81494a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.d(this.f81494a, ((b) obj).f81494a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f81494a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f81494a + ')';
    }
}
