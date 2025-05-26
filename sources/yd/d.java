package yd;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import nd.p;
import pd.g0;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: b, reason: collision with root package name */
    public final p f138724b;

    public d(p pVar) {
        d7.b.p(pVar, "Argument must not be null");
        this.f138724b = pVar;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        this.f138724b.a(messageDigest);
    }

    @Override // nd.p
    public final g0 b(com.bumptech.glide.f fVar, g0 g0Var, int i13, int i14) {
        c cVar = (c) g0Var.get();
        g0 cVar2 = new wd.c(cVar.f138714a.f138713a.e(), com.bumptech.glide.b.a(fVar).f29741b);
        p pVar = this.f138724b;
        g0 b13 = pVar.b(fVar, cVar2, i13, i14);
        if (!cVar2.equals(b13)) {
            cVar2.c();
        }
        cVar.f138714a.f138713a.l(pVar, (Bitmap) b13.get());
        return g0Var;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f138724b.equals(((d) obj).f138724b);
        }
        return false;
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f138724b.hashCode();
    }
}
