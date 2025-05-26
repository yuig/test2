package oj;

import android.animation.TypeEvaluator;
import kh2.g0;

/* loaded from: classes3.dex */
public final class c implements TypeEvaluator {

    /* renamed from: b, reason: collision with root package name */
    public static final c f95350b = new c();

    /* renamed from: a, reason: collision with root package name */
    public final f f95351a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        float h03 = g0.h0(fVar.f95354a, fVar2.f95354a, f13);
        float h04 = g0.h0(fVar.f95355b, fVar2.f95355b, f13);
        float h05 = g0.h0(fVar.f95356c, fVar2.f95356c, f13);
        f fVar3 = this.f95351a;
        fVar3.f95354a = h03;
        fVar3.f95355b = h04;
        fVar3.f95356c = h05;
        return fVar3;
    }
}
