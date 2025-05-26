package b3;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    public static final Canvas f21312a = new Canvas();

    public static final d a(Canvas canvas) {
        d dVar = new d();
        dVar.f21309a = canvas;
        return dVar;
    }

    public static final Canvas b(u uVar) {
        Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((d) uVar).f21309a;
    }
}
