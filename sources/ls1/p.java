package ls1;

import android.graphics.Rect;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends q {

    /* renamed from: m, reason: collision with root package name */
    public final Rect f84707m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f84708n;

    /* renamed from: o, reason: collision with root package name */
    public final int f84709o;

    /* renamed from: p, reason: collision with root package name */
    public final int f84710p;

    /* renamed from: q, reason: collision with root package name */
    public final int f84711q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f84712r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f84713s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f30 pin, int i13, int i14, vn1.c gestaltTextColor, boolean z13, String str, Rect globalVisiblePinRect, Rect pinDrawableRect, int i15, int i16, int i17, int i18, boolean z14, boolean z15) {
        super(null, pin, i13, i14, gestaltTextColor, z13, str, true, -1, pinDrawableRect, null, i17);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(gestaltTextColor, "gestaltTextColor");
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Intrinsics.checkNotNullParameter(pinDrawableRect, "pinDrawableRect");
        this.f84707m = globalVisiblePinRect;
        this.f84708n = pinDrawableRect;
        this.f84709o = i15;
        this.f84710p = i16;
        this.f84711q = i18;
        this.f84712r = z14;
        this.f84713s = z15;
    }
}
