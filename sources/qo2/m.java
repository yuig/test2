package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final m f104591c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f80423a, "<this>");
        f104591c = new m(n.f104595a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        l builder = (l) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char l13 = decoder.l(this.f104534b, i13);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f104584a;
        int i14 = builder.f104585b;
        builder.f104585b = i14 + 1;
        cArr[i14] = l13;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        l lVar = new l();
        lVar.f104584a = bufferWithData;
        lVar.f104585b = bufferWithData.length;
        lVar.b(10);
        return lVar;
    }

    @Override // qo2.b1
    public final Object o() {
        return new char[0];
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            encoder.i(this.f104534b, i14, content[i14]);
        }
    }
}
