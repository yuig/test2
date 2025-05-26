package eb2;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f58246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58248c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58249d;

    public a(int i13, int i14, int i15, int i16) {
        this.f58246a = i13;
        this.f58247b = i14;
        this.f58248c = i15;
        this.f58249d = i16;
    }

    public int a(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f58249d;
    }

    public int b(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f58246a;
    }

    public int c(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f58248c;
    }

    public int d(View view, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f58247b;
    }
}
