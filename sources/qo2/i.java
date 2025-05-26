package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i f104566c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.c.f80421a, "<this>");
        f104566c = new i(j.f104572a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        h builder = (h) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte B = decoder.B(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f104561a;
        int i14 = builder.f104562b;
        builder.f104562b = i14 + 1;
        bArr[i14] = B;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        h hVar = new h();
        hVar.f104561a = bufferWithData;
        hVar.f104562b = bufferWithData.length;
        hVar.b(10);
        return hVar;
    }

    @Override // qo2.b1
    public final Object o() {
        return new byte[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.r(this.f104534b, i14, content[i14]);
        }
    }
}
