package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f33389a;

    /* renamed from: b, reason: collision with root package name */
    private y f33390b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f33390b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f33389a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f33389a;
        if (str != null && (yVar = this.f33390b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f33389a == null) {
            sb3.append(" token");
        }
        if (this.f33390b == null) {
            sb3.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }
}
