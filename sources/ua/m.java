package ua;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f121306a;

    /* renamed from: b, reason: collision with root package name */
    public final float f121307b;

    /* renamed from: c, reason: collision with root package name */
    public final float f121308c;

    /* renamed from: d, reason: collision with root package name */
    public final float f121309d;

    /* renamed from: e, reason: collision with root package name */
    public final float f121310e;

    /* renamed from: f, reason: collision with root package name */
    public final float f121311f;

    /* renamed from: g, reason: collision with root package name */
    public final float f121312g;

    /* renamed from: h, reason: collision with root package name */
    public final float f121313h;

    public m(View view) {
        this.f121306a = view.getTranslationX();
        this.f121307b = view.getTranslationY();
        WeakHashMap weakHashMap = q5.v0.f102521a;
        this.f121308c = q5.m0.g(view);
        this.f121309d = view.getScaleX();
        this.f121310e = view.getScaleY();
        this.f121311f = view.getRotationX();
        this.f121312g = view.getRotationY();
        this.f121313h = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f121306a == this.f121306a && mVar.f121307b == this.f121307b && mVar.f121308c == this.f121308c && mVar.f121309d == this.f121309d && mVar.f121310e == this.f121310e && mVar.f121311f == this.f121311f && mVar.f121312g == this.f121312g && mVar.f121313h == this.f121313h;
    }

    public final int hashCode() {
        float f13 = this.f121306a;
        int floatToIntBits = (f13 != 0.0f ? Float.floatToIntBits(f13) : 0) * 31;
        float f14 = this.f121307b;
        int floatToIntBits2 = (floatToIntBits + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
        float f15 = this.f121308c;
        int floatToIntBits3 = (floatToIntBits2 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
        float f16 = this.f121309d;
        int floatToIntBits4 = (floatToIntBits3 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
        float f17 = this.f121310e;
        int floatToIntBits5 = (floatToIntBits4 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0)) * 31;
        float f18 = this.f121311f;
        int floatToIntBits6 = (floatToIntBits5 + (f18 != 0.0f ? Float.floatToIntBits(f18) : 0)) * 31;
        float f19 = this.f121312g;
        int floatToIntBits7 = (floatToIntBits6 + (f19 != 0.0f ? Float.floatToIntBits(f19) : 0)) * 31;
        float f23 = this.f121313h;
        return floatToIntBits7 + (f23 != 0.0f ? Float.floatToIntBits(f23) : 0);
    }
}
