package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final y f104655c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.l.f80437a, "<this>");
        f104655c = new y(z.f104669a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        x builder = (x) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float n13 = decoder.n(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f104650a;
        int i14 = builder.f104651b;
        builder.f104651b = i14 + 1;
        fArr[i14] = n13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        x xVar = new x();
        xVar.f104650a = bufferWithData;
        xVar.f104651b = bufferWithData.length;
        xVar.b(10);
        return xVar;
    }

    @Override // qo2.b1
    public final Object o() {
        return new float[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.v(this.f104534b, i14, content[i14]);
        }
    }
}
