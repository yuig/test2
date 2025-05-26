package jl;

import el.i0;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class m extends bl.w {

    /* renamed from: c, reason: collision with root package name */
    public final j f76868c;

    /* renamed from: d, reason: collision with root package name */
    public final ml.a f76869d;

    /* renamed from: e, reason: collision with root package name */
    public final ml.a f76870e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f76871f;

    public m(j jVar, ml.a aVar, ml.a aVar2, Integer num) {
        super(3);
        this.f76868c = jVar;
        this.f76869d = aVar;
        this.f76870e = aVar2;
        this.f76871f = num;
    }

    public static m n(i iVar, ml.a aVar, Integer num) {
        ml.a a13;
        j jVar = new j(iVar);
        i iVar2 = i.f76857e;
        if (!iVar.equals(iVar2) && num == null) {
            throw new GeneralSecurityException("For given Variant " + iVar + " the value of idRequirement must be non-null");
        }
        if (iVar.equals(iVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        byte[] bArr = aVar.f87434a;
        if (bArr.length != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + bArr.length);
        }
        if (iVar == iVar2) {
            a13 = i0.f59494a;
        } else if (iVar == i.f76855c || iVar == i.f76856d) {
            a13 = i0.a(num.intValue());
        } else {
            if (iVar != i.f76854b) {
                throw new IllegalStateException("Unknown Variant: " + iVar);
            }
            a13 = i0.b(num.intValue());
        }
        return new m(jVar, aVar, a13, num);
    }

    @Override // bl.w
    public final Integer j() {
        return this.f76871f;
    }

    @Override // bl.w
    public final ml.a k() {
        return this.f76870e;
    }
}
