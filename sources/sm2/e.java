package sm2;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f113283c;

    public /* synthetic */ e(f fVar, int i13) {
        this.f113282b = i13;
        this.f113283c = fVar;
    }

    @Override // sm2.d
    public final void f(String[] strArr) {
        int i13 = this.f113282b;
        f fVar = this.f113283c;
        switch (i13) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                fVar.f113284a.f113294d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                fVar.f113284a.f113295e = strArr;
                return;
        }
    }
}
