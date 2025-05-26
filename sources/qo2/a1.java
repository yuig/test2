package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a1 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f104532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(oo2.g primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f104532c = primitive.i() + "Array";
    }

    @Override // oo2.g
    public final String i() {
        return this.f104532c;
    }
}
