package com.airbnb.lottie.compose;

import a.a;
import ac.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Ls3/e1;", "Lac/m;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class LottieAnimationSizeElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f28389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28390c;

    public LottieAnimationSizeElement(int i13, int i14) {
        this.f28389b = i13;
        this.f28390c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.f28389b == lottieAnimationSizeElement.f28389b && this.f28390c == lottieAnimationSizeElement.f28390c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28390c) + (Integer.hashCode(this.f28389b) * 31);
    }

    @Override // s3.e1
    public final p l() {
        m mVar = new m();
        mVar.f1871n = this.f28389b;
        mVar.f1872o = this.f28390c;
        return mVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        m node = (m) pVar;
        Intrinsics.checkNotNullParameter(node, "node");
        node.f1871n = this.f28389b;
        node.f1872o = this.f28390c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LottieAnimationSizeElement(width=");
        sb3.append(this.f28389b);
        sb3.append(", height=");
        return a.n(sb3, this.f28390c, ")");
    }
}
