package com.google.android.play.core.integrity;

/* loaded from: classes3.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f33442a;

    /* renamed from: b, reason: collision with root package name */
    private y f33443b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f33443b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f33442a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f33442a;
        if (str != null && (yVar = this.f33443b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f33442a == null) {
            sb3.append(" token");
        }
        if (this.f33443b == null) {
            sb3.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }
}
