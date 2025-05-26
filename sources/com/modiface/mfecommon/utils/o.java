package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public float f34352a;

    /* renamed from: b, reason: collision with root package name */
    public float f34353b;

    public o(float f13, float f14) {
        this.f34352a = f13;
        this.f34353b = f14;
    }

    public boolean a(float f13, float f14) {
        return this.f34352a == f13 && this.f34353b == f14;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return a(oVar.f34352a, oVar.f34353b);
    }

    public o() {
        this(0.0f, 0.0f);
    }
}
