package pd;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Queue;

/* loaded from: classes.dex */
public final class i0 implements nd.h {

    /* renamed from: j, reason: collision with root package name */
    public static final he.k f99690j = new he.k(50);

    /* renamed from: b, reason: collision with root package name */
    public final qd.i f99691b;

    /* renamed from: c, reason: collision with root package name */
    public final nd.h f99692c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.h f99693d;

    /* renamed from: e, reason: collision with root package name */
    public final int f99694e;

    /* renamed from: f, reason: collision with root package name */
    public final int f99695f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f99696g;

    /* renamed from: h, reason: collision with root package name */
    public final nd.l f99697h;

    /* renamed from: i, reason: collision with root package name */
    public final nd.p f99698i;

    public i0(qd.i iVar, nd.h hVar, nd.h hVar2, int i13, int i14, nd.p pVar, Class cls, nd.l lVar) {
        this.f99691b = iVar;
        this.f99692c = hVar;
        this.f99693d = hVar2;
        this.f99694e = i13;
        this.f99695f = i14;
        this.f99698i = pVar;
        this.f99696g = cls;
        this.f99697h = lVar;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        Object f13;
        qd.i iVar = this.f99691b;
        synchronized (iVar) {
            dc.a aVar = iVar.f103546b;
            qd.l lVar = (qd.l) ((Queue) aVar.f92902b).poll();
            if (lVar == null) {
                lVar = aVar.k();
            }
            qd.h hVar = (qd.h) lVar;
            hVar.f103543b = 8;
            hVar.f103544c = byte[].class;
            f13 = iVar.f(hVar, byte[].class);
        }
        byte[] bArr = (byte[]) f13;
        ByteBuffer.wrap(bArr).putInt(this.f99694e).putInt(this.f99695f).array();
        this.f99693d.a(messageDigest);
        this.f99692c.a(messageDigest);
        messageDigest.update(bArr);
        nd.p pVar = this.f99698i;
        if (pVar != null) {
            pVar.a(messageDigest);
        }
        this.f99697h.a(messageDigest);
        he.k kVar = f99690j;
        Class cls = this.f99696g;
        byte[] bArr2 = (byte[]) kVar.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(nd.h.f90415a);
            kVar.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f99691b.h(bArr);
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f99695f == i0Var.f99695f && this.f99694e == i0Var.f99694e && he.n.b(this.f99698i, i0Var.f99698i) && this.f99696g.equals(i0Var.f99696g) && this.f99692c.equals(i0Var.f99692c) && this.f99693d.equals(i0Var.f99693d) && this.f99697h.equals(i0Var.f99697h);
    }

    @Override // nd.h
    public final int hashCode() {
        int hashCode = ((((this.f99693d.hashCode() + (this.f99692c.hashCode() * 31)) * 31) + this.f99694e) * 31) + this.f99695f;
        nd.p pVar = this.f99698i;
        if (pVar != null) {
            hashCode = (hashCode * 31) + pVar.hashCode();
        }
        return this.f99697h.f90422b.hashCode() + ((this.f99696g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f99692c + ", signature=" + this.f99693d + ", width=" + this.f99694e + ", height=" + this.f99695f + ", decodedResourceClass=" + this.f99696g + ", transformation='" + this.f99698i + "', options=" + this.f99697h + '}';
    }
}
