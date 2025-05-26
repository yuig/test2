package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f104586c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.t.f80448a, "<this>");
        f104586c = new l0(m0.f104592a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        k0 builder = (k0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long e13 = decoder.e(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f104578a;
        int i14 = builder.f104579b;
        builder.f104579b = i14 + 1;
        jArr[i14] = e13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        k0 k0Var = new k0();
        k0Var.f104578a = bufferWithData;
        k0Var.f104579b = bufferWithData.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // qo2.b1
    public final Object o() {
        return new long[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.y(this.f104534b, i14, content[i14]);
        }
    }
}
