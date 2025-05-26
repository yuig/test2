package androidx.activity;

import a.cb;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f15873a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15874b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15876d;

    public b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        a aVar = a.f15870a;
        float d2 = aVar.d(backEvent);
        float e13 = aVar.e(backEvent);
        float b13 = aVar.b(backEvent);
        int c13 = aVar.c(backEvent);
        this.f15873a = d2;
        this.f15874b = e13;
        this.f15875c = b13;
        this.f15876d = c13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BackEventCompat{touchX=");
        sb3.append(this.f15873a);
        sb3.append(", touchY=");
        sb3.append(this.f15874b);
        sb3.append(", progress=");
        sb3.append(this.f15875c);
        sb3.append(", swipeEdge=");
        return cb.l(sb3, this.f15876d, '}');
    }
}
