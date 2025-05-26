package ua2;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d1 extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public int f121483f;

    /* renamed from: g, reason: collision with root package name */
    public int f121484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(View parentView) {
        super(parentView, b1.VERTICAL);
        Intrinsics.checkNotNullParameter(parentView, "parentView");
    }

    @Override // ua2.f1
    public final z0 v(int i13, int i14) {
        z0 y13 = y(i13, i14);
        this.f121495d = y13;
        this.f121483f = i14;
        this.f121484g = i14 + y13.f121641b;
        return y13;
    }
}
