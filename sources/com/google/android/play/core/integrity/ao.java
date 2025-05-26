package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f33421a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f33422b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f33423c = null;

    public /* synthetic */ ao(String str, Long l13, Object obj, an anVar) {
        this.f33421a = str;
        this.f33422b = l13;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f33422b;
    }

    public final boolean equals(Object obj) {
        boolean z13;
        Long l13;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f33421a.equals(integrityTokenRequest.nonce()) && ((l13 = this.f33422b) != null ? l13.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z13 = true;
                if ((obj instanceof ao) || !a()) {
                    return z13;
                }
                ao aoVar = (ao) obj;
                if (!z13) {
                    return false;
                }
                Object obj2 = aoVar.f33423c;
                return true;
            }
        }
        z13 = false;
        if (obj instanceof ao) {
        }
        return z13;
    }

    public final int hashCode() {
        int hashCode = this.f33421a.hashCode() ^ 1000003;
        Long l13 = this.f33422b;
        int hashCode2 = (hashCode * 1000003) ^ (l13 == null ? 0 : l13.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f33421a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f33421a + ", cloudProjectNumber=" + this.f33422b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
