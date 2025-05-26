package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final u1 f104635c;

    static {
        Intrinsics.checkNotNullParameter(xk2.e0.f135207b, "<this>");
        f104635c = new u1(v1.f104640a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        long[] collectionSize = ((xk2.f0) obj).f135209a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        t1 builder = (t1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long i14 = decoder.x(this.f104534b, i13).i();
        xk2.d0 d0Var = xk2.e0.f135207b;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f104626a;
        int i15 = builder.f104627b;
        builder.f104627b = i15 + 1;
        jArr[i15] = i14;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        long[] bufferWithData = ((xk2.f0) obj).f135209a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        t1 t1Var = new t1();
        t1Var.f104626a = bufferWithData;
        t1Var.f104627b = bufferWithData.length;
        t1Var.b(10);
        return t1Var;
    }

    @Override // qo2.b1
    public final Object o() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.f0(storage);
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        long[] content = ((xk2.f0) obj).f135209a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            po2.d p13 = encoder.p(this.f104534b, i14);
            long j13 = content[i14];
            xk2.d0 d0Var = xk2.e0.f135207b;
            p13.q(j13);
        }
    }
}
