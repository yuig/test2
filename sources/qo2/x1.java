package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final x1 f104654c;

    static {
        Intrinsics.checkNotNullParameter(xk2.i0.f135212b, "<this>");
        f104654c = new x1(y1.f104667a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        short[] collectionSize = ((xk2.j0) obj).f135220a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        w1 builder = (w1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short q13 = decoder.x(this.f104534b, i13).q();
        xk2.h0 h0Var = xk2.i0.f135212b;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f104648a;
        int i14 = builder.f104649b;
        builder.f104649b = i14 + 1;
        sArr[i14] = q13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        short[] bufferWithData = ((xk2.j0) obj).f135220a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        w1 w1Var = new w1();
        w1Var.f104648a = bufferWithData;
        w1Var.f104649b = bufferWithData.length;
        w1Var.b(10);
        return w1Var;
    }

    @Override // qo2.b1
    public final Object o() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.j0(storage);
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        short[] content = ((xk2.j0) obj).f135220a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            po2.d p13 = encoder.p(this.f104534b, i14);
            short s13 = content[i14];
            xk2.h0 h0Var = xk2.i0.f135212b;
            p13.t(s13);
        }
    }
}
