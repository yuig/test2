package qm;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes.dex */
public final class s extends nm.i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f104217b = new d(new s(nm.g0.LAZILY_PARSED_NUMBER), 1);

    /* renamed from: a, reason: collision with root package name */
    public final nm.h0 f104218a;

    public s(nm.h0 h0Var) {
        this.f104218a = h0Var;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        um.b K = aVar.K();
        int i13 = r.f104216a[K.ordinal()];
        if (i13 == 1) {
            aVar.B1();
            return null;
        }
        if (i13 == 2 || i13 == 3) {
            return this.f104218a.readNumber(aVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + K + "; at path " + aVar.k());
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cVar.L((Number) obj);
    }
}
