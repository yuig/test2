package m1;

import androidx.compose.foundation.gestures.DraggableElement;

/* loaded from: classes2.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f85613a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f85614b;

    static {
        bl2.c cVar = null;
        f85613a = new v0(0, cVar);
        f85614b = new v0(1, cVar);
    }

    public static u2.q a(u2.q qVar, b1 b1Var, f1 f1Var, boolean z13, o1.l lVar, boolean z14, kl2.l lVar2, boolean z15) {
        return qVar.j(new DraggableElement(b1Var, f1Var, z13, lVar, z14, f85613a, lVar2, z15));
    }
}
