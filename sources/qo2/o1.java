package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f104605c;

    static {
        Intrinsics.checkNotNullParameter(xk2.y.f135237b, "<this>");
        f104605c = new o1(p1.f104608a);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        byte[] collectionSize = ((xk2.z) obj).f135239a;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // qo2.o, qo2.a
    public final void k(po2.a decoder, int i13, Object obj, boolean z13) {
        n1 builder = (n1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte E = decoder.x(this.f104534b, i13).E();
        xk2.x xVar = xk2.y.f135237b;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f104599a;
        int i14 = builder.f104600b;
        builder.f104600b = i14 + 1;
        bArr[i14] = E;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        byte[] bufferWithData = ((xk2.z) obj).f135239a;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        n1 n1Var = new n1();
        n1Var.f104599a = bufferWithData;
        n1Var.f104600b = bufferWithData.length;
        n1Var.b(10);
        return n1Var;
    }

    @Override // qo2.b1
    public final Object o() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new xk2.z(storage);
    }

    @Override // qo2.b1
    public final void p(po2.b encoder, Object obj, int i13) {
        byte[] content = ((xk2.z) obj).f135239a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i14 = 0; i14 < i13; i14++) {
            po2.d p13 = encoder.p(this.f104534b, i14);
            byte b13 = content[i14];
            xk2.x xVar = xk2.y.f135237b;
            p13.g(b13);
        }
    }
}
