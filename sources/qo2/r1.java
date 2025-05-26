package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final r1 f104617c;

    static {
        Intrinsics.checkNotNullParameter(xk2.b0.f135200b, "<this>");
        f104617c = new r1(s1.f104621a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        int[] collectionSize = ((xk2.c0) obj).f135206a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        q1 builder = (q1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g13 = decoder.x(this.f104534b, i13).g();
        xk2.a0 a0Var = xk2.b0.f135200b;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f104612a;
        int i14 = builder.f104613b;
        builder.f104613b = i14 + 1;
        iArr[i14] = g13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        int[] bufferWithData = ((xk2.c0) obj).f135206a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        q1 q1Var = new q1();
        q1Var.f104612a = bufferWithData;
        q1Var.f104613b = bufferWithData.length;
        q1Var.b(10);
        return q1Var;
    }

    @Override // qo2.b1
    public final Object o() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.c0(storage);
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        int[] content = ((xk2.c0) obj).f135206a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            po2.d p13 = encoder.p(this.f104534b, i14);
            int i15 = content[i14];
            xk2.a0 a0Var = xk2.b0.f135200b;
            p13.C(i15);
        }
    }
}
