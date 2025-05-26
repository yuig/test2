package wd;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class r implements nd.p {

    /* renamed from: b, reason: collision with root package name */
    public final nd.p f129202b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129203c;

    public r(nd.p pVar, boolean z13) {
        this.f129202b = pVar;
        this.f129203c = z13;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        this.f129202b.a(messageDigest);
    }

    @Override // nd.p
    public final pd.g0 b(com.bumptech.glide.f fVar, pd.g0 g0Var, int i13, int i14) {
        qd.d dVar = com.bumptech.glide.b.a(fVar).f29741b;
        Drawable drawable = (Drawable) g0Var.get();
        c a13 = q.a(dVar, drawable, i13, i14);
        if (a13 != null) {
            pd.g0 b13 = this.f129202b.b(fVar, a13, i13, i14);
            if (!b13.equals(a13)) {
                return w.e(fVar.getResources(), b13);
            }
            b13.c();
            return g0Var;
        }
        if (!this.f129203c) {
            return g0Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f129202b.equals(((r) obj).f129202b);
        }
        return false;
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f129202b.hashCode();
    }
}
