package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f104565c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.n0.f80438a, "<this>");
        f104565c = new h1(i1.f104570a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        g1 builder = (g1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short j13 = decoder.j(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f104559a;
        int i14 = builder.f104560b;
        builder.f104560b = i14 + 1;
        sArr[i14] = j13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        g1 g1Var = new g1();
        g1Var.f104559a = bufferWithData;
        g1Var.f104560b = bufferWithData.length;
        g1Var.b(10);
        return g1Var;
    }

    @Override // qo2.b1
    public final Object o() {
        return new short[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.B(this.f104534b, i14, content[i14]);
        }
    }
}
