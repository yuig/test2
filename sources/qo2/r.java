package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final r f104614c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.k.f80435a, "<this>");
        f104614c = new r(s.f104618a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        q builder = (q) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double y13 = decoder.y(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f104610a;
        int i14 = builder.f104611b;
        builder.f104611b = i14 + 1;
        dArr[i14] = y13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        q qVar = new q();
        qVar.f104610a = bufferWithData;
        qVar.f104611b = bufferWithData.length;
        qVar.b(10);
        return qVar;
    }

    @Override // qo2.b1
    public final Object o() {
        return new double[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.o(this.f104534b, i14, content[i14]);
        }
    }
}
